package com.yb.user.dao;

import com.yb.base.component.BaseDao;
import com.yb.user.model.YbUserCart;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by 80657 on 2017/11/9.
 */
@Repository
public class UserCartDao extends BaseDao<YbUserCart> {



    public List<YbUserCart> selectAll(Integer uid){
        Example example=new Example(YbUserCart.class);
        Example.Criteria criteria = example.createCriteria();
        if (uid==null){
            throw  new RuntimeException("UserCartDao类 uid 为空");
        }
        criteria.andEqualTo("uid",uid);
        List<YbUserCart> ybUserCarts = selectByExample(example);
        return  ybUserCarts;
    }

    @Transactional
    public void saveYbUserCart(YbUserCart ybUserCart){
        save(ybUserCart);

    }





}
