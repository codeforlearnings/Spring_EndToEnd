package com.ManyToMany;

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
@RequestMapping("skill")
public class SkillController {
	@Autowired
	private SkillService skillService;
	
	@PostMapping
	public Skill save(@RequestBody Skill skill) {
		return skillService.save(skill);
	}
	
	@GetMapping
	public List<Skill> readAll(){
		return skillService.readAll();
	}
	
	@GetMapping("/{id}")
	public Skill read(@PathVariable Integer id) {
		return skillService.read(id);
	}
	
	@DeleteMapping
	public Integer delete(@PathVariable Integer id) {
		skillService.delete(id);
		return id;
	}
	
}






