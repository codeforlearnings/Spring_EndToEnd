package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.EmployeeDTO;
import com.Repository.EmployeeRepository;
import com.model.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@GetMapping
	public List<Employee> readAll(){
		return (List<Employee>) employeeRepository.findAll();
	}
	
	@GetMapping("/all")
	public List<EmployeeDTO> readAllEmployees(){
		return employeeRepository.readAllEmployees();
	}
	
	@GetMapping("/allWithEducation")
	public List<EmployeeDTO> readAllEmployeesWithEducation(){
		return employeeRepository.readAllEmployees1();
	}




}
