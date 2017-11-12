package com.yb.user.dao;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yb.base.component.BaseDao;
import com.yb.user.entity.YbUserInfoMapper;
import com.yb.user.model.YbUser;
import com.yb.user.model.YbUserInfo;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Repository
public class UserDao  extends BaseDao<YbUser>{
	
	 
	private static final Logger log = LoggerFactory.getLogger(UserDao.class);

	
	@Autowired
	YbUserInfoMapper userInfoMapper;
	
	public YbUser querybyphone(String phone) {
		Example example =new 	Example(YbUser.class);
		log.info(phone+"querybyphone");
		Criteria critria =example.createCriteria();
		critria.andEqualTo("phone",phone);
		List<YbUser> list=selectByExample(example);
		log.info(list.toString()+"querybyphone");
		return list.size()>0?list.get(0):null;
		
	}
	
	public YbUserInfo queryUserInfo(Integer id) {

		return userInfoMapper.selectByPrimaryKey(id);
		
	}
	
	
}
