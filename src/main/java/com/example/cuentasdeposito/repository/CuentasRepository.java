package com.example.cuentasdeposito.repository;

import com.example.cuentasdeposito.model.CuentasDeposito;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentasRepository extends JpaRepository<CuentasDeposito, String>{
	
}
