package com.educandoweb.Curso.Spring.Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.Spring.Boot.entities.Category;

//responsavel por implementar tudo da classe Usuario
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
