package br.com.entra21.prova02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crie um programa que faça vários cálculos Informe qual operação matemática
		 * deseja realizar caso informe 0 deve encerrar o programa 1 = somar 2 =
		 * subtrair 3 = multiplicar 4 = dividir Capturar os 2 valores e informar o
		 * resultado e esperar o próximo calculo
		 * 
		 */

		float numeroA, numeroB;

		// Usei a base do projeto no método selecaoOperacao(); para organizar melhor o
		// código e deixar o método principal o mais limpo possível.
		selecaoOperacao();
		selecaoOperacao();
		selecaoOperacao();
		selecaoOperacao();

	}

	public static void selecaoOperacao() {
		// Aqui usei String para direcionar o usuário ao comando que ele deve usar e
		// Scanner para capturar o que ele digitou.
		Scanner entrada = new Scanner(System.in);
		String opcao;
		System.out.println("Selecione a operação desejada: ");
		System.out.println("1 = somar = +");
		System.out.println("2 = subtrair = -");
		System.out.println("3 = multiplicar = *");
		System.out.println("4 = dividir = /");
		System.out.println("5 = sair");
		opcao = entrada.nextLine();

		/*
		 * Usei swtch aqui para quando o usário escolher uma operação o programa
		 * entender, de acordo com o que for solictado,caso não sejá uma opção válida o
		 * programa para de executar.
		 */
		switch (opcao) {
		case "1", "somar", "+":
			calculoSoma();
			break;

		case "2", "subtrair", "-":
			calculoSubtracao();
			break;

		case "3", "multiplicar", "*":
			calculoMultiplicacao();
			break;

		case "4", "dividir", "/":
			calculoDivisao();
			break;

		case "5", "sair":
			System.out.println("\nFinalizar operação.");
			System.exit(0);
		default:
			System.out.println("Você não selecionou nenhuma opção válida");
			System.exit(0);
		}

	}

	// Em todos os métodos abaixo estão as fórmulas para a execução do código
	// desejado
	// Se o usuário digitar zero, o programa irá parar de executar.

	public static void calculoSoma() {
		float numeroA, numeroB, soma;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu primeiro número:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite seu segundo número:");
		numeroB = entrada.nextFloat();

		if (numeroA == 0 || numeroB == 0) {
			System.out.println("Proibído usar o número 0(zero).");
			System.exit(0);
		} else {
			soma = numeroA + numeroB;
			System.out.println("O resultado da soma é " + soma);
		}
	}

	public static void calculoSubtracao() {
		float numeroA, numeroB, subtracao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu primeiro número:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite seu segundo número:");
		numeroB = entrada.nextFloat();

		if (numeroA == 0 || numeroB == 0) {
			System.out.println("Proibído usar o número 0(zero).");
			System.exit(0);
		} else {
			subtracao = numeroA - numeroB;
			System.out.println("O resultado da subtração é " + subtracao);
		}
	}

	public static void calculoMultiplicacao() {
		float numeroA, numeroB, mult;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu primeiro número:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite seu segundo número:");
		numeroB = entrada.nextFloat();

		if (numeroA == 0 || numeroB == 0) {
			System.out.println("Proibído usar o número 0(zero).");
			System.exit(0);
		} else {
			mult = numeroA * numeroB;
			System.out.println("O resultado da multiplicação é " + mult);
		}
	}

	public static void calculoDivisao() {
		float numeroA, numeroB, div;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu primeiro número:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite seu segundo número:");
		numeroB = entrada.nextFloat();

		if (numeroA == 0 || numeroB == 0) {
			System.out.println("Proibído usar o número 0(zero).");
			System.exit(0);
		} else {
			div = numeroA / numeroB;
			System.out.println("O resultado da divisão é " + div);
		}
	}

}
