package com.yb.user.api;

import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yb.user.model.YbUserCollect;
import om.dubbo.api.user.UserCollectApi;
import om.dubbo.api.user.UserLoginServiceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.yb.base.component.BaseController;
import com.yb.base.component.BaseService.ServiceResult;
import com.yb.base.util.TokenUtil;
import com.yb.user.model.YbUser;
import com.yb.user.model.YbUserInfo;


// region
 /*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         佛祖保佑       永无BUG
 */
//endregion
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {


    @Reference
    UserLoginServiceApi userloginapi;



    public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);


    @PostMapping("login")
    public ModelMap Login(HttpServletRequest request
            , @RequestParam String phone
            , @RequestParam String code //验证码
            , @RequestParam(required = false) Integer isAutoLogin //是否自动登录
            , @RequestParam(required = false) String deviceCode
    ) {
        ModelMap modelMap = getResult();
        ServiceResult<YbUser> serviceResult = userloginapi.findbyPhone(phone);
        String sideWord = request.getHeader("User-Agent");
        HttpSession session = request.getSession();

        if (code.equals("1234")) {//模拟手机验证码 ，如果和服务器的相同则表示通过
            if (serviceResult.getResultCode() != UserLoginServiceApi.SUCCESS) {//没有注册过，直接注册，并直接返回token
                YbUser ybUser = userloginapi.CreateYbUser(phone, deviceCode).getT();
                ServiceResult<YbUser> result = userloginapi.save(ybUser);
                Map<String, String> token = TokenUtil.createToken(result.getT(), sideWord);
                session.setAttribute("uid",result.getT().getId());
                modelMap.put("user", ybUser);
                modelMap.put("token", token);
                return modelMap;
            }
            //直接登录
            YbUser ybUser = serviceResult.getT();
            session.setAttribute("uid",ybUser.getId());
            Map<String, String> token = TokenUtil.createToken(ybUser, sideWord);
            modelMap.put("user", ybUser);
            modelMap.put("token", token);
            return modelMap;
        } else {
            return getResult(false, "验证码错误，请重新输入");
        }
    }

    @PostMapping("userinfo")
    public ModelMap UserInfo(HttpServletRequest request) {
        ModelMap modelMap = getResult();
        YbUser user = getUser(request);
        if (user != null) {
            ServiceResult<YbUserInfo> userInfo = userloginapi.findUserInfo(user.getId());
            if (userInfo.getResultCode() == UserLoginServiceApi.SUCCESS) {
                YbUserInfo ybUserInfo = userInfo.getT();
                modelMap.put("userinfo", ybUserInfo);
                return modelMap;
            }
        }
        return getResult(false, "没有找到该用户信息");
    }




}
