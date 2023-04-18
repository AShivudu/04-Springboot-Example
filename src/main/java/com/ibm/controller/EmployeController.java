package com.ibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Employe;
import com.ibm.service.EmployeService;

@RestController
@RequestMapping("/employe")
public class EmployeController {

	@Autowired
	private EmployeService service;

	@PostMapping("/save")
	public Employe saveEmploye(@RequestBody Employe employe) {
		return service.saveEmploye(employe);
	}

	@GetMapping("/findAll")
	public List<Employe> getAllEmployes() {
		return service.getAllEmployes();
	}

	@GetMapping("/find")
	public Optional<Employe> getEmploye(@PathVariable Long id) {
		return service.getEmploye(id);

	}

}
