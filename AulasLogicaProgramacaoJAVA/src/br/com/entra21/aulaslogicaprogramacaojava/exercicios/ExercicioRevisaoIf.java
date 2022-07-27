package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioRevisaoIf {

	static Scanner entrada = new Scanner(System.in);
	static float altura;
	static String nome;
	public ExercicioRevisaoIf() {
		
		
		System.out.println("1 - Exerc�cio 1 (if)");
		System.out.println("2 - Exerc�cio 2 (if)");
		byte option;
		option = entrada.nextByte();
		
		switch(option) {
		
		case 1:
			exercicioRevisaoIf1();
			break;
			
		case 2:
			exercicioRevisaoIf2();
			break;
		
		}
	}
	
	private static void exercicioRevisaoIf1() {
		/*Escreva um programa que:
		Defina como constante a altura minima permitida para entrar em um brinquedo (Aten��o a nomenclatura e utilize a constante no IF)
		Capture nome e altura do usu�rio
		Validar se a altura informada � MENOR que a permitida
		Caso seja MENOR informar de forma educada mencionando o nome do usu�rio e sua altura qual o par�metro minimo para entrar no brinquedo
		Caso n�o seja MENOR informar que a entrada est� liberada. */
		
		
		
		System.out.println("Por favor, digite o seu nome: ");
		nome = entrada.next();
		
		System.out.println("\n" +nome + ", agora digite a sua altura:");
		altura = entrada.nextFloat();
		
		if(altura < 1.60) {
			System.out.println("Desculpe " + nome + ", mas voc� n�o possui a altura m�nima para este brinquedo.");
			
		}else {
			System.out.println("\nOl� " + nome + ", pode entrar no brinquedo" );
		}
		
	}
	
	private static void exercicioRevisaoIf2() {
		/*Escreva um programa que:
		Defina como constante a quantidade de notas de um aluno
		Capture nome e cada uma das notas
		Calcule a m�dia
		Informe
		se reprovou (<3)
		senao se , em recupera��o (<7)
		sen�o se, passou com a nota minima (=7)
		sen�o se, passou mas poderia ser melhor (<10)
		sen�o se, nota maxima (=10)
		sen�o (tem algo de errado com o seu calculo de m�dia)*/
		
		float nota1, nota2, nota3, nota4, media;
		
		
		System.out.println("Insira seu nome:");
		nome = entrada.next();
		System.out.println("Insira sua primeira nota:");
		nota1 = entrada.nextFloat();
		System.out.println("Insira sua segunda nota:");
		nota2 = entrada.nextFloat();
		System.out.println("Insira sua terceira nota:");
		nota3 = entrada.nextFloat();
		System.out.println("Insira sua quarta nota:");
		nota4 = entrada.nextFloat();
		final byte qtdnotas = 4;
		media = (nota1 + nota2 + nota3 + nota4) / (qtdnotas);
		
		System.out.println("Sua m�dia � " + media);
		
		if(media <= 3) {
			System.out.println(nome + ", voc� reprovou.");
		}else if(media < 7) {
			System.out.println("Voc� est� em recupera��o " + nome + " , estude para a prova final.");
		}else if(media == 7) {
			System.out.println("Voc� passou com a nota m�nima" + nome + " , se esforce mais na pr�xima");
		}else if(media <10) {
			System.out.println("Voc� passou" + nome + " , mas d� para melhorar.");
		}else if(media == 10) {
			System.out.println("Parab�ns, "+ nome + "voc� passou com a nota m�xima.");
		}else {
			System.out.println("Tem algo errado com seu c�lculo de m�dia.");
		}
	}
	
}
