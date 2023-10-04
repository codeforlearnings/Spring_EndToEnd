package com.OneToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping
	public Person save(@RequestBody Person person) {
		return personService.save(person);
	}

	@GetMapping
	public List<Person> readAll(){
		return personService.readAll();
	}
	
	@GetMapping("/{id}")
	public Person read(@PathVariable Integer id) {
		return personService.read(id);
	}
	
	@DeleteMapping("/{id}")
	public Integer delete(@PathVariable Integer id) {
		return personService.delete(id);
	}
}






