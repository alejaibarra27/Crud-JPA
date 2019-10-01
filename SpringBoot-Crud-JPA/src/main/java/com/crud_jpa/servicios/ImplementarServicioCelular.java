package com.crud_jpa.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud_jpa.accesoDatosBD.AccesoDatosBDCelular;
import com.crud_jpa.modelo.Celular;

@Service
@Transactional
public class ImplementarServicioCelular implements ServicioCelular{
	
	@Autowired
	AccesoDatosBDCelular accesoDatosBDCelular;

	@Override
	public List<Celular> getAllCelulares() {
		
		return (List<Celular>) accesoDatosBDCelular.findAll(); 
	}

	@Override
	public Celular getCelularById(long codigo) {
		// TODO Auto-generated method stub
		return accesoDatosBDCelular.findById(codigo).get();
	}

	@Override
	public void GuardaroActualizar(Celular celular) {
		
		accesoDatosBDCelular.save(celular);
		
	}

	@Override
	public void EliminarCelular(long codigo) {
		
		accesoDatosBDCelular.deleteById(codigo);
		
	}

}
