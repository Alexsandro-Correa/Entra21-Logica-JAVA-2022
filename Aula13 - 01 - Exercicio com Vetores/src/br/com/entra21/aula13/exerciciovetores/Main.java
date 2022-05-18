package br.com.entra21.aula13.exerciciovetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte menu;

		do {

			// utilizando do-while porque me permite entrar no bloco antes de testar a
			// condi��o de perman�ncia
			System.out.println(escreverMenu());

			menu = input.nextByte();

			switch (menu) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				exibirTamanhoVetores(); // chamada de m�todo
				break;

			case 2:
				exibirTamanhoVetoresInicializados();
				break;

			case 3:
				vetorCom5ParaInicializar();
				break;

			case 4:
				definirTamanhoVetorParaInicializar();
				break;

			case 5:
				percorrerVetorInicializadoCrescenteDecrescente();
				break;

			case 6:
				exibirVetorInteiroNaoInicializado();
				break;

			default:
				System.out.println("Selecione uma op��o v�lida.");
				break;

			}
			// caso a condi��o de perman�ncia seja true, repita o bloco
		} while (menu != 0); // enquanto n�o for zero, repita

		System.out.println("Obrigado por executar o programa!");
	}

	public static void exibirTamanhoVetores() {

		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		float vetorFloat[] = new float[2];
		double vetorDoubles[] = new double[3];
		char vetorChars[] = new char[1];
		boolean vetorBooleans[] = new boolean[4];

		System.out.println("vetorBytes t�m tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts t�m tamanho = " + vetorShorts.length);
		System.out.println("vetorInts t�m tamanho = " + vetorInts.length);
		System.out.println("vetorLongs t�m tamanho = " + vetorLongs.length);
		System.out.println("vetorFloat t�m tamanho = " + vetorFloat.length);
		System.out.println("vetorDoubles t�m tamanho = " + vetorDoubles.length);
		System.out.println("vetorChars t�m tamanho = " + vetorChars.length);
		System.out.println("vetorBooleans t�m tamanho = " + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializados() {

		byte vetorBytes[] = { 3, 6, 4, 5 };
		short vetorShorts[] = { 128, 300, 520 };
		int vetorInts[] = { 1030, 1080 };
		long vetorLongs[] = { 120000, 150000, 500000 };
		float vetorFloat[] = { 10000.50f, 20000.5f, 50240.66f };
		double vetorDoubles[] = { 150000.855d, 260000.73258d };
		char vetorChars[] = { 'a', 'k', 'c', 'g', 't' };
		boolean vetorBooleans[] = { true, false, false, true };

		System.out.println("vetorBytes t�m tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts t�m tamanho = " + vetorShorts.length);
		System.out.println("vetorInts t�m tamanho = " + vetorInts.length);
		System.out.println("vetorLongs t�m tamanho = " + vetorLongs.length);
		System.out.println("vetorFloat t�m tamanho = " + vetorFloat.length);
		System.out.println("vetorDoubles t�m tamanho = " + vetorDoubles.length);
		System.out.println("vetorChars t�m tamanho = " + vetorChars.length);
		System.out.println("vetorBooleans t�m tamanho = " + vetorBooleans.length);

	}

	public static void vetorCom5ParaInicializar() {

		byte vetorBytes[] = new byte[5];
		Scanner input = new Scanner(System.in);

		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println("Inicializando a posi��o " + (contador + 1) + " no �ndice " + contador);
			vetorBytes[contador] = input.nextByte();

		}

	}

	public static void definirTamanhoVetorParaInicializar() {

		Scanner input = new Scanner(System.in);
		byte tamanho;
		byte vetorBytes[];

		System.out.println("Informe o tamanho do vetor:");
		tamanho = input.nextByte();

		vetorBytes = new byte[tamanho];

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println("Informe o valor para o item " + (contador + 1) + " no �ndice [" + contador + "]");
			vetorBytes[contador] = input.nextByte();
		}

	}

	public static void percorrerVetorInicializadoCrescenteDecrescente() {

		byte vetorBytes[] = { 3, 9, 15, 23, 5, 16 };

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println(vetorBytes[contador]);

		}

		System.out.println("------------------------");

		for (byte contador = (byte) (vetorBytes.length - 1); contador >= 0; contador--) {
			// come�ando com o tamanho -1, porque o �ndice sempre tem um valor a menos
			// condi��o de perman�ncia, enquanto meu contador for maior que zero, comece com
			// um valor alto
			// e prettendo para n�o chegar ao zero
			// como uma repeti��o decrescente utilizo o decremento no contador

			System.out.println(vetorBytes[contador]);
		}

	}

	public static void exibirVetorInteiroNaoInicializado() {

		String resposta;
		byte index = 0;
		byte vetorBytes[] = new byte[10];
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Informe o valor para o �ndice [" + index + "]");
			vetorBytes[index] = input.nextByte();

			System.out.println("Gostaria de inicializar outro �ndice?");
			resposta = input.next();

			if (resposta.equalsIgnoreCase("sim")) {

				do {
					System.out.println("Informe um �ndice v�lido entre 0 e " + (vetorBytes.length - 1));
					index = input.nextByte(); // se o usu�rio digitar um valor v�lido esse index ser� usado no meu DO
												// principal onde a l�gica se repete

				} while (index < 0 || index >= vetorBytes.length); // a posi��o escolhida n�o pode ser menos do que zero
																	// nem o tamanho do vetor ou superior
				// exemplo: o range v�lido � de 0(zero)a 9(nove), qualquer n�mero al�m disso
				// fica preso nesse loop
			}

		} while (resposta.equalsIgnoreCase("sim"));

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println("vetorBytes [" + contador + "] = " + vetorBytes[contador]);

		}
	}

	public static String escreverMenu() {

		String menu = "";
		menu += "Menu:\n";
		menu += "0 - Sair\n";
		menu += "1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "2 -Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "3 - Criar 1 vetor de 5 posi��es, para que o usu�rio alimente esses valores\n";
		menu += "4 - Criar um vetor com o tamanho informado pelo usu�rio e depois solicitar que o usu�rio\n";
		menu += "5 - Criar um vetor de inteiros inicializado , para percorrer:\n\tDo inicio ao fim\n\tDo fim ao inicio\n\tPara exibir os valores\n";
		menu += "\"6 - Criar um vetor de inteiros n�o inicializado";

		return menu;

	}
}
