package com.educandoweb.Curso.Spring.Boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.Curso.Spring.Boot.entities.Product;
import com.educandoweb.Curso.Spring.Boot.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//trazendo dos os usaurios(user)
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	//trazendo por id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
