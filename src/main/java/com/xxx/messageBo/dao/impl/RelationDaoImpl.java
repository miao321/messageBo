package com.xxx.messageBo.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.xxx.messageBo.bean.Relation;
import com.xxx.messageBo.bean.User;
import com.xxx.messageBo.dao.RelationDao;
import com.xxx.messageBo.util.ConnectionFactory;
import com.xxx.messageBo.util.ControlDB;
import com.xxx.messageBo.util.DbClose;

/**
 * 
 * @author miao
 * @date 2017年5月26日下午4:01:08
 */

public class RelationDaoImpl implements RelationDao{
	
	public boolean addFriend(String userId,String friendId){
		
		ControlDB cd=new ControlDB();		
		String setTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		//String sql="select * from tb_users where tb_users.userId=tb_relation.userId";
		String sql="insert into tb_relation(userId,friendId,setTime) values('"+userId+"','"+friendId+"','"+setTime+"')";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public boolean addFriend(Relation relation){
		ControlDB cd=new ControlDB();
		String setTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		String sql="insert into tb_relation(relationId,userId,friendId,setTime) values(?,?,?,?)";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public User searchFriends(String username){
		ControlDB cd=new ControlDB();
		User user=new User();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		boolean flag=false;
		try{
			conn=ConnectionFactory.getConnection();
			String sql="select username from tb_users where tb_users.userId=tb_relation.userId order by friendId desc";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//读取信息
			while(rs.next()){
//				Relation rel=new Relation();
//				rel.set
				
				user.setUsername(rs.getString("username"));
			}
			
			//关闭连接对象
			DbClose.close(rs, stmt, conn);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return user;
	}
	
	public List<Relation> getAllFriends(String userId,String friendId){
		List<Relation> list = new ArrayList<Relation>();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
//		String sql="select * from tb_relation order by relationId desc";
//		String sql="select * from tb_users where userId in (select friendId from tb_relation where userId = 1) or userId in (select userId from tb_relation where friendId = 1)";
		String sql="select * from tb_users where userId in (select friendId from tb_relation where userId = '"+userId+"') or userId in (select userId from tb_relation where friendId = '"+friendId+"')";
				
		try{
			conn=ConnectionFactory.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//读取好友信息
			while(rs.next()){
				Relation rel = new Relation();
				rel.setRelationId(rs.getInt("relationId"));
				rel.setUserId(rs.getString("userId"));
				rel.setFriendId(rs.getString("friendId"));
				rel.setDate(rs.getString("setTime"));
				list.add(rel);
			}
			//关闭连接对象
			DbClose.close(rs, stmt, conn);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	
	public boolean deleteFriend(int friendId){
		ControlDB cd = new ControlDB();
		String sql="delete from tb_relation where friendId='"+friendId+"'";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
					
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}

}
