package com.example.demo;

import com.example.demo.controller.Basket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopperApplication.class, args);

		Basket baske = new Basket();
	}

}
