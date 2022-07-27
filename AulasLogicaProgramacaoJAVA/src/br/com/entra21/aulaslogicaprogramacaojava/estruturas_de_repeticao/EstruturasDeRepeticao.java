package br.com.entra21.aulaslogicaprogramacaojava.estruturas_de_repeticao;

import java.util.ArrayList;

import br.com.entra21.aulaslogicaprogramacaojava.Menu;

public class EstruturasDeRepeticao extends Menu {

	public EstruturasDeRepeticao(String title, ArrayList<String> matters) {
		super(title, matters);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();
		
		switch(option) {
		
		case 1:
			new AprenderFor();
			break;
		
		case 2:
			new AprenderWhileDoWhile();
			break;
		}
		
		return option;
	}

}
