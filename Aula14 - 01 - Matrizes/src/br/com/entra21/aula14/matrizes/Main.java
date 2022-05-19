package br.com.entra21.aula14.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	// definindo minha variável entrada do tipo Scanner acessivel em toda a classe Main
	// como o método main é static, tano métodos ou variáveis devem ser static
	// para se relacionarem com o método main

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
				System.out.println("Apenas 0, 1 e 2 são opções válidas. Digite novamente:\n");
				break;

			}

		} while (option != 0);

		System.out.println("Fim da aula sobre matrizes.");

	}

	public static String escreverMenuMatrizes() {
		String conteudoMenu = "";
		conteudoMenu += "Escolha uma opção para aprender\n";
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
		notas = new float[10][3];//Aqui foi definido diretamente no código o tamanho da matriz
		// primeiro índice é a quantidade de vetores
		// segundo índice é a capacidade de cada vetor
		// apenas no nível ficam os valores
		
		byte quantidadeAlunos, quantidadeNotas;
		System.out.println("Informe a quantidade de alunos:");
		quantidadeAlunos = input.nextByte();
		
		System.out.println("Informe a quantidade de notas para cada alunos:");
		quantidadeNotas = input.nextByte();
		
		//quem decide o tamanho da minha matriz é o usuário
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];
		
		for(byte alunos = 0; alunos < novasNotas.length; alunos++) {
			
			System.out.println("Nessa posição [" + alunos + "] temos " + novasNotas[alunos].length + " notas.\n");
			
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
				
			{"1 - Metodologias Ágeis", "Introdução", "Metodologias", "Git"},
			{"2 - Lógica com JAVA", "Variáveis", "Constantes", "Comentários", "Desvio Condicionais", "Laços de Repetição"},
			{"3 - P.O.O", "Classes", "Objetos", "Herança", "Polimorfismo", "Encapsulamento", "Conceitos"}
		};
		
	}

}
