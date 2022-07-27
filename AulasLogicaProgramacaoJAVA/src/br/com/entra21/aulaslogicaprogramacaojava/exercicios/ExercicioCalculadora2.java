package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioCalculadora2 {

	public ExercicioCalculadora2() {
		
		//Faça um programa de calculadora
				//Capture 2 números e calcule a opção matemática correspondente
				
				String opcao;
				float numeroA, numeroB;
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Digite seu primeiro número:");
				numeroA = entrada.nextFloat();
				System.out.println("Digite a operação desejada > (+), (-), (*) ou (/)");
				opcao = entrada.next();
				System.out.println("Digite seu segundo número:");
				numeroB = entrada.nextFloat();
				
				switch(opcao) {
				case "+":
					calculoSoma(numeroA, numeroB);
					break;
				case "-":
					calculoSubtracao(numeroA, numeroB);
					break;
				case "*":
					calculoMultiplicacao(numeroA, numeroB);
					break;
				case "/":
					calculoDivisao(numeroA, numeroB);
					break;
					default:
						System.out.println("Nenhuma opção válida foi selecionada.");
						break;
						
						
				}
				
				
				
			}
			
			public static String calculoSoma(float numeroA, float numeroB) {
				
				float soma = numeroA + numeroB;
				System.out.println("O resultado da soma é " + soma);
				
				return "soma";

		}
			public static String calculoSubtracao(float numeroA, float numeroB) {
				
				float subtracao = numeroA - numeroB;
				System.out.println("O resultado da subtração é " + subtracao);
				
				return "";

		}
			public static String calculoMultiplicacao(float numeroA, float numeroB) {
						
				float multiplicacao = numeroA * numeroB;
				System.out.println("O resultado da multiplicação é " + multiplicacao);
				
				return "";

		}
			public static String calculoDivisao(float numeroA, float numeroB) {
				
				float divisao = numeroA / numeroB;
				System.out.println("O resultado da divisão é " + divisao);
				
				return "";

	}
}
