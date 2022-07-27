package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioPrecoCusto {

	public ExercicioPrecoCusto() {
		
		Scanner entrada = new Scanner(System.in);
		String produto;
		float precoCusto, precoVenda;

		System.out.println("Informe o nome do produto: ");
		produto = entrada.next();

		System.out.println("Informe o preço de custo do/da " + produto + ":");
		precoCusto = entrada.nextFloat();

		precoVenda = precoCusto * 65 / 100 + precoCusto; // forma longa
		precoVenda = precoCusto * 1.65f; // truque de matemáica

		System.out.println("O preço da venda será de: " + precoVenda);
		
	}
}
