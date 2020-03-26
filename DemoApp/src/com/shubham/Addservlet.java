package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/add")
public class Addservlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));
		
		int k= i + j;
		
		PrintWriter pw = res.getWriter();
		pw.println("Result is "+k);
		pw.println("<html> <body bgcolor='cyan'>");
		pw.println("</html> </body>");
		/*Cookie cok = new Cookie("k", k + "");
		res.addCookie(cok);
		
		res.sendRedirect("/sq");
*/
	}
}
