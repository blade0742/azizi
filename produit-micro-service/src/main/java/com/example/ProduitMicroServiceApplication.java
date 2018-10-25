package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.Produit;

@SpringBootApplication
public class ProduitMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduitMicroServiceApplication.class, args);
		Produit produit = new Produit("ff",1000);
	}
}
