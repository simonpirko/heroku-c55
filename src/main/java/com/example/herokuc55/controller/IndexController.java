package com.example.herokuc55.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Simon Pirko on 19.09.22
 */

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String getIndex(){
		System.out.println("Hello")
		return "home";
	}
}
