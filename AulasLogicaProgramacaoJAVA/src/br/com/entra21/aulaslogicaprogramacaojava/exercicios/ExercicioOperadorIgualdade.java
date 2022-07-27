package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioOperadorIgualdade {

	public ExercicioOperadorIgualdade(){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Prática sobre operador de igualdade\r\n"
				+ "Faça um programa que compare 2 números e informe se o 1º é igual ao 2º numero\n"
				+ "Faça um programa que compare 2 números e informe se o 1º é diferente do 2º numero");

		// Exercício 1
		byte idadeA = 24, idadeB = 30;
		boolean resultado;

		resultado = (idadeA) == (idadeB);
		System.out.println("\nA idade " + idadeA + " é igual a idade " + idadeB + "? " + resultado);

		// Exercício 2
		float alturaA = 1.64f, alturaB = 1.50f;
		boolean resultadoB;

		resultadoB = (alturaA) != (alturaB);
		System.out.println("\nA altura " + alturaA + " é diferente da altura " + alturaB + "? " + resultadoB);
		
	}
}
