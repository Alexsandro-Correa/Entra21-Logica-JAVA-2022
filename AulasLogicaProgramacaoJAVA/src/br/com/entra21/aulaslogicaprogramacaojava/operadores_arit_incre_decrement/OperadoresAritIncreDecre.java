package br.com.entra21.aulaslogicaprogramacaojava.operadores_arit_incre_decrement;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class OperadoresAritIncreDecre extends Menu {

	public OperadoresAritIncreDecre(String title, ArrayList<String> matters) {
		super(title, matters);

	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();

		switch (option) {

		case 1:
			operadoresAritmeticos();
			break;

		case 2:
			incremento();
			break;

		case 3:
			decremento();
			break;

		}

		return option;
	}
	
	private static void operadoresAritmeticos() {
		
		System.out.println("Operadores Aritm�ticos");

		System.out.println("Realizando uma soma" + (1 + 7));
		System.out.println(4 + 10);

		float numeroA, numeroB;
		float calculoSoma;
		float resto;

		// Objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso
		// ao teclado
		Scanner entrada = new Scanner(System.in);
		// new Scanner significa construa um objeto da classe Scanner e atribua na
		// variavel entrada

		System.out.println("Informe o n�mero A:");
		numeroA = entrada.nextFloat();

		System.out.println("Informe o n�mero B:");
		numeroB = entrada.nextFloat();

		System.out.println("A soma entre esses 2 n�meros � " + (numeroA + numeroB));
		calculoSoma = numeroA + numeroB;

		System.out.println("Outra forma de exibir essa soma � " + calculoSoma);

		System.out.println("A subtra��o entre esses 2 n�meros � " + (numeroA - numeroB));

		System.out.println("Multiplica��o " + numeroA * numeroB);
		
		System.out.println("Divis�o " + numeroA/numeroB);
		
		resto = numeroA%numeroB;
		
		System.out.println("O resto da divis�o " + resto);
		
		boolean ehDivisivel = numeroA % numeroB ==0;
		
		System.out.println("� divis�vel entre si? " +ehDivisivel);
		
	}
	
	private static void incremento() {
		
		int idade = 24;
		
		System.out.println("Minha idade com p�s incremento " + (idade++));
		System.out.println("E agora? " +idade);
		
		
		
		//anivers�rio
		idade = idade+1;
		System.out.println(idade);
		
		//ano 29/02 4 em 4 anos
		idade = idade+4;
		
		idade++;
		System.out.println(idade);
		
		idade+=2;
		System.out.println(idade);;
		
		idade= idade +2;
		System.out.println(idade);
		
		
		idade*=2; 
		System.out.println(idade);
		
		idade = idade*2;
		System.out.println(idade);
		
	}
	
	private static void decremento() {
		
		int idade = 24;
		
		idade/=2;
		System.out.println(idade);
		
		idade = idade/2;
		System.out.println(idade);
		
		
		idade--;
		System.out.println(idade);
		
		idade-=10;
		System.out.println(idade);
		
		idade = idade-10;
		System.out.println(idade);
		
	}

}
