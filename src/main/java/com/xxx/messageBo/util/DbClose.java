package com.xxx.messageBo.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 关闭连接对象
 * @author miao
 * @date 2017年5月7日
 */

public class DbClose {
	public static void close(Connection conn){
		if(conn!=null){
			try{
				conn.close();
				conn=null;
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Statement stmt){
		if(stmt!=null){
			try{
				stmt.close();
				stmt=null;
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs){
		if(rs!=null){
			try{
				rs.close();
				rs=null;
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs,Statement stmt,Connection conn){
		close(rs);
		close(stmt);
		close(conn);
	}
	
	public static void close(Statement stmt,Connection conn){
		close(stmt);
		close(conn);
	}

}
