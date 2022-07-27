package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioCalculadora {

	public ExercicioCalculadora() {
		// Faça um programa de calculadora

				
		Scanner entrada = new Scanner(System.in);		
		double numeroA, numeroB;
		String operacao;

				System.out.println("Insira o operação desejada: (+,-,*,/)");
				operacao = entrada.next();

				if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {

					System.out.println("\nInsira o primeiro número: ");
					numeroA = entrada.nextDouble();

					System.out.println("Insira o segundo número: ");
					numeroB = entrada.nextDouble();

					switch (operacao) {

					case "+":
						System.out.println("Soma = " + (numeroA + numeroB));
						break;

					case "-":
						System.out.println("Subtração = " + (numeroA - numeroB));
						break;

					case "*":
						System.out.println("Multiplicação = " + (numeroA * numeroB));
						break;

					case "/":
						System.out.println("Divisão = " + (numeroA / numeroB));
						break;

					default:
						System.out.println("Opção inválida");
						break;
					}

				} else {
					System.out.println("Opção inválida");
				}
	}
}
