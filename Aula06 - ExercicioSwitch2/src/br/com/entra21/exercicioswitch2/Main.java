package br.com.entra21.exercicioswitch2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Com o mesmo formato do exercício 1 , agora aceite apenas String como resposta
Qual é a sua cor favorita? 
Verde
Azul
Amarelo
Vermelho*/
		
		System.out.println("Qual é a sua cor favorita? ");
		String opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nVerde");
		System.out.println("Azul");
		System.out.println("Amarelo");
		System.out.println("Vermelho");
		
		opcao = entrada.next();
		
		switch(opcao) {
		case "Verde":
			System.out.println("\nVerde, a cor da esperança.");
			break;
		case "Azul":
			System.out.println("\nAzul, a cor do mar.");
			break;
		case "Amarelo":
			System.out.println("\nAmarelo, a cor da amizade.");
			break;
		case "Vermelho":
			System.out.println("\nVermelho, a cor do amor.");
			break;
		default:
				System.out.println("\nOpção inválida.");
				break;
			
		}

	}

}
