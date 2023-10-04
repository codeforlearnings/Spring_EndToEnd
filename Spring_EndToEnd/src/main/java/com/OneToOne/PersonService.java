package com.OneToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public Person save(Person person) {
		person.getAddress().setPerson(person);
		return personRepository.save(person);
	}
	
	public List<Person> readAll(){
		return (List<Person>) personRepository.findAll();
	}
	
	public Person read(Integer id) {
		return personRepository.findById(id).get();
	}
	
	public Integer delete(Integer id) {
		personRepository.deleteById(id);
		return id;
	}
}
