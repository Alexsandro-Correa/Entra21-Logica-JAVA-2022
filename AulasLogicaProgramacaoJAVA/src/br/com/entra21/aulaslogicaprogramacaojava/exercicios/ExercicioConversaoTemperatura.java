package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioConversaoTemperatura {

	public ExercicioConversaoTemperatura() {
		
		Scanner entrada = new Scanner(System.in);
		byte option;

		System.out.println("1 = Converter graus Celsius em Fahrenheit");
		System.out.println("2 = Converter graus Fahrenheit em Celsius");
		option = entrada.nextByte();

		switch (option) {

		case 1:
			float celsius, fahrenheit, conversaoCelsius;

			System.out.println("Conversor Graus Fahrenheit em Celsius:");
			System.out.println("\nInsira a temperatura em graus Celsius:");
			celsius = entrada.nextFloat();
			conversaoCelsius = (float) ((float) celsius * 1.8 + 32);
			System.out.println("A temperatura em graus Fahrenheit é de " + conversaoCelsius + "°F.");
			break;

		case 2:
			float conversaoFahrenheit;

			System.out.println("Conversor Graus Fahrenheit em Celsius:");
			System.out.println("\nInsira a temperatura em graus Fahrenheit:");
			fahrenheit = entrada.nextFloat();
			conversaoFahrenheit = (float) ((fahrenheit - 32) / 1.8);
			System.out.println("A temperatura em graus Celsius é de " + conversaoFahrenheit + "°C.");

			break;

		}

		
		
	}
}
