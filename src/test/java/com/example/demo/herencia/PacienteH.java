package com.example.demo.herencia;

public class PacienteH {
	
	private String nombre, sexo, especie;
	
	protected Integer calcularDescuento() {
		System.out.println("Sin descuento");
		return 0;
	}
	
	
	
	//GETTER & SETTER

	@Override
	public String toString() {
		return "PacienteH [nombre=" + nombre + ", sexo=" + sexo + ", especie=" + especie + "]";
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

	

}
