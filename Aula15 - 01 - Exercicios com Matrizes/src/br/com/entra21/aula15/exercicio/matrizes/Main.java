package br.com.entra21.aula15.exercicio.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {

			System.out.println(escreverMenu());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				criarMatriz2Niveis();
				break;
				
			case 2:
				inicializarMatriz2Niveis();
				break;
				
			case 3:
				criarMatrizes5vetores3posicoes();
				break;
				
			case 4:
				solicitarTamanhoMatrizParaPreencher();
				break;
				
			case 5:
				
				break;
				
			case 6:
				atribuirAleatoriamenteValoresNosDetalhesVetores();
				break;
				
			default:
				System.out.println("Digite uma opção válida");
				break;
			}

		} while (option != 0);
			System.out.println("Encerrando programa exercícios sobre matrizes.");
	}

	public static String escreverMenu() {

		String menu = "Escolha uma das opções:\n\n";
		menu = menu + "\t0 - Sair\n";
		menu += "\t1 - Criar matriz de 2 níveis\n";
		menu += "\t2 - Inicializar matriz de 2 níveis\n";
		menu += "\t3 - Criar matriz de 5 vetores com capacidade de 3 itens em cada\n";
		menu += "\t4 - Criar matriz com vetores e capacidades de cada um definido pelo usuário\n ";
		menu += "\t5 - \n";
		menu += "\t6 - Preencher aleatoriamente valores na matriz\n";
		

		return menu;
	}

	public static void criarMatriz2Niveis() {

		char matrizChars[][] = new char[2][3]; //dois vetores onde cada um pode armazenar 3 letras
		boolean matrizBooleans[][];
		matrizBooleans = new boolean[2][4]; // dois vetores onde cada um pode armazenar 4 valores lógicos
		byte matrizBytes[][] = new byte[4][3];
		short matrizShorts[][] = new short[2][3];
		int matrizInts[][] = new int[3][2];
		long matrizLongs[][] = new long[3][5];
		float matrizFloats[][] = new float[3][4];
		double matrizDoubles[][] = new double[5][3];
		
		System.out.println("matrizChars tamanho =  " + matrizChars.length + " e cada vetor tem tamanho " + matrizChars[0].length);
		System.out.println("matrizBooleans tamanho =  " + matrizBooleans.length + " e cada vetor tem tamanho " + matrizBooleans[0].length);
		System.out.println("matrizBytes tamanho =  " + matrizBytes.length + " e cada vetor tem tamanho " + matrizBytes[0].length);
		System.out.println("matrizShorts tamanho =  " + matrizShorts.length + " e cada vetor tem tamanho " + matrizShorts[0].length);
		System.out.println("matrizInts tamanho =  " + matrizInts.length + " e cada vetor tem tamanho " + matrizInts[0].length);
		System.out.println("matrizLongs tamanho =  " + matrizLongs.length + " e cada vetor tem tamanho " + matrizLongs[0].length);
		System.out.println("matrizFloats tamanho =  " + matrizFloats.length + " e cada vetor tem tamanho " + matrizFloats[0].length);
		System.out.println("matrizDoubles tamanho =  " + matrizDoubles.length + " e cada vetor tem tamanho " + matrizDoubles[0].length);
		
	}
	
	public static void inicializarMatriz2Niveis() {
		
		char matrizChars[][] = { // Quem define o tamanho de cada vetor é a inicialização que pode ser irregular
				{'a','c','r','m'},
				{'r','d','o'},
				{'f','f','c','a'}
		};
		
		boolean matrizBooleans[][] = {  //esse é regular porque todos tem a mesma capacidade de itens por vetor
				{true, false, true, false},
				{true, false, true, false},
				{true, false, true, false} 
		};
		
		byte matrizBytes[][] = {   // Quem define o tamanho de cada vetor é a inicialização que pode ser irregular
				{10,20,30,42,50},
				{15,20,33},
				{12,26},
				{10}
		};
		
		short matrizShorts[][] = {
				{300,450,1000},
				{560,600,700},
				{250,3800,4500}
		};
		
		int matrizInts[][] = {
				{23000,36000},
				{46000,52000},
				{37000,49000}
				
		};
		
		long matrizLongs[][] = {
				{300000,680000,520000},
				{112000, 368222, 123564},
				{789655, 690000, 258000}
				
		};
		
		float matrizFloats[][] = {
				{15000.65f,150000},
				{16800.82f,320000.9f},
				{368000, 850230.64f}
				
		};
		
		double matrizDoubles[][] = {
				{150000.45d, 236.50d},
				{850000.98d, 123456.789d},
				{658900.333d, 333333.3333d}
				
		};
		
		System.out.println("matrizChars tamanho =  " + matrizChars.length + " e cada vetor tem tamanho " + matrizChars[0].length);
		System.out.println("matrizBooleans tamanho =  " + matrizBooleans.length + " e cada vetor tem tamanho " + matrizBooleans[0].length);
		System.out.println("matrizBytes tamanho =  " + matrizBytes.length + " e cada vetor tem tamanho " + matrizBytes[0].length);
		System.out.println("matrizShorts tamanho =  " + matrizShorts.length + " e cada vetor tem tamanho " + matrizShorts[0].length);
		System.out.println("matrizInts tamanho =  " + matrizInts.length + " e cada vetor tem tamanho " + matrizInts[0].length);
		System.out.println("matrizLongs tamanho =  " + matrizLongs.length + " e cada vetor tem tamanho " + matrizLongs[0].length);
		System.out.println("matrizFloats tamanho =  " + matrizFloats.length + " e cada vetor tem tamanho " + matrizFloats[0].length);
		System.out.println("matrizDoubles tamanho =  " + matrizDoubles.length + " e cada vetor tem tamanho " + matrizDoubles[0].length);
		
	}

	public static void criarMatrizes5vetores3posicoes() {
		
		byte matrizBytes[][] = new byte[5][3];
		System.out.println("Para o primeiro vetor, informe o primeiro valor ");
		matrizBytes[0][0] = input.nextByte();
		
		System.out.println("Para o primeiro vetor, informe o segundo valor ");
		matrizBytes[0][1] = input.nextByte();
		
		System.out.println("Para o primeiro vetor, informe o terceiro valor ");
		matrizBytes[0][2] = input.nextByte();
		
		//----------------------------------------------------------------------
		
		System.out.println("Para o segundo vetor, informe o primeiro valor ");
		matrizBytes[1][0] = input.nextByte();
		
		System.out.println("Para o segundo vetor, informe o segundo valor ");
		matrizBytes[1][1] = input.nextByte();
		
		System.out.println("Para o segundo vetor, informe o terceiro valor ");
		matrizBytes[1][2] = input.nextByte();
		
		for(byte vetor = 2; vetor < matrizBytes.length ; vetor++) {  //[2][3][4] continuando a minha captura com for
			
			for(byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {
				
				System.out.println("Para o " + (vetor+1) + "º vetor informe o " + (detalhe+1) + ("º valor."));
				matrizBytes[vetor][detalhe] = input.nextByte();
				
			}
			
			
		}
		
		
		
	}

	public static void solicitarTamanhoMatrizParaPreencher() {
       
        byte tamanhoVetor, tamanhoDetalhe;
        byte matrizBytes [][];
       
        System.out.println("Quantos vetores vc quer na sua matriz: ");
        tamanhoVetor = input.nextByte();
        System.out.println("Quantos itens vc quer em cada vetor: ");
        tamanhoDetalhe= input.nextByte();
       
        matrizBytes = new byte [tamanhoVetor][tamanhoDetalhe];
       
        for(byte vetor =0; vetor< matrizBytes.length; vetor++) {
           
            for(byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {
               
                System.out.println("Para o indice [" +vetor+ "] detalhe [" +detalhe+ "] informe o valor ");
                matrizBytes[vetor][detalhe]= input.nextByte();
            }
        }
       
        for(byte vetor =0; vetor< matrizBytes.length; vetor++) {
           
            for(byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {
               
                System.out.println("Matriz bytes [" +vetor+ "] detalhe [" +detalhe+ "] ==> " + matrizBytes[vetor][detalhe]);
               
            }
        }
       
    }
		
	public static void ex5() { //fazer depois
		
	}
	
	public static void atribuirAleatoriamenteValoresNosDetalhesVetores() {
		
		byte matrizBytes[][] = new byte[20][33];
		byte vetor = 0, detalhe = 0;
		String resposta;
		
		do {
			
			System.out.println("Para o vetor " + vetor + " e detalhe " + detalhe + " informe o valor");			
			matrizBytes[vetor][detalhe] = input.nextByte();
			
			System.out.println("Gostaria de inicializar outro valor?");
			resposta = input.next();
			
			if(resposta.equalsIgnoreCase("sim")) {
				
				System.out.println("Qual vetor você quer acessar?");
				vetor = input.nextByte();
				
				System.out.println("Qual detalhe desse vetor você quer atualizar o valor?");
				detalhe = input.nextByte();
				
			}
			
		}while(resposta.equalsIgnoreCase("sim"));
		
		
	}
	
	}

