package br.com.entra21.exercicio.preco.custo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer, ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.");
		//System.out.println("Aumentar um valor percentual � obtido matematicamente ao somar no valor do produto  com o resultado do calculo\r\n"
				//+ "produto X (65 /100)\r\n"
				//+ "\r\n"
				//+ "ou seja aumento=produto+ produto X (60/100)");
		
		String produto;
		float precoCusto, precoVenda;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto: ");
		produto = entrada.nextLine();
		
		System.out.println("Informe o pre�o de custo do produto " +produto + ":");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto * 65/100 + precoCusto; // forma longa
		precoVenda= precoCusto*1.65f; //truque de matem�ica
		
		System.out.println("O pre�o da venda ser� de: " + precoVenda);
		
	}

}
