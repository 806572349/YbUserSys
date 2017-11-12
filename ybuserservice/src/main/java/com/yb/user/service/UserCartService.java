package com.yb.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yb.base.component.BaseService;
import com.yb.user.dao.UserCartDao;
import com.yb.user.model.YbUserCart;
import om.dubbo.api.user.UserCartApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by 80657 on 2017/11/9.
 */
// region
/*
      ┏┛ ┻━━━━━┛ ┻┓
      ┃　　　　　　 ┃
      ┃　　　━　　　┃
      ┃　┳┛　  ┗┳　┃
      ┃　　　　　　 ┃
      ┃　　　┻　　　┃
      ┃　　　　　　 ┃
      ┗━┓　　　┏━━━┛
       ┃　　　┃   神兽保佑
       ┃　　　┃   代码无BUG！
       ┃　　　┗━━━━━━━━━┓
       ┃　　　　　　　    ┣┓
       ┃　　　　         ┏┛
       ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
         ┃ ┫ ┫   ┃ ┫ ┫
         ┗━┻━┛   ┗━┻━┛
 */
// endregion
@Service
@Component
public class UserCartService implements UserCartApi {
    @Autowired
    UserCartDao userCartDao;

    @Override
    public List<YbUserCart> queryAll(Integer uid){
        List<YbUserCart> ybUserCarts = userCartDao.selectAll(uid);
        return ybUserCarts;
    }

    @Override
    public void save(YbUserCart ybUserCart){

        userCartDao.saveYbUserCart(ybUserCart);


    }


}
