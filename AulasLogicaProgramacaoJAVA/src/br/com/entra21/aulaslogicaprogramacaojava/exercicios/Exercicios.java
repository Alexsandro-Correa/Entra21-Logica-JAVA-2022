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
			System.out.println("Opção inválida");
			break;

		}

		return option;
	}

	private static void exercicioAreaPerimetro() {

		/*
		 * Faça um programa que solicite a base e altura de um retângulo e informe sua
		 * área e perimetro. Sabendo que a área é calculada com base no produto entre
		 * base e altura; O perímetro é obtido ao somar todos os vertices do retângulo.
		 */

		// Criar variáveis
		float base, altura, area, perimetro; // boas práticas de nomenclatura

		// Definir valores às variáveis

		System.out.println("Informe a base do retângulo:");
		base = entrada.nextFloat();

		System.out.println("Informe a altura do retângulo:");
		altura = entrada.nextFloat();

		// momento de processamentos...
		area = base * altura;
		perimetro = base * 2 + altura * 2;

		System.out.println("Área é  " + base + " x " + altura);
		System.out.println("Perímetro é " + base + " + " + base + " + " + altura + " + " + altura);
		System.out.println("A sua área é: " + area + ", e seu perímetro é: " + perimetro + ".");

	}

	private static void exercicioCalculadora() {

		// Faça um programa de calculadora

		double numeroA, numeroB;
		String operacao;

		System.out.println("Insira o operação desejada: (+,-,*,/)");
		operacao = entrada.next();

		if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {

			System.out.println("\nInsira o primeiro número: ");
			numeroA = entrada.nextDouble();

			System.out.println("Insira o segundo número: ");
			numeroB = entrada.nextDouble();

			switch (operacao) {

			case "+":
				System.out.println("Soma = " + (numeroA + numeroB));
				break;

			case "-":
				System.out.println("Subtração = " + (numeroA - numeroB));
				break;

			case "*":
				System.out.println("Multiplicação = " + (numeroA * numeroB));
				break;

			case "/":
				System.out.println("Divisão = " + (numeroA / numeroB));
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

		} else {
			System.out.println("Opção inválida");
			exercicioCalculadora();
		}

	}

	private static void exercicioCalculoIMC() {

		// Faça um programa que calcule o IMC.

		float peso, altura, resultadoIMC;

		System.out.println("Informe seu peso:");
		peso = entrada.nextFloat();

		System.out.println("Informe sua altura:");
		altura = entrada.nextFloat();

		resultadoIMC = peso / (altura * altura);

		System.out.println("IMC " + resultadoIMC);

		if (resultadoIMC < 18.5) {
			System.out.println("Você está abaixo do peso!");
		} else if (resultadoIMC > 18.5 && resultadoIMC <= 24.9) {
			System.out.println("\nVocê está no peso ideal!");
		} else if (resultadoIMC > 24.9 && resultadoIMC <= 29.9) {
			System.out.println("\nVocê está com sobrepeso!");
		} else if (resultadoIMC > 30.0 && resultadoIMC <= 34.9) {
			System.out.println("\nVocê está com obesidade grau I!");
		} else if (resultadoIMC > 35.0 && resultadoIMC <= 39.9) {
			System.out.println("\nVocê está com obesidade grau II!");
		} else if (resultadoIMC > 40.0) {
			System.out.println("\nVocê está obesidade grau III!");
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
			System.out.println("A temperatura em graus Fahrenheit é de " + conversaoCelsius + "°F.");
			break;

		case 2:
			float conversaoFahrenheit;

			System.out.println("Conversor Graus Fahrenheit em Celsius:");
			System.out.println("\nInsira a temperatura em graus Fahrenheit:");
			fahrenheit = entrada.nextFloat();
			conversaoFahrenheit = (float) ((fahrenheit - 32) / 1.8);
			System.out.println("A temperatura em graus Celsius é de " + conversaoFahrenheit + "°C.");

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

		System.out.println(aluno + " sua média é: " + media + ".");

	}

	private static void exercicioPrecoCusto() {

		String produto;
		float precoCusto, precoVenda;

		System.out.println("Informe o nome do produto: ");
		produto = entrada.next();

		System.out.println("Informe o preço de custo do/da " + produto + ":");
		precoCusto = entrada.nextFloat();

		precoVenda = precoCusto * 65 / 100 + precoCusto; // forma longa
		precoVenda = precoCusto * 1.65f; // truque de matemáica

		System.out.println("O preço da venda será de: " + precoVenda);

	}

	private static void exercicioOperadorIgualdade() {

		System.out.println("Prática sobre operador de igualdade\r\n"
				+ "Faça um programa que compare 2 números e informe se o 1º é igual ao 2º numero\n"
				+ "Faça um programa que compare 2 números e informe se o 1º é diferente do 2º numero");

		// Exercício 1
		byte idadeA = 24, idadeB = 30;
		boolean resultado;

		resultado = (idadeA) == (idadeB);
		System.out.println("\nA idade " + idadeA + " é igual a idade " + idadeB + "? " + resultado);

		// Exercício 2
		float alturaA = 1.64f, alturaB = 1.50f;
		boolean resultadoB;

		resultadoB = (alturaA) != (alturaB);
		System.out.println("\nA altura " + alturaA + " é diferente da altura " + alturaB + "? " + resultadoB);

	}

	private static void exercicioOperadorLogico() {

		System.out.println("Prática sobre operadores lógicos\r\n"
				+ "Deve ser informado se o usuário é maior ou igual que 170cm E tem é maior de idade (utilizar o &&)\n"
				+ "Deve ser informado se o usuário é maior ou igual que 170cm OU tem é maior de idade (utilizar o ||)\n");

		String nome = "Alex";
		byte idade = 24;
		float altura = 1.64f;
		boolean resultado;

		resultado = (altura) >= 1.70 && (idade) >= 18;
		System.out.println(
				"O " + nome + " tem " + altura + "cm e " + idade + "anos, está apto para a vaga? " + resultado);

		resultado = (altura) >= 1.70 || (idade) >= 18;
		System.out.println(
				"O " + nome + " tem " + altura + "cm e " + idade + "anos, está apto para a vaga? " + resultado);

	}

	private static void exercicioOperadorRelacional() {

		System.out.println("Prática sobre operador relacional\r\n"
				+ "Faça um programa que informe se o 1º numero é maior que o 2º numero"
				+ "Faça um programa que informe se o 1º numero é maior ou igual que o 2º numero"
				+ "Faça um programa que informe se o 1º numero é menor que o 2º numero"
				+ "Faça um programa que informe se o 1º numero é menor ou igual que o 2º numero");

		float peso1 = 64.5f, peso2 = 52.3f, peso3 = 80.3f, peso4 = 68.3f;
		boolean resultado, resultado2, resultado3, resultado4;
		resultado = (peso3) > (peso2);
		resultado2 = (peso4) >= (peso2);
		resultado3 = (peso1) < (peso2);
		resultado4 = (peso1) <= (peso3);

		System.out.println("\n" + peso3 + "kg é mais pesado que " + peso2 + "kg? " + resultado);
		System.out.println("\n" + peso4 + "kg é mais pesado ou tão pesado quanto " + peso2 + "kg? " + resultado2);
		System.out.println("\n" + peso1 + "kg é mais pesado que " + peso2 + "kg? " + resultado3);
		System.out.println("\n" + peso1 + "kg é mais pesado ou tão pesado quanto " + peso3 + "kg? " + resultado4);

	}

	private static void exercicioIfElse() {

		System.out.println("Capturar 2 números e informar qual é o maior");

		byte numeroA, numeroB;

		System.out.println("Informe o valor do numeroA");
		numeroA = entrada.nextByte();

		System.out.println("Informe o valor do numeroB");
		numeroB = entrada.nextByte();

		if (numeroA > numeroB) {
			System.out.println("NumeroA é maior");
		} else if (numeroA == numeroB) {
			System.out.println("O numeroA e o numeroB são iguais");

		} else {
			System.out.println("NumeroB é maior");
		}

		System.out.println("=======================");

		System.out.println("Capturar ano de nascimento e informar se já tem idade para votar");

		short anoNascimento;
		short calculo;

		System.out.println("Informe ano de nascimento:");
		anoNascimento = entrada.nextShort();

		calculo = (short) (2022 - anoNascimento);

		if (calculo > 15) {
			System.out.println("Tem idade para votar");
		} else {
			System.out.println("Tá cedo ainda, vai brincar");
		}

		System.out.println(calculo >= 16 ? "Já pode votar." : "Não pode votar");

	}

}