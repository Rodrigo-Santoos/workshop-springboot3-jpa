package com.educandoweb.Curso.Spring.Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.Spring.Boot.entities.OrderItem;

//responsavel por implementar tudo da classe Usuario
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
