package com.bootdo.system.service;

import com.bootdo.system.domain.UserinfoaaDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-13 16:07:10
 */
public interface UserinfoaaService {
	
	UserinfoaaDO get(Integer id);
	
	List<UserinfoaaDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserinfoaaDO userinfoaa);
	
	int update(UserinfoaaDO userinfoaa);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
