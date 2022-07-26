package br.com.entra21.aulaslogicaprogramacaojava;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private Scanner input = new Scanner(System.in);
	private String title;
	private ArrayList<String> matters;

	public Menu(String title, ArrayList<String> matters) {
		super();
		this.title = title;
		this.matters = matters;

	}

	public void writeAllMenus() {
		
		do {
			
			System.out.println("\n=================> " + this.title +  " <=================");
			System.out.println("\n\t-1 = Sair");
			System.out.println("\t 0 = Voltar ao menu principal");
			
			if(matters != null && !matters.isEmpty()) {
				
				for(byte counter = 0; counter <matters.size(); counter++) {
					System.out.println("\t "  + (counter +1 ) + " = " + matters.get(counter));
				}
				
			}else {
				System.out.println("Opção inválida, tente novamente:");
			}
			
			
		}while(captureOption() != 0);
		
		
	}

	public byte captureOption() {

		byte option;
		option = input.nextByte();

		switch (option) {

		case -1:
			System.out.println("Obrigado por usar o programa \"Aprendendo Lógica de Programação com JAVA\".");
			System.exit(-1);
			break;

		case 0:
			System.out.println("Voltando ao menu principal...");
			break;

		}
		
		return option;
	}

	public String getTitle() {
		return title;
	}
	

}
