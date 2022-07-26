package br.com.entra21.aulaslogicaprogramacaojava.condicao_if_else;

import java.util.ArrayList;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class CondicionaisIfElse extends Menu {

	public CondicionaisIfElse(String title, ArrayList<String> matters) {
		super(title, matters);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();

		switch (option) {

		case 1:
			condicionalIf();
			break;

		case 2:
			condicionalIfElse();
			break;

		case 3:
			operadorTernario();
			break;
			
		case 4:
			condicionalElseIf();
			break;

		}

		return option;
	}

	private static void condicionalIf() {

		System.out.println("Aprendendo sobre if");

		if (true) {
			System.out.println("Vai fazer isso quando der true");
			System.out.println("Somente true");
		}

		System.out.println("Aqui vai acontecer naturalmente porque o c�digo segue sempre em frente");

		if (false) {
			// nunca passaria aqui pois apenas quando resulta em true passa por esse bloco
		}

		byte idade = 18;

		if (idade >= 18) { // � maior de idade?
			// sim
			System.out.println("� maior de idade");
		}

		if ((idade >= 13) && (idade < 18)) {// � adolescente ) (13~17)?
			System.out.println("� adolescente");

		}

	}

	private static void condicionalIfElse() {

		System.out.println("Aprendendo a usar o if com else");

		if (false) {
			System.out.println("Vai passar por aqui quando a condi��o resultar em true");
		} else {
			System.out.println("Vai passar por aqui quando a condi��o resultar em false");
		}

		byte idade = 18;

		if (idade > 17) {// � maior de idade?
			System.out.println("� de maior.");
		} else {
			System.out.println("N�o � permitido menores aqui!");

		}
	}

	private static void operadorTernario() {

		System.out.println("Aprendendo sobre operador tern�rio");

		String nome;
		boolean condicao = true;

		nome = (true) ? "Nome" : "Sobrenome";

		System.out.println("Ent�o voc� � " + (condicao ? "de maior" : " de menor"));

		byte idade = 30;

		if (idade > 17) {
			System.out.println("Voc� � de maior");
		} else {
			System.out.println("Voc� � de menor");
		}

		System.out.println("Voc� � de " + (idade > 17 ? "de maior" : "de menor"));

		condicao = (idade == 30 ? true : false);

	}

	private static void condicionalElseIf() {
		
System.out.println("Aprendendo sobre else if (ou seja renovando o if antes do else)");
		
		float altura = 1.5f;
		double dinheiro = 1600;
		
		if(altura < 1.5) { //� baixinho ?
			System.out.println("� bem baixinho");
		}else if(altura <= 1.9) { //� alto
			System.out.println("� alto");
		}else {
			// mesmo que eu n�o queira fazer nada aqui � uma boa pr�tica ter o else
		}
		
		//se at� 1200, at� 1800, at� 2000, qualquer valor acima
		byte pontos;
		String mensagem;
		if(dinheiro <= 1200) {
			mensagem = "Sal�rio minimo";
			pontos = 5;
		}else if(dinheiro <= 1800) {
			mensagem = "Ta ficando rico";
			pontos = 8;
		}else if(dinheiro <= 2000) {
			mensagem = "Me empresta :) ";
			pontos = 12;
		}else {
			mensagem = "Me contrata vai";
			pontos = 13;
		}
		
		System.out.println(mensagem);
		System.out.println("Sua pontua��o " + pontos);

	}
	
}