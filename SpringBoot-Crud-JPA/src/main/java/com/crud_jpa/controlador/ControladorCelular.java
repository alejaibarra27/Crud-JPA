package com.crud_jpa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crud_jpa.modelo.Celular;
import com.crud_jpa.servicios.ServicioCelular;

@Controller
@RequestMapping(value = "/celular")
public class ControladorCelular {

	 @Autowired
	 ServicioCelular servicioCelular;
	 
	 @RequestMapping(value = "/lista", method = RequestMethod.GET)
	 public ModelAndView list() {
		 ModelAndView modelo = new ModelAndView("lista_celular");
		 List<Celular> listaCelular = servicioCelular.getAllCelulares();
		 modelo.addObject("listaCelular", listaCelular);
		 
		 return modelo;
	 }
	 
	 @RequestMapping(value = "/agregarCelular", method = RequestMethod.GET)
	 public ModelAndView agregarCelular() {
		 ModelAndView modelo = new ModelAndView();
		 
		 Celular celular = new Celular();
		 modelo.addObject("formularioCelular", celular);
		 modelo.setViewName("formulario_Celular");
		 
		 return modelo;
	 }
	 
	 @RequestMapping(value="/actualizarCelular/{codigo}", method = RequestMethod.GET)
	 public ModelAndView editarCelular(@PathVariable long codigo) {
		 ModelAndView modelo = new ModelAndView();
		 
		 Celular celular = servicioCelular.getCelularById(codigo);
		 modelo.addObject("formularioCelular", celular);
		 modelo.setViewName("formulario_Celular");
		 
		 return modelo;
	 }
	 
	 @RequestMapping(value = "/guardarCelular/", method = RequestMethod.POST)
	 public ModelAndView guardar(@ModelAttribute("formularioCelular")Celular celular) {
		 servicioCelular.GuardaroActualizar(celular);
		 
		 return new ModelAndView("redireccionar:/celular/lista");
	 }
	 
	 @RequestMapping(value = "/eliminarCelular/{codigo}", method = RequestMethod.POST)
	 public ModelAndView eliminar(@PathVariable("codigo") long codigo) {
		 servicioCelular.EliminarCelular(codigo);
		 
		 return new ModelAndView("redireccionar:/celular/lista");
	 }
}
