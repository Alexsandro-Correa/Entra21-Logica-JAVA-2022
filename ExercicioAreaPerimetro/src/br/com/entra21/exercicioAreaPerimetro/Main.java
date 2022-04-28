package br.com.entra21.exercicioAreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.");
		System.out.println("Sabendo que a área é calculada com base no produto entre base e altura.");
		System.out.println("O perímetro é obtido ao somar todos os vertices do retângulo.");
		
		//Criar variáveis
		float base, altura, area, perimetro; //boas práticas de nomenclatura
		
		Scanner entrada = new Scanner(System.in);
		
		//Definir valores às variáveis
		
		System.out.println("Informe a base do retângulo:");
		base = entrada.nextFloat();
		
		System.out.println("Informe a altura do retângulo:");
		altura = entrada.nextFloat(); 
		
		//momento de processamentos...
		area = base * altura;
		perimetro = base *2 + altura *2;
		
		System.out.println("Área é  "+base+" x "+altura);
		System.out.println("Perímetro é "+base+" + "+base+" + "+altura+" + "+altura);
		System.out.println("A sua área é: " + area + ", e seu perímetro é: " + perimetro+".");
		
		
	}

}
