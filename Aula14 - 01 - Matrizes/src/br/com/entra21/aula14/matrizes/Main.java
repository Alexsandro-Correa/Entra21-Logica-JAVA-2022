package br.com.entra21.aula14.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	// definindo minha vari�vel entrada do tipo Scanner acessivel em toda a classe Main
	// como o m�todo main � static, tano m�todos ou vari�veis devem ser static
	// para se relacionarem com o m�todo main

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println(escreverMenuMatrizes());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderMatrizesSimples();
				break;

			case 2:
				aprenderMatrizesInicializadas();
				break;

			default:
				System.out.println("Apenas 0, 1 e 2 s�o op��es v�lidas. Digite novamente:\n");
				break;

			}

		} while (option != 0);

		System.out.println("Fim da aula sobre matrizes.");

	}

	public static String escreverMenuMatrizes() {
		String conteudoMenu = "";
		conteudoMenu += "Escolha uma op��o para aprender\n";
		conteudoMenu += "\t0 - Sair\n";
		conteudoMenu += "\t1 - Inicializando matrizes com tamanho definidos\n";
		conteudoMenu += "\t2 - Inicializando matrizes com valores predeterminados\n";

		conteudoMenu += "\t\n";

		return conteudoMenu;
	}

	public static void aprenderMatrizesSimples() {

		System.out.println("Aprendendo sobre matrizes simples.");

		System.out.println("Armazenar as 3 notas de todos os 10 alunoss");
		float notas[][];
		notas = new float[10][3];//Aqui foi definido diretamente no c�digo o tamanho da matriz
		// primeiro �ndice � a quantidade de vetores
		// segundo �ndice � a capacidade de cada vetor
		// apenas no n�vel ficam os valores
		
		byte quantidadeAlunos, quantidadeNotas;
		System.out.println("Informe a quantidade de alunos:");
		quantidadeAlunos = input.nextByte();
		
		System.out.println("Informe a quantidade de notas para cada alunos:");
		quantidadeNotas = input.nextByte();
		
		//quem decide o tamanho da minha matriz � o usu�rio
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];
		
		for(byte alunos = 0; alunos < novasNotas.length; alunos++) {
			
			System.out.println("Nessa posi��o [" + alunos + "] temos " + novasNotas[alunos].length + " notas.\n");
			
			for(byte nota = 0; nota < novasNotas[alunos].length; nota++ ) {
				
				System.out.println("\t Valor da nota [" + nota + "] ===> " + novasNotas[alunos][nota]);
				
			}
			
			
			
		}

	}

	public static void aprenderMatrizesInicializadas() {

		System.out.println("Aprendendo sobre matrizes inicializadas e irregulares.\n");
		
		float salarioAlunos[][] = {
				{1000, 1250.50f, 2500.35f},
				{2600, 3500, 4500},
				{50000, 150000, 2000000}
		};
		
		byte matrizIrregular[][] = {
				
				{1,2,3,4,5,6,7},
				{4,3,2,1},
				{10,12},
				{-127,0,127}
		};
		
		String ementa[][] = {
				
			{"1 - Metodologias �geis", "Introdu��o", "Metodologias", "Git"},
			{"2 - L�gica com JAVA", "Vari�veis", "Constantes", "Coment�rios", "Desvio Condicionais", "La�os de Repeti��o"},
			{"3 - P.O.O", "Classes", "Objetos", "Heran�a", "Polimorfismo", "Encapsulamento", "Conceitos"}
		};
		
	}

}
