package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		//Instanciar datos Auto
		Auto auto1= new Auto();
		Auto auto2= new Auto();
		//Atributos auto1
		auto1.setMarca("Chevrolet");
		auto1.setAnio(2022);
		auto1.setPrecio(25000.12);
		//Atributos auto2
		auto2.setMarca("KIA");
		auto2.setAnio(2023);
		auto2.setPrecio(12000.02);
		
		//Mostrar valores de Atributos
		System.out.println("----- Auto 1 ------");
		System.out.println("auto1.marca: "+ auto1.getMarca());
		System.out.println("auto1.anio: "+ auto1.getAnio());
		System.out.println("auto1.precio: "+ auto1.getAnio());
		
		System.out.println("***** Auto 2 ******");
		System.out.println("auto2.marca: "+ auto2.getMarca());
		System.out.println("auto2.anio: "+ auto2.getAnio());
		System.out.println("auto2.precio: "+ auto2.getPrecio());
	}

}
