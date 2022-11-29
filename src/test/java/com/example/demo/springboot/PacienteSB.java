package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class PacienteSB {
	
	
	private String nombre;
	private String sexo;
	private String especie; 	//Sirve para saber si es paciente niño o 3ra edad
	
	//Definimos un metodo
	
	public  Integer calcularDescuento() {
		
		System.out.println("Sin descuento");
		return 0;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	@Override
	public String toString() {
		return "PacienteH [nombre=" + nombre + ", sexo=" + sexo + ", especie=" + especie + "]";
	}


	

}
