package br.com.entra21.aulaslogicaprogramacaojava.estruturas_de_repeticao;

import java.util.Scanner;

public class AprenderWhileDoWhile {

	public AprenderWhileDoWhile() {
		
		System.out.println("Escolha uma op��o:");
		System.out.println("\n0 - sair \n1 - while\n2 - do-while");

		// Instanciando um objeto da classe Scanner e j� utilizando o m�todo next
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
			System.out.println("Op��o inv�lida");
			new AprenderWhileDoWhile();
			break;
		}

	}

	private static void aprenderWhile() {
		System.out.println("\nVamos aprender o while aqui.\n");
		byte contagem = 1;
		
		while(contagem <= 10) { // condi��o de perman�ncia
			System.out.println("Contando " + contagem);
			contagem++;
		}
		//para fazer uma repeti��o com base em quantidade � gerado muito c�digo
		System.out.println("\nAcabei.");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja iniciar uma repeti��o");
		String resposta = entrada.next();
		
		while(resposta.equalsIgnoreCase("continuar") || resposta.equalsIgnoreCase("sim")) {
			System.out.println("Voc� respondeu : " + resposta);
			System.out.println("Deseja continuar?");
			resposta = entrada.next();
		}
		
		System.out.println("Terminou meu while com base em decis�o");
		
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
		System.out.println("Entendeu n�? :P");
		
		byte dia;
				
		do {
			System.out.println("Informe o dia do seu anivers�rio?");
			dia = entrada.nextByte();
		}while(dia > 31); //repetir enquanto informar algo maior que 31
		System.out.println("Espero que n�o tenha errado muito...");
		
		byte mes;
		byte contador = 0;
		
		do {
			System.out.println(contador + " erros at� o momento.");
			System.out.println("Informe o dia do seu anivers�rio: (1 at� 31)");
			dia = entrada.nextByte();
			System.out.println("Informe o m�s do seu anivers�rio: (1 at� 12)");
			mes = entrada.nextByte();
			contador++;
			
		}while(dia < 1 || dia > 31 || mes > 12);
		System.out.println("Finalmente voc� digitou certo: " + dia + "/" + mes + " mas errou " + contador );
		
		new AprenderWhileDoWhile();
	}
}
