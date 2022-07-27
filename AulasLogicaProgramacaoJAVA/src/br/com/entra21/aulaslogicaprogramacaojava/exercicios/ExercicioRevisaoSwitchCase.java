package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioRevisaoSwitchCase {

	static Scanner entrada = new Scanner(System.in);

	public ExercicioRevisaoSwitchCase() {

		System.out.println("Exercícios Switch\n");
		System.out.println("1 - Exercício 1");
		System.out.println("2 - Exercício 2");
		System.out.println("3 - Exercício 3");
		System.out.println("4 - Exercício 4");
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

		System.out.println("Informe o mês de seu aniversário em número : ");
		mes = entrada.nextByte();

		switch (mes) {
		case 1:
			System.out.println("Mês 1, Janeiro");
			break;
		case 2:
			System.out.println("Mês 2, Fevereiro");
			break;
		case 3:
			System.out.println("Mês 3, Março");
			break;
		case 4:
			System.out.println("Mês 4, Abril");
			break;
		case 5:
			System.out.println("Mês 5, Maio");
			break;
		case 6:
			System.out.println("Mês 6, Junho");
			break;
		case 7:
			System.out.println("Mês , Julho");
			break;
		case 8:
			System.out.println("Mês 8, Agosto");
			break;
		case 9:
			System.out.println("Mês 9, Setembro");
			break;
		case 10:
			System.out.println("Mês 10, Outubro");
			break;
		case 11:
			System.out.println("Mês 11, Novembro");
			break;
		case 12:
			System.out.println("Mês 12, Dezembro");
			break;
		default:
			System.out.println(nome + " ,você não selecionou um mês válido.");
		}
	}

	private static void exercicioRevisaoSwitch2() {

		/*
		 * Exiba em tela uma lista de opções para o usuário escolher e para cada escolha
		 * retornar uma mensagem diferente. Qual é a sua estação do ano favorita? 1 =
		 * Primavera 2 = Outono 3 = Inverno 4 = Verão
		 */

		byte opcao;

		System.out.println("Qual é a usa estação do ano favorita? ");

		System.out.println("\n1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Verão");

		opcao = entrada.nextByte();

		switch (opcao) {
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

	private static void exercicioRevisaoSwitch3() {

		/*
		 * Com o mesmo formato do exercício 1 , agora aceite apenas String como resposta
		 * Qual é a sua cor favorita? Verde Azul Amarelo Vermelho
		 */

		String opcao;

		System.out.println("Qual é a sua cor favorita entre as opções? \n\nVerde\nAzul\nAmarelo\nVermelho");

		opcao = entrada.next();

		switch (opcao) {
		case "Verde":
		case "verde":
			System.out.println("\nVerde, a cor da esperança.");
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
			System.out.println("\nOpção inválida.");
			break;

		}

	}

	private static void exercicioRevisaoSwitch4() {

		/*
		 * Escreva um menu de opções e trate a situação onde o usuário não escolha uma
		 * opção informada na lista
		 */

		String opcao;

		System.out.println("Você tem filhos? ");
		System.out.println("Sim");
		System.out.println("Não");
		opcao = entrada.next();
		opcao = opcao.toLowerCase(); // com esse comando sempre escreve em minúsculo a entrada
		// opcao = opcao.toUpperCase(): com esse comando sempre escreve em maiúsculo a
		// entrada

		switch (opcao) {
		case "sim":
			System.out.println("Legal, você tem filhos.");
			break;
		case "não":
			System.out.println("Que pena, você não tem filhos.");
			break;
		default:
			System.out.println("Você tem que escolher 'Sim' ou 'Não' apenas.");
			break;

		}

	}
}
