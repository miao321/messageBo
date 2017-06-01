package com.xxx.messageBo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xxx.messageBo.bean.User;
import com.xxx.messageBo.bean.Relation;
import com.xxx.messageBo.dao.RelationDao;
import com.xxx.messageBo.dao.UserDao;
import com.xxx.messageBo.dao.impl.RelationDaoImpl;
import com.xxx.messageBo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class AddFriendServlet
 */
public class AddFriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFriendServlet() {
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
		RelationDao relationDao=new RelationDaoImpl();
		UserDao userDao = new UserDaoImpl();
		//UserDao userDao=new UserDaoImpl();
		PrintWriter pw=response.getWriter();
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("Utf-8");
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
//		Relation rel=(Relation)session.getAttribute("rel");
//		int userId=rel.getUserId();
//		int friendId=rel.getFriendId();
		//String setTime=rel.getDate();
		//int userId=request.getParameter("userId");
		String authorName=request.getParameter("author");
//		System.out.println("authorName:" + authorName);
		String friendId = String.valueOf(userDao.selectUser(authorName).get(0).getUserId());
		String userId = String.valueOf(user.getUserId());
		//relationDao.addFriend(relation);
//		System.out.println("userId:" + userId);
//		System.out.println("friendId:" + friendId);
		relationDao.addFriend(userId, friendId);
		
	}

}
