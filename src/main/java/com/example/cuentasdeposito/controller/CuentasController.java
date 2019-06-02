package com.example.cuentasdeposito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cuentasdeposito.model.Cuentas;
import com.example.cuentasdeposito.model.MovimientosCuentas;
import com.example.cuentasdeposito.services.CuentasServices;
import com.google.gson.JsonObject;


@RestController
@RequestMapping(value = "/cuentaDeDepositos")
public class CuentasController {

	@Autowired
	private CuentasServices cuentasServices;
	String numeroDeCuenta;
	String tipoDeCuenta;
	double saldoDeCuenta;
	String estadoDeCuenta; 
	String documentoIdentidad; 
	String tipoDeDocumento;
	String saldoDeCuentaString;
	double montoMovimiento;
	String montoMovimientoString;
	boolean resultadoMovimiento;
	
	@GetMapping("/saldo/{numCuenta}")
	public @ResponseBody String getSaldoCuenta(@PathVariable("numCuenta") String numCuenta ) {
		Cuentas cuentaActual = cuentasServices.getBynumCuenta(numCuenta);
		saldoDeCuenta = cuentaActual.getSaldoDeCuenta();
		saldoDeCuentaString = String.format("%.2f",saldoDeCuenta);
		JsonObject response = new JsonObject();
		response.addProperty("numCuenta", numCuenta);
		response.addProperty("saldo", saldoDeCuentaString);
		return response.toString();
	}
	
	@PutMapping("/debitar/")
	public ResponseEntity<?> debitarCuenta(@RequestBody MovimientosCuentas body) {
		numeroDeCuenta = body.getNumCuenta();
		montoMovimiento = body.getMonto();
		montoMovimientoString = String.format("%.2f",montoMovimiento);
		
		resultadoMovimiento = cuentasServices.servicioDebitarCuenta(numeroDeCuenta, montoMovimiento);
		
		Cuentas cuentaActual = cuentasServices.getBynumCuenta(numeroDeCuenta);
		saldoDeCuenta = cuentaActual.getSaldoDeCuenta();
		saldoDeCuentaString = String.format("%.2f",saldoDeCuenta);
		
		if(resultadoMovimiento == true) {
			JsonObject response = new JsonObject();
			response.addProperty("numCuenta", numeroDeCuenta);
			response.addProperty("cantidadDebitada", montoMovimientoString);
			response.addProperty("saldo", saldoDeCuentaString);
			return new ResponseEntity<>(response.toString(), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
