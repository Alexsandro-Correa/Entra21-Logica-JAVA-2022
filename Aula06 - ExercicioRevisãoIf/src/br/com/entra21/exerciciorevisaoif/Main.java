package br.com.entra21.exerciciorevisaoif;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Escreva um programa que:
Defina como constante a altura minima permitida para entrar em um brinquedo (Aten��o a nomenclatura e utilize a constante no IF)
Capture nome e altura do usu�rio
Validar se a altura informada � MENOR que a permitida
Caso seja MENOR informar de forma educada mencionando o nome do usu�rio e sua altura qual o par�metro minimo para entrar no brinquedo
Caso n�o seja MENOR informar que a entrada est� liberada. */
		
		float altura;
		String nome;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite o seu nome: ");
		nome = entrada.next();
		
		System.out.println("\n" +nome + ", agora digite a sua altura:");
		altura = entrada.nextFloat();
		
		if(altura < 1.60) {
			System.out.println("Desculpe " + nome + ", mas voc� n�o possui a altura m�nima para este brinquedo.");
			
		}else {
			System.out.println("nOl� " + nome + ", pode entrar no brinquedo" );
		}
		
		

	}

}
