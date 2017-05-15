package com.xxx.messageBo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xxx.messageBo.bean.User;
import com.xxx.messageBo.dao.UserDao;
import com.xxx.messageBo.util.ConnectionFactory;
import com.xxx.messageBo.util.ControlDB;
import com.xxx.messageBo.util.DbClose;

/**
 * 操作用户类
 * @author miao
 * @date 2017年5月7日
 */

public class UserDaoImpl implements UserDao {
	
	public User loginSelect(String loginName,String password){
		User user=new User();
		String sql="select * from users where username='"+loginName+"' and password='"+password+"'";
		try{
			Connection conn=ConnectionFactory.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=null;
			rs=st.executeQuery(sql);
			if(rs.next()){
				user.setUserId(rs.getInt("userId"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setTag(rs.getInt("tag"));
				user.setRole(rs.getInt("role"));
			}
			DbClose.close(rs, st, conn);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return user;
	}
	
	
	public boolean changePassword(int userId,String psw,String psw1 ){
		ControlDB cd=new ControlDB();
		String sql="update users set password='"+psw1+"' where userId='"+userId+"' and password='"+psw+"'";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public List<User> getAllUser(){
		List<User> list=new ArrayList<User>();
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		conn=ConnectionFactory.getConnection();
		try{
			st=conn.createStatement();
			String sql="select * from users where role=0";
			rs=st.executeQuery(sql);
			while(rs.next()){
				User user=new User();
				user.setUserId(rs.getInt("userId"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setTag(rs.getInt("tag"));
				list.add(user);
			}
			DbClose.close(rs, st, conn);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public List<User> selectUser(String username){
		List<User> list=new ArrayList<User>();
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		String sql="select * from users where role=0 and username='"+username+"'";
		try{
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()){
				//有用户则返回
				do{
					User user=new User();
					user.setUserId(rs.getInt("userId"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setTag(rs.getInt("tag"));
					list.add(user);
				}while(rs.next());
				DbClose.close(rs, st, conn);
			}else{
				//否则返回所有用户
				list=(new UserDaoImpl()).getAllUser();
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean setUserTag(int userId,int type){
		ControlDB cd=new ControlDB();
		String sql="update users set tag='"+type+"' where userId='"+userId+"'";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public int getUserTag(int userId){
		Connection conn=null;
		conn=ConnectionFactory.getConnection();
		PreparedStatement ptst=null;
		ResultSet rs=null;
		int tag=0;
		String sql="select * from users where userId=?";
		try{
			ptst=conn.prepareStatement(sql);
			ptst.setInt(1,userId);
			rs=ptst.executeQuery();
			if(rs.next()){
				tag=rs.getInt("tag");
				DbClose.close(rs, ptst, conn);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return tag;
	}
	
	public boolean insertUser(String username,String psw){
		ControlDB cd=new ControlDB();
		String sql="insert into users(username,password,tag,role) values('"+username+"','"+psw+"','"+0+"','"+0+"')";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean deleteUser(int userId){
		ControlDB cd=new ControlDB();
		String sql="delete from users where userId='"+userId+"'";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	

}
