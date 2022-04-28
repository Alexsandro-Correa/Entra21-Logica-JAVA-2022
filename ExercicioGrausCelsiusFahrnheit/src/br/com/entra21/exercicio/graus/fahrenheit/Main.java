package br.com.entra21.exercicio.graus.fahrenheit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que converta graus Fahrenheit em Celsius:");

		float celsius, fahrenheit, conversaoFahrenheit;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Conversor Graus Fahrenheit em Celsius:");
		System.out.println("\nInsira a temperatura em graus Fahrenheit:");
		fahrenheit = entrada.nextFloat();
		conversaoFahrenheit = (float) ((fahrenheit - 32) / 1.8);
		System.out.println("A temperatura em graus Celsius é de " + conversaoFahrenheit + "°C.");

	}

}
