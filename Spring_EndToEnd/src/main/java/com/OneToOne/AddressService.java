package com.OneToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	public Address save(Address address) {
		return addressRepository.save(address);
	}
	
	public List<Address> readAll(){
		return (List<Address>) addressRepository.findAll();
	}
	
	public Address read(Integer id) {
		return  addressRepository.findById(id).get();
	}
	
	public Integer delete(Integer id) {
		addressRepository.deleteById(id);
		return id;
	}
	
}
