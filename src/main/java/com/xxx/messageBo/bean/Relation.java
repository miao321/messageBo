package com.xxx.messageBo.bean;
/**
 * 
 * @author miao
 * @date 2017年5月23日
 */

public class Relation {
	private int relationId;
	private String userId;
	private String friendId;
	private String date;
	
	public Relation(){}
	
	public Relation(int relationId,String userId,String friendId,String date){
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
