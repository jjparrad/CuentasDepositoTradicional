package com.example.cuentasdeposito.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cuentasdeposito.model.CuentasDeposito;
import com.example.cuentasdeposito.repository.CuentasRepository;


@RestController
public class CuentasController {

	@Autowired
	private CuentasRepository cuentasRepository;
		
	/**
	@GetMapping("cuentaDeDepositos/saldo/{numCuenta}")
	public List<CuentasDeposito> getSaldoCuenta(@PathVariable String numCuenta) {
		//cuentasRepository.findById(numCuenta);
		return cuentasRepository.findAll();
	} 
	**/
	
	@GetMapping("cuentaDeDepositos/saldo/")
	public String getCuentas() {
		return "Funciona";
	}

	/**
	@GetMapping("cuentaDeDepositos/cuentas/{numCuenta}")
	public Optional<CuentasDeposito> getSaldoCuenta(@PathVariable("numCuenta") String numCuenta ) {
		return cuentasRepository.findById(numCuenta);
	}
	 * @return 
	**/
	@GetMapping("cuentaDeDepositos/cuentas/")
	public List<CuentasDeposito> getSaldoCuenta() {
		return cuentasRepository.findAll();
	}
}
