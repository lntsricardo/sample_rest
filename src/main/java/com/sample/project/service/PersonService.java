package com.sample.project.service;

import java.util.List;

import com.sample.project.model.entity.Person;

public interface PersonService {

	String create(Person person) throws Exception;
	
	List<Person> findByName(String name) throws Exception;

	List<Person> findAll() throws Exception;

}
