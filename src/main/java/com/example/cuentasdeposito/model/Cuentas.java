package com.example.cuentasdeposito.model;

import java.io.Serializable;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Cuentas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	String numeroDeCuenta;
	String tipoDeCuenta;
	double saldoDeCuenta;
	String estadoDeCuenta; 
	String documentoIdentidad; 
	String tipoDeDocumento;
	
	public Cuentas(String numeroDeCuenta,String tipoDeCuenta, double saldoDeCuenta, String estadoDeCuenta, String documentoIdentidad, String tipoDeDocumento) {
		this.numeroDeCuenta = numeroDeCuenta;
		this.tipoDeCuenta = tipoDeCuenta;
		this.saldoDeCuenta = saldoDeCuenta;
		this.estadoDeCuenta = estadoDeCuenta;
		this.documentoIdentidad = documentoIdentidad;
		this.tipoDeDocumento = tipoDeDocumento;
	}

	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public String getTipoDeCuenta() {
		return tipoDeCuenta;
	}

	public void setTipoDeCuenta(String tipoDeCuenta) {
		this.tipoDeCuenta = tipoDeCuenta;
	}

	public double getSaldoDeCuenta() {
		return saldoDeCuenta;
	}

	public void setSaldoDeCuenta(double saldoDeCuenta) {
		this.saldoDeCuenta = saldoDeCuenta;
	}

	public String getEstadoDeCuenta() {
		return estadoDeCuenta;
	}

	public void setEstadoDeCuenta(String estadoDeCuenta) {
		this.estadoDeCuenta = estadoDeCuenta;
	}

	public String getDocumentoIdentidad() {
		return documentoIdentidad;
	}

	public void setDocumentoIdentidad(String documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}

	public String getTipoDeDocumento() {
		return tipoDeDocumento;
	}

	public void setTipoDeDocumento(String tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}
	
}
