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
				new CondicionalSwitchCase("Estrutura de Condição switch/case",
						new ArrayList<String>(Arrays.asList("Estrutura de Condição switch/case"))).writeAllMenus();
				break;

			case 6:
				new Funcoes("Funções", new ArrayList<String>(Arrays.asList("Aprender Funções"))).writeAllMenus();
				break;

			case 7:
				new EstruturasDeRepeticao("Estruturas de Repetição for, while e do while",
						new ArrayList<String>(
								Arrays.asList("Estrutura de Repetição for", "Estrutura de repetição while e do while")))
						.writeAllMenus();
				break;

			case 8:
				new Vetores("Vetores", new ArrayList<String>(
						Arrays.asList("Declarar Vetores", "Acessar Índices", "Atualizar Valores", "Média com Vetores")))
						.writeAllMenus();
				break;

			case 9:
				new Matrizes("Matrizes",
						new ArrayList<String>(Arrays.asList("Matrizes Simples", "Matrizes Inicializadas")))
						.writeAllMenus();
				break;

			case 10:
				new Exercicios("Exercícios Lógica de Programação JAVA",
						new ArrayList<String>(Arrays.asList("Exercício Área Perímetro", "Exercício Calculadora",
								"Exercício Cálculo IMC", "Exercício Conversor de Temperatura",
								"Exercício Média Aritmética", "Exercício Preço de Custo",
								"Exercício Operador de Igualdade", "Exercício Operador Lógico",
								"Exercício Operador Relacional", "Exercício IfElse", "Exercícios de Revisão if",
								"Exercícios de Revisão switch/case", "Exercício Calculadora 2", "Exercício Currículo",
								"Exercício de Fixação de Repetição","Exercício com Vetores", "Exercício com Matrizes")))
						.writeAllMenus();
				break;

			case 11:
				new Provas("Provas", new ArrayList<String>(Arrays.asList("Prova 1", "Prova 2"))).writeAllMenus();

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
		menu += "\n\t6 - Funções";
		menu += "\n\t7 - Estrutura de repetição: for, while e do while";
		menu += "\n\t8 - Vetores";
		menu += "\n\t9 - Matrizes";
		menu += "\n\t10 - Exercícios";
		menu += "\n\t11 - Provas";

		return menu;
	}

}
