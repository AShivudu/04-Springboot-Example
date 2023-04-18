package com.ibm.service;

import java.util.List;
import java.util.Optional;

import com.ibm.entity.Employe;

public interface EmployeService {

	Employe saveEmploye(Employe employe);

	Optional<Employe> getEmploye(Long id);

	List<Employe> getAllEmployes();
}
