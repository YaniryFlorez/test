package com.example.demo.veterinaria.repository;

import com.example.demo.veterinaria.modelo.CitaMedica;
import com.example.demo.veterinaria.modelo.Paciente;

public interface IPacienteRepository {

public Paciente BusquedaId(String id);
	
	// CRUD
		
		//
		public void actualizar(Paciente id );

		public void insertar(Paciente id );

		public void borrar(Paciente id ); // Recibe el id del objeto a borrar
		
}
