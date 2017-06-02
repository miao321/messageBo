package com.xxx.messageBo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xxx.messageBo.bean.User;
import com.xxx.messageBo.dao.MessageDao;
import com.xxx.messageBo.dao.UserDao;
import com.xxx.messageBo.dao.impl.MessageDaoImpl;
import com.xxx.messageBo.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class ReMessageServlet
 */
public class ReMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReMessageServlet() {
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
		request.setCharacterEncoding("UTF-8");
		MessageDao messageDao=new MessageDaoImpl();
		UserDao userDao=new UserDaoImpl();
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		String content=request.getParameter("content");  //这里有毛病
		int userId=user.getUserId();
		
		String author=user.getUsername();
		int tag=userDao.getUserTag(userId);
		
		if(tag==0){
			messageDao.insertMessage(author, content);
			pw.println("success");
			
		}else{
			pw.println("failure");
		}
	}

}
