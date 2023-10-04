package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Repository.GenderRepository;
import com.model.Gender;

@RestController
@RequestMapping("gender")
public class GenderController {

	@Autowired
	private GenderRepository genderRepository;
	
	
	@PostMapping
	public Gender save(@RequestBody Gender gender) {
		return genderRepository.save(gender);
	}
	
}
