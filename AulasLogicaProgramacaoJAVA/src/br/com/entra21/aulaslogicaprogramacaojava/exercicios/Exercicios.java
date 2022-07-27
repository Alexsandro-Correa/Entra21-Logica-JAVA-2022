package br.com.entra21.aulaslogicaprogramacaojava.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class Exercicios extends Menu {

	static Scanner entrada = new Scanner(System.in);

	public Exercicios(String title, ArrayList<String> matters) {
		super(title, matters);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();

		switch (option) {

		case 1:
			new ExercicioAreaPerimetro();
			break;

		case 2:
			new ExercicioCalculadora();
			break;

		case 3:
			new ExercicioCalculoIMC();
			break;

		case 4:
			new ExercicioConversaoTemperatura();
			break;

		case 5:
			new ExercicioMediaAritmetica();
			break;

		case 6:
			new ExercicioPrecoCusto();
			break;

		case 7:
			new ExercicioOperadorIgualdade();
			break;

		case 8:
			new ExercicioOperadorLogico();
			break;

		case 9:
			new ExercicioOperadorRelacional();
			break;

		case 10:
			new ExercicioIfElse();
			break;

		case 11:
			new ExercicioRevisaoIf();
			break;

		case 12:
			new ExercicioRevisaoSwitchCase();
			break;
			
		case 13:
			new ExercicioCalculadora2();
			break;
			
		case 14:
			new ExercicioCurriculo();
			break;
			
		case 15:
			new ExercicioFixacaoRepeticao();
			break;
			
		case 16:
			new ExercicioVetores();
			break;
			
		case 17:
			new ExercicioMatrizes();
			break;

		default:
			System.out.println("Opção inválida");
			break;

		}

		return option;
	}

}