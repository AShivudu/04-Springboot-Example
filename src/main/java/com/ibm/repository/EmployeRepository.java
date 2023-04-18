package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
