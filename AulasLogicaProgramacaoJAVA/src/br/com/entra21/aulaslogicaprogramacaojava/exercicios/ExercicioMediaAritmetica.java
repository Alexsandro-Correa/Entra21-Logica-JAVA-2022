package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioMediaAritmetica {

	public ExercicioMediaAritmetica() {
		
		Scanner entrada = new Scanner(System.in);
		String aluno;
		float nota1, nota2, nota3, media;

		System.out.println("\nPor favor, insira seu nome: ");
		aluno = entrada.next();

		System.out.println("Insira sua primeira nota: ");
		nota1 = entrada.nextFloat();

		System.out.println("Insira sua segunda nota: ");
		nota2 = entrada.nextFloat();

		System.out.println("Insira sua terceira nota; ");
		nota3 = entrada.nextFloat();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println(aluno + " sua média é: " + media + ".");
	}
}
