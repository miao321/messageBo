package com.xxx.messageBo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.messageBo.dao.UserDao;
import com.xxx.messageBo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class TagServlet
 */
public class TagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TagServlet() {
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
		int userId=Integer.parseInt(request.getParameter("userId"));
		String type=request.getParameter("role");
		int role=Integer.parseInt(type);
		if(userDao.setUserTag(userId, role)){
			response.sendRedirect("userManager.jsp");
		}
	}

}
