package br.com.entra21.aulaslogicaprogramacaojava.funcoes;

import java.util.Scanner;

public class AprenderFuncoes {

	public AprenderFuncoes() {
		
		String opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quero executar o assunto abaixo: ");
		System.out.println("1 - Procedimento:");
		System.out.println("2 - Par�metros");
		System.out.println("3 - Retornos");
		System.out.println("4 - Completo");
		System.out.println("11 - Exercicio1");
		System.out.println("12 - Exercicio2");
		opcao = entrada.nextLine();
		
		opcao = opcao.toLowerCase();
		switch(opcao) {
		case "1":
		case "procedimento":
			verProcedimentos();
			verProcedimentos();
			break;
			
		case "2":
		case "parametros":
			verParametros(2);//como argumento eu passei o valor 2 para o m�todo
			verParametros(18);//como argumento eu passei o valor 18 para o m�todo
			verParametros(5);//como argumento eu passei o valor 5 para o m�todo
			verMaisParametros(opcao, "Alex", 10);
			verMaisParametros(opcao, "Alex", 200);
			break;
			
		case "3":
		case "retornos":
			byte retorno = retornarValorInteiro(); // o retorno para atribuir vari�veis
			//usar diretamente em saidas em tela syso
			System.out.println("Esse m�todo retornou " + retornarValorInteiro());
			if(retornarValorInteiro() < 20) {// usar o retorno para a l�gica booleana
				System.out.println("Retornou menos que 20");
			}else {
				System.out.println("Retornou maior ou igual a 20");
			}
			break;
			
		case "4":
		case "completo":
			calcularDivisao(4,2);//o retorno ta a�,pega quem quiser,nesse caso ningu�m nessa linha
			operacoesCalculadora(10,3);
			System.out.println(operacoesCalculadora(10,3));
			float entradaA,entradaB;
			System.out.println("Informe o primeiro float:");
			entradaA = entrada.nextFloat();
			System.out.println("Informe o segundo float:");
			entradaB = entrada.nextFloat();
			float calculo = calcularDivisao(entradaA, entradaB);
			System.out.println("O resultado da divis�o �: " + calculo);
			break;
			
				
			
			default:
				System.out.println("N�o tem essa op��o no menu.");
				break;
		}
		
		

	}
	
	
	//Declara��o de fun��o
	//As regras de uso e como ser� executado
	//public = visibilidade
	//static = tipo de acesso
	//void = tipo de retorno
	public static void capturarFrase() {
		System.out.println("Escreva uma frase...");
		System.out.println("--------------------------");
		System.out.println("   ENTER PARA CONFIRMAR   ");
		System.out.println("--------------------------");
		
		
		
	}
	
	public static void verProcedimentos() {
		System.out.println("1 - Procedimentos:");
		
		String frase;
		Scanner entrada = new Scanner(System.in);
		//Chamada de fun��o onde eu passo os argumentos caso precise
		capturarFrase();
		frase = entrada.nextLine();
		
		System.out.println("Voc� disse: " + frase);
		
		//Chamada de fun��o onde eu passo os argumentos caso precise
		capturarFrase();
		frase = entrada.nextLine();
		
		System.out.println("Voc� disse: " + frase);
		
		//Chamada de fun��o onde eu passo os argumentos caso precise
		capturarFrase();
		frase = entrada.nextLine();
		
		System.out.println("Voc� disse: " + frase);
	}
	
	public static void verParametros(int numero) {
		System.out.println("\nVoc� me passou por par�metro o n�mero " + numero);
		if(numero % 2 == 0) {
			System.out.println("Que legal, esse n�mero ainda � par");
		}
		
		
		
	}

	public static void verMaisParametros(String escolha,String nome, int numero) {//Par�metros
		//Par�metros s�o vari�veis tempor�rias criadas respectivamente aos argumentos passados.
		System.out.println("\nRecebi isso tudo de voc�");
		System.out.println(escolha);
		System.out.println(nome);
		System.out.println(numero);
		
		if(numero < 100) {
			System.out.println("\nMenor que 100");
		}else {
			System.out.println("\n� maior ou igual a 100");
		}
	}
	
	public static byte retornarValorInteiro() {
		byte variavelParaRetorno = 15;
		System.out.println("Aqui sempre retornando 15 porque n�o tenho par�metros para deicar din�mico");
		return variavelParaRetorno;
	}
	
	public static float calcularDivisao(float numeroA,float numeroB) {
		return numeroA / numeroB;	
	}
	
	public static String operacoesCalculadora(float numeroA,float numeroB) {
		
		float soma = numeroA + numeroB;
		float subtracao = numeroA - numeroB;
		float multiplicacao = numeroA * numeroB;
		float divisao = numeroA / numeroB;
		
		return "Executei tudo soma = " + soma +" ;sub = " + subtracao + " ;div = " + divisao + " ;multi = " + multiplicacao  ;

	}
}
