package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.Scanner;

public class ExercicioOperadorLogico {

	public ExercicioOperadorLogico() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Pr�tica sobre operadores l�gicos\r\n"
				+ "Deve ser informado se o usu�rio � maior ou igual que 170cm E tem � maior de idade (utilizar o &&)\n"
				+ "Deve ser informado se o usu�rio � maior ou igual que 170cm OU tem � maior de idade (utilizar o ||)\n");

		String nome = "Alex";
		byte idade = 24;
		float altura = 1.64f;
		boolean resultado;

		resultado = (altura) >= 1.70 && (idade) >= 18;
		System.out.println(
				"O " + nome + " tem " + altura + "cm e " + idade + "anos, est� apto para a vaga? " + resultado);

		resultado = (altura) >= 1.70 || (idade) >= 18;
		System.out.println(
				"O " + nome + " tem " + altura + "cm e " + idade + "anos, est� apto para a vaga? " + resultado);

		
	}
}
