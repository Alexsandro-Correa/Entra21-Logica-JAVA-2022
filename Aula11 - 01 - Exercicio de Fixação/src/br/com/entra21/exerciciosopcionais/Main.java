package br.com.entra21.exerciciosopcionais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("\nEscolha uma das op��es: ");
			System.out.println("\n0 - Sair");
			System.out.println("1 - Calculando a soma ");
			System.out.println("2 - Repetir 20 vezes");
			System.out.println("3 - Entre 20 pessoas exiba a soma das idades");
			System.out.println("4 - Entre 20 pessoas quantas s�o de maior");
			System.out.println("5 - Entre 10 pessoas exiba o nome da pessoa mais nova");
			System.out.println("6 - Entre 20 n�meros quantos s�o pares");
			System.out.println("7 - Entre 20 n�meros quantos est�o entre 0 a 100");
			System.out.println("8 - Capture N n�meros, acumule a soma e s� pare quando for informado um n�mero negativo");
			System.out.println("9 - Solicite a quantidade de notas e calcule a m�dia do aluno");
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
				numerosPares();
				break;

			case 7 :
				numeros0A100();
				break;
				
			case 8:
				numeroUsuarios();
				break;

			case 9:
				mediaAlunos();
				break;

			default:
				System.out.println("Escolha uma op��o v�lida!");
				break;
			}

		} while (option != 0);
		System.out.println("Obrigado por usar o programa Lista de Exercicios!");
	}

	//1
	public static void calculandoSoma() {
		System.out.println("C�lculo da soma:");
		int soma = 0;

		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter, " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter);
		}
	}

	//2
	public static void runRepeat20() {

		for (byte counter = 1; counter <= 20; counter++) {
			System.out.print("Eu gosto de estudar algoritmos : " + (counter % 5 == 0 ? "\n" : ""));

		}
	}

	//3
	public static void sumAge() {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		byte idade;

		for (byte counter = 1; counter <= 20; counter++) {

			System.out.println("No momento a soma est� em " + soma);
			System.out.println("Insira sua idade: ");
			idade = entrada.nextByte();
			soma = soma + idade;

		}
		System.out.println("A soma total das idades foi " + soma);
	}

	//4
	public static void maioresDeIdade() {
		System.out.println("Exibir apenas os maiores de idade.");
		byte maiores = 0, idade, counter;
		Scanner entrada = new Scanner(System.in);

		for (counter = 1; counter <= 20; counter++) {
			System.out.println("Qual � a sua idade: " + counter);
			idade = entrada.nextByte();

			if (idade >= 18) {
				maiores++;
				System.out.println("A �ltima pessoa informada era de maior.");

			}

		}
		System.out.println("Entre " + (counter - 1) + " pessoas, apenas " + maiores + " s�o maiores");

	}

	//5
	public static void exibirMaisNovo() {
		Scanner entrada = new Scanner(System.in);
		String nome, maisNovo = "";
		byte idade, idadeMin = 0;

		for (byte counter = 1; counter <= 10; counter++) {

			System.out.println("Digite seu nome: ");
			nome = entrada.next();
			System.out.println(nome + " ,digite a sua idade: ");
			idade = entrada.nextByte();
			// no primeiro la�o,sempre a primeira idade vai ser a menor

			if (counter == 1) {
				idadeMin = idade;
				maisNovo = nome;
				System.out.println("Sou o primeiro por isso sou o mais novo.");

			} else { // a partir do segundo la�o eu j� tenho como comparar com a vari�vel idadeMin

				System.out.println("Estou no la�o " + counter + " e preciso verificar.");

				if (idade < idadeMin) {
					System.out.println("Ainda bem que testei, pois agora o mais novo � " + nome + " com " + idade);
					idadeMin = idade;
					maisNovo = nome;

				}

			}
		}

		System.out.println("Ap�s isso tudo o mais novo � " + maisNovo + " com " + idadeMin + " anos.");

	}

	//6
	public static void numerosPares() {
		Scanner entrada = new Scanner(System.in);
		byte numero;
		byte par = 0;
		
		for(byte contador = 1; contador <= 3; contador++) {
			System.out.println("\nDigite um n�mero de 1 a 100:");
			numero = entrada.nextByte();
			
			if(numero %2 == 0) {
				System.out.println("O n�mero " + numero + " � par.");
				par++;
			}else {
				System.out.println("O n�mero " + numero + " � impar." );
			}
			
			System.out.println(par + " dos n�meros digitados s�o pares.");
		}
	}

	//7
	public static void numeros0A100() {
		Scanner entrada =  new Scanner(System.in);
		int numero;
		byte zeroACem = 0;
		
		for(byte contador = 1; contador <=3; contador++) {
			
			System.out.println("Digite um n�mero");
			numero = entrada.nextInt();
			
			if(numero >= 0 && numero <= 100) {
				System.out.println("O n�mero digitado est� entre 0 a 100.\n");
				zeroACem++;
			}else {
				System.out.println("O n�mero digitado n�o est� entre 0 a 100.\n");
			}
		}
		System.out.println("Foram digitados " + zeroACem + " n�meros entre 0 a 100." ) ;
	}
	
	//8
	public static void numeroUsuarios() {
		Scanner entrada = new Scanner(System.in);
		int numero, soma = 0;

		do {

			System.out.println("Qual n�mero voc� quer?");
			numero = entrada.nextInt();
			if (numero >= 0) {
				soma = soma + numero; // somente n�meros positivos ser�o somados ou n�meros naturais
			}

		} while (numero >= 0); // enquanto a condi��o bater, repita.

		System.out.println("Sua soma �: " + soma);

	}

	//9
	public static void mediaAlunos() {
		Scanner entrada = new Scanner(System.in);
		byte qtd, contador = 0;
		float notas, soma = 0f;
		System.out.println("Quantas notas voc� quer capturar? ");
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

		System.out.println("A soma � igual a " + soma);

	}
}