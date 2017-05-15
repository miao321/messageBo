package com.xxx.messageBo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.messageBo.dao.MessageDao;
import com.xxx.messageBo.dao.impl.MessageDaoImpl;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
		MessageDao messageDao=new MessageDaoImpl();
		PrintWriter pw=response.getWriter();
		request.setCharacterEncoding("UTF-8");
		int messageId=Integer.parseInt(request.getParameter("messageId"));
		String context=request.getParameter("context");
		if(messageDao.updateMessage(messageId, context)){
			pw.println("success");
		}else{
			pw.println("failure");
		}
	}

}
