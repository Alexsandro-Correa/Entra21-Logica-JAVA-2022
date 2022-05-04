package br.com.entra21.exerciciorevisaoif;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Escreva um programa que:
Defina como constante a altura minima permitida para entrar em um brinquedo (Atenção a nomenclatura e utilize a constante no IF)
Capture nome e altura do usuário
Validar se a altura informada é MENOR que a permitida
Caso seja MENOR informar de forma educada mencionando o nome do usuário e sua altura qual o parâmetro minimo para entrar no brinquedo
Caso não seja MENOR informar que a entrada está liberada. */
		
		float altura;
		String nome;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite o seu nome: ");
		nome = entrada.next();
		
		System.out.println("\n" +nome + ", agora digite a sua altura:");
		altura = entrada.nextFloat();
		
		if(altura < 1.60) {
			System.out.println("Desculpe " + nome + ", mas você não possui a altura mínima para este brinquedo.");
			
		}else {
			System.out.println("nOlá " + nome + ", pode entrar no brinquedo" );
		}
		
		

	}

}
