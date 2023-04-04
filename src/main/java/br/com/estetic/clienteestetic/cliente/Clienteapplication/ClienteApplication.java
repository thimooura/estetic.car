package br.com.estetic.clienteestetic.cliente.Clienteapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClienteApplication {
    @GetMapping
    public String getHomeTeste(){
        return "Cliente";
    }
    public static void main(String[] args) {SpringApplication.run(ClienteApplication.class, args);
    }

}

