package com.xxx.messageBo.dao;

import java.util.List;

import com.xxx.messageBo.bean.Message;

/**
 * 操作留言信息类
 * @author miao
 * @date 2017年5月7日
 */

public interface MessageDao {
	/**
	 * 获取所有留言信息
	 * @return List<Message>
	 */
	public List<Message> getAllMessage() ;
	
	/**
	 * 获得单条留言信息
	 * @param messageId
	 * @return Message
	 */
	public Message getOneMessage(int messageId);

	/**
	 * 获得某个用户的留言信息
	 * @param author
	 * @return List<Message>
	 */
	public List<Message> selectByAuthor(String author);
	
	/**
	 * 删除单条留言信息
	 * @param messageId
	 * @return boolean
	 */
	public boolean deleteMessage(int messageId);
	
	/**
	 * 更新某条留言信息
	 * @param messageId
	 * @param context;
	 * @return boolean
	 */
	public boolean updateMessage(int messageId,String context);
	
	/**
	 * 新增留言信息
	 * @param author
	 * @param context
	 * @return boolean
	 */
	public boolean insertMessage(String author,String context);
}
