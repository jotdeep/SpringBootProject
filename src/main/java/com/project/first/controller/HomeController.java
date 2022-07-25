package com.project.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.first.dao.UserRepository;
import com.project.first.entities.Contact;
import com.project.first.entities.User;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("title","Home - Smart Contact Manager");
		return "home";
	}
	@RequestMapping("/base")
	public String base()
	{
		return "base";
	}
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	@RequestMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("title","Signup - Smart Contact Manager");
		return "signup";
	}
}
 