package com.sv.tripElSalvadorApp.Service;

import java.util.List;

import com.sv.tripElSalvadorApp.model.Trip;

public interface ITripService {
	
List<Trip> buscarTodos();

Trip buscarPorId(Integer idTrip);

void guardar(Trip trip);
}
