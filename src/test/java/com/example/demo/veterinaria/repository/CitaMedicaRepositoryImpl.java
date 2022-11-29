package com.example.demo.veterinaria.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.veterinaria.modelo.CitaMedica;


public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
	
	public void agendar(String numero, LocalDateTime fechaCita){
		
		
}

	@Override
	public CitaMedica BusquedaCodigo(String numero) {
		// TODO Auto-generated method stub
		CitaMedica cita = new CitaMedica();
		cita.setFechaAgenda(null);
		cita.setFechaCita(null);
		cita.setMedico(null);
		cita.setPaciente(null);
		
		return cita;
	}

	@Override
	public void actualizar(CitaMedica numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(CitaMedica numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer numero) {
		// TODO Auto-generated method stub
		
	}
	

	
}
