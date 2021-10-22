package com.spring.curso.Resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User>findall(){
		User user =new User(1L,"Maria","maria@gami.com","99999999","12345");
		return  ResponseEntity.ok().body(user);
		
	}
}
