package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-23 10:46:31
 */
public class WebsiteDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String title;
	//
	private String keyword;
	//
	private String descr;
	//
	private String phone;
	//
	private String mail;
	//
	private String baknum;
	//
	private String versions;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	 * 获取：
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * 设置：
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}
	/**
	 * 获取：
	 */
	public String getDescr() {
		return descr;
	}
	/**
	 * 设置：
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * 获取：
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * 设置：
	 */
	public void setBaknum(String baknum) {
		this.baknum = baknum;
	}
	/**
	 * 获取：
	 */
	public String getBaknum() {
		return baknum;
	}
	/**
	 * 设置：
	 */
	public void setVersions(String versions) {
		this.versions = versions;
	}
	/**
	 * 获取：
	 */
	public String getVersions() {
		return versions;
	}
}
