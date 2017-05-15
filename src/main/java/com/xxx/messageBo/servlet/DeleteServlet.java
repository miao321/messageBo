package com.xxx.messageBo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.messageBo.dao.MessageDao;
import com.xxx.messageBo.dao.UserDao;
import com.xxx.messageBo.dao.impl.MessageDaoImpl;
import com.xxx.messageBo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
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
		PrintWriter pw=response.getWriter();
//		UserDao userDao=new UserDaoImpl();
//		int userId=Integer.parseInt(request.getParameter("userId"));
//		if(userDao.deleteUser(userId)){
//			pw.println("success");
//		}else{
//			pw.println("failure");
//		}
		MessageDao messageDao=new MessageDaoImpl();
		int messageId=Integer.parseInt(request.getParameter("messageId"));
		if(messageDao.deleteMessage(messageId)){
			response.sendRedirect("SelectServlet");
		}else{
			pw.println("failure");
		}
	}

}
