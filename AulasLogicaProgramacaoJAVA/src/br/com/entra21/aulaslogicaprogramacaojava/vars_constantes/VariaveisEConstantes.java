package br.com.entra21.aulaslogicaprogramacaojava.vars_constantes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class VariaveisEConstantes extends Menu {

	public VariaveisEConstantes(String title, ArrayList<String> matters) {
		super(title, matters);

	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();

		switch (option) {

		case 1:
			aprenderTiposDeDados();
			break;

		case 2:
			aprenderVariaveis();
			break;

		case 3:
			aprenderConstantes();
			break;

		}

		return option;
	}

	private static void aprenderTiposDeDados() {
		System.out.println("A linguagem Java tem oito tipos primitivos:\n");

		System.out.println("1 - byte , 1 byte - 8 bits = -128-127 - números inteiros");
		System.out.println("2 - short, 2 bytes - 16 bits = -32768 a +32767 - números inteiros");
		System.out.println("3 - int, 4 bytes - 32 bits = -2147483648 a + 2147483647 - números inteiros");
		System.out.println("4 - long, 8 bytes - 64 bits = -922337203685477808 a 922337203685477807 - números inteiros");
		System.out.println(
				"5 - char, Caracteres Unicode 16 bits = 0 a 65536 = caracteres (Apenas um caractere nessas características)");
		System.out.println("6 - float, 4 bytes - 32 bits = aproximadamente 3.40282347E+38 = Ponto flutuante");
		System.out.println("7 - double, 8bytes - 64 bits = 1.79769313486231570W+308 = Ponto Flutuante");
		System.out.println("8 - boolean, Possuem valores True e false = booleano");
	}

	private static void aprenderVariaveis() {
		
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

		System.out.println("Meu peso é " + peso + "kg. Minha altura é " + altura + "cm.\n");

		char letra = 'R';

		boolean intervaloAntesDasOito = false;
		boolean intervaloAgora = true;

		String nomeCompleto = "";

		String nome;
		byte minhaIdade;
		float minhaAltura, salario;

		// Scanner entrada;
		// entrada = new Scanner(System.in);

		/*
		 * System.out.println("\nPor favor, qual é o seu nome?");
		 * 
		 * nome = entrada.next();
		 * 
		 * System.out.println("\nInforme sua idade:"); minhaIdade = entrada.nextByte();
		 * 
		 * System.out.println("\nBem vindo " + nome +
		 * " agora consigo interagir com humanos e já sei que você tem " + idade +
		 * " anos.");
		 * 
		 * System.out.println("\nInforme a sua altura:"); minhaAltura =
		 * entrada.nextFloat();
		 * 
		 * System.out.println("\nQuanto você ganha?"); salario = entrada.nextFloat();
		 * 
		 * System.out.println( "\nAgora eu já sei que você tem " + minhaAltura + "cm" +
		 * " e que você ganha R$" + salario + ".");
		 */

		/*nome = JOptionPane.showInputDialog("Informe novamente seu nome completo");

		JOptionPane.showMessageDialog(null, "Legal, agora eu aprendi o seu nome " + nome + "!");

		minhaIdade = Byte.parseByte(JOptionPane.showInputDialog("Informe a sua idade"));
		JOptionPane.showMessageDialog(null, "Legal, você tem " + minhaIdade + " anos.");
		salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salário"));
		JOptionPane.showMessageDialog(null, "Tá bom, você ganha " + salario + " reais.");
		*/

	}

	private static void aprenderConstantes() {
		
		final byte IDADE;
		IDADE = 33;
	}

}
