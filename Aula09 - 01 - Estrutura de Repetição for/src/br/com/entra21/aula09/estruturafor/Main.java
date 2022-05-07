package br.com.entra21.aula09.estruturafor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre la�os de repeti��o - for: ");

		
		String opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sobre o for escolha uma op��o para aprender mais:");
		System.out.println("1 - for simples");
		System.out.println("2 - for dentro de for:");
		System.out
				.println("3 - Solicite ao usu�rio uma quantidade limite e exiba em tela a repeti��o de 1 at� o limite");
		System.out.println("4 - Solicite ao usu�rio um valor numero para exibir a contagem regressiva at� o zero");
		System.out.println("5 - Retorne a tabuada do numero escolhido");
		System.out.println("6 - Retornar todas as tabuadas de 1 at� a tabuada do numero informado pelo usu�rio");
		opcao = entrada.nextLine();

		switch (opcao.toLowerCase()) {
		case "1", "for simples":
			// fun��o aula simples
			aulaForSimples(); // fun��o do tipo procedimento n�o tem argumento nem retorno
			break;

		case "2":
			// olha veio por n�mero
		case "for dentro de for":
			// fun��o aula complexa
			aulaForDentroDeFor();
			break;
		case "3":
			exercicioForLimite();
			break;
		case "4":
			contagemRegressiva();
			break;
		case "5":
			exercicioTabuada();
			break;
		case "6":
			exibirTodasTabuadas();
			break;
		}

	}

	public static void aulaForSimples() {

		System.out.println("Aprendendo sobre FOR da maneira simples");
		System.out.println("Repeti��o simples de forma linear de 1 em 1");
		for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {

			System.out.println("Repetindo " + contador1);
		}

		System.out.println("------------------");

		System.out.println("O incremento ou decremento n�o precisa ser de 1 em 1");
		for (int contador = 1; contador <= 10; contador += 2) {

			System.out.println("Repetindo " + contador);
			// System.out.println(contador1);
			// N�o � poss�vel usar a vari�vel contador1 pois ela s�
			// existe no outro escopo do for.
		}

		System.out.println("------------------");

		for (int contador = 4; contador <= 10; contador += 2) {

			System.out.println("Repetindo = " + contador);
		}

		System.out.println("------------------");

		System.out.println("Tamb�m � poss�vel fazer de forma regressiva");
		for (int contador = 10; contador >= 1; contador -= 1) {

			System.out.println("Repetindo contador = " + contador);

		}

		int numero = 5;
		int contador;

		System.out.println("-------------------------");

		System.out.println("Fazer coisas legais que eu n�o sabia quando colava na tabuada");
		for (contador = 1; contador <= 10; contador++) {

			System.out.println("Tabuada " + contador + " x " + numero + " = " + (numero * contador));

		}

		System.out.println("Olha como o contador ficou " + contador);

	}

	public static void aulaForDentroDeFor() {

		System.out.println("Aprendendo sobre FOR da maneira mais complexa");

		byte nivelMaior = 2, nivelDetalhe = 3;

		for (int contador = 1; contador <= nivelMaior; contador++) {

			// No primeiro for devo repetir at� a quantidade e nesse caso seria 2x

			System.out.println("Para o n�vel maior repetindo pela " + contador + "� vez:");

			// por�m aqui dentro tem outro for
			for (int contadorInterno = 1; contadorInterno <= nivelDetalhe; contadorInterno++) {
				// No for interno vou repetir 3x
				System.out.println("\tPara o n�vel detalhe repetindo pela " + contadorInterno + "� vez.");
				// Minha repeti��o interna termina aqui
			}

			// Vou ter que esperar esse for interno acabar para dar volta no meu for
			// principal
			// At� aqui primeiro for

		}
	}

	public static void exercicioForLimite() {

		byte limite;
		Scanner entrada = new Scanner(System.in);

		System.out.println("At� qual n�mero voc� quer contar?");
		limite = entrada.nextByte();

		for (int contador = 1; contador <= limite; contador++) {

			System.out.println("Sua contagem: " + contador);
		}
	}

	public static void contagemRegressiva() {

		byte numero;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um n�mero:");
		numero = entrada.nextByte();

		for (int contador = numero; contador > 0; contador--) {
			System.out.println("Contagem regressiva " + contador);
		}
	}

	public static void exercicioTabuada() {
		Scanner entrada = new Scanner (System.in);
		int numero ;
		System.out.println("Informe qual tabuada voc� quer saber:");
		numero = entrada.nextInt();
		
		for(int contador = 1; contador <= 10; contador++) {
			
			System.out.println(numero +" x " + contador + " = " + (numero*contador));
			
		}
	}

	public static void exibirTodasTabuadas() {
		
		for(int numero = 1; numero <= 10; numero++) {
			
			System.out.println("Quero ver a tabuada do " + numero);
			
			for(int contador = 1; contador <= 10; contador++) {
				System.out.println(numero + " x " + contador + " = " + (numero*contador));
			}
		}
		
		
	}
}
