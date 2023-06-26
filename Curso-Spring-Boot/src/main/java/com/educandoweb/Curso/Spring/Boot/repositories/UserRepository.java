package com.educandoweb.Curso.Spring.Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.Spring.Boot.entities.User;

//responsavel por implementar tudo da classe Usuario
public interface UserRepository extends JpaRepository<User, Long> {

}
