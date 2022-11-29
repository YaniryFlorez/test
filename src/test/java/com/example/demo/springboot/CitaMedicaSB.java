package com.example.demo.springboot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service //Aqui esta la logica del negocio
public class CitaMedicaSB {

	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private VeterinarioSB veterinario;
	private PacienteSB paciente;

	public void agendar(String numero, LocalDateTime fechaCita, PacienteSB ph, VeterinarioSB veterinario) {

		this.numero = numero;
		this.fechaCita = fechaCita;
		this.fechaAgenda = LocalDateTime.now();

		Integer valor_descuento = ph.calcularDescuento();
		System.out.println("Valor: " + valor_descuento);

		this.veterinario = veterinario;
		this.guardarCitaH(this);

	}

	private void guardarCitaH(CitaMedicaSB cita) {

		// Insertar en la base de datos, guardar cita
		System.out.println(cita);
	}

	@Override
	public String toString() {
		return "CitaMedicaH [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
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

	public VeterinarioSB getVeterinario() {
		return veterinario;
	}

	public void setMedico(VeterinarioSB veterinario) {
		this.veterinario = veterinario;
	}

	public PacienteSB getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteSB paciente) {
		this.paciente = paciente;
	}

}
