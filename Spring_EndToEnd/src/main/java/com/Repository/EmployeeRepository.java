package com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.DTO.EmployeeDTO;
import com.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	@Query("select new com.DTO.EmployeeDTO(e.id, e.firstName, " + 
	       "e.lastName, e.age, g.name) from Employee e inner join Gender g on " + 
	       "(e.genderId = g.id)")
	public List<EmployeeDTO> readAllEmployees();
	
	
	@Query("select new com.DTO.EmployeeDTO(e.id, e.firstName, " + 
		   "e.lastName, e.age, g.name, educ.name) from Employee e inner join Gender g on " + 
		   "(e.genderId = g.id) inner join Education educ on (e.educationId = educ.id)")
	public List<EmployeeDTO> readAllEmployees1();
		
	
}
