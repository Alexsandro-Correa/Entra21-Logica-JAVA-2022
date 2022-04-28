package br.com.exercicio.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa de calculadora: ");
		
		double numeroA, numeroB;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro número: ");
		numeroA = entrada.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		numeroB = entrada.nextDouble();
		
		System.out.println("Soma = " + (numeroA + numeroB));
		System.out.println("Subtração = " + (numeroA - numeroB));
		System.out.println("Multiplicação = " + (numeroA * numeroB));
		System.out.println("Divisão = " + (numeroA / numeroB));
		
		

	}

}
