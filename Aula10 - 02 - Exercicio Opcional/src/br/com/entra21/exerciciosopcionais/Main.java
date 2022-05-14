package br.com.entra21.exerciciosopcionais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Escreva um algoritmo que exiba 20 vezes a mensagem "Eu gosto de estudar
		// algoritmos"
		// Escreva um algoritmo que calcule a soma dos n�meros de 1 a 15.
		// Leia a idade de 20 pessoas e exiba a soma das idades

		menu();

	}

	private static void menu() {

		String opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma op��o: ");
		System.out.println("1 - Repeti��o at� 20 - repeti�ao 20");
		System.out.println("2 - Repeti��o soma at� 15 - soma 15");
		System.out.println("3 - ");
		System.out.println("4 - ");
		System.out.println("5 - ");
		System.out.println("6 - ");
		System.out.println("7 - ");
		System.out.println("8 - ");
		System.out.println("9 - ");
		opcao = entrada.next();

		switch (opcao) {
		case "1", "Repeti��o at� 20", "repeti�ao 20":
			algoritmoRepeticao();
			break;

		case "2", "Repeti��o soma at� 15", "soma 15":
			algoritmoSoma();
			break;

		case "3":
			somaIdades();
			break;
		}
	}

	private static void algoritmoRepeticao() {

		for (byte contador = 1; contador <= 20; contador++) {
			System.out.println("Eu gosto de estudar algoritmos: " + contador);
		}
	}

	private static void algoritmoSoma() {

		byte numero = 1, contador;

		for (numero = 1; numero <= 15; numero++) {
			System.out.println("\nSoma do n�mero " + numero + " at� 15.");
			for (contador = 1; contador < 16; contador++) {
				System.out.println(numero + " + " + contador + " = " + (numero + contador));
			}
		}
	}

	private static void somaIdades() {
		
		
		

	}

}
