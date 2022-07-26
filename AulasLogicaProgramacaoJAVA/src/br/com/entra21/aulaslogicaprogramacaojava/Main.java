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
				new VariaveisEConstantes("Vari�veis e Constantes",
						new ArrayList<String>(Arrays.asList("Tipos de Dados", "Vari�veis", "Constantes")))
						.writeAllMenus();
				break;

			case 2:
				new OperadoresAritIncreDecre("Operadores Aritm�ticos,Incremento e Decremento",
						new ArrayList<String>(Arrays.asList("Operadores Aritm�ticos", "Incremento", "Decremento")))
						.writeAllMenus();
				break;

			case 3:
				new OperadoresIgualdadeRelacionaisLogicos("Operadores de Igualdade, Relacionais e L�gicos",
						new ArrayList<String>(Arrays.asList("Operadores de Igualdade", "Operadores Relacionais",
								"Operadores L�gicos")))
						.writeAllMenus();
				break;

			case 4:
				new CondicionaisIfElse("Estruturas de condi��o: if, else e else if",
						new ArrayList<String>(Arrays.asList("Estrutura de Condi��o if", "Estrutura de Condi��o if else",
								"Operador Tern�rio", "Estrutura de Condi��o elseif")))
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
				new Exercicios("Exerc�cios L�gica de Programa��o JAVA",
						new ArrayList<String>(Arrays.asList("Exerc�cio �rea Per�metro", "Exerc�cio Calculadora",
								"Exerc�cio C�lculo IMC", "Exerc�cio Conversor de Temperatura",
								"Exerc�cio M�dia Aritm�tica", "Exerc�cio Pre�o de Custo",
								"Exerc�cio Operador de Igualdade", "Exerc�cio Operador L�gico",
								"Exerc�cio Operador Relacional", "Exerc�cio IfElse")))
						.writeAllMenus();
				break;

			default:
				System.out.println("Op��o inv�lida,tente novamente:");
				break;

			}

		} while (option != 0);

		System.out.println("Obrigado por usar o programa \"Aprendendo L�gica de Programa��o com JAVA\".");

	}

	private static String writeMenu() {

		String menu = "\t\n=================> Aulas L�gica de Programa��o em JAVA <=================\n";
		menu += "\n\t0 - Sair";
		menu += "\n\t1 - Vari�veis e Constantes";
		menu += "\n\t2 - Operadores Aritm�ticos, Incremento e Decremento";
		menu += "\n\t3 - Operadores de Igualdade, Relacionais e L�gicos";
		menu += "\n\t4 - Estruturas de condi��o: if, else e else if";
		menu += "\n\t5 - Estruturas de condi��o: switch/case";
		menu += "\n\t6 - Estrutura de repeti��o: for";
		menu += "\n\t7 - Estrutura de repeti��o: while e do while";
		menu += "\n\t8 - Vetores";
		menu += "\n\t9 - Matrizes";
		menu += "\n\t10 - Exerc�cios";

		return menu;
	}

}
