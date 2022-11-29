package com.example.demo1;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Taller4Pa2Application<PacienteAdultoSB, CitaMedicaSB, VeterinarioSB> implements CommandLineRunner {

	@Autowired
	private CitaMedicaSB citamedicaSB;
	
	@Autowired
	private PacienteAdultoSB pacienteAdultoSB;
	
	@Autowired
	private VeterinarioSB veterinariosb;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Taller4Pa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
