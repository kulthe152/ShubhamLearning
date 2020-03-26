package com.kulthe;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.serv.MultiService;


@Controller
public class Addcontroller 
{
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletRequest request, HttpServletResponse response)
	{
		MultiService ms = new MultiService();
		int k = ms.mul(i, j);
				
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Dakhav");
		mv.addObject("result", k);
		
		return mv;
	}
}
 