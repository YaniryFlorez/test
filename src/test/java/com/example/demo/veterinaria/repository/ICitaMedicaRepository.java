package com.example.demo.veterinaria.repository;

import com.example.demo.veterinaria.modelo.CitaMedica;

public interface ICitaMedicaRepository {

	public CitaMedica BusquedaCodigo(String numero);
	
	// CRUD
		
		//
		public void actualizar(CitaMedica numero );

		public void insertar(CitaMedica numero);

		public void borrar(Integer numero); // Recibe el id del objeto a borrar
	 
}
