package com.xxx.messageBo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.messageBo.dao.UserDao;
import com.xxx.messageBo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDaoImpl();
		PrintWriter pw=response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmPassword");
		try{
			if(userDao.insertUser(userName, password)){
				pw.println("success");
				//response.sendRedirect("login.jsp");
				//request.getRequestDispatcher("login.jsp").forward(request, response);
			}else{
				pw.println("failure");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
