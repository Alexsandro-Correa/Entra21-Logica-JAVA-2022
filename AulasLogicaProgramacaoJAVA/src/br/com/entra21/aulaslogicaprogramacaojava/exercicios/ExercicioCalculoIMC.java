package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioCalculoIMC {

	public ExercicioCalculoIMC() {
		
		Scanner entrada = new Scanner(System.in);
		float peso, altura, resultadoIMC;

		System.out.println("Informe seu peso:");
		peso = entrada.nextFloat();

		System.out.println("Informe sua altura:");
		altura = entrada.nextFloat();

		resultadoIMC = peso / (altura * altura);

		System.out.println("IMC " + resultadoIMC);

		if (resultadoIMC < 18.5) {
			System.out.println("Você está abaixo do peso!");
		} else if (resultadoIMC > 18.5 && resultadoIMC <= 24.9) {
			System.out.println("\nVocê está no peso ideal!");
		} else if (resultadoIMC > 24.9 && resultadoIMC <= 29.9) {
			System.out.println("\nVocê está com sobrepeso!");
		} else if (resultadoIMC > 30.0 && resultadoIMC <= 34.9) {
			System.out.println("\nVocê está com obesidade grau I!");
		} else if (resultadoIMC > 35.0 && resultadoIMC <= 39.9) {
			System.out.println("\nVocê está com obesidade grau II!");
		} else if (resultadoIMC > 40.0) {
			System.out.println("\nVocê está obesidade grau III!");
		}

		System.out.println("\nTabela IMC");
		System.out.println("\nAbaixo do peso: Abaixo de 18,5.");
		System.out.println("Peso ideal: 18,5 - 24,9.");
		System.out.println("Sobrepeso: 24,9 - 29,9.");
		System.out.println("Obesidade grau I: 30 - 34,9.");
		System.out.println("Obesidade grau II; 35 - 39,9.");
		System.out.println("Obesidade grau III: Maior ou igual a 40.");
	}
}
