package br.com.entra21.elseif;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre else if (ou seja renovando o if antes do else)");
		
		float altura = 1.5f;
		double dinheiro = 1600;
		
		if(altura < 1.5) { //� baixinho ?
			System.out.println("� bem baixinho");
		}else if(altura <= 1.9) { //� alto
			System.out.println("� alto");
		}else {
			// mesmo que eu n�o queira fazer nada aqui � uma boa pr�tica ter o else
		}
		
		//se at� 1200, at� 1800, at� 2000, qualquer valor acima
		byte pontos;
		String mensagem;
		if(dinheiro <= 1200) {
			mensagem = "Sal�rio minimo";
			pontos = 5;
		}else if(dinheiro <= 1800) {
			mensagem = "Ta ficando rico";
			pontos = 8;
		}else if(dinheiro <= 2000) {
			mensagem = "Me empresta :) ";
			pontos = 12;
		}else {
			mensagem = "Me contrata vai";
			pontos = 13;
		}
		
		System.out.println(mensagem);
		System.out.println("Sua pontua��o " + pontos);

	}

}
