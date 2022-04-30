package br.com.entra21.elseif;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre else if (ou seja renovando o if antes do else)");
		
		float altura = 1.5f;
		double dinheiro = 1600;
		
		if(altura < 1.5) { //é baixinho ?
			System.out.println("É bem baixinho");
		}else if(altura <= 1.9) { //é alto
			System.out.println("É alto");
		}else {
			// mesmo que eu não queira fazer nada aqui é uma boa prática ter o else
		}
		
		//se até 1200, até 1800, até 2000, qualquer valor acima
		byte pontos;
		String mensagem;
		if(dinheiro <= 1200) {
			mensagem = "Salário minimo";
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
		System.out.println("Sua pontuação " + pontos);

	}

}
