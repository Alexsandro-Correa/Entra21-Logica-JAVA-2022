package br.com.entra21.exercioswitch3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Escreva um menu de op��es e trate a situa��o onde o usu�rio n�o escolha uma
		 * op��o informada na lista
		 */

		String opcao;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Voc� tem filhos? ");
		System.out.println("Sim");
		System.out.println("N�o");
		opcao = entrada.next();
		opcao = opcao.toLowerCase(); // com esse comando sempre escreve em min�sculo a entrada
		//opcao = opcao.toUpperCase():   com esse comando sempre escreve em mai�sculo a entrada

		switch (opcao) {
		case "sim":
			System.out.println("Legal, voc� tem filhos.");
			break;
		case "n�o":
			System.out.println("Que pena, voc� n�o tem filhos.");
			break;
		default:
			System.out.println("Voc� tem que escolher 'Sim' ou 'N�o' apenas.");
			break;

		}

	}

}
