package com.example.demo.herencia;

public class PacienteCachorroH extends PacienteH{
	
	private int pesoNacimiento;
	private int tamanioNacimiento;
	
	
	public int getTamanioNacimiento() {
		return tamanioNacimiento;
	}

	public void setTamanioNacimiento(int tamanioNacimiento) {
		this.tamanioNacimiento = tamanioNacimiento;
	}

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}

	@Override
	public String toString() {
		return super.toString() + " PacienteCachorro [pesoNacimiento=" + pesoNacimiento + "tamañoNacimiento=" + tamanioNacimiento + "]";
	}

	public Integer calcularDescuento() {
		System.out.println("Paciente Cachorro con el 05% descuento");
		return 5;
	}
}
