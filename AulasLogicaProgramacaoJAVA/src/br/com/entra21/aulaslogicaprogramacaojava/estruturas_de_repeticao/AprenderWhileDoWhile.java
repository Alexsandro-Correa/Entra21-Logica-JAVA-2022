package br.com.entra21.aulaslogicaprogramacaojava.estruturas_de_repeticao;

import java.util.Scanner;

public class AprenderWhileDoWhile {

	public AprenderWhileDoWhile() {
		
		System.out.println("Escolha uma opção:");
		System.out.println("\n0 - sair \n1 - while\n2 - do-while");

		// Instanciando um objeto da classe Scanner e já utilizando o método next
		switch (new Scanner(System.in).next().toLowerCase()) {
		
		case "0", "sair":
			System.out.println("Escolheu sair.");
			break;

		case "1", "while":
			aprenderWhile();
			break;

		case "2", "do-while": 
			aprenderDoWhile();
			break;

		default:
			System.out.println("Opção inválida");
			new AprenderWhileDoWhile();
			break;
		}

	}

	private static void aprenderWhile() {
		System.out.println("\nVamos aprender o while aqui.\n");
		byte contagem = 1;
		
		while(contagem <= 10) { // condição de permanência
			System.out.println("Contando " + contagem);
			contagem++;
		}
		//para fazer uma repetição com base em quantidade é gerado muito código
		System.out.println("\nAcabei.");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja iniciar uma repetição");
		String resposta = entrada.next();
		
		while(resposta.equalsIgnoreCase("continuar") || resposta.equalsIgnoreCase("sim")) {
			System.out.println("Você respondeu : " + resposta);
			System.out.println("Deseja continuar?");
			resposta = entrada.next();
		}
		
		System.out.println("Terminou meu while com base em decisão");
		
		new AprenderWhileDoWhile();

	}

	private static void aprenderDoWhile() {
		System.out.println("Vamos aprender do while aqui.");
		Scanner entrada = new Scanner(System.in);
		String resposta;
		
		do {
			System.out.println("Existiam 2 dogs Pita e Repita, Pita morreu, quem ficou?");
			resposta =entrada.next();			
		}while(resposta.equalsIgnoreCase("repita"));
		System.out.println("Entendeu né? :P");
		
		byte dia;
				
		do {
			System.out.println("Informe o dia do seu aniversário?");
			dia = entrada.nextByte();
		}while(dia > 31); //repetir enquanto informar algo maior que 31
		System.out.println("Espero que não tenha errado muito...");
		
		byte mes;
		byte contador = 0;
		
		do {
			System.out.println(contador + " erros até o momento.");
			System.out.println("Informe o dia do seu aniversário: (1 até 31)");
			dia = entrada.nextByte();
			System.out.println("Informe o mês do seu aniversário: (1 até 12)");
			mes = entrada.nextByte();
			contador++;
			
		}while(dia < 1 || dia > 31 || mes > 12);
		System.out.println("Finalmente você digitou certo: " + dia + "/" + mes + " mas errou " + contador );
		
		new AprenderWhileDoWhile();
	}
}
