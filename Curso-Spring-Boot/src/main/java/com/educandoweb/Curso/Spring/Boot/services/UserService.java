package com.educandoweb.Curso.Spring.Boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.Curso.Spring.Boot.entities.User;
import com.educandoweb.Curso.Spring.Boot.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	//trazendo dos os usaurios(user)
	public List<User> findAll(){
		return repository.findAll();
	}
	
	//trazendo por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
