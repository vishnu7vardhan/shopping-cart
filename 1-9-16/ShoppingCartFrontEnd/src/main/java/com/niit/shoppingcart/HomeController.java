package com.niit.shoppingcart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	//if you want to navigate
	@RequestMapping("/")
	public String Home()
	{
		return "/Index";
	}
	
	@RequestMapping("/Index")
	public String index()
	{
		return "/Index";
	}
	
	@RequestMapping("/Gallery")
	public String gallery()
	{
		return "Gallery";
	}
	
	@RequestMapping("/Menu")
	public String menu()
	{
		return "Menu";
	}
	/*@RequestMapping("/Login")
	public String login()
	{
		return "Login";
	}*/
	/*@RequestMapping("/Register")
	public String register()
	{
		return "Register";
	}*/
	
	@RequestMapping("/LoginPage")
	public String loginpage()
	{
		return "LoginPage";
	}
	/*@RequestMapping("/RegisterPage")
	public String registerpage()
	{
		return "RegisterPage";
	}*/
}

/*	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("message","thank you for visiting");
		return mv;
	}
	
	@RequestMapping("/Register")
	public ModelAndView register()
	{
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("user click register here", "true");
		return mv;
	}
	
	@RequestMapping("/Login")
	public ModelAndView login()
	{
	
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("user click login here", "true");
		return mv;
	}
}
*/


