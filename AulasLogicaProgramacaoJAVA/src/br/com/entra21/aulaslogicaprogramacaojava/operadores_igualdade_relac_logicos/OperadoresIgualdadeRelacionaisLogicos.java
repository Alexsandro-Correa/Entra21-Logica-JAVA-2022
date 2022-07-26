package br.com.entra21.aulaslogicaprogramacaojava.operadores_igualdade_relac_logicos;

import java.util.ArrayList;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class OperadoresIgualdadeRelacionaisLogicos extends Menu {

	public OperadoresIgualdadeRelacionaisLogicos(String title, ArrayList<String> matters) {
		super(title, matters);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();

		switch (option) {

		case 1:
			operadoresDeIgualdade();
			break;

		case 2:
			operadoresRelacionais();
			break;

		case 3:
			operadoresLogicos();
			break;

		}

		return option;
	}

	private static void operadoresDeIgualdade() {

		System.out.println("Operadores de igualdade");

		System.out.println("igual ==");

		byte idadeA, idadeB;
		boolean resultado;

		idadeA = 10;
		idadeB = 10;

		resultado = idadeA == idadeB;

		System.out.println("Ao comparar a igualdade resultou em " + resultado);

		resultado = idadeA != idadeB;

		System.out.println("Ao comparar a desigualdade resultou em " + resultado);
	}

	private static void operadoresRelacionais() {
		
		System.out.println("Operadores Relacionais");
		
		System.out.println("Menor < (dica   voltando ou apagando <<<<<------  )");
		
		byte idadeA = 50, idadeB = 51;
		boolean resultado;
		
		resultado = idadeA < idadeB; //idade é menor que idadeB?
		
		System.out.println("A idadeA é (<) menor que idadeB? " + resultado);
		
		System.out.println("A idadeA é (<) menor que idadeB? " + (idadeA<idadeB));
		
		resultado = idadeA <= idadeB;
		
		System.out.println( idadeA + " é (<) menor ou igual que " +idadeB+ "? " + resultado);
		
		System.out.println("Maior > (dica é  'sempre em frente ----->')");
		
		resultado = idadeA > idadeB;
		
		System.out.println(idadeA + " é maior (>) que " + idadeB + " ? " + resultado);
		
		resultado = idadeA >= idadeB;
		
		System.out.println(idadeA + "é maior ou igual (>=) que " + idadeB + " ? " + resultado);

	}
	
	private static void operadoresLogicos() {
		
System.out.println("Operadores Lógicos");
		
		System.out.println("E - AND - && - eComercial - (SHIFT+7) - (alt+38) = expressão restritiva");
		System.out.println("Entre 2 booleans ao utilizar o && para resultar true, ambos tem que ser true");
		System.out.println("Em outras palavras, se houver um false em comparação com && resultará em false");
		
		System.out.println("Tabela verdade do E");
		System.out.println("T && T = T");
		System.out.println("T && F = F");
		System.out.println("F && T = F");
		System.out.println("F && F = F");
		
		byte idade = 24;
		float altura = 1.64f;
		double dinheiro;
		boolean resultado;
		
		resultado = idade <18; //false
		
		resultado = altura > 2.0f; //false
		
		resultado = (idade < 18) && (altura >= 2.0f);
		//				(false)	 &&	  (false)
		//						false
		
		idade = 15;
		altura = 1.9f;
		
		resultado = (idade < 18) && (altura >= 2.0f);
		//				(true)	&&		(false)
		//						(false)
		
		idade = 20;
		altura = 2.1f;
		dinheiro = 20000;
		
		resultado = (idade >=18) && (altura >= 2.0f) && (dinheiro >= 50000);
		//				(true)	&&  	(true)		&&		(false)
		//						(true)	 &&		(false)
		//								(false)
		
		idade = 30;
		altura = 2.15f;
		dinheiro = 100000;
		
		resultado = (idade >=18) && (altura >= 2.0f) && (dinheiro >= 50000);
		//				(true)	&&  	(true)		&&		(true)
		//						(true)	 &&		(true)
		//								(true)
		
		
		idade = 40;
		altura = 2.35f;
		dinheiro = 100000;
		
		resultado = ( (idade >= 18) && (idade <=45)  ) && (altura < 2.35) && (dinheiro >= 50000);
		//				(	(true)  &&  (true)	)   	&& (altura < 2.35) && (dinheiro >= 50000)
		//					(true)	&& (altura < 2.35) && (dinheiro >= 50000)
		//					(true) && (false) && (dinheiro >= 50000)
		//						(true) && (false) && (true)
		//							(false) && (true)
		
		//------------------------------------------------------------
		
		System.out.println("OU - OUR - || -pipe - (SHIFT+\\) - (alt+124) = expressão inclusiva");
		System.out.println("Entre 2 booleans ao utilizar o || para resultar em true, basta que apenas um seja true");
		System.out.println("Em outras palavras, apenas quando ambos forem false com || resultará en false");
		
		System.out.println("Tabela verdade do OU");
		System.out.println("T || T = T");
		System.out.println("T || F = T");
		System.out.println("F || T = T");
		System.out.println("F || F = F");
		
		idade = 17;
		dinheiro = 1000;
		
		resultado = (idade >= 18) || (dinheiro >= 1000); //entrar na rave de 7 dias no sítio
		//				(false)  || (dinheiro >=1000)
		//			(false) || 	(true)
		// 				   (true)
		
		resultado = (idade <= 14) || (idade >= 18); //melhor época para os pais?
		//				(false) || (idade >=18)
		//					(false) || (false)
		//						  (false)
		
		idade = 3;
		resultado = (idade <= 14) || (idade >= 18); //melhor época para os pais?
		//				(true)   || (idade >= 18)
		//				(true) || (false)
		//					(true)
		
		
	
	}
}
