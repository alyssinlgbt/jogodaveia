package jogodavelha;

public class Tabuleiro {
	int [][]matriz = new int[3][3]; 
	
	public void tabuleiro() {//construtor que inicia o zerando o tabuleiro
	          zeratabuleiro();
	          return;
    }
    
	public void zeratabuleiro() {
		// deixa o tabuleiro limpo para a partida
		for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                matriz[linha][coluna]= 0;
		return;
	}
	
	
	
    public void VerificaLados() {
    	// METODO PARA VERIFICAR LADOS
    
    	if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 3) {
    		System.out.println("x é o vencedor");
    	}
    	if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 3) {
    		System.out.println("x é o vencedor");
    	}
    	if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 3) {
    		System.out.println("x é o vencedor");
    	}
    	if (matriz[0][0] + matriz[0][1] + matriz[0][2] == -3) {
    		System.out.println("O é o vencedor");
    	}
    	if (matriz[0][0] + matriz[0][1] + matriz[0][2] == -3) {
    		System.out.println("O é o vencedor");
    	}
    	if (matriz[0][0] + matriz[0][1] + matriz[0][2] == -3) {
    		System.out.println("O é o vencedor");
    	}
    	return ;}

    public void VerificaRetas() {
    	// METODO PARA VERIFICAR RETAS
    	if (matriz[0][0] + matriz[1][0] + matriz[2][0] == 3) {
    		System.out.println("X é o vencedor");
    	}
    	if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 3) {
    		System.out.println("X é o vencedor");
    	}
    	if (matriz[2][0] + matriz[2][1] + matriz[2][2] == 3) {
    		System.out.println("X é o vencedor");
    	}
    	if (matriz[0][0] + matriz[1][0] + matriz[2][0] == -3) {
    		System.out.println("O é o vencedor");
    	}
    	if (matriz[1][0] + matriz[1][1] + matriz[1][2] == -3) {
    		System.out.println("O é o vencedor");
    	}
    	if (matriz[2][0] + matriz[2][1] + matriz[2][2] == -3) {
    		System.out.println("0 é o vencedor");
    	} 
    	
    	
    	return ;}
    
    public void Verificadiagonal() {
    	// METODO PARA VERIFICAR 
   
    	if (matriz[0][0] + matriz[1][1] + matriz[2][2] == 3) {
    		System.out.println("X é o vencedor");
    	}
    	if (matriz[2][0] + matriz[1][1] + matriz[0][2] == 3) {
    		System.out.println("X é o vencedor");
    	}
    	if (matriz[0][0] + matriz[1][1] + matriz[2][2] == -3) {
    		System.out.println("O é o vencedor");
    	}
    	if (matriz[2][0] + matriz[1][1] + matriz[0][2] == -3) {
    		System.out.println("O é o vencedor");
    	}
    	
    	
    	
    	
    	
    	return ; }
    	
    	
    	public void jogada(int coluna,int linha) {

    		if(coluna == 0 && linha == 0) {
    			this.matriz[0][0] = 1;
    		}
    		if(coluna == 0 && linha == 1) {
    			matriz[0][1] = 1;
    		}
    		if(coluna == 0 && linha == 2) {
    			matriz[0][2] = 1;
    		}
    		if(coluna == 1 && linha == 0) {
    			matriz[1][0] = 1;
    		}
    		if(coluna == 1 && linha == 1) {
    			matriz[1][1] = 1;
    		}
    		if(coluna == 1 && linha == 2) {
    			matriz[1][2] = 1;
    		}
    		if(coluna == 2 && linha == 0) {
    			matriz[2][0] = 1;
    		}
    		if(coluna == 2 && linha == 1) {
    			matriz[2][1] = 1;
    		}
    		if(coluna == 2 && linha == 2) {
    			matriz[2][2] = 1;
    		}
    	return;}
    	
    	public void Mostrar() {
    		//metodo para imprimir tabuleiro
    		
    	  System.out.println(matriz[0][0]);
    	  System.out.println(matriz[0][1]); 
    	  System.out.println(matriz[0][2]);
    	  System.out.println(matriz[1][0]);
    	  System.out.println(matriz[1][1]);
    	  System.out.println(matriz[1][2]);
    	  System.out.println(matriz[2][0]);
    	  System.out.println(matriz[2][1]);
    	  System.out.println(matriz[2][2]);
            
    	 return; }
    	
    








}
	


	
	
	
        
        
        
        
	
	
            
    
            
            
            
            
            
            
            
            
            
            
            
            
        