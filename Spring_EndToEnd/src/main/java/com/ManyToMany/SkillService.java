package com.ManyToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

	@Autowired
	private SkillRepository skillRepository;
	
	public Skill save(Skill skill) {
		return skillRepository.save(skill);
	}
	
	public List<Skill> readAll(){
		return (List<Skill>) skillRepository.findAll();
	}
	
	public Skill read(Integer id) {
		return skillRepository.findById(id).get();
	}
	
	public Integer delete(Integer id) {
		skillRepository.deleteById(id);
		return id;
	}
}
