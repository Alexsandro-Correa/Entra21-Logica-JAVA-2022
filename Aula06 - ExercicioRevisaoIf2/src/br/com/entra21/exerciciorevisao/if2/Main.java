package br.com.entra21.exerciciorevisao.if2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
		
		String nome;
		float nota1, nota2, nota3, nota4, media;
		Scanner entrada = new Scanner(System.in);
		
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
