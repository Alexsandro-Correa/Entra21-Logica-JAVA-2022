package br.com.entra21.exercicioswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Exiba em tela uma lista de op��es para o usu�rio escolher e para cada escolha retornar uma mensagem diferente. 
		Qual � a sua esta��o do ano favorita? 
		1 = Primavera
		2 = Outono
		3 = Inverno
		4 = Ver�o 
		*/
		
		byte opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual � a usa esta��o do ano favorita? ");
		
		
		System.out.println("\n1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Ver�o");
		
		opcao = entrada.nextByte();
		
		switch(opcao) {
		case 1:
			System.out.println("\nPrimavera, a esta��o das flores.");
			break;
		case 2:
			System.out.println("\nOutono, a esta��o das frutas.");
			break;
		case 3:
			System.out.println("\nInverno, a esta��o mais fria.");
			break;
		case 4:
			System.out.println("\nVer�o, a esta��o mais quente.");
			break;
		default:
				System.out.println("\nOp��o inv�lida.");
				break;
			
		}

	}

}
