package com.spring.returntype;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HelloController { 
	
	@RequestMapping("/hello") 
	public ModelAndView hello() { 
		ModelAndView view = new ModelAndView(); // View´Â hello.jsp 
		view.setViewName("hello"); // [hello.jsp] ${name} = Lim 
		view.addObject("name", "KyumJae"); return view; 
	} 
	
	@RequestMapping("/hello2") 
	public String hello2() { 
		// View´Â hello.jsp 
		return "hello"; 
	}
	
	@RequestMapping("/hello3") 
	public void hello3() { 
		
	}
	
	@RequestMapping("/hello4") 
	@ResponseBody 
	public String hello4() { 
		return "<html><body><h1>Hello, ResponseBody!</h1></body></html>"; 
	}
}
