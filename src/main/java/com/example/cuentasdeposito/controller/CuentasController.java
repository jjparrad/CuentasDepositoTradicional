package com.example.cuentasdeposito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cuentasdeposito.repository.CuentasRepository;


@RestController
public class CuentasController {

	@Autowired
	private CuentasRepository cuentasRepository;
	
	//Atributos Cuentas
	String numeroDeCuenta;	
	String tipoDeCuenta;
	double saldoDeCuenta;
	String estadoDeCuenta;
	String documentoIdentidad;
	String tipoDeDocumento;
	
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
	@GetMapping("cuentaDeDepositos/saldo/{numCuenta}")
	public CuentasDeposito getSaldoCuenta(@PathVariable String numCuenta) {
		return cuentasRepository.findBynumCuenta(numCuenta);
	}
	**/
	
}
