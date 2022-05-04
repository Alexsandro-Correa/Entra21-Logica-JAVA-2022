package br.com.entra21.exercioswitch3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Escreva um menu de opções e trate a situação onde o 
		 usuário não escolha uma opção informada na lista */
		
		String opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Você tem filhos? ");
		System.out.println("Sim");
		System.out.println("Não");
		opcao = entrada.next();
		
		switch(opcao) {
		case "Sim":
			System.out.println("Legal, você tem filhos.");
			break;
		case "Não":
			System.out.println("Que pena, você não tem filhos.");
			break;
			default:
				System.out.println("Você tem que escolher 'Sim' ou 'Não' apenas.");
			
		
		}
		

	}

}
