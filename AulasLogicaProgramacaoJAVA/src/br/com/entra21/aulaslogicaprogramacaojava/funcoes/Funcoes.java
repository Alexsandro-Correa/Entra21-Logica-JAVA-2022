package br.com.entra21.aulaslogicaprogramacaojava.funcoes;

import java.util.ArrayList;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class Funcoes extends Menu {

	public Funcoes(String title, ArrayList<String> matters) {
		super(title, matters);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();

		switch (option) {

		case 1:
			new AprenderFuncoes();
			break;

		}

		return option;
	}

}
