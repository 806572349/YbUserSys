package com.yb.user.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yb.base.component.BaseController;
import com.yb.base.component.BaseService;
import com.yb.user.model.YbUser;
import com.yb.user.model.YbUserCollect;
import om.dubbo.api.user.UserCollectApi;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import com.yb.base.component.BaseService.ServiceResult;
/**
 * Created by 80657 on 2017/11/8.
 */

@RestController
@RequestMapping("/user")
public class CollectController extends BaseController {
    @Reference
    UserCollectApi collectApi;

    /*
       getCollectList
        */
    // region   获取收藏夹
    @PostMapping("getCollectList")
    public ModelMap getFavoriteList(HttpServletRequest request,
                                    @RequestParam Integer pageindex,
                                    @RequestParam Integer pagesize,
                                    @RequestParam Integer type
    ) {
        ModelMap modelMap = getResult();
        YbUser ybUser = getUser(request);
        ServiceResult<List<YbUserCollect>> collectList = collectApi.getCollectList(ybUser.getId(), pageindex, pagesize, type);
        if (collectList.getResultCode()==SUCCESS){
            modelMap.put("collectlist",collectList.getT());
            return modelMap;

        }
        return getResult(false,"收藏夹发生错误");
    }


    //endregion


    // region   加入收藏夹
    //addCollect
    /**
     * 传递参数
     * @param request
     * @param uid 用户id
     * @param objid 对象id
     * @param objname
     * @param objdesc 对象描述
     * @param objicon
     * @param objurl
     * @param type
     * @return
     */
    @PostMapping("addCollect")
    public  ModelMap addCollectList(HttpServletRequest request,
                                  @RequestParam Integer uid,
                                  @RequestParam Integer objid,
                                  @RequestParam(required = false) String objname,
                                  @RequestParam(required = false) String objdesc,
                                  @RequestParam(required = false)String objicon,
                                  @RequestParam(required = false) String  objurl,
                                  @RequestParam(required = false) String objproperty,
                                  @RequestParam Integer type
                                  ){

        YbUser ybUser = getUser(request);
        ModelMap modelMap = getResult();
        YbUserCollect ybUserCollect=collectApi.createCollect(ybUser.getId(),objid,objname,objdesc,objicon,objurl,objproperty,type);//创建新的
        ServiceResult<Integer> serviceResult = collectApi.addCollects(ybUserCollect);
        if (serviceResult.getResultCode()==SUCCESS){
            return  modelMap;
        }
        return  getResult(false,"添加失败");




    }


    //endregion

    // region   取消收藏


    @PostMapping("deleteCollects")
    public  ModelMap deleteCollects(HttpServletRequest request,
                                    @RequestParam Integer uid,
                                    @RequestParam Integer ObjId,
                                    @RequestParam Integer type){
        ServiceResult<Integer> serviceResult = collectApi.deleteCollects(uid, ObjId);
        if (serviceResult.getResultCode()==SUCCESS){
            return getResult();

        }
        return getResult(false,"取消失败");


    }


    //endregion


}
