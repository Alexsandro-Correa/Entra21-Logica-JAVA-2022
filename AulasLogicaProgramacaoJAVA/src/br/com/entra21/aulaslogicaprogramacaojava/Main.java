package br.com.entra21.aulaslogicaprogramacaojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.aulaslogicaprogramacaojava.condicao_if_else.CondicionaisIfElse;
import br.com.entra21.aulaslogicaprogramacaojava.condicao_switch_case.CondicionalSwitchCase;
import br.com.entra21.aulaslogicaprogramacaojava.estruturas_de_repeticao.EstruturasDeRepeticao;
import br.com.entra21.aulaslogicaprogramacaojava.exercicios.Exercicios;
import br.com.entra21.aulaslogicaprogramacaojava.funcoes.Funcoes;
import br.com.entra21.aulaslogicaprogramacaojava.matrizes.Matrizes;
import br.com.entra21.aulaslogicaprogramacaojava.operadores_arit_incre_decrement.OperadoresAritIncreDecre;
import br.com.entra21.aulaslogicaprogramacaojava.operadores_igualdade_relac_logicos.OperadoresIgualdadeRelacionaisLogicos;
import br.com.entra21.aulaslogicaprogramacaojava.prova.Provas;
import br.com.entra21.aulaslogicaprogramacaojava.vars_constantes.VariaveisEConstantes;
import br.com.entra21.aulaslogicaprogramacaojava.vetores.Vetores;

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
				new CondicionalSwitchCase("Estrutura de Condi��o switch/case",
						new ArrayList<String>(Arrays.asList("Estrutura de Condi��o switch/case"))).writeAllMenus();
				break;

			case 6:
				new Funcoes("Fun��es", new ArrayList<String>(Arrays.asList("Aprender Fun��es"))).writeAllMenus();
				break;

			case 7:
				new EstruturasDeRepeticao("Estruturas de Repeti��o for, while e do while",
						new ArrayList<String>(
								Arrays.asList("Estrutura de Repeti��o for", "Estrutura de repeti��o while e do while")))
						.writeAllMenus();
				break;

			case 8:
				new Vetores("Vetores", new ArrayList<String>(
						Arrays.asList("Declarar Vetores", "Acessar �ndices", "Atualizar Valores", "M�dia com Vetores")))
						.writeAllMenus();
				break;

			case 9:
				new Matrizes("Matrizes",
						new ArrayList<String>(Arrays.asList("Matrizes Simples", "Matrizes Inicializadas")))
						.writeAllMenus();
				break;

			case 10:
				new Exercicios("Exerc�cios L�gica de Programa��o JAVA",
						new ArrayList<String>(Arrays.asList("Exerc�cio �rea Per�metro", "Exerc�cio Calculadora",
								"Exerc�cio C�lculo IMC", "Exerc�cio Conversor de Temperatura",
								"Exerc�cio M�dia Aritm�tica", "Exerc�cio Pre�o de Custo",
								"Exerc�cio Operador de Igualdade", "Exerc�cio Operador L�gico",
								"Exerc�cio Operador Relacional", "Exerc�cio IfElse", "Exerc�cios de Revis�o if",
								"Exerc�cios de Revis�o switch/case", "Exerc�cio Calculadora 2", "Exerc�cio Curr�culo",
								"Exerc�cio de Fixa��o de Repeti��o","Exerc�cio com Vetores", "Exerc�cio com Matrizes")))
						.writeAllMenus();
				break;

			case 11:
				new Provas("Provas", new ArrayList<String>(Arrays.asList("Prova 1", "Prova 2"))).writeAllMenus();

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
		menu += "\n\t6 - Fun��es";
		menu += "\n\t7 - Estrutura de repeti��o: for, while e do while";
		menu += "\n\t8 - Vetores";
		menu += "\n\t9 - Matrizes";
		menu += "\n\t10 - Exerc�cios";
		menu += "\n\t11 - Provas";

		return menu;
	}

}
