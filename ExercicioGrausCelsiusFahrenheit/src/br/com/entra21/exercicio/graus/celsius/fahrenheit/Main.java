package br.com.entra21.exercicio.graus.celsius.fahrenheit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que converta graus Celsius em Fahrenheit:");

		float celsius, fahrenheit, conversaoCelsius;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Conversor Graus Fahrenheit em Celsius:");
		System.out.println("\nInsira a temperatura em graus Celsius:");
		celsius = entrada.nextFloat();
		conversaoCelsius =  (float) ((float) celsius * 1.8 +32);
		System.out.println("A temperatura em graus Fahrenheit é de " + conversaoCelsius + "°F.");

	}

}
