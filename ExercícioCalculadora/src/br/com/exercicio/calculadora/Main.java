package br.com.exercicio.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fa�a um programa de calculadora: ");
		
		double numeroA, numeroB;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro n�mero: ");
		numeroA = entrada.nextDouble();
		
		System.out.println("Insira o segundo n�mero: ");
		numeroB = entrada.nextDouble();
		
		System.out.println("Soma = " + (numeroA + numeroB));
		System.out.println("Subtra��o = " + (numeroA - numeroB));
		System.out.println("Multiplica��o = " + (numeroA * numeroB));
		System.out.println("Divis�o = " + (numeroA / numeroB));
		
		

	}

}
