package br.com.entra21.exerciciosopcionais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("\nEscolha uma das opções: ");
			System.out.println("\n0 - Sair");
			System.out.println("1 - Calculando a soma ");
			System.out.println("2 - Repetir 20 vezes");
			System.out.println("3 - Entre 20 pessoas exiba a soma das idades");
			System.out.println("4 - Entre 20 pessoas quantas são de maior");
			System.out.println("5 - Entre 10 pessoas exiba o nome da pessoa mais nova");
			System.out.println("6 - Entre 20 números quantos são pares");
			System.out.println("8 - Capture N números, acumule a soma e só pare quando for informado um número negativo");
			System.out.println("9 - Solicite a quantidade de notas e calcule a média do aluno");
			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				calculandoSoma();
				break;

			case 2:
				runRepeat20();
				break;

			case 3:
				sumAge();
				break;

			case 4:
				maioresDeIdade();

			case 5:
				exibirMaisNovo();
				break;

			case 6:

				break;

			case 8:
				numeroUsuarios();
				break;

			case 9:
				mediaAlunos();
				break;

			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}

		} while (option != 0);
		System.out.println("Obrigado por usar o programa Lista de Exercicios!");
	}

	public static void calculandoSoma() {
		System.out.println("Cálculo da soma:");
		int soma = 0;

		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter, " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter);
		}
	}

	public static void runRepeat20() {

		for (byte counter = 1; counter <= 20; counter++) {
			System.out.print("Eu gosto de estudar algoritmos : " + (counter % 5 == 0 ? "\n" : ""));

		}
	}

	public static void sumAge() {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		byte idade;

		for (byte counter = 1; counter <= 20; counter++) {

			System.out.println("No momento a soma está em " + soma);
			System.out.println("Insira sua idade: ");
			idade = entrada.nextByte();
			soma = soma + idade;

		}
		System.out.println("A soma total das idades foi " + soma);
	}

	public static void maioresDeIdade() {
		System.out.println("Exibir apenas os maiores de idade.");
		byte maiores = 0, idade, counter;
		Scanner entrada = new Scanner(System.in);

		for (counter = 1; counter <= 20; counter++) {
			System.out.println("Qual é a sua idade: " + counter);
			idade = entrada.nextByte();

			if (idade >= 18) {
				maiores++;
				System.out.println("A última pessoa informada era de maior.");

			}

		}
		System.out.println("Entre " + (counter - 1) + " pessoas, apenas " + maiores + " são maiores");

	}

	public static void exibirMaisNovo() {
		Scanner entrada = new Scanner(System.in);
		String nome, maisNovo = "";
		byte idade, idadeMin = 0;

		for (byte counter = 1; counter <= 10; counter++) {

			System.out.println("Digite seu nome: ");
			nome = entrada.next();
			System.out.println(nome + " ,digite a sua idade: ");
			idade = entrada.nextByte();
			// no primeiro laço,sempre a primeira idade vai ser a menor

			if (counter == 1) {
				idadeMin = idade;
				maisNovo = nome;
				System.out.println("Sou o primeiro por isso sou o mais novo.");

			} else { // a partir do segundo laço eu já tenho como comparar com a variável idadeMin

				System.out.println("Estou no laço " + counter + " e preciso verificar.");

				if (idade < idadeMin) {
					System.out.println("Ainda bem que testei, pois agora o mais novo é " + nome + " com " + idade);
					idadeMin = idade;
					maisNovo = nome;

				}

			}
		}

		System.out.println("Após isso tudo o mais novo é " + maisNovo + " com " + idadeMin + " anos.");

	}

	public static void numeroUsuarios() {
		Scanner entrada = new Scanner(System.in);
		int numero, soma = 0;

		do {

			System.out.println("Qual número você quer?");
			numero = entrada.nextInt();
			if (numero >= 0) {
				soma = soma + numero; // somente números positivos serão somados ou números naturais
			}

		} while (numero >= 0); // enquanto a condição bater, repita.

		System.out.println("Sua soma é: " + soma);

	}

	public static void mediaAlunos() {
		Scanner entrada = new Scanner(System.in);
		byte qtd, contador = 0;
		float notas, soma = 0f;
		System.out.println("Quantas notas você quer capturar? ");
		qtd = entrada.nextByte();
		String resposta;

		do {
			contador++;
			System.out.println("Informe uma nota: ");
			notas = entrada.nextFloat();
			if (contador >= qtd) {
				System.out.println("Quer capturar mais alguma nota? ");
				resposta = entrada.next();

				if (resposta.equals("sim")) {
					contador--;
				}

			}

			soma = soma + notas;
		} while (contador <= qtd);

		System.out.println("A soma é igual a " + soma);

	}
}