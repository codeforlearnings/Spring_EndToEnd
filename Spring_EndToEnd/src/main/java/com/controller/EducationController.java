package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Repository.EducationRepository;
import com.model.Education;

@RestController
@RequestMapping("education")
public class EducationController {

	@Autowired
	private EducationRepository educationRepository;
	
	@PostMapping
	public Education save(@RequestBody Education education) {
		return educationRepository.save(education);
	}
	
	@GetMapping
	public List<Education> readAll(){
		return (List<Education>) educationRepository.findAll();
	}
	
}
