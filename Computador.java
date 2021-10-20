package jogodavelha;

public class Computador {

	Tabuleiro matriz = new Tabuleiro();
	
	
	public void pcnivel1() {
	 while(true) {
		if(matriz.matriz[0][0] == 0) {
			matriz.matriz[0][0] = -1;
			break;
		}
		if(matriz.matriz[0][1] == 0) {
			matriz.matriz[0][1] = -1;
			break;
		}
		if(matriz.matriz[0][2] == 0) {
			matriz.matriz[0][2] = -1;
			break;
		}
		if(matriz.matriz[1][0] == 0) {
			matriz.matriz[1][0] = -1;
			break;
		}
		if(matriz.matriz[1][1] == 0) {
			matriz.matriz[1][1] = -1;
			break;
		}
		if(matriz.matriz[1][2] == 0) {
			matriz.matriz[1][2] = -1;
			break;
		}
		if(matriz.matriz[2][0] == 0) {
			matriz.matriz[2][0] = -1;
			break;
		}
		if(matriz.matriz[2][1] == 0) {
			matriz.matriz[2][1] = -1;
			break;
		}
		if(matriz.matriz[2][2] == 0) {
			matriz.matriz[2][2] = -1;
			break;
		}
	
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
