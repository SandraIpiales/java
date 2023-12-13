package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetroR1;
		double perimetroR2;

		r1.setBase(10);
		r1.setAltura(5);

		r2.setBase(8);
		r2.setAltura(3);

		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		perimetroR1=r1.calcularPerimetro();
		perimetroR2=r2.calcularPerimetro();
		
		System.out.println("Area de r1:" + areaR1);
		System.out.println("Area de r2:" + areaR2);
		System.out.println("Perímetro de r1:" + perimetroR1);
		System.out.println("Perímetro de r:" + perimetroR2);


		

	}

}