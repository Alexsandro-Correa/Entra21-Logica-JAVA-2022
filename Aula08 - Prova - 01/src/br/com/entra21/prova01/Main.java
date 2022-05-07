package br.com.entra21.prova01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crie um programa que informe o signo do usuário Capturar nome , dia e mês de
		 * aniversário Criar constante para numero limite do dia do mês, no caso 31 Se o
		 * dia for maior que o limite Informar o valor limite para um dia do mês Senão
		 * escolher o mês correspondente para fazer as validações especificas nesse mês
		 * existe esse dia? com base no dia do mês qual é o signo mês invalido
		 */

		codigoSignos();

	}

	public static void codigoSignos() {

		// Nessa primeira parte do código declarei as variáveis e constantes
		// Usei String e Scanner para auxiliar o usuário e captar a sua resposta pra que
		// o código
		// funcione de acordo com o solicitado

		String nome, mes;
		byte dia;
		final byte diaMes = 31, diaMes2 = 30, diaMes3 = 28;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		nome = entrada.next();

		System.out.println("Digite o dia do seu nascimento: ");

		dia = entrada.nextByte();

		System.out.println("Digite seu mês de nascimento: ");
		diaMes();
		mes = entrada.next();

		// Aqui eu usei o switch para saber qual mês o usuário selecionou com default no
		// final
		// mostrando que não foi selecionado uma opção válida, caso não caia em nenhum
		// dos cases.

		// Usei if/else para saber o signo do usuário e para mostrar um erro caso seja
		// selecionada
		// uma data maior que a que existe no mês referente. Para isso criei 3
		// constantes de mês para
		// para não passar da data válida, e coloquei mensagem de erro para o usuário
		// estar ciente
		// que não selecionou uma opção válida

		// E usei o toLowerCase para se o usuário digitar em maiusculo o programa
		// reconhecer em minúsculo
		// aumentando as probabilidades de execução do código
		mes = mes.toLowerCase();
		switch (mes) {
		case "1", "janeiro":
			if (dia >= 21 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo é aquário.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é capricornio.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "2", "fevereiro":
			if (dia >= 19 && dia <= diaMes3 && dia != 0) {
				System.out.println("\nSeu signo é peixes.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes3 || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é aquario.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "3", "março":
			if (dia >= 21 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo é áries.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é peixes.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "4", "abril":
			if (dia >= 21 && dia <= diaMes2 && dia != 0) {
				System.out.println("\nSeu signo é touro.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes2 || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é áries.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "5", "maio":
			if (dia >= 21 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo é gêmeos.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é touro.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "6", "junho":
			if (dia >= 21 && dia <= diaMes2 && dia != 0) {
				System.out.println("\nSeu signo é câncer.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes2 || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é gêmeos.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "7", "julho":
			if (dia >= 23 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo é leão.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é câncer.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "8", "agosto":
			if (dia >= 23 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo é virgem.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é leão.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "9", "setembro":
			if (dia >= 23 && dia <= diaMes2 && dia != 0) {
				System.out.println("\nSeu signo é libra.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes2 || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é virgem.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "10", "outubro":
			if (dia >= 23 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo é escorpião.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é libra.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "11", "novembro":
			if (dia >= 22 && dia <= diaMes2 && dia != 0) {
				System.out.println("\nSeu signo é sagitário.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes2 || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é escorpião.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;

		case "12", "dezembro":
			if (dia >= 22 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo é capricórnio.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			} else if (dia >= diaMes || dia == 0) {
				System.out.println("Você não selecionou uma data válida");
			} else {
				System.out.println("\nSeu signo é sagitário.");
				System.out.println("Você nasceu dia " + dia + "/" + mes);
			}
			break;
		default:
			System.out.println("\nVocê digitou um mês inválido.");
			break;
		}
	}

	// Método criado para o usuário escolher uma dessas opções como mês de
	// nascimento
	public static void diaMes() {
		System.out.println("1 ou Janeiro");
		System.out.println("2 ou Fevereiro");
		System.out.println("3 ou Março");
		System.out.println("4 ou Abril");
		System.out.println("5 ou Maio");
		System.out.println("6 ou Junho");
		System.out.println("7 ou Julho");
		System.out.println("8 ou Agosto");
		System.out.println("9 ou Setembro");
		System.out.println("10 ou Outubro");
		System.out.println("11 ou Novembro");
		System.out.println("12 ou Dezembro");
		return;
	}

}
