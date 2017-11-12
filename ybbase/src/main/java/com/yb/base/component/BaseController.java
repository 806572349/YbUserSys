package com.yb.base.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.yb.base.util.Conf;
import com.yb.base.util.TokenUtil;
import com.yb.user.model.YbUser;



public abstract class BaseController extends YbJsonConvter{

	public Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 网络请求状态，成功
	 */
	public static final Integer SUCCESS = 0x00;
	/**
	 * 网络请求状态，失败
	 */
	public static final Integer FAIL = 0x01;
	/**
	 * 地址
	 */
	public static final String HTTP_URL = "http://d89e4752.ngrok.io";
	
	
	/**
	 * 返回结果
	 * @return
	 */
	public ModelMap getResult(){
		return getResult(true, "");
	}
	/**
	 * 装载结果返回
	 * @param k
	 * @param v
	 * @return
	 */
	public ModelMap getResult(String k,Object v){
		ModelMap obj = getResult();
		obj.put(k, v);
		return obj;
	}
	
	/**
	 * 设置返回结果
	 * @param result
	 * @return
	 */
	public ModelMap getResult(boolean result){
		return getResult(result, "");
	}
	
	/**
	 * 设置返回结果和返回消息
	 * @param result
	 * @param errorMesg
	 * @return
	 */
	public ModelMap getResult(boolean result,String errorMesg){
		ModelMap map = new ModelMap();
		if(result){
			map.put("error", "0");
			map.put("error_mesg", "");
		}else{
			map.put("error", "1");
			map.put("error_mesg", errorMesg);
		}
		return map;
	}
	
	/**
	 * 根据token获取user
	 * @param request
	 * @return
	 */
	public YbUser getUser(HttpServletRequest request){
		String token = request.getHeader("token");
		String userAgent = request.getHeader("User-Agent");
		YbUser user = TokenUtil.getUserByToken(token,userAgent);
		return user;
	}
	
//	public P2pBackAdmin getAdminUser(HttpServletRequest request){
//		String token = request.getHeader("token");
//		String userAgent = request.getHeader("User-Agent");
//		P2pBackAdmin user = TokenUtil.getAdminUserByToken(token,userAgent);
//		return user;
//	}
	/**
	 * 查看用户是否登录过期
	 * @param user
	 * @return
	 */
	public boolean isUserExprie(YbUser user){
		return System.currentTimeMillis() - user.getLoginTime().getTime() > Conf.TOKEN_LEFTTIME;
	}
	
	
	/**
	 * 查看admin用户是否登录过期
	 * @param user
	 * @return
	 */
//	public boolean isAdminUserExprie(P2pBackAdmin user){
//		return System.currentTimeMillis() - user.getUpdateTime().getTime() > Conf.Admin_TOKEN_LEFTTIME;
//	}
//	
	/**
	 * token超时
	 * @return
	 */
	public ModelMap tokenTimeOut(){
		return getResult(false, "token_timeout");
	}
	
	/**
	 * token非法
	 * @return
	 */
	public ModelMap tokenIllegal(){
		return getResult(false, "token_illegal");
	}
	
	@InitBinder    
    protected void initBinder(HttpServletRequest request,  
        ServletRequestDataBinder binder) throws Exception {  
        binder.registerCustomEditor(Date.class,   
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));  
    }
}
