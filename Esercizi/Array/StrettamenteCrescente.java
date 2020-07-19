import java.util.Scanner;

/*
 *	5- Scrivere un metodo statico strettamenteCrescente(double[] in) che
 *	   restituisce true se ogni valore dell'array fornito in ingresso è 
 *	   maggiore del valore che lo precede, altrimenti restituisce false.
 * 
 */

public class StrettamenteCrescente {

	public static void main(String[] args) {
		
		double[] valore = {1.0 , 2.4, 3.9, 10.6};
		System.out.println(strettamenteCrescente(valore));
		
	}

	public static boolean strettamenteCrescente(double[] in) {
		
		boolean risultato = false;

		/*
		 * Controllo ad uno a uno i valori per vedere se quello precedente è
		 * inferiore a quello successivo.
		 */
			
			for(int i = 0; i < in.length; i++) {
				
				if(i == 0) {
					
					if(in[i] < in[i+1]) {
						risultato = true;
					} else {
						risultato = false;
						break;
					}
					
				} else
					if( i < in.length) {	//continuo fino a quanto i è minore della dimensione dell'array
						
						if(in[i-1] < in[i]) {
							risultato = true;
						} else {
							risultato = false;
							break;
						}
					}
				
			}
			
		return risultato;
		
	}
}
