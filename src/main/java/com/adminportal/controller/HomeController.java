package com.adminportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adminportal.domain.Book;
import com.adminportal.service.BookService;

@Controller
public class HomeController {

	
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		
		return "login";
	}
	
	
}
