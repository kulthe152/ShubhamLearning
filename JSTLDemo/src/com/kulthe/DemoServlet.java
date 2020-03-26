package com.kulthe;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		 
		 List<student> stud = Arrays.asList(new student(1,"shubh"),new student(2,"pallu"),new student(3,"darshana"));
		 
		 
		 req.setAttribute("student", stud);
		 RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		 rd.forward(req, res);
	}
}
