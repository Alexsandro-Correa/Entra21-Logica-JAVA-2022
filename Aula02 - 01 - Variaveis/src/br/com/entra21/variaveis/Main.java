package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {

	

	public static void main(String[] args) {

		byte idade;
		idade = 24;

		byte outraIdade = 26;

		short ano;
		ano = 2022;

		short outroAno = 2021;

		System.out.println("Minha idade é " + (idade + outraIdade) + ".");

		System.out.println("Estamos em " + ano + " e ano passado foi " + outroAno + ".");

		int municipios;
		municipios = 5568;

		int habitantesBrasil = 212060000;

		System.out.println("No Brasil, em " + ano + " temos exatamente " + habitantesBrasil + " habitantes.");

		long habitantesTerra1500;
		habitantesTerra1500 = 79000000;

		double habitantesAtualmente;
		habitantesAtualmente = 7900000000.00;

		float peso, altura;
		peso = 64.3f;
		altura = 1.64f;

		System.out.println("Meu peso é " + peso + "kg. Minha altura é " + altura + "cm.");

		char letra = 'R';

		boolean intervaloAntesDasOito = false;
		boolean intervaloAgora = true;

		String nomeCompleto = "";

		String nome;
		byte minhaIdade;
		float minhaAltura, salario ;

		//Scanner entrada;
		//entrada = new Scanner(System.in);

		/*
		 System.out.println("\nPor favor, qual é o seu nome?");
		
		nome = entrada.next();

		System.out.println("\nInforme sua idade:");
		minhaIdade = entrada.nextByte();

		System.out.println("\nBem vindo " + nome + " agora consigo interagir com humanos e já sei que você tem " + idade
				+ " anos.");

		System.out.println("\nInforme a sua altura:");
		minhaAltura = entrada.nextFloat();

		System.out.println("\nQuanto você ganha?");
		salario = entrada.nextFloat();

		System.out.println(
				"\nAgora eu já sei que você tem " + minhaAltura + "cm" + " e que você ganha R$" + salario + ".");
				*/
				

		nome = JOptionPane.showInputDialog("Informe novamente seu nome completo");

		JOptionPane.showMessageDialog(null, "Legal, agora eu aprendi o seu nome " + nome + "!");
		
		minhaIdade = Byte.parseByte(
				JOptionPane.showInputDialog("Informe a sua idade")
				);
		JOptionPane.showMessageDialog(null, "Legal, você tem " + minhaIdade + " anos.");
		salario = Float.parseFloat(
				JOptionPane.showInputDialog("Informe seu salário")
				);
		JOptionPane.showMessageDialog(null, "Tá bom, você ganha " + salario + " reais.");
		
		
		
	}

}