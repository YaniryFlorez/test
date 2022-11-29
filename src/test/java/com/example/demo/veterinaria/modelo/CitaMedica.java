package com.example.demo.veterinaria.modelo;

import java.time.LocalDateTime;

import com.example.demo.veterinaria.modelo.CitaMedica;
import com.example.demo.veterinaria.modelo.Paciente;
import com.example.demo.veterinaria.modelo.Veterinario;


public class CitaMedica {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Veterinario veterinario;
	private Paciente paciente;

	public void agendar(String numero, LocalDateTime fechaCita, Paciente ph, Veterinario veterinario) {

		this.numero = numero;
		this.fechaCita = fechaCita;
		this.fechaAgenda = LocalDateTime.now();

		Integer valor_descuento = ph.calcularDescuento();
		System.out.println("Valor: " + valor_descuento);

		this.veterinario = veterinario;
		//this.guardarCitaH(this);

	}

	private void guardarCitaH(CitaMedica cita) {

		// Insertar en la base de datos, guardar cita
		System.out.println(cita);
	}

	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", Veterinario=" + veterinario + ", paciente=" + paciente + "]";
	}

// SET y GET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setMedico(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
