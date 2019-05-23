package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.UserinfoaaDao;
import com.bootdo.system.domain.UserinfoaaDO;
import com.bootdo.system.service.UserinfoaaService;



@Service
public class UserinfoaaServiceImpl implements UserinfoaaService {
	@Autowired
	private UserinfoaaDao userinfoaaDao;
	
	@Override
	public UserinfoaaDO get(Integer id){
		return userinfoaaDao.get(id);
	}
	
	@Override
	public List<UserinfoaaDO> list(Map<String, Object> map){
		return userinfoaaDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return userinfoaaDao.count(map);
	}
	
	@Override
	public int save(UserinfoaaDO userinfoaa){
		return userinfoaaDao.save(userinfoaa);
	}
	
	@Override
	public int update(UserinfoaaDO userinfoaa){
		return userinfoaaDao.update(userinfoaa);
	}
	
	@Override
	public int remove(Integer id){
		return userinfoaaDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return userinfoaaDao.batchRemove(ids);
	}
	
}
