package com.literatura.challengealura;

import com.literatura.challengealura.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ChallengealuraApplication implements CommandLineRunner {

	public static void main(String[] args){
		SpringApplication.run(ChallengealuraApplication.class,args);

	}

	@Override
	public void run (String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}