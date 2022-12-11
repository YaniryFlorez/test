package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PacienteCachorroH pacienteCh = new PacienteCachorroH();
		pacienteCh.setPesoNacimiento(3);
		pacienteCh.setTamanioNacimiento(4);
		pacienteCh.setNombre("Tomy");
		pacienteCh.setEspecie("Gato");
		pacienteCh.setSexo("Macho");
		
		
		VeterinarioH veterinario = new VeterinarioH();
		veterinario.setCedula("17596324");
		veterinario.setNombre("Luis Carlos Cordoba");
		
		CitaMedicaH cita= new CitaMedicaH();
		cita.agendar("00123", LocalDateTime.of(2022, 12, 2, 8, 30),pacienteCh, veterinario);
	}

}
