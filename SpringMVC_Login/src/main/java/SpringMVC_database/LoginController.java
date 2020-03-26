package SpringMVC_database;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Services_database.LoginService;

@Controller
public class LoginController 
{
	@RequestMapping("/credentials")
	public ModelAndView checkCredentials(HttpServletRequest req, HttpServletResponse res)
	{
		ModelAndView mv = new ModelAndView();
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		if(new LoginService().check(uname,pass))
		{
			mv.setViewName("success.jsp");
		}
		else
		{
			mv.setViewName("index.jsp");
		}
		
		return mv;
	}
}
