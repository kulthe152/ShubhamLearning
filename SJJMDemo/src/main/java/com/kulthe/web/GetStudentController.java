 package com.kulthe.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kulthe.web.dao.StudentDao;
import com.kulthe.web.model.Student;


public class GetStudentController extends HttpServlet {
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sid = Integer.parseInt(request.getParameter("sid"));
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(sid);
		
		request.setAttribute("student", s1);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("showStudent.jsp");
		rd.forward(request, response);
		
	}

	
}
