package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioOperadorIgualdade {

	public ExercicioOperadorIgualdade(){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Pr�tica sobre operador de igualdade\r\n"
				+ "Fa�a um programa que compare 2 n�meros e informe se o 1� � igual ao 2� numero\n"
				+ "Fa�a um programa que compare 2 n�meros e informe se o 1� � diferente do 2� numero");

		// Exerc�cio 1
		byte idadeA = 24, idadeB = 30;
		boolean resultado;

		resultado = (idadeA) == (idadeB);
		System.out.println("\nA idade " + idadeA + " � igual a idade " + idadeB + "? " + resultado);

		// Exerc�cio 2
		float alturaA = 1.64f, alturaB = 1.50f;
		boolean resultadoB;

		resultadoB = (alturaA) != (alturaB);
		System.out.println("\nA altura " + alturaA + " � diferente da altura " + alturaB + "? " + resultadoB);
		
	}
}
