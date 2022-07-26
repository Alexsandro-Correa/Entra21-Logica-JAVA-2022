package br.com.entra21.aulaslogicaprogramacaojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.aulaslogicaprogramacaojava.condicao_if_else.CondicionaisIfElse;
import br.com.entra21.aulaslogicaprogramacaojava.exercicios.Exercicios;
import br.com.entra21.aulaslogicaprogramacaojava.operadores_arit_incre_decrement.OperadoresAritIncreDecre;
import br.com.entra21.aulaslogicaprogramacaojava.operadores_igualdade_relac_logicos.OperadoresIgualdadeRelacionaisLogicos;
import br.com.entra21.aulaslogicaprogramacaojava.vars_constantes.VariaveisEConstantes;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println(writeMenu());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				new VariaveisEConstantes("Variáveis e Constantes",
						new ArrayList<String>(Arrays.asList("Tipos de Dados", "Variáveis", "Constantes")))
						.writeAllMenus();
				break;

			case 2:
				new OperadoresAritIncreDecre("Operadores Aritméticos,Incremento e Decremento",
						new ArrayList<String>(Arrays.asList("Operadores Aritméticos", "Incremento", "Decremento")))
						.writeAllMenus();
				break;

			case 3:
				new OperadoresIgualdadeRelacionaisLogicos("Operadores de Igualdade, Relacionais e Lógicos",
						new ArrayList<String>(Arrays.asList("Operadores de Igualdade", "Operadores Relacionais",
								"Operadores Lógicos")))
						.writeAllMenus();
				break;

			case 4:
				new CondicionaisIfElse("Estruturas de condição: if, else e else if",
						new ArrayList<String>(Arrays.asList("Estrutura de Condição if", "Estrutura de Condição if else",
								"Operador Ternário", "Estrutura de Condição elseif")))
						.writeAllMenus();
				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:

				break;

			case 9:

				break;

			case 10:
				new Exercicios("Exercícios Lógica de Programação JAVA",
						new ArrayList<String>(Arrays.asList("Exercício Área Perímetro", "Exercício Calculadora",
								"Exercício Cálculo IMC", "Exercício Conversor de Temperatura",
								"Exercício Média Aritmética", "Exercício Preço de Custo",
								"Exercício Operador de Igualdade", "Exercício Operador Lógico",
								"Exercício Operador Relacional", "Exercício IfElse")))
						.writeAllMenus();
				break;

			default:
				System.out.println("Opção inválida,tente novamente:");
				break;

			}

		} while (option != 0);

		System.out.println("Obrigado por usar o programa \"Aprendendo Lógica de Programação com JAVA\".");

	}

	private static String writeMenu() {

		String menu = "\t\n=================> Aulas Lógica de Programação em JAVA <=================\n";
		menu += "\n\t0 - Sair";
		menu += "\n\t1 - Variáveis e Constantes";
		menu += "\n\t2 - Operadores Aritméticos, Incremento e Decremento";
		menu += "\n\t3 - Operadores de Igualdade, Relacionais e Lógicos";
		menu += "\n\t4 - Estruturas de condição: if, else e else if";
		menu += "\n\t5 - Estruturas de condição: switch/case";
		menu += "\n\t6 - Estrutura de repetição: for";
		menu += "\n\t7 - Estrutura de repetição: while e do while";
		menu += "\n\t8 - Vetores";
		menu += "\n\t9 - Matrizes";
		menu += "\n\t10 - Exercícios";

		return menu;
	}

}
