package com.xxx.messageBo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xxx.messageBo.bean.User;
import com.xxx.messageBo.dao.UserDao;
import com.xxx.messageBo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class UserLoginServlet
 */
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		HttpSession session=request.getSession();
		String loginName=request.getParameter("loginName");
		System.out.println("loginName1:" + loginName);
		String password=request.getParameter("password");
		System.out.println("password:"+password);
		User user=(User)userDao.loginSelect(loginName, password);
		if(user.getUsername()==null||user.getRole()==1||user.getUsername()==" "){
			response.sendRedirect("error.jsp");
		}else{	
			session.setAttribute("user", user);
			if(loginName==""||password==""){
				response.sendRedirect("error.jsp");
			}else{
				response.sendRedirect("SelectServlet");
			}
			
		}
	}

}
