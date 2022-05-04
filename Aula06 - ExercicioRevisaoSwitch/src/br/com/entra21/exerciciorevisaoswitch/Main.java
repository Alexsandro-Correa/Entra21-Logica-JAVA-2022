package br.com.entra21.exerciciorevisaoswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Escreva um programa que:
Solicite ao usuário o seu nome e o mês de seu aniversário
A captura do mês deve ser por numero
Exibir uma mensagem com o nome e o mês no formato normal (Ex: 4  Abril, 12 Dezembro)
Caso não seja escolhido um mês válido deve exibir uma mensagem */
		
		String nome;
		byte mes;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = entrada.next();
		
		System.out.println("Informe o mês de seu aniversário em número : ");
		mes = entrada.nextByte();
		
		switch(mes) {
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

}
