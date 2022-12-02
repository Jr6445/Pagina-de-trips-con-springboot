package com.sv.tripElSalvadorApp.controller;


import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sv.tripElSalvadorApp.Service.ITripService;
import com.sv.tripElSalvadorApp.model.Trip;

@Controller
public class HomeController {

//	@Autowired
	@Autowired(required = false)

	private ITripService tripService;
	
	@GetMapping("/")
	public String motrarHome(Model model) {
		
		List<Trip> lista = tripService.buscarTodos();
		model.addAttribute("trips",lista);
		
		return "home";
	}
	

	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Trip> lista = tripService.buscarTodos();
		model.addAttribute("trips", lista);
		
		return "tabla";
	}
	


	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("En la Montaña");
		lista.add("En la Cuidad");
		lista.add("En los pueblos");
		lista.add("En las playas");
		model.addAttribute("listadoTrips", lista);
		
		return "listado";
	}

	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Trip trip = new Trip();
		trip.setNombre("Rapel en Volcatenango");
		trip.setDescripcion("Aventa rapel en un circuito conectado en las...");
		trip.setFecha(new Date());
		trip.setCosto(10.0);
		model.addAttribute("trip" , trip);
		
		return "detalle";
	}

	


}





