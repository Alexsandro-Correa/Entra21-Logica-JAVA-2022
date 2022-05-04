package br.com.entra21.exercioswitch3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Escreva um menu de opções e trate a situação onde o usuário não escolha uma
		 * opção informada na lista
		 */

		String opcao;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Você tem filhos? ");
		System.out.println("Sim");
		System.out.println("Não");
		opcao = entrada.next();
		opcao = opcao.toLowerCase(); // com esse comando sempre escreve em minúsculo a entrada
		//opcao = opcao.toUpperCase():   com esse comando sempre escreve em maiúsculo a entrada

		switch (opcao) {
		case "sim":
			System.out.println("Legal, você tem filhos.");
			break;
		case "não":
			System.out.println("Que pena, você não tem filhos.");
			break;
		default:
			System.out.println("Você tem que escolher 'Sim' ou 'Não' apenas.");
			break;

		}

	}

}
