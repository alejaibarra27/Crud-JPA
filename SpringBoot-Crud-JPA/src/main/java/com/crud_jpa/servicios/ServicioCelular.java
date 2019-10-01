package com.crud_jpa.servicios;

import java.util.List;

import com.crud_jpa.modelo.Celular;

public interface ServicioCelular {

	public List<Celular> getAllCelulares();
	
	public Celular getCelularById(long codigo);
	
	public void GuardaroActualizar(Celular celular);
	
	public void EliminarCelular(long codigo);
}
