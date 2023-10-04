package com.Repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Gender;

public interface GenderRepository extends CrudRepository<Gender, Integer>{

}
