package com.example.cuentasdeposito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cuentasdeposito.model.Cuentas;
import com.example.cuentasdeposito.services.CuentasServices;
import com.google.gson.*;


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
	
}
