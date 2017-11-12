package com.yb.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yb.user.dao.UserCollectDao;
import com.yb.user.model.YbUserCollect;
import om.dubbo.api.user.UserCollectApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by 80657 on 2017/11/8.
 */
@Service
@Component
public class UserCollectService implements UserCollectApi {

    @Autowired
    UserCollectDao userCollectDao;

    @Override
    public ServiceResult<List<YbUserCollect>> getCollectList(Integer id, Integer page, Integer pageSize, Integer type) {
        return generateResult(userCollectDao.queryAllCollect(id, page, pageSize, type));

    }

    @Override
    public ServiceResult<Integer> addCollects(YbUserCollect ybUserCollect) {
        userCollectDao.save(ybUserCollect);
        return generateResult(SUCCESS, "收藏成功", 0);


    }

    @Override
    public ServiceResult<Integer> deleteCollects(int uid,int objid){
        userCollectDao.deleteCollect(uid,objid);
        return  generateResult(SUCCESS,"删除成功",0);
    }


    @Override
    public YbUserCollect createCollect(Integer uid, Integer objid, String objname, String objdesc, String objnicn, String objurl, String objproperty, Integer type) {
        YbUserCollect userCollect = new YbUserCollect();
        userCollect.setUid(uid);
        userCollect.setCreateTime(new Date());
        userCollect.setType(type);
        userCollect.setTypeObjId(objid);
        userCollect.setTypeObjName(objname);
        userCollect.setTypeObjDesc(objdesc);
        userCollect.setTypeObjIcon(objnicn);
        userCollect.setTypeObjProperty(objproperty);
        userCollect.setTypeObjUrl(objurl);
        return userCollect;


    }


}
