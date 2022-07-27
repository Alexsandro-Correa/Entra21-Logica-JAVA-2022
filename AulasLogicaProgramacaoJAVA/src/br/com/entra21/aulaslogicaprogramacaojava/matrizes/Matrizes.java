package br.com.entra21.aulaslogicaprogramacaojava.matrizes;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class Matrizes extends Menu {

	static Scanner input = new Scanner(System.in);

	public Matrizes(String title, ArrayList<String> matters) {
		super(title, matters);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();

		switch (option) {

		case 1:
			aprenderMatrizesSimples();
			break;

		case 2:
			aprenderMatrizesInicializadas();
			break;

		}

		return option;
	}

	public static void aprenderMatrizesSimples() {

		System.out.println("Aprendendo sobre matrizes simples.");

		System.out.println("Armazenar as 3 notas de todos os 10 alunoss");
		float notas[][];
		notas = new float[10][3];// Aqui foi definido diretamente no código o tamanho da matriz
		// primeiro índice é a quantidade de vetores
		// segundo índice é a capacidade de cada vetor
		// apenas no nível ficam os valores

		byte quantidadeAlunos, quantidadeNotas;
		System.out.println("Informe a quantidade de alunos:");
		quantidadeAlunos = input.nextByte();

		System.out.println("Informe a quantidade de notas para cada alunos:");
		quantidadeNotas = input.nextByte();

		// quem decide o tamanho da minha matriz é o usuário
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for (byte alunos = 0; alunos < novasNotas.length; alunos++) {

			System.out.println("Nessa posição [" + alunos + "] temos " + novasNotas[alunos].length + " notas.\n");

			for (byte nota = 0; nota < novasNotas[alunos].length; nota++) {

				System.out.println("\t Valor da nota [" + nota + "] ===> " + novasNotas[alunos][nota]);

			}

		}

	}

	public static void aprenderMatrizesInicializadas() {

		System.out.println("Aprendendo sobre matrizes inicializadas e irregulares.\n");

		float salarioAlunos[][] = { { 1000, 1250.50f, 2500.35f }, // ===> [0][0] | [0][1] | [0][2]
				{ 2600, 3500, 4500 }, // ===> [1][0] | [1][1] | [1][2]
				{ 50000, 150000, 2000000 }, // ===> [2][0] | [2][1] | [2][2]
				{ 50000, 150000, 2000000 } // ===> [3][0] | [3][1] | [3][2]
		};

		byte matrizIrregular[][] = {

				{ 1, 2, 3, 4, 5, 6, 7 }, // length 7
				{ 4, 3, 2, 1 }, // length 4
				{ 10, 12 }, // length 2
				{ -127, 0, 127 } // length 3
		};

		String ementa[][] = {

				{ "1 - Metodologias Ágeis", "Introdução", "Metodologias", "Git" },
				{ "2 - Lógica com JAVA", "Variáveis", "Constantes", "Comentários", "Desvio Condicionais",
						"Laços de Repetição" },
				{ "3 - P.O.O", "Classes", "Objetos", "Herança", "Polimorfismo", "Encapsulamento", "Conceitos" } };

	}

}
