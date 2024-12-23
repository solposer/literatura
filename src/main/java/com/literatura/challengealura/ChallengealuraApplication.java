package com.literatura.challengealura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ChallengealuraApplication implements CommandLineRunner {
	@Autowired
	private BookRepository repository;
	public static void main(String[] args){
		SpringApplication.run(ChallengealuraApplication.class,args);

	}

	@Override
	public void run (String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.muestraElMenu();
	}
}