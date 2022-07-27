package br.com.entra21.aulaslogicaprogramacaojava.prova;

import java.util.ArrayList;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class Provas extends Menu {

	public Provas(String title, ArrayList<String> matters) {
		super(title, matters);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();
		
		switch(option) {
		
		case 1:
			new Prova1();
			break;
			
		case 2:
			new Prova2();
			break;			
		}
		
		return option;
	}

}
