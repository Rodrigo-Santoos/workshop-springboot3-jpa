package com.educandoweb.Curso.Spring.Boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.Curso.Spring.Boot.entities.Order;
import com.educandoweb.Curso.Spring.Boot.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	//trazendo dos os usaurios(user)
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	//trazendo por id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
