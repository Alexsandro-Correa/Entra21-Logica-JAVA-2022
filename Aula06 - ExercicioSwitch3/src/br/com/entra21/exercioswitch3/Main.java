package br.com.entra21.exercioswitch3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Escreva um menu de op��es e trate a situa��o onde o 
		 usu�rio n�o escolha uma op��o informada na lista */
		
		String opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Voc� tem filhos? ");
		System.out.println("Sim");
		System.out.println("N�o");
		opcao = entrada.next();
		
		switch(opcao) {
		case "Sim":
			System.out.println("Legal, voc� tem filhos.");
			break;
		case "N�o":
			System.out.println("Que pena, voc� n�o tem filhos.");
			break;
			default:
				System.out.println("Voc� tem que escolher 'Sim' ou 'N�o' apenas.");
			
		
		}
		

	}

}
