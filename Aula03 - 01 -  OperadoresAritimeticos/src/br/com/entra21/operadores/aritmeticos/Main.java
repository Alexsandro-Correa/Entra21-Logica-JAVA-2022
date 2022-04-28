package br.com.entra21.operadores.aritmeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Operadores Aritméticos");

		System.out.println("Realizando uma soma" + (1 + 7));
		System.out.println(4 + 10);

		float numeroA, numeroB;
		float calculoSoma;
		float resto;

		// Objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso
		// ao teclado
		Scanner entrada = new Scanner(System.in);
		// new Scanner significa construa um objeto da classe Scanner e atribua na
		// variavel entrada

		System.out.println("Informe o número A:");
		numeroA = entrada.nextFloat();

		System.out.println("Informe o número B:");
		numeroB = entrada.nextFloat();

		System.out.println("A soma entre esses 2 números é " + (numeroA + numeroB));
		calculoSoma = numeroA + numeroB;

		System.out.println("Outra forma de exibir essa soma é " + calculoSoma);

		System.out.println("A subtração entre esses 2 números é " + (numeroA - numeroB));

		System.out.println("Multiplicação " + numeroA * numeroB);
		
		System.out.println("Divisão " + numeroA/numeroB);
		
		resto = numeroA%numeroB;
		
		System.out.println("O resto da divisão " + resto);
		
		boolean ehDivisivel = numeroA % numeroB ==0;
		
		System.out.println("É divisível entre si? " +ehDivisivel);
		
		

	}

}
