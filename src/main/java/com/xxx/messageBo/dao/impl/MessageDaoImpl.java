package com.xxx.messageBo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.xxx.messageBo.bean.Message;
import com.xxx.messageBo.dao.MessageDao;
import com.xxx.messageBo.util.ConnectionFactory;
import com.xxx.messageBo.util.ControlDB;
import com.xxx.messageBo.util.DbClose;

public class MessageDaoImpl implements MessageDao {
	
	public List<Message> getAllMessage(){
		List<Message> list=new ArrayList<Message>();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql="select * from tb_message order by messageId desc";
		try{
			conn=ConnectionFactory.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//读取留言信息
			while(rs.next()){
				Message msg=new Message();
				msg.setMessageId(rs.getInt("messageId"));
				msg.setAuthor(rs.getString("author"));
				msg.setContext(rs.getString("context"));
				msg.setDate(rs.getString("msgdate"));
				list.add(msg);
			}
			//关闭连接对象
			DbClose.close(rs, stmt, conn);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;	
	}
	
	public Message getOneMessage(int messageId){
		Message msg=new Message();
		Connection conn=null;
		PreparedStatement ptst=null;
		ResultSet rs=null;
		String sql="select * from tb_message where messageId="+messageId;
		
		try{
			conn=ConnectionFactory.getConnection();
			ptst=conn.prepareStatement(sql);
			//ptst.setInt(1, messageId);
			rs=ptst.executeQuery(sql);
			if(rs.next()){
				msg.setMessageId(rs.getInt("messageId"));
				msg.setAuthor(rs.getString("author"));
				msg.setContext(rs.getString("context"));
				msg.setDate(rs.getString("msgdate"));
			}
			DbClose.close(rs, ptst, conn);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return msg;
	}
	
	public List<Message> selectByAuthor(String author){
		List<Message> list=new ArrayList<Message>();
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			conn=ConnectionFactory.getConnection();
			String s=author.trim();
			String sql="select * from tb_message where author='"+s+"' order by messageId desc";
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()){
				while(rs.next()){
				//如果有该用户的留言信息
				Message msg=new Message();
				msg.setMessageId(rs.getInt("messageId"));
				msg.setAuthor(rs.getString("author"));
				msg.setContext(rs.getString("context"));
				msg.setDate(rs.getString("msgdate"));	
				list.add(msg);
			}
			DbClose.close(rs, st, conn);
		}else{
			//如果没有该用户的留言信息，则返回所有留言
			list=(new MessageDaoImpl()).getAllMessage();
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return list;
	}
	
	public boolean deleteMessage(int messageId){
		ControlDB cd=new ControlDB();
		boolean flag=false;
		String sql="delete from tb_message where messageId='"+messageId+"'";
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updateMessage(int messageId,String context){
		ControlDB cd=new ControlDB();
		String sql="update tb_message set context='"+context+"'where messageId='"+messageId+"'";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean insertMessage(String author,String context){
		ControlDB cd=new ControlDB();
		
		String nowTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		String sql="insert into tb_message(author,context,msgdate) values('"+author+"','"+context+"','"+nowTime+"')";
		//String sql="insert into tb_message(messageId,author,context,msgdate) values(?,?,?,?)";
		boolean flag=false;
		try{
			flag=cd.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}

}
