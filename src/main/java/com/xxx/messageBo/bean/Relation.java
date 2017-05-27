package com.xxx.messageBo.bean;
/**
 * 
 * @author miao
 * @date 2017年5月23日
 */

public class Relation {
	private int relationId;
	private int userId;
	private int friendId;
	private String date;
	
	public Relation(){}
	
	public Relation(int relationId,int userId,int friendId,String date){
		this.relationId=relationId;
		this.userId=userId;
		this.friendId=friendId;
		this.date=date;
	}

	public int getRelationId() {
		return relationId;
	}

	public void setRelationId(int relationId) {
		this.relationId = relationId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFriendId() {
		return friendId;
	}

	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
