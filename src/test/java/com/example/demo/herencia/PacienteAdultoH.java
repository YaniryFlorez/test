package com.example.demo.herencia;

public class PacienteAdultoH extends PacienteH {
	
	private String vacunas;

	
	public String getVacunas() {
		return vacunas;
	}

	public void setVacunas(String vacunas) {
		this.vacunas = vacunas;
	}

	@Override
	public String toString() {
		return super.toString() + " PacienteAdulto [Vacunas=" + vacunas + "]";
	}
	
	public Integer calcularDescuento() {
		System.out.println("Paciente con descuento del 30%");
		return 30;
	}
}
