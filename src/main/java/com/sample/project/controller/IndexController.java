package com.sample.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping("/")
	public String index(){
		return "Spring Boot Project by Ricardo Davanço Freire";
	}

}
