package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioOperadorRelacional {

	public ExercicioOperadorRelacional() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Prática sobre operador relacional\r\n"
				+ "Faça um programa que informe se o 1º numero é maior que o 2º numero"
				+ "Faça um programa que informe se o 1º numero é maior ou igual que o 2º numero"
				+ "Faça um programa que informe se o 1º numero é menor que o 2º numero"
				+ "Faça um programa que informe se o 1º numero é menor ou igual que o 2º numero");

		float peso1 = 64.5f, peso2 = 52.3f, peso3 = 80.3f, peso4 = 68.3f;
		boolean resultado, resultado2, resultado3, resultado4;
		resultado = (peso3) > (peso2);
		resultado2 = (peso4) >= (peso2);
		resultado3 = (peso1) < (peso2);
		resultado4 = (peso1) <= (peso3);

		System.out.println("\n" + peso3 + "kg é mais pesado que " + peso2 + "kg? " + resultado);
		System.out.println("\n" + peso4 + "kg é mais pesado ou tão pesado quanto " + peso2 + "kg? " + resultado2);
		System.out.println("\n" + peso1 + "kg é mais pesado que " + peso2 + "kg? " + resultado3);
		System.out.println("\n" + peso1 + "kg é mais pesado ou tão pesado quanto " + peso3 + "kg? " + resultado4);

	}
}
