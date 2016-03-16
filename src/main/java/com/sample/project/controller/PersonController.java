package com.sample.project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.project.model.entity.Person;
import com.sample.project.service.PersonService;

@RestController
@RequestMapping(value="/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping(path="/create")
	@ResponseBody
	public String create(@Valid Person person, BindingResult result){
		if (result.hasErrors()) {
			return "Name can't be null!";
		}
		return service.create(person);
	}

}
