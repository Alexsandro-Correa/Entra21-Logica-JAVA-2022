package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioCalculadora {

	public ExercicioCalculadora() {
		// Fa�a um programa de calculadora

				
		Scanner entrada = new Scanner(System.in);		
		double numeroA, numeroB;
		String operacao;

				System.out.println("Insira o opera��o desejada: (+,-,*,/)");
				operacao = entrada.next();

				if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {

					System.out.println("\nInsira o primeiro n�mero: ");
					numeroA = entrada.nextDouble();

					System.out.println("Insira o segundo n�mero: ");
					numeroB = entrada.nextDouble();

					switch (operacao) {

					case "+":
						System.out.println("Soma = " + (numeroA + numeroB));
						break;

					case "-":
						System.out.println("Subtra��o = " + (numeroA - numeroB));
						break;

					case "*":
						System.out.println("Multiplica��o = " + (numeroA * numeroB));
						break;

					case "/":
						System.out.println("Divis�o = " + (numeroA / numeroB));
						break;

					default:
						System.out.println("Op��o inv�lida");
						break;
					}

				} else {
					System.out.println("Op��o inv�lida");
				}
	}
}
