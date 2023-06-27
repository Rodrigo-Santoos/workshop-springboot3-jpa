package com.educandoweb.Curso.Spring.Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.Spring.Boot.entities.Order;

//responsavel por implementar tudo da classe Usuario
public interface OrderRepository extends JpaRepository<Order, Long> {

}
