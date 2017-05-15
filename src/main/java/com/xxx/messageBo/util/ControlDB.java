package com.xxx.messageBo.util;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ControlDB {
	public boolean executeUpdate(String sql) throws SQLException{
		Connection conn=null;
		Statement stmt=null;
		boolean flag=false;
		try{
			conn=ConnectionFactory.getConnection();
			stmt=conn.createStatement();
			int result=stmt.executeUpdate(sql);
			if(result==1)
				flag=true;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			conn.close();
			stmt.close();
			stmt=null;
			conn=null;
		}
		return flag;
	}

}
