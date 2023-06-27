package com.educandoweb.Curso.Spring.Boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.Curso.Spring.Boot.entities.Category;
import com.educandoweb.Curso.Spring.Boot.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	//trazendo dos os usaurios(user)
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	//trazendo por id
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
