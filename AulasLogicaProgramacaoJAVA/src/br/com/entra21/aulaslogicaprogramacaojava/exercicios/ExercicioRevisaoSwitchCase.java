package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioRevisaoSwitchCase {

	static Scanner entrada = new Scanner(System.in);

	public ExercicioRevisaoSwitchCase() {

		System.out.println("Exerc�cios Switch\n");
		System.out.println("1 - Exerc�cio 1");
		System.out.println("2 - Exerc�cio 2");
		System.out.println("3 - Exerc�cio 3");
		System.out.println("4 - Exerc�cio 4");
		byte option;
		option = entrada.nextByte();

		switch (option) {

		case 1:
			exercicioRevisaoSwitch1();
			break;

		case 2:
			exercicioRevisaoSwitch2();
			break;

		case 3:
			exercicioRevisaoSwitch3();
			break;

		case 4:
			exercicioRevisaoSwitch4();
			break;

		}

	}

	private static void exercicioRevisaoSwitch1() {

		String nome;
		byte mes;

		System.out.println("Informe seu nome: ");
		nome = entrada.next();

		System.out.println("Informe o m�s de seu anivers�rio em n�mero : ");
		mes = entrada.nextByte();

		switch (mes) {
		case 1:
			System.out.println("M�s 1, Janeiro");
			break;
		case 2:
			System.out.println("M�s 2, Fevereiro");
			break;
		case 3:
			System.out.println("M�s 3, Mar�o");
			break;
		case 4:
			System.out.println("M�s 4, Abril");
			break;
		case 5:
			System.out.println("M�s 5, Maio");
			break;
		case 6:
			System.out.println("M�s 6, Junho");
			break;
		case 7:
			System.out.println("M�s , Julho");
			break;
		case 8:
			System.out.println("M�s 8, Agosto");
			break;
		case 9:
			System.out.println("M�s 9, Setembro");
			break;
		case 10:
			System.out.println("M�s 10, Outubro");
			break;
		case 11:
			System.out.println("M�s 11, Novembro");
			break;
		case 12:
			System.out.println("M�s 12, Dezembro");
			break;
		default:
			System.out.println(nome + " ,voc� n�o selecionou um m�s v�lido.");
		}
	}

	private static void exercicioRevisaoSwitch2() {

		/*
		 * Exiba em tela uma lista de op��es para o usu�rio escolher e para cada escolha
		 * retornar uma mensagem diferente. Qual � a sua esta��o do ano favorita? 1 =
		 * Primavera 2 = Outono 3 = Inverno 4 = Ver�o
		 */

		byte opcao;

		System.out.println("Qual � a usa esta��o do ano favorita? ");

		System.out.println("\n1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Ver�o");

		opcao = entrada.nextByte();

		switch (opcao) {
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

	private static void exercicioRevisaoSwitch3() {

		/*
		 * Com o mesmo formato do exerc�cio 1 , agora aceite apenas String como resposta
		 * Qual � a sua cor favorita? Verde Azul Amarelo Vermelho
		 */

		String opcao;

		System.out.println("Qual � a sua cor favorita entre as op��es? \n\nVerde\nAzul\nAmarelo\nVermelho");

		opcao = entrada.next();

		switch (opcao) {
		case "Verde":
		case "verde":
			System.out.println("\nVerde, a cor da esperan�a.");
			break;
		case "Azul":
		case "azul":
			System.out.println("\nAzul, a cor do mar.");
			break;
		case "Amarelo":
		case "amarelo":
			System.out.println("\nAmarelo, a cor da amizade.");
			break;
		case "Vermelho":
		case "vermelho":
			System.out.println("\nVermelho, a cor do amor.");
			break;
		default:
			System.out.println("\nOp��o inv�lida.");
			break;

		}

	}

	private static void exercicioRevisaoSwitch4() {

		/*
		 * Escreva um menu de op��es e trate a situa��o onde o usu�rio n�o escolha uma
		 * op��o informada na lista
		 */

		String opcao;

		System.out.println("Voc� tem filhos? ");
		System.out.println("Sim");
		System.out.println("N�o");
		opcao = entrada.next();
		opcao = opcao.toLowerCase(); // com esse comando sempre escreve em min�sculo a entrada
		// opcao = opcao.toUpperCase(): com esse comando sempre escreve em mai�sculo a
		// entrada

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
