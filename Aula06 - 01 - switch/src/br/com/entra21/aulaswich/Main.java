package br.com.entra21.aulaswich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Condicionais Switch: ");
		
		System.out.println("\nServe para escolher entre op��es pr� definidas");
		
		System.out.println("Geralmente quando h� muitos if elses ifs baseados em igualdade");
		
		
		float altura = 1.5f;
		
		if(altura == 1.0) {
			System.out.println("\n� baixinho");
		}else if(altura == 1.2){
			System.out.println("\nContinua baixinho");
		}else if(altura == 1.5){
			System.out.println("\nBaixinho mas nem tanto");
		}else {
			System.out.println("\nJ� n�o � considerado baixinho");
		}
		
		System.out.println("1 = Intervalo");
		System.out.println("2 = Exerc�cio");
		System.out.println("3 = Prova");
		Scanner entrada = new Scanner(System.in);
		byte opcao;
		System.out.println("\nEscolha a op��o 3 se tiver coragem:");
		System.out.println("Ou escolha qualquer op��o.");
		opcao = entrada.nextByte();
		
		switch(opcao) {
		case 1:
			System.out.println("Vamos para o intervalo");
			break;
			
		case 2:
			System.out.println("Daqui a pouco tem exerc�cio");
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
			
		case "n�o":
			System.out.println("\nEsperar mais um pouco...");
			break;
			
			default:
				System.out.println("\nEra uma pergunta t�o simples...");
		
		}
		
		System.out.println("Escolha um n�mero:");
		System.out.println("1 = azul");
		System.out.println("2 = vermelho");
		resposta = entrada.next();
		
		switch(resposta) {
		case "1":
			System.out.println("Azul � bom,mas nada contra quem gosta de vermelho");
			break;
		case "2":
			System.out.println("Vermelho");
			break;
		case "nenhuma":
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
				
		}
		

	}

}
