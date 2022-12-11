package com.example.demo.herencia;

import java.time.LocalDateTime;

public class CitaMedicaH {
	private String numero;
	private LocalDateTime fechaCita, fechaAgenda;
	private VeterinarioH veterinario;
	private PacienteH paciente;

	public void agendar(String numero, LocalDateTime fechaCita,PacienteH ph, VeterinarioH mh) {
		this.numero = numero;
		this.fechaCita = fechaCita;
		this.fechaAgenda = LocalDateTime.now();
		this.paciente = ph;
		
		Integer valorDescuento = ph.calcularDescuento();
		System.out.println("Valor: " + valorDescuento);

		this.veterinario = mh;
		this.guardarCita(this);
	}

	private void guardarCita(CitaMedicaH cita) {
		// funcion INSERT
		System.out.println("Se ha agendado la cita: ");
		System.out.println(cita);

	}

	// GETTER & SETTER
	

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

	public VeterinarioH getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(VeterinarioH veterinario) {
		this.veterinario = veterinario;
	}

	public PacienteH getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteH paciente) {
		this.paciente = paciente;
	}
	
	
	@Override
	public String toString() {
		return "CitaMedicaH [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", Veterinario=" + veterinario + ", paciente=" + paciente + "]";
	}
}
