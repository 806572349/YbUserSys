package com.yb.user.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yb.base.component.BaseController;
import com.yb.user.model.YbUserCart;
import om.dubbo.api.user.UserCartApi;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 80657 on 2017/11/9.
 */
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
public class CartController  extends BaseController{

    @Reference
    UserCartApi userCartApi;


    // region   getCartList查询购物车列表
        @PostMapping("getCartList")
        public ModelMap getCartList(HttpServletRequest request,
                                    @RequestParam Integer uid
                                    ){

            List<YbUserCart> ybUserCarts = userCartApi.queryAll(uid);
            ModelMap result = getResult();
            result.put("cartlist",ybUserCarts);
            return  result;


        }
    //endregion


    // region   加入购物车

    /**
     *
     * @param request
     * @param uid 用户id
     * @param pid 产品id
     * @param cid 类目id
     * @param salesum 商品价格
     * @param numbers 数量
     * @param businessid 商户id
     * @param businessname 商户名称
     * @param productcode 商品唯一标识
     * @return
     */
    /**
     *
     * @param request
     * @param ybUserCart
     * @return
     */
        @PostMapping(value = "addCart",produces = MediaType.APPLICATION_JSON_VALUE)
        public  ModelMap addCart(HttpServletRequest request,YbUserCart ybUserCart
//                                 @RequestParam Integer uid,
//                                 @RequestParam Integer pid,
//                                 @RequestParam Integer cid,
//                                 @RequestParam BigDecimal salesum,
//                                 @RequestParam Integer numbers,
//                                 @RequestParam Integer businessid,
//                                 @RequestParam String  businessname,
//                                 @RequestParam String  productcode
                                 ){

            userCartApi.save(ybUserCart);
            return  getResult();




        }

    //endregion
}
