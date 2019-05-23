package com.bootdo.system.service;

import com.bootdo.system.domain.WebsiteDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-23 10:46:31
 */
public interface WebsiteService {
	
	WebsiteDO get(Integer id);
	
	List<WebsiteDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WebsiteDO website);
	
	int update(WebsiteDO website);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
