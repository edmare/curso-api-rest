package com.curso.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		/*Producto producto = new Producto();
		producto.setDescripcion("lapices");
		producto.setPrecio(1.12);
		producto.setStock(23);
		System.out.println(producto);*/

	}

}
