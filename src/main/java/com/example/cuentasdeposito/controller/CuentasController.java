package com.example.cuentasdeposito.controller;

import java.util.List;

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
	 * @return 
	**/
	
	@GetMapping("cuentaDeDepositos/saldo/")
	public String getCuentas() {
		return "Funciona";
	}
	
	@GetMapping("cuentaDeDepositos/saldo/{numCuenta}")
	public List<CuentasDeposito> getSaldoCuenta(@PathVariable String numCuenta) {
		cuentasRepository.findBynumCuenta(numCuenta);
		//return cuentasRepository.findAll();
		return null;
	}
	
/**	
	public Double getUsuario(@PathVariable("numTarjeta") String numTarjeta ) {
		numtarjeta = numTarjeta;
		Usuario p = servicio.getBynumeroTarjeta(numtarjeta);
		return p.getdeudaActual();
	}
**/
	
}
