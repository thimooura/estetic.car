package br.com.estetic.clienteestetic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class ClienteEsteticApplication {


	@GetMapping
	public String getHomeTeste() {
		return "Estetic car - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteEsteticApplication.class, args);
	}
}
