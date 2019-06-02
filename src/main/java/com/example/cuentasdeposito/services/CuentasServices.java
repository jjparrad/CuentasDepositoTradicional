package com.example.cuentasdeposito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cuentasdeposito.model.Cuentas;
import com.example.cuentasdeposito.repository.CuentasRepository;

@Service
public class CuentasServices {

	@Autowired
	private CuentasRepository cuentasRepository;
	
	private String numeroDeCuenta;
	private double saldoDeCuenta;
	private double montoMovimiento;
	private boolean resultadoMovimiento; 
	private String estadoDeCuenta;
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
	
	public boolean servicioDebitarCuenta(String numCuenta, Double monto) {
		numeroDeCuenta = numCuenta;
		montoMovimiento = monto;
		Cuentas cuentaActual = cuentasRepository.findBynumeroDeCuenta(numeroDeCuenta);
		saldoDeCuenta = cuentaActual.getSaldoDeCuenta();
		estadoDeCuenta = cuentaActual.getEstadoDeCuenta();
		if(saldoDeCuenta >= montoMovimiento && estadoDeCuenta.equals("Activa")) {
			saldoDeCuenta = saldoDeCuenta - montoMovimiento;
			cuentaActual.setSaldoDeCuenta(saldoDeCuenta);
			cuentasRepository.save(cuentaActual);
			resultadoMovimiento = true;
		}else {
			resultadoMovimiento = false;
		}
		
		return resultadoMovimiento;	
	}
	
	public boolean servicioAcreditarCuenta(String numCuenta, Double monto) {
		numeroDeCuenta = numCuenta;
		montoMovimiento = monto;
		Cuentas cuentaActual = cuentasRepository.findBynumeroDeCuenta(numeroDeCuenta);
		saldoDeCuenta = cuentaActual.getSaldoDeCuenta();
		estadoDeCuenta = cuentaActual.getEstadoDeCuenta();
		if(estadoDeCuenta.equals("Activa")) {
			saldoDeCuenta = saldoDeCuenta + montoMovimiento;
			cuentaActual.setSaldoDeCuenta(saldoDeCuenta);
			cuentasRepository.save(cuentaActual);
			resultadoMovimiento = true;
		}else {
			resultadoMovimiento = false;
		}
		
		return resultadoMovimiento;
	}
	
}
