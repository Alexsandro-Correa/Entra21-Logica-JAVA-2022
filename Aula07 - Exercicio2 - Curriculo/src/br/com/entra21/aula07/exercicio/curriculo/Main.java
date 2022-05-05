package br.com.entra21.aula07.exercicio.curriculo;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		/* Fa�a um programa que
		   Escreva as informa��es de um curriculum
		   Cada etapa deve ter sua fun��o separada*/
		
		
		String curriculo,nome,email,idade,cidade, contato,competencias,experiencia,formacao,estado;
		curriculo = "Curr�culo";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo ");
		nome = entrada.nextLine();
		
		System.out.println("Digite sua idade ");
		idade = entrada.nextLine();
		
		System.out.println("Digite seu e-mail ");
		email = entrada.nextLine();
		
		System.out.println("Digite sua cidade ");
		cidade = entrada.nextLine();
		
		System.out.println("Digite seu estado ");
		estado = entrada.nextLine();
		
		System.out.println("Digite seu telefone ");
		contato = entrada.nextLine();
		
		System.out.println("Digite suas compet�ncias ");
		competencias = entrada.nextLine();
		
		System.out.println("Digite suas experi�ncias ");
		experiencia = entrada.nextLine();
		
		System.out.println("Digite sua forma��o ");
		formacao = entrada.nextLine();
		
		
		System.out.println("\nCurriculum Vitae");
		
		dadoNome(nome);
		
		dadoIdade(idade);
		
		dadoLocal(cidade,estado);
		
		dadoContato(contato);
		
		dadoEmail(email);
		
		dadoCompetencias(competencias);
		
		dadoExperiencia(experiencia);
		
		dadoFormacao(formacao);
		
		
		
	
		

	}
	
	
	public static void dadoNome(String nome) {
		
		System.out.println("\n\n\n" + nome);
		return;
	}
	public static void dadoIdade(String idade) {
		
		System.out.println("Idade: "+idade +" anos.");
		
		return;
	}
	public static void dadoEmail(String email) {
		
		System.out.println("E-mail para contato: " + email + "\n");
		
		return;
	}
	public static void dadoLocal(String cidade, String estado) {
		
		System.out.println(cidade + "," + estado);
		
		return;
	}
	public static void dadoContato(String contato) {
		
		System.out.println("Telefone: " + contato);
		return;
	}
	public static void dadoCompetencias(String competencias) {
		
		System.out.println("Compet�ncias:");
		System.out.println("\n" + competencias);
		
		return;
	}
	public static void dadoExperiencia(String experiencia) {
		
		System.out.println("\nExperi�ncias: ");
		System.out.println("\n" + experiencia);
		
		return;
	}
	public static void dadoFormacao(String formacao) {
		
		System.out.println("\nForma��o:");
		System.out.println("\n" + formacao);
		return;
		}
}

