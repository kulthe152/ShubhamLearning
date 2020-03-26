package com.kulthe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kulthe.dao.loginDao;

/**
 * Servlet implementation class Login_opr
 */
@WebServlet("/login")
public class Login_opr extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uu = request.getParameter("unm");
		String pp = request.getParameter("pass");
		
		loginDao dd = new loginDao();
		
		if(dd.check(uu, pp))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username",uu);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}

	}	
}
