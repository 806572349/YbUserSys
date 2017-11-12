package com.yb.user.service;


import java.util.Date;

import om.dubbo.api.user.UserLoginServiceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import com.yb.base.util.GenerateGUID;
import com.yb.user.dao.UserDao;
import com.yb.user.dao.UserLoginDao;
import com.yb.user.model.YbUser;
import com.yb.user.model.YbUserInfo;


@Service
@Component
public class UserLoginService implements UserLoginServiceApi {


    private static final Logger log = LoggerFactory.getLogger(UserLoginService.class);

    @Autowired
    UserLoginDao userlogindao;

    @Autowired
    UserDao userDao;

    @Override
    public ServiceResult<YbUser> findbyPhone(String phone) {

        YbUser ybUser = userDao.querybyphone(phone);
        if (ybUser == null) {
            return generateResult(COMMONFAIL, "未找到该用户", null);
        }
        log.info(phone + ybUser.toString());
        return generateResult(ybUser);

    }

    @Override
    public ServiceResult<YbUser> save(YbUser ybUser) {
        if (ybUser == null) {
            return generateResult(COMMONFAIL, "参数为空", null);
        }
//		ybUser.setCreateTime(new Date());
//		ybUser.setCreateTime(new Date());
//		ybUser.setDeviceCode(deviceCode);
//		ybUser.setLoginTime(new Date());
//		ybUser.setPhone(phone);
//		ybUser.setUsername(phone);
//		ybUser.setUserLevel(1);
//		ybUser.setUserRegWay("android");
//		ybUser.setUserCode(GenerateGUID.generateGUID());
        userlogindao.save(ybUser);

        return findbyPhone(ybUser.getPhone());

    }

    @Override
    public ServiceResult<YbUserInfo> findUserInfo(Integer id) {
        YbUserInfo userInfo = userDao.queryUserInfo(id);
        return generateResult(userInfo);

    }

    @Override
    public ServiceResult<YbUser> CreateYbUser(String phone, String deviceCode) {
        YbUser ybUser = new YbUser();
        ybUser.setCreateTime(new Date());
        ybUser.setCreateTime(new Date());
        ybUser.setDeviceCode(deviceCode);
        ybUser.setLoginTime(new Date());
        ybUser.setPhone(phone);
        ybUser.setUsername(phone);
        ybUser.setUserLevel(1);
        ybUser.setUserRegWay("android");
        ybUser.setUserCode(GenerateGUID.generateGUID());
        return generateResult(ybUser);

    }


}
