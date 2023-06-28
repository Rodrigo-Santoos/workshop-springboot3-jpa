package com.educandoweb.Curso.Spring.Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.Spring.Boot.entities.Product;

//responsavel por implementar tudo da classe Usuario
public interface ProductRepository extends JpaRepository<Product, Long> {

}
