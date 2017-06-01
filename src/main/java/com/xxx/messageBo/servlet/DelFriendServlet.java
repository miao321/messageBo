package com.xxx.messageBo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.messageBo.dao.RelationDao;
import com.xxx.messageBo.dao.UserDao;
import com.xxx.messageBo.dao.impl.RelationDaoImpl;
import com.xxx.messageBo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class DelFriendServlet
 */
public class DelFriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelFriendServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RelationDao relationDao = new RelationDaoImpl();
		int friendId=Integer.parseInt(request.getParameter("friendId"));
		if(relationDao.deleteFriend(friendId)){
			response.sendRedirect("friendsList.jsp");
		}
	}

}
