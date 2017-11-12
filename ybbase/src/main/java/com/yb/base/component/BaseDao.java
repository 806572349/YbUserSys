package com.yb.base.component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import tk.mybatis.mapper.common.Mapper;

public abstract class BaseDao<T> extends SqlSessionDaoSupport implements IDao<T>  {

	public Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
	
    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int save(T entity) {
        return mapper.insert(entity);
    }

    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }
    
    public int deleteByExample(Object example) {
        return mapper.deleteByExample(example);
    }

    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }
    
    public Map<String,Object> selectPageByExample(Integer page,Integer pageSize,Object example) {
    	Map<String, Object> map =new  HashMap<>();
		Page<T> pagetotal = null;
		if(page!=null&&pageSize!=null) {
			pagetotal  =  PageHelper.startPage(page, pageSize, true);
		}
		List<T> list=mapper.selectByExample(example);
		map.put("list", list);
		if(pagetotal != null) {
			map.put("total", pagetotal.getTotal());
		}
        return map;
    }
    
    
    //TODO 其他...
}

