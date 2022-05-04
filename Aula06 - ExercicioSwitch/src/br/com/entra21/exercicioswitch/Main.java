package br.com.entra21.exercicioswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Exiba em tela uma lista de opções para o usuário escolher e para cada escolha retornar uma mensagem diferente. 
		Qual é a sua estação do ano favorita? 
		1 = Primavera
		2 = Outono
		3 = Inverno
		4 = Verão 
		*/
		
		byte opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é a usa estação do ano favorita? ");
		
		
		System.out.println("\n1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Verão");
		
		opcao = entrada.nextByte();
		
		switch(opcao) {
		case 1:
			System.out.println("\nPrimavera, a estação das flores.");
			break;
		case 2:
			System.out.println("\nOutono, a estação das frutas.");
			break;
		case 3:
			System.out.println("\nInverno, a estação mais fria.");
			break;
		case 4:
			System.out.println("\nVerão, a estação mais quente.");
			break;
		default:
				System.out.println("\nOpção inválida.");
				break;
			
		}

	}

}
