package com.example.cuentasdeposito.model;

import javax.persistence.*;

@Entity
@Table (name = "CuentasDeDeposito")
public class CuentasDeposito {

	@Id
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
}
