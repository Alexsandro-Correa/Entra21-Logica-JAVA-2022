package br.com.entra21.exerciciorevisaoswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Escreva um programa que:
Solicite ao usu�rio o seu nome e o m�s de seu anivers�rio
A captura do m�s deve ser por numero
Exibir uma mensagem com o nome e o m�s no formato normal (Ex: 4  Abril, 12 Dezembro)
Caso n�o seja escolhido um m�s v�lido deve exibir uma mensagem */
		
		String nome;
		byte mes;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = entrada.next();
		
		System.out.println("Informe o m�s de seu anivers�rio em n�mero : ");
		mes = entrada.nextByte();
		
		switch(mes) {
		case 1:
			System.out.println("M�s 1, Janeiro");
			break;
		case 2:
			System.out.println("M�s 2, Fevereiro");
			break;
		case 3:
			System.out.println("M�s 3, Mar�o");
			break;
		case 4:
			System.out.println("M�s 4, Abril");
			break;
		case 5:
			System.out.println("M�s 5, Maio");
			break;
		case 6:
			System.out.println("M�s 6, Junho");
			break;
		case 7:
			System.out.println("M�s , Julho");
			break;
		case 8:
			System.out.println("M�s 8, Agosto");
			break;
		case 9:
			System.out.println("M�s 9, Setembro");
			break;
		case 10:
			System.out.println("M�s 10, Outubro");
			break;
		case 11:
			System.out.println("M�s 11, Novembro");
			break;
		case 12:
			System.out.println("M�s 12, Dezembro");
			break;
		default:
			System.out.println(nome + " ,voc� n�o selecionou um m�s v�lido.");
		}

	}

}
