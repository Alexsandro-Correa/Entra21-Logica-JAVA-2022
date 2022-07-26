package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class Exercicios extends Menu {

	static Scanner entrada = new Scanner(System.in);

	public Exercicios(String title, ArrayList<String> matters) {
		super(title, matters);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();

		switch (option) {

		case 1:
			exercicioAreaPerimetro();
			break;

		case 2:
			exercicioCalculadora();
			break;

		case 3:
			exercicioCalculoIMC();
			break;

		case 4:
			exercicioConversaoTemperatura();
			break;

		case 5:
			exercicioMediaAritmetica();
			break;

		case 6:
			exercicioPrecoCusto();
			break;

		case 7:
			exercicioOperadorIgualdade();
			break;

		case 8:
			exercicioOperadorLogico();
			break;

		case 9:
			exercicioOperadorRelacional();
			break;

		case 10:
			exercicioIfElse();
			break;

		default:
			System.out.println("Op��o inv�lida");
			break;

		}

		return option;
	}

	private static void exercicioAreaPerimetro() {

		/*
		 * Fa�a um programa que solicite a base e altura de um ret�ngulo e informe sua
		 * �rea e perimetro. Sabendo que a �rea � calculada com base no produto entre
		 * base e altura; O per�metro � obtido ao somar todos os vertices do ret�ngulo.
		 */

		// Criar vari�veis
		float base, altura, area, perimetro; // boas pr�ticas de nomenclatura

		// Definir valores �s vari�veis

		System.out.println("Informe a base do ret�ngulo:");
		base = entrada.nextFloat();

		System.out.println("Informe a altura do ret�ngulo:");
		altura = entrada.nextFloat();

		// momento de processamentos...
		area = base * altura;
		perimetro = base * 2 + altura * 2;

		System.out.println("�rea �  " + base + " x " + altura);
		System.out.println("Per�metro � " + base + " + " + base + " + " + altura + " + " + altura);
		System.out.println("A sua �rea �: " + area + ", e seu per�metro �: " + perimetro + ".");

	}

	private static void exercicioCalculadora() {

		// Fa�a um programa de calculadora

		double numeroA, numeroB;
		String operacao;

		System.out.println("Insira o opera��o desejada: (+,-,*,/)");
		operacao = entrada.next();

		if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {

			System.out.println("\nInsira o primeiro n�mero: ");
			numeroA = entrada.nextDouble();

			System.out.println("Insira o segundo n�mero: ");
			numeroB = entrada.nextDouble();

			switch (operacao) {

			case "+":
				System.out.println("Soma = " + (numeroA + numeroB));
				break;

			case "-":
				System.out.println("Subtra��o = " + (numeroA - numeroB));
				break;

			case "*":
				System.out.println("Multiplica��o = " + (numeroA * numeroB));
				break;

			case "/":
				System.out.println("Divis�o = " + (numeroA / numeroB));
				break;

			default:
				System.out.println("Op��o inv�lida");
				break;
			}

		} else {
			System.out.println("Op��o inv�lida");
			exercicioCalculadora();
		}

	}

	private static void exercicioCalculoIMC() {

		// Fa�a um programa que calcule o IMC.

		float peso, altura, resultadoIMC;

		System.out.println("Informe seu peso:");
		peso = entrada.nextFloat();

		System.out.println("Informe sua altura:");
		altura = entrada.nextFloat();

		resultadoIMC = peso / (altura * altura);

		System.out.println("IMC " + resultadoIMC);

		if (resultadoIMC < 18.5) {
			System.out.println("Voc� est� abaixo do peso!");
		} else if (resultadoIMC > 18.5 && resultadoIMC <= 24.9) {
			System.out.println("\nVoc� est� no peso ideal!");
		} else if (resultadoIMC > 24.9 && resultadoIMC <= 29.9) {
			System.out.println("\nVoc� est� com sobrepeso!");
		} else if (resultadoIMC > 30.0 && resultadoIMC <= 34.9) {
			System.out.println("\nVoc� est� com obesidade grau I!");
		} else if (resultadoIMC > 35.0 && resultadoIMC <= 39.9) {
			System.out.println("\nVoc� est� com obesidade grau II!");
		} else if (resultadoIMC > 40.0) {
			System.out.println("\nVoc� est� obesidade grau III!");
		}

		System.out.println("\nTabela IMC");
		System.out.println("\nAbaixo do peso: Abaixo de 18,5.");
		System.out.println("Peso ideal: 18,5 - 24,9.");
		System.out.println("Sobrepeso: 24,9 - 29,9.");
		System.out.println("Obesidade grau I: 30 - 34,9.");
		System.out.println("Obesidade grau II; 35 - 39,9.");
		System.out.println("Obesidade grau III: Maior ou igual a 40.");

	}

	private static void exercicioConversaoTemperatura() {

		byte option;

		System.out.println("1 = Converter graus Celsius em Fahrenheit");
		System.out.println("2 = Converter graus Fahrenheit em Celsius");
		option = entrada.nextByte();

		switch (option) {

		case 1:
			float celsius, fahrenheit, conversaoCelsius;

			System.out.println("Conversor Graus Fahrenheit em Celsius:");
			System.out.println("\nInsira a temperatura em graus Celsius:");
			celsius = entrada.nextFloat();
			conversaoCelsius = (float) ((float) celsius * 1.8 + 32);
			System.out.println("A temperatura em graus Fahrenheit � de " + conversaoCelsius + "�F.");
			break;

		case 2:
			float conversaoFahrenheit;

			System.out.println("Conversor Graus Fahrenheit em Celsius:");
			System.out.println("\nInsira a temperatura em graus Fahrenheit:");
			fahrenheit = entrada.nextFloat();
			conversaoFahrenheit = (float) ((fahrenheit - 32) / 1.8);
			System.out.println("A temperatura em graus Celsius � de " + conversaoFahrenheit + "�C.");

			break;

		}

	}

	private static void exercicioMediaAritmetica() {

		String aluno;
		float nota1, nota2, nota3, media;

		System.out.println("\nPor favor, insira seu nome: ");
		aluno = entrada.next();

		System.out.println("Insira sua primeira nota: ");
		nota1 = entrada.nextFloat();

		System.out.println("Insira sua segunda nota: ");
		nota2 = entrada.nextFloat();

		System.out.println("Insira sua terceira nota; ");
		nota3 = entrada.nextFloat();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println(aluno + " sua m�dia �: " + media + ".");

	}

	private static void exercicioPrecoCusto() {

		String produto;
		float precoCusto, precoVenda;

		System.out.println("Informe o nome do produto: ");
		produto = entrada.next();

		System.out.println("Informe o pre�o de custo do/da " + produto + ":");
		precoCusto = entrada.nextFloat();

		precoVenda = precoCusto * 65 / 100 + precoCusto; // forma longa
		precoVenda = precoCusto * 1.65f; // truque de matem�ica

		System.out.println("O pre�o da venda ser� de: " + precoVenda);

	}

	private static void exercicioOperadorIgualdade() {

		System.out.println("Pr�tica sobre operador de igualdade\r\n"
				+ "Fa�a um programa que compare 2 n�meros e informe se o 1� � igual ao 2� numero\n"
				+ "Fa�a um programa que compare 2 n�meros e informe se o 1� � diferente do 2� numero");

		// Exerc�cio 1
		byte idadeA = 24, idadeB = 30;
		boolean resultado;

		resultado = (idadeA) == (idadeB);
		System.out.println("\nA idade " + idadeA + " � igual a idade " + idadeB + "? " + resultado);

		// Exerc�cio 2
		float alturaA = 1.64f, alturaB = 1.50f;
		boolean resultadoB;

		resultadoB = (alturaA) != (alturaB);
		System.out.println("\nA altura " + alturaA + " � diferente da altura " + alturaB + "? " + resultadoB);

	}

	private static void exercicioOperadorLogico() {

		System.out.println("Pr�tica sobre operadores l�gicos\r\n"
				+ "Deve ser informado se o usu�rio � maior ou igual que 170cm E tem � maior de idade (utilizar o &&)\n"
				+ "Deve ser informado se o usu�rio � maior ou igual que 170cm OU tem � maior de idade (utilizar o ||)\n");

		String nome = "Alex";
		byte idade = 24;
		float altura = 1.64f;
		boolean resultado;

		resultado = (altura) >= 1.70 && (idade) >= 18;
		System.out.println(
				"O " + nome + " tem " + altura + "cm e " + idade + "anos, est� apto para a vaga? " + resultado);

		resultado = (altura) >= 1.70 || (idade) >= 18;
		System.out.println(
				"O " + nome + " tem " + altura + "cm e " + idade + "anos, est� apto para a vaga? " + resultado);

	}

	private static void exercicioOperadorRelacional() {

		System.out.println("Pr�tica sobre operador relacional\r\n"
				+ "Fa�a um programa que informe se o 1� numero � maior que o 2� numero"
				+ "Fa�a um programa que informe se o 1� numero � maior ou igual que o 2� numero"
				+ "Fa�a um programa que informe se o 1� numero � menor que o 2� numero"
				+ "Fa�a um programa que informe se o 1� numero � menor ou igual que o 2� numero");

		float peso1 = 64.5f, peso2 = 52.3f, peso3 = 80.3f, peso4 = 68.3f;
		boolean resultado, resultado2, resultado3, resultado4;
		resultado = (peso3) > (peso2);
		resultado2 = (peso4) >= (peso2);
		resultado3 = (peso1) < (peso2);
		resultado4 = (peso1) <= (peso3);

		System.out.println("\n" + peso3 + "kg � mais pesado que " + peso2 + "kg? " + resultado);
		System.out.println("\n" + peso4 + "kg � mais pesado ou t�o pesado quanto " + peso2 + "kg? " + resultado2);
		System.out.println("\n" + peso1 + "kg � mais pesado que " + peso2 + "kg? " + resultado3);
		System.out.println("\n" + peso1 + "kg � mais pesado ou t�o pesado quanto " + peso3 + "kg? " + resultado4);

	}

	private static void exercicioIfElse() {

		System.out.println("Capturar 2 n�meros e informar qual � o maior");

		byte numeroA, numeroB;

		System.out.println("Informe o valor do numeroA");
		numeroA = entrada.nextByte();

		System.out.println("Informe o valor do numeroB");
		numeroB = entrada.nextByte();

		if (numeroA > numeroB) {
			System.out.println("NumeroA � maior");
		} else if (numeroA == numeroB) {
			System.out.println("O numeroA e o numeroB s�o iguais");

		} else {
			System.out.println("NumeroB � maior");
		}

		System.out.println("=======================");

		System.out.println("Capturar ano de nascimento e informar se j� tem idade para votar");

		short anoNascimento;
		short calculo;

		System.out.println("Informe ano de nascimento:");
		anoNascimento = entrada.nextShort();

		calculo = (short) (2022 - anoNascimento);

		if (calculo > 15) {
			System.out.println("Tem idade para votar");
		} else {
			System.out.println("T� cedo ainda, vai brincar");
		}

		System.out.println(calculo >= 16 ? "J� pode votar." : "N�o pode votar");

	}

}