package com.project.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.first.dao.UserRepository;
import com.project.first.entities.Contact;
import com.project.first.entities.User;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
}
