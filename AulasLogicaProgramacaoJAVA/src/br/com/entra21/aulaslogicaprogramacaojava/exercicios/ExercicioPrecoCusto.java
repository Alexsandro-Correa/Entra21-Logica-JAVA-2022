package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioPrecoCusto {

	public ExercicioPrecoCusto() {
		
		Scanner entrada = new Scanner(System.in);
		String produto;
		float precoCusto, precoVenda;

		System.out.println("Informe o nome do produto: ");
		produto = entrada.next();

		System.out.println("Informe o pre�o de custo do/da " + produto + ":");
		precoCusto = entrada.nextFloat();

		precoVenda = precoCusto * 65 / 100 + precoCusto; // forma longa
		precoVenda = precoCusto * 1.65f; // truque de matem�ica

		System.out.println("O pre�o da venda ser� de: " + precoVenda);
		
	}
}
