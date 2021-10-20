package jogodavelha;

import java.util.Scanner;

public class Jogador {
	Tabuleiro matriz = new Tabuleiro();
	
	Scanner entrada = new Scanner(System.in);

	public void aplicaoDaPlay() {
	
		
		
		System.out.println("escolha entre a coluna 0, 1 ou 2");
		int coluna = entrada.nextInt();
		
		System.out.println("escolha entre a linha 0, 1 ou 2");
		
		int linha = entrada.nextInt();
	
		matriz.jogada(coluna, linha);
	
	
	
	
	 return ;
	
	
	
	
	
	}
		
		}
	
	
	
	
	
	
		
	
	
	
	
	
	
	

