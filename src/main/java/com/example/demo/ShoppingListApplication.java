package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoppingListApplication {
	public static void main (String[] args) {
		SpringApplication.run(ShoppingListApplication.class, args);
	}

		//CommandLineRunner ist eine Interface von Spring, die automatisch aufgerufen wird, wenn die App hochgefahren ist.
		@Bean
		CommandLineRunner initializeItems(ListItemService listItemService) {
			return args -> {
				listItemService.addItem(new ListItem(1, "Milch", false));
				listItemService.addItem(new ListItem(2, "Brot", true));
				listItemService.addItem(new ListItem(3, "Käse", false));
				listItemService.addItem(new ListItem(4, "Eier", false));
			};

	}

}



