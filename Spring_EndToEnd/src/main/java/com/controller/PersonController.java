package com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.PersonDTO;
import com.DTO.PersonDTO2;
import com.Repository.PersonRepository;
import com.model.Person;
@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;	
	@PostMapping
	public Person save(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@GetMapping("readAllPersonsWithAge/{age}")
	public List<Person> readAllPersonsWithAge(@PathVariable Integer age){
		return personRepository.findAllByAge(age);
	}
	
	@GetMapping("readAllPersonsWithAgeGr/{age}")
	public List<Person> readAllPersonsWithAgeGr(@PathVariable Integer age){
		return personRepository.findAllByAgeGreaterThan(age);
	}
	
	@GetMapping("readAllPersonsWithAgeLs/{age}")
	public List<Person> readAllPersonsWithAgeLs(@PathVariable Integer age){
		return personRepository.findAllByAgeLessThan(age);
	}
	
	@GetMapping("readAllPersonsWithEmailLike/{email}")
	public List<Person> readAllPersonsWithEmailLike(@PathVariable String email){
		return personRepository.findAllByEmailLike("%" + email + "%");
	}
	
	@GetMapping("readAllPersonsWithEmail/{email}")
	public Person readAllPersonsWithEmail(@PathVariable String email){
		return personRepository.findByEmail(email);
	}	
	
	@GetMapping("readAllFirstNames")
	public String[] readAllFirstNames(){
		return personRepository.readAllFirstNames();
	}	
	
	@GetMapping("readAllLastNames")
	public String[] readAllLastNames(){
		return personRepository.readAllLastNames();
	}	
	
	@GetMapping("readAllEmails")
	public String[] readAllEmails(){
		return personRepository.emails();
	}	
	
	@GetMapping("allAges")
	public Integer[] allAges(){
		return personRepository.allAges();
	}	
	
	@GetMapping("readAllSelectedFirstNames")
	public String[] readAllSelectedFirstNames(){
		return personRepository.readSelectedFirstNames();
	}	
	
	@GetMapping("readAllSelectedLastNames/{arg1}")
	public String[] readAllSelectedLastNames(@PathVariable("arg1") Integer age){
		return personRepository.readSelectedLastNames(age);
	}	
	
	@GetMapping("readAllSelectedEmails/{age}")
	public String[] readAllSelectedEmails(@PathVariable Integer age){
		return personRepository.readSelectedEmails(age);
	}	
	
	@GetMapping("readAllSelectedEmails/{firstName}/{age}")
	public String[] readAllSelectedEmails(@PathVariable String firstName, 
										  @PathVariable Integer age){
		return personRepository.readSelectedEmails(firstName, age);
	}	
	
	
	@GetMapping("readFirstNameAndLastName")
	public List<Object[]> readFirstNameAndLastName(){
		return personRepository.readFirstNameAndLastName();
	}	
	
	@GetMapping("readAllPersons/{email}")
	public List<Person> readAllPersons(@PathVariable String email){
		return personRepository.readAllPersons("%" + email + "%");
	}
	
	@GetMapping("readAllRecordsWithFirstNameAndAge")
	public List<PersonDTO> readAllRecordsWithFirstNameAndAge(){
		return personRepository.readAllRecordsWithFirstNameAndAge();
	}
	
	@GetMapping("readAllRecordsWithFirstNameAndLnAndEmail")
	public List<PersonDTO2> readAllRecordsWithFirstNameAndLnAndEmail(){
		return personRepository.readAllRecordsWithFirstNameAndLnAndEmail();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
