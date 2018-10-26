package com.SpringMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddContrller
{
	@RequestMapping("/apple")
	public ModelAndView addition(HttpServletRequest request,HttpServletResponse response) 
	{
		int i = Integer.parseInt(request.getParamater("a1"));
		int j = Integer.parseInt(request.getParamater("a2"));
		int k =i+j;
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Display.jsp");
		mv.addObject("result", k);
		
		return mv;
	}
}
