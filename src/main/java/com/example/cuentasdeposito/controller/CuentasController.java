package com.example.cuentasdeposito.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cuentasdeposito.model.Cuentas;
import com.example.cuentasdeposito.model.CuentasDeposito;
import com.example.cuentasdeposito.services.CuentasServices;


@RestController
public class CuentasController {

	@Autowired
	private CuentasServices cuentasServices;
	
	@GetMapping("cuentaDeDepositos/cuentas/")
	public List<CuentasDeposito> getCuentas() {
		//return cuentasServices.findAll();
		return null;
	}
	
	@GetMapping("cuentaDeDepositos/nuevaCuenta/")
	public String crearNuevaCuenta() {		
		return "La cuenta ha sido creada";
	}
	
	@GetMapping("cuentaDeDepositos/saldo/{numCuenta}")
	public Double getSaldoCuenta(@PathVariable("numCuenta") String numCuenta ) {
		Optional<CuentasDeposito> cuentaActual = cuentasServices.getBynumCuenta(numCuenta);
		System.out.println(cuentaActual);
		//return cuentaActual.;
		return 165464.123;
	}
	
	/**
	@GetMapping("cuentaDeDepositos/nuevaCuenta/")
	public String crearNuevaCuenta(@RequestBody CuentasDeposito nuevaCuenta) {		
		return "La cuenta ha sido creada";
	}
	 * @return 
	**/
	
	
}
