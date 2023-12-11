package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu=new Calculadora();
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;
		
		resultadoSuma = calcu.sumar(5,3);
		resultadoResta=calcu.restar(10, 2);
		resultadoMultiplicar=calcu.multiplicar(10,5);
		resultadoDividir=calcu.dividir(10, 2);
		resultadoPromediar=calcu.promediar(10,8,9);
		
		calcu.mostrarResultados();
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMultiplicar);
		System.out.println("RESULTADO DIVISION: "+resultadoDividir);
		System.out.println("RESULTADO PROMEDIAR: "+resultadoPromediar);
		

	}

}
