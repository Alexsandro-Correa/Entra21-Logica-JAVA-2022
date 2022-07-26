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

		System.out.println("Aqui vai acontecer naturalmente porque o código segue sempre em frente");

		if (false) {
			// nunca passaria aqui pois apenas quando resulta em true passa por esse bloco
		}

		byte idade = 18;

		if (idade >= 18) { // é maior de idade?
			// sim
			System.out.println("É maior de idade");
		}

		if ((idade >= 13) && (idade < 18)) {// é adolescente ) (13~17)?
			System.out.println("É adolescente");

		}

	}

	private static void condicionalIfElse() {

		System.out.println("Aprendendo a usar o if com else");

		if (false) {
			System.out.println("Vai passar por aqui quando a condição resultar em true");
		} else {
			System.out.println("Vai passar por aqui quando a condição resultar em false");
		}

		byte idade = 18;

		if (idade > 17) {// é maior de idade?
			System.out.println("É de maior.");
		} else {
			System.out.println("Não é permitido menores aqui!");

		}
	}

	private static void operadorTernario() {

		System.out.println("Aprendendo sobre operador ternário");

		String nome;
		boolean condicao = true;

		nome = (true) ? "Nome" : "Sobrenome";

		System.out.println("Então você é " + (condicao ? "de maior" : " de menor"));

		byte idade = 30;

		if (idade > 17) {
			System.out.println("Você é de maior");
		} else {
			System.out.println("Você é de menor");
		}

		System.out.println("Você é de " + (idade > 17 ? "de maior" : "de menor"));

		condicao = (idade == 30 ? true : false);

	}

	private static void condicionalElseIf() {
		
System.out.println("Aprendendo sobre else if (ou seja renovando o if antes do else)");
		
		float altura = 1.5f;
		double dinheiro = 1600;
		
		if(altura < 1.5) { //é baixinho ?
			System.out.println("É bem baixinho");
		}else if(altura <= 1.9) { //é alto
			System.out.println("É alto");
		}else {
			// mesmo que eu não queira fazer nada aqui é uma boa prática ter o else
		}
		
		//se até 1200, até 1800, até 2000, qualquer valor acima
		byte pontos;
		String mensagem;
		if(dinheiro <= 1200) {
			mensagem = "Salário minimo";
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
		System.out.println("Sua pontuação " + pontos);

	}
	
}