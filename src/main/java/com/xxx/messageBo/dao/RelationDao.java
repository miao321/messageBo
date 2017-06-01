package com.xxx.messageBo.dao;

import java.util.List;

import com.xxx.messageBo.bean.Relation;
import com.xxx.messageBo.bean.User;

/**
 * 
 * @author miao
 * @date 2017年5月23日下午9:46:23
 */
public interface RelationDao {
	/**
	 * 添加好友
	 * @param userId
	 * @param friendId
	 * @return boolean
	 */
	public boolean addFriend(String userId,String friendId);
	
	public boolean addFriend(Relation relation);
	
	/**
	 * 查看好友
	 * @param userId
	 * @return boolean
	 */
	public User searchFriends(String username);
	
	/**
	 * 获取所有好友
	 * @return Relation<list>
	 */
	 public List<Relation> getAllFriends(String userId,String friendId);
	 
	 /**
	  * 删除好友
	  * @param friendId
	  * @return boolean
	  */
	 public boolean deleteFriend(int friendId);

	

}
