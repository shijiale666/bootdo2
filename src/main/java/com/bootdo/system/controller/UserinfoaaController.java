package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.UserinfoaaDO;
import com.bootdo.system.service.UserinfoaaService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-13 16:07:10
 */
 
@Controller
@RequestMapping("/system/userinfoaa")
public class UserinfoaaController {
	@Autowired
	private UserinfoaaService userinfoaaService;
	
	@GetMapping()
	@RequiresPermissions("system:userinfoaa:userinfoaa")
	String Userinfoaa(){
	    return "system/userinfoaa/userinfoaa";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:userinfoaa:userinfoaa")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UserinfoaaDO> userinfoaaList = userinfoaaService.list(query);
		int total = userinfoaaService.count(query);
		PageUtils pageUtils = new PageUtils(userinfoaaList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:userinfoaa:add")
	String add(){
	    return "system/userinfoaa/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:userinfoaa:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		UserinfoaaDO userinfoaa = userinfoaaService.get(id);
		model.addAttribute("userinfoaa", userinfoaa);
	    return "system/userinfoaa/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:userinfoaa:add")
	public R save( UserinfoaaDO userinfoaa){
		if(userinfoaaService.save(userinfoaa)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:userinfoaa:edit")
	public R update( UserinfoaaDO userinfoaa){
		userinfoaaService.update(userinfoaa);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:userinfoaa:remove")
	public R remove( Integer id){
		if(userinfoaaService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:userinfoaa:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		userinfoaaService.batchRemove(ids);
		return R.ok();
	}
	
}
