package com.yb.user.dao;

import com.github.pagehelper.PageHelper;
import com.yb.base.component.BaseDao;
import com.yb.user.model.YbUserCollect;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by 80657 on 2017/11/8.
 */
@Repository
public class UserCollectDao extends BaseDao<YbUserCollect> {


    public List<YbUserCollect> queryAllCollect(Integer uid, Integer page, Integer pageSize, Integer type) {
        Example example = new Example(YbUserCollect.class);
        Example.Criteria criteria = example.createCriteria();
        if (uid!=null&&type!=null)
        criteria.andEqualTo("type", type).andEqualTo("uid", uid);
        if (page!=null&&pageSize!=null)
        PageHelper.startPage(page, pageSize, true);
        return selectByExample(example);

    }

    public int deleteCollect(Integer uid, Integer objid) {
        Example example = new Example(YbUserCollect.class);
        Example.Criteria criteria = example.createCriteria();
        if (uid!=null&&objid!=null){
            criteria.andEqualTo("uid", uid).andEqualTo("typeObjId", objid);
        }

        return deleteByExample(example);

    }


}
