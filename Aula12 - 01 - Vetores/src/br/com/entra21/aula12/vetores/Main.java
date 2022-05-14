package br.com.entra21.aula12.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		byte opcoes;

		do {

			System.out.println("0 - Sair");
			System.out.println("1 - Declarando vetores");
			System.out.println("2 - Acessando índices");
			System.out.println("3 - Atribuindo valores nos índices");
			System.out.println("4 - Média com vetores");
			opcoes = entrada.nextByte();

			switch (opcoes) {

			case 0:
				// case vazio só para não cair no default porque o zero atende a condição de
				// saída.
				break;

			case 1:
				// chamada de função
				declararVetores(); // dentro desses parenteses estariam meus argumentos
				break;

			case 2:
				acessarIndices();
				break;

			case 3:
				atualizarValores();
				break;
				
			case 4:
				mediaComVetores();
				break;
			}

		} while (opcoes != 0);

	}

	public static void declararVetores() { // aqui dentro do parenteses é parâmetro

		byte idades[]; // primeiro criar a variável que é um vetor de algum tipo

		idades = new byte[15]; // segundo definir o tamanho

		System.out.println("O tamanho é " + idades.length);

	}

	public static void acessarIndices() {

		byte idades[]; // primeiro criar a variável que é um vetor de algum tipo

		idades = new byte[15]; // segundo definir o tamanho

		System.out.println("O que tem no índice[1] " + idades[1]);
		System.out.println("O que tem no índice[2] " + idades[2]);
	}

	public static void atualizarValores() {
		float notas[] = { 1, 3.5f, 8 }; // 1 criei a variável e 2 defini o tamanho e os valores respectivamente
		// [0] [1 [2]]
		notas[0] = 24;
		notas[2] = 12;
		System.out.println(notas[0]);
		System.out.println(notas[2]);
	}
	
	public static void mediaComVetores() {
		Scanner entrada = new Scanner(System.in);
		float notas[] = new float [3];
		
		for(byte contador = 0; contador < notas.length; contador++ ) {
			
			//System.out.println("Contagem em " + contador);
			System.out.println("Informe a " + (contador+1) + "ª");
			notas[contador] = entrada.nextFloat();
		}
		System.out.println("A segunda nota foi " + notas[1]);
		float soma = 0;
		
		for(byte contador = 0; contador < notas.length; contador++) {
			System.out.println(notas[contador]);
			soma = soma + notas[contador];
		}
		
		System.out.println("Soma = " + soma);
		System.out.println("Média = " + soma/notas.length);
	}

}
