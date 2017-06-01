package com.xxx.messageBo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xxx.messageBo.bean.User;
import com.xxx.messageBo.dao.RelationDao;
import com.xxx.messageBo.dao.UserDao;
import com.xxx.messageBo.dao.impl.RelationDaoImpl;
import com.xxx.messageBo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class SelectFriendServlet
 */
public class SelectFriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectFriendServlet() {
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
		UserDao userDao = new UserDaoImpl();
		RelationDao relationDao = new RelationDaoImpl(); 
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		
		String authorName=request.getParameter("author");

		String friendId = String.valueOf(userDao.selectUser(authorName).get(0).getUserId());
		String userId = String.valueOf(user.getUserId());
		
		
//		String username=request.getParameter("user");
//		if(username==null||username==" "){
//			request.setAttribute("userList", userDao.getAllUser());
			request.setAttribute("relationList", relationDao.getAllFriends(userId,friendId));
//		}else{
//			request.setAttribute("userList", userDao.selectUser(username));
//			request.setAttribute("relationList", relationDao.searchFriends(username));
//		}
//		request.getRequestDispatcher("userManager.jsp").forward(request, response);
	
	}

}
