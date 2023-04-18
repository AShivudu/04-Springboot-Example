package com.ibm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Employe;
import com.ibm.repository.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService {

	@Autowired
	private EmployeRepository repository;

	@Override
	public Employe saveEmploye(Employe employe) {

		return repository.save(employe);
	}

	@Override
	public Optional<Employe> getEmploye(Long id) {

		return repository.findById(id);
	}

	@Override
	public List<Employe> getAllEmployes() {

		return repository.findAll();
	}

}
