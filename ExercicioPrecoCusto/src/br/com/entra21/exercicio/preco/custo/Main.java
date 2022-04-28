package br.com.entra21.exercicio.preco.custo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer, após, processe um aumento de 65% e informe qual será o preço de venda.");
		//System.out.println("Aumentar um valor percentual é obtido matematicamente ao somar no valor do produto  com o resultado do calculo\r\n"
				//+ "produto X (65 /100)\r\n"
				//+ "\r\n"
				//+ "ou seja aumento=produto+ produto X (60/100)");
		
		String produto;
		float precoCusto, precoVenda;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto: ");
		produto = entrada.nextLine();
		
		System.out.println("Informe o preço de custo do produto " +produto + ":");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto * 65/100 + precoCusto; // forma longa
		precoVenda= precoCusto*1.65f; //truque de matemáica
		
		System.out.println("O preço da venda será de: " + precoVenda);
		
	}

}
