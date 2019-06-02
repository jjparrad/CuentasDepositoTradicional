package com.example.cuentasdeposito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cuentasdeposito.model.Cuentas;
import com.example.cuentasdeposito.repository.CuentasRepository;

@Service
public class CuentasServices {

	@Autowired
	private CuentasRepository cuentasRepository;
	/**
	private String numeroDeCuenta;
	private String tipoDeCuenta;
	private double saldoDeCuenta;
	private String estadoDeCuenta; 
	private String documentoIdentidad; 
	private String tipoDeDocumento;
	
	public Cuentas create(String numeroDeCuenta,String tipoDeCuenta, double saldoDeCuenta, String estadoDeCuenta, String documentoIdentidad, String tipoDeDocumento) {
		return cuentasRepository.saveAndFlush(new Cuentas(numeroDeCuenta, tipoDeCuenta, saldoDeCuenta, estadoDeCuenta, documentoIdentidad, tipoDeDocumento));
	}
	**/
	public Cuentas getBynumCuenta(String numCuenta) {
		return cuentasRepository.findBynumeroDeCuenta(numCuenta);
		//return null;
	}
	
}
