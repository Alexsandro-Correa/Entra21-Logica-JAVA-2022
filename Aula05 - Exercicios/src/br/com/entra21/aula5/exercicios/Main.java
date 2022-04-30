package br.com.entra21.aula5.exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Capturar 2 números e informar qual é o maior");

		Scanner entrada = new Scanner(System.in);
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
		
		if(calculo > 15) {
			System.out.println("Tem idade para votar");
		}else {
			System.out.println("Tá cedo ainda, vai brincar");
		}
		
		System.out.println(calculo >= 16 ? "Já pode votar." : "Não pode votar");

	}

}
