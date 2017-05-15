package com.xxx.messageBo.dao;

import java.util.List;

import com.xxx.messageBo.bean.User;

/**
 * 操作用户类
 * @author miao
 * @date 2017年5月7日
 */

public interface UserDao {
	
	/**
	 * 获取登录用户信息
	 * @param loginName
	 * @param password
	 * @return
	 */
	public User loginSelect(String loginName,String password);
	
	/**
	 * 修改密码
	 * @param id 
	 * @param psw
	 * @param psw1
	 * @return
	 */
	public boolean changePassword(int userId,String psw,String psw1);
	
	/**
	 * 获得所有用户
	 * @return
	 */
	public List<User> getAllUser();
	
	/**
	 * 根据用户名查找用户
	 * @param name
	 * @return
	 */
	public List<User> selectUser(String username);
	
	/**
	 * 设置用户权限
	 * @param id
	 * param type
	 * @return 
	 */
	public boolean setUserTag(int userId,int type);
	
	/**
	 * 获取用户权限
	 * @param id
	 * @return 
	 */
	public int getUserTag(int userId);
	
	/**
	 * 增加用户
	 * @param name
	 * @param psw
	 * @return
	 */
	public boolean insertUser(String username,String psw);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public boolean deleteUser(int userId);
	

}
