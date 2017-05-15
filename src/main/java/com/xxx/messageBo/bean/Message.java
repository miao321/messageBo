package com.xxx.messageBo.bean;

/**
 * 留言信息类
 * @author miao
 * @date 2017年5月7日
 */

public class Message {
	private int messageId;
	private String author;   //作者
	private String context;   //内容
	private String date;    //日期
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
