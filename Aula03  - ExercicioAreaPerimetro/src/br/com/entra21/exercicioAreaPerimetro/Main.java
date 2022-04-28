package br.com.entra21.exercicioAreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fa�a um programa que solicite a base e altura de um ret�ngulo e informe sua �rea e perimetro.");
		System.out.println("Sabendo que a �rea � calculada com base no produto entre base e altura.");
		System.out.println("O per�metro � obtido ao somar todos os vertices do ret�ngulo.");
		
		//Criar vari�veis
		float base, altura, area, perimetro; //boas pr�ticas de nomenclatura
		
		Scanner entrada = new Scanner(System.in);
		
		//Definir valores �s vari�veis
		
		System.out.println("Informe a base do ret�ngulo:");
		base = entrada.nextFloat();
		
		System.out.println("Informe a altura do ret�ngulo:");
		altura = entrada.nextFloat(); 
		
		//momento de processamentos...
		area = base * altura;
		perimetro = base *2 + altura *2;
		
		System.out.println("�rea �  "+base+" x "+altura);
		System.out.println("Per�metro � "+base+" + "+base+" + "+altura+" + "+altura);
		System.out.println("A sua �rea �: " + area + ", e seu per�metro �: " + perimetro+".");
		
		
	}

}
