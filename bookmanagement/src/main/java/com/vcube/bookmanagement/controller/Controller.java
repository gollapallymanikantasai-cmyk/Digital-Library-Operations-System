package com.vcube.bookmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.bookmanagement.entity.Modal;
import com.vcube.bookmanagement.repo.Repository;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	Repository repo;
	
	@PostMapping("/insert")
	public Modal insert(@RequestBody Modal m) {
		return repo.save(m);
	}
	
	@PutMapping("/update/{id}")
	public Modal update(@RequestBody Modal m,@PathVariable int id ) {
		Modal m1=repo.findById(id).orElseThrow();
		m1.setPrice(m.getPrice());
		m1.setTitle(m.getTitle());
		m1.setAuthor(m.getAuthor());
		return repo.save(m1);
	}
	
	@GetMapping("/getBooks")
	public List<Modal> getBooks(){
		return repo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		repo.deleteById(id);
		return "successfully deleted id:"+ id;
	}

}
