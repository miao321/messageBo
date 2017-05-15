package com.xxx.messageBo.bean;

/**
 * 用户类
 * @author miao
 * @date 2017年5月7日
 */

public class User {
	private int userId;
	private String username;         //用户名
	private String password;    //密码
	private int tag;    //权限  0：允许发言    1：不允许发言
	private int role;    //0:用户     1：管理员
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	

}
