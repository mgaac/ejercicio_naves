package com.example.ejercicio_naves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import com.example.ejercicio_naves.model.DfLinea;
import com.example.ejercicio_naves.model.DfNave;
import com.example.ejercicio_naves.model.DfAnunav;
import com.example.ejercicio_naves.repository.DfLineaRepository;
import com.example.ejercicio_naves.repository.DfNaveRepository;
import com.example.ejercicio_naves.repository.DfAnunavRepository;

@SpringBootApplication
public class EjercicioNavesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioNavesApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(
		DfNaveRepository naveRepository, 
		DfLineaRepository lineaRepository,
		DfAnunavRepository anunavRepository
	) {
		return args -> {
			// Create shipping lines (LINEA is CHAR(4))
			DfLinea linea1 = new DfLinea();
			linea1.setId("MSC1");  // 4 characters
			linea1.setDescripc("Mediterranean Shipping Company");
			linea1.setActivo("S"); 
			
			DfLinea linea2 = new DfLinea();
			linea2.setId("MAER");  // 4 characters
			linea2.setDescripc("Maersk Line");
			linea2.setActivo("S");
			
			lineaRepository.saveAll(Arrays.asList(linea1, linea2));
			
			// Create ships (NAVE is DEC(4))
			DfNave nave1 = new DfNave();
			nave1.setId(BigDecimal.valueOf(1234));  // 4 digits
			nave1.setDescripc("MSC PANAMA");
			nave1.setLinea(linea1);
			nave1.setViajes(1);
			nave1.setPais("US");
			nave1.setLlamada("MSCP1234");
			nave1.setEdi(9123456);
			nave1.setActivo("S");
			
			DfNave nave2 = new DfNave();
			nave2.setId(BigDecimal.valueOf(2345));
			nave2.setDescripc("MAERSK SEALAND");
			nave2.setLinea(linea2);
			nave2.setViajes(2);
			nave2.setPais("DK");
			nave2.setLlamada("MAER5678");
			nave2.setEdi(9234567);
			nave2.setActivo("S");
			
			DfNave nave3 = new DfNave();
			nave3.setId(BigDecimal.valueOf(3456));
			nave3.setDescripc("MSC VALENCIA");
			nave3.setLinea(linea1);
			nave3.setViajes(3);
			nave3.setPais("ES");
			nave3.setLlamada("MSCV9012");
			nave3.setEdi(9345678);
			nave3.setActivo("S");
			
			naveRepository.saveAll(Arrays.asList(nave1, nave2, nave3));

			// Create ship announcements
			LocalDateTime now = LocalDateTime.now();
			
			DfAnunav anunav1 = new DfAnunav();
			anunav1.setUvi("U123");  // 4 chars
			anunav1.setNave(nave1);
			anunav1.setLinea(linea1);
			anunav1.setViajes(1);
			anunav1.setEta(now.plusDays(1));
			anunav1.setEtd(now.plusDays(2));
			anunav1.setEstAnun("A"); // Active
			anunav1.setActivo("S");
			
			DfAnunav anunav2 = new DfAnunav();
			anunav2.setUvi("U456");  // 4 chars
			anunav2.setNave(nave2);
			anunav2.setLinea(linea2);
			anunav2.setViajes(2);
			anunav2.setEta(now.plusDays(3));
			anunav2.setEtd(now.plusDays(4));
			anunav2.setEstAnun("A");
			anunav2.setActivo("S");
			
			DfAnunav anunav3 = new DfAnunav();
			anunav3.setUvi("U789");  // 4 chars
			anunav3.setNave(nave3);
			anunav3.setLinea(linea1);
			anunav3.setViajes(3);
			anunav3.setEta(now.plusDays(5));
			anunav3.setEtd(now.plusDays(6));
			anunav3.setEstAnun("A");
			anunav3.setActivo("S");
			
			anunavRepository.saveAll(Arrays.asList(anunav1, anunav2, anunav3));
		};
	}
}
