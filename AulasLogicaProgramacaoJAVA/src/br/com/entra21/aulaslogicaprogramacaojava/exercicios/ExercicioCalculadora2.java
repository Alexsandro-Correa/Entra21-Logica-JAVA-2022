package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioCalculadora2 {

	public ExercicioCalculadora2() {
		
		//Fa�a um programa de calculadora
				//Capture 2 n�meros e calcule a op��o matem�tica correspondente
				
				String opcao;
				float numeroA, numeroB;
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Digite seu primeiro n�mero:");
				numeroA = entrada.nextFloat();
				System.out.println("Digite a opera��o desejada > (+), (-), (*) ou (/)");
				opcao = entrada.next();
				System.out.println("Digite seu segundo n�mero:");
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
						System.out.println("Nenhuma op��o v�lida foi selecionada.");
						break;
						
						
				}
				
				
				
			}
			
			public static String calculoSoma(float numeroA, float numeroB) {
				
				float soma = numeroA + numeroB;
				System.out.println("O resultado da soma � " + soma);
				
				return "soma";

		}
			public static String calculoSubtracao(float numeroA, float numeroB) {
				
				float subtracao = numeroA - numeroB;
				System.out.println("O resultado da subtra��o � " + subtracao);
				
				return "";

		}
			public static String calculoMultiplicacao(float numeroA, float numeroB) {
						
				float multiplicacao = numeroA * numeroB;
				System.out.println("O resultado da multiplica��o � " + multiplicacao);
				
				return "";

		}
			public static String calculoDivisao(float numeroA, float numeroB) {
				
				float divisao = numeroA / numeroB;
				System.out.println("O resultado da divis�o � " + divisao);
				
				return "";

	}
}
