package com.example.cuentasdeposito.model;

import javax.persistence.*;


@Entity
@Table (name = "CuentasDeDeposito")
public class CuentasDeposito {

	@Id
	@Column(columnDefinition = "text")
	private String numeroDeCuenta;	
	@Column(columnDefinition = "text")
	private String tipoDeCuenta;
	@Column(columnDefinition = "numeric")
	private double saldoDeCuenta;
	@Column(columnDefinition = "text")
	private String estadoDeCuenta;
	@Column(columnDefinition = "text")
	private String documentoIdentidad;
	@Column(columnDefinition = "text")
	private String tipoDeDocumento;
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
