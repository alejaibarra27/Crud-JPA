package com.crud_jpa.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="celular")
public class Celular {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "procesador")
	private String procesador;
	
	@Column(name = "sistema_operativo")
	private String sistema_operativo;
	
	@Column(name = "memoria_interna")
	private String memoria_interna;
	
	@Column(name = "valor")
	private double valor;

	
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getSistema_operativo() {
		return sistema_operativo;
	}

	public void setSistema_operativo(String sistema_operativo) {
		this.sistema_operativo = sistema_operativo;
	}

	public String getMemoria_interna() {
		return memoria_interna;
	}

	public void setMemoria_interna(String memoria_interna) {
		this.memoria_interna = memoria_interna;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
