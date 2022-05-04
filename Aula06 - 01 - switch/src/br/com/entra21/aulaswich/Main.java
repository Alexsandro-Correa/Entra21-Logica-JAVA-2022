package br.com.entra21.aulaswich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Condicionais Switch: ");
		
		System.out.println("\nServe para escolher entre opções pré definidas");
		
		System.out.println("Geralmente quando há muitos if elses ifs baseados em igualdade");
		
		
		float altura = 1.5f;
		
		if(altura == 1.0) {
			System.out.println("\nÉ baixinho");
		}else if(altura == 1.2){
			System.out.println("\nContinua baixinho");
		}else if(altura == 1.5){
			System.out.println("\nBaixinho mas nem tanto");
		}else {
			System.out.println("\nJá não é considerado baixinho");
		}
		
		System.out.println("1 = Intervalo");
		System.out.println("2 = Exercício");
		System.out.println("3 = Prova");
		Scanner entrada = new Scanner(System.in);
		byte opcao;
		System.out.println("\nEscolha a opção 3 se tiver coragem:");
		System.out.println("Ou escolha qualquer opção.");
		opcao = entrada.nextByte();
		
		switch(opcao) {
		case 1:
			System.out.println("Vamos para o intervalo");
			break;
			
		case 2:
			System.out.println("Daqui a pouco tem exercício");
			break;
			
		case 3:
			System.out.println("\nEra dia 5 mas podemos fazer hoje");
			break;
		
		}
		
		String resposta;
		System.out.println("\nQueremos intervalo?");
		resposta = entrada.next();
		
		switch(resposta) {
		case "sim":
			System.out.println("\nHoje foi na hora");
			break;
			
		case "não":
			System.out.println("\nEsperar mais um pouco...");
			break;
			
			default:
				System.out.println("\nEra uma pergunta tão simples...");
		
		}
		
		System.out.println("Escolha um número:");
		System.out.println("1 = azul");
		System.out.println("2 = vermelho");
		resposta = entrada.next();
		
		switch(resposta) {
		case "1":
			System.out.println("Azul é bom,mas nada contra quem gosta de vermelho");
			break;
		case "2":
			System.out.println("Vermelho");
			break;
		case "nenhuma":
			break;
		default:
			System.out.println("Opção inválida");
			break;
				
		}
		

	}

}
