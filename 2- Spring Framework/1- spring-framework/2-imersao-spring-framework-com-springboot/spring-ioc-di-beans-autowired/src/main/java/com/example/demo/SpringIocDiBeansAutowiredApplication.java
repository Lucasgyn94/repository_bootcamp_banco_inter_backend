package com.example.demo;

import com.example.demo.app.ConversorJson;
import com.example.demo.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringIocDiBeansAutowiredApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIocDiBeansAutowiredApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"74590-711\",\"logradouro\": \"Avenida Contorno\",\"localidade\": \"Goiania-Goias\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("\n=== DADOS DO CEP ===");
			System.out.println(response);
		};
	}
}
