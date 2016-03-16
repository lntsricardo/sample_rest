package com.sample.project.model.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.project.model.entity.Person;

public interface PersonRepository extends MongoRepository<Person, String>{
	
	public List<Person> findByName(String name);

}
