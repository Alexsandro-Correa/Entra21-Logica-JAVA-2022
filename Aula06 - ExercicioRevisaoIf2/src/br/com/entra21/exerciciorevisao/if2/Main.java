package br.com.entra21.exerciciorevisao.if2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Escreva um programa que:
Defina como constante a quantidade de notas de um aluno
Capture nome e cada uma das notas
Calcule a média
Informe
se reprovou (<3)
senao se , em recuperação (<7)
senão se, passou com a nota minima (=7)
senão se, passou mas poderia ser melhor (<10)
senão se, nota maxima (=10)
senão (tem algo de errado com o seu calculo de média)*/
		
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
		
		System.out.println("Sua média é " + media);
		
		if(media <= 3) {
			System.out.println(nome + ", você reprovou.");
		}else if(media < 7) {
			System.out.println("Você está em recuperação " + nome + " , estude para a prova final.");
		}else if(media == 7) {
			System.out.println("Você passou com a nota mínima" + nome + " , se esforce mais na próxima");
		}else if(media <10) {
			System.out.println("Você passou" + nome + " , mas dá para melhorar.");
		}else if(media == 10) {
			System.out.println("Parabéns, "+ nome + "você passou com a nota máxima.");
		}else {
			System.out.println("Tem algo errado com seu cálculo de média.");
		}
		
		}

}
