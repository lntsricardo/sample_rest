package com.sample.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.project.model.dao.PersonRepository;
import com.sample.project.model.entity.Person;
import com.sample.project.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository dao;

	@Override
	public String create(Person person) throws Exception {
		Person personCreated = dao.insert(person);
		return String.format("Person %s created successfully", personCreated.getName());
	}

	@Override
	public List<Person> findByName(String name) throws Exception {
		return dao.findByName(name);
	}

	@Override
	public List<Person> findAll() throws Exception {
		return dao.findAll();
	}

}
