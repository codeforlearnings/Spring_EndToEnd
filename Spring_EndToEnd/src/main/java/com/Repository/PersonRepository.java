package com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.DTO.PersonDTO;
import com.DTO.PersonDTO2;
import com.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

	public List<Person> findAllByAge(Integer age);
	public List<Person> findAllByAgeGreaterThan(Integer age);
	public List<Person> findAllByAgeLessThan(Integer age);
	public Person findByEmail(String email);
	public List<Person> findAllByEmailLike(String email);
	
	@Query("select p.firstName from Person p")
	public String[] readAllFirstNames();
	
	@Query("select e.lastName from Person e")
	public String[] readAllLastNames();
	
	@Query("select x.email from Person x")
	public String[] emails();
	
	@Query("select y.age from Person y")
	public Integer[] allAges();
	
	@Query("select p.firstName from Person p where p.age <= 30")
	public String[] readSelectedFirstNames();
	
	@Query("select p.lastName from Person p where p.age <= :age")
	public String[] readSelectedLastNames(Integer age);
	
	@Query("select r.email from Person r where r.age <= ?1")
	public String[] readSelectedEmails(Integer age);
	
	@Query("select r.email from Person r where r.firstName = ?1 or r.age >= ?2")
	public String[] readSelectedEmails(String firstName, Integer age);
	
	@Query("select p.firstName, p.lastName from Person p")
	public List<Object[]> readFirstNameAndLastName();
	
	@Query("select p.firstName, p.lastName, p.email from Person p where p.age <= :arg1")
	public List<Object[]> readFirstNameAndLastNameEmail(Integer arg1);
	
	@Query("select p.firstName, p.lastName, p.email from Person p where p.age <= :arg1 or p.id >= :arg2")
	public List<Object[]> readFirstNameAndLastNameEmail(Integer arg1, Integer arg2);
	
	@Query("select p.id, p.firstName, p.lastName, p.email, p.age from Person p")
	public List<Object[]> readAll();
	
	@Query("select p.id, p.firstName, p.lastName, p.email, p.age from Person p where p.id >= ?1")
	public List<Object[]> readAll(Integer arg1);
	
	@Query("select p from Person p")
	public List<Person> readPersons();
	
	@Query("select p from Person p where p.id = :id")
	public Person readPersons(Integer id);
	
	@Query("select p from Person p where p.email = :email")
	public Person readPersons(String email);

	@Query("select p from Person p where p.email like :email")
	public List<Person> readAllPersons(String email);
	
	@Query("select new com.DTO.PersonDTO(p.firstName, p.age) from Person p")
	public List<PersonDTO> readAllRecordsWithFirstNameAndAge();

	@Query("select new com.DTO.PersonDTO2(p.firstName, p.lastName, p.email) from Person p")
	public List<PersonDTO2> readAllRecordsWithFirstNameAndLnAndEmail();
	
	
	
	
	


}




