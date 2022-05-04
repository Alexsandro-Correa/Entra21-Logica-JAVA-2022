package br.com.alexsandro.ex.opcional1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta 
		e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as
		fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67*/
		
		float C , K, Re, Ra, F;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius");
		C = entrada.nextFloat();
		
		K = (float) (C + 273.15);
		Re = (float) (C * 0.8);
		Ra = (float) (C * 1.8 +32 +459.67);
		F = (float) (C * 1.8 + 32);
		
		System.out.println( C + "ºC, em Kelvin é " + K + "ºK");
		System.out.println( C + "ºC, em Réamur é " + Re + "ºRe" );
		System.out.println( C + "ºC, em Rankine é " + Ra + "ºRa");
		System.out.println( C + "ºC, em Fahrenheit é " + F + "ºF");
		
		
		

	}

}
