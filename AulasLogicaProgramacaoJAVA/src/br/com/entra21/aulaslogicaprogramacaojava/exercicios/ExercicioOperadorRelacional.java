package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioOperadorRelacional {

	public ExercicioOperadorRelacional() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Pr�tica sobre operador relacional\r\n"
				+ "Fa�a um programa que informe se o 1� numero � maior que o 2� numero"
				+ "Fa�a um programa que informe se o 1� numero � maior ou igual que o 2� numero"
				+ "Fa�a um programa que informe se o 1� numero � menor que o 2� numero"
				+ "Fa�a um programa que informe se o 1� numero � menor ou igual que o 2� numero");

		float peso1 = 64.5f, peso2 = 52.3f, peso3 = 80.3f, peso4 = 68.3f;
		boolean resultado, resultado2, resultado3, resultado4;
		resultado = (peso3) > (peso2);
		resultado2 = (peso4) >= (peso2);
		resultado3 = (peso1) < (peso2);
		resultado4 = (peso1) <= (peso3);

		System.out.println("\n" + peso3 + "kg � mais pesado que " + peso2 + "kg? " + resultado);
		System.out.println("\n" + peso4 + "kg � mais pesado ou t�o pesado quanto " + peso2 + "kg? " + resultado2);
		System.out.println("\n" + peso1 + "kg � mais pesado que " + peso2 + "kg? " + resultado3);
		System.out.println("\n" + peso1 + "kg � mais pesado ou t�o pesado quanto " + peso3 + "kg? " + resultado4);

	}
}
