package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class ShoppingListApplication {
	public static void main (String[] args) {
		SpringApplication.run(ShoppingListApplication.class, args);
	}

	/*
	//CommandLineRunner ist eine Interface von Spring, die automatisch aufgerufen wird, wenn die App hochgefahren ist.
		@Bean
		CommandLineRunner initializeItems() {

			return args -> {
				new ListItem("Ketchup");
				new ListItem("Milch");
				new ListItem("Eicheln");
			};

	}*/

}