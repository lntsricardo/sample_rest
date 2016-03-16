package com.sample.project.service.impl;

import org.springframework.stereotype.Service;

import com.sample.project.model.entity.Person;
import com.sample.project.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public String create(Person person) {
		return String.format("Person %s created successfully", person.getName());
	}

}
