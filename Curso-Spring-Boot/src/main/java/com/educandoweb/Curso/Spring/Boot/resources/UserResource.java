package com.educandoweb.Curso.Spring.Boot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.Curso.Spring.Boot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Rodrigo", "rodrigo@gmail.com", "358750103", "12345");
		return ResponseEntity.ok().body(u);
	}
}
