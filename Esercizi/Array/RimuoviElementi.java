/*
 *	7-	Scrivere un metodo rimuovi(int v, int[] in) che restituisce un nuovo array
 *		con gli interi presenti nell'array passato come argomento, ma con il valore
 *		v rimosso. Per esempio, se v è 3 e in contiene 0, 1, 3, 2, 3, 0, 3, 1, il
 *		metodo restituirà un array contenente 0, 1, 2, 0, 1. 
 *
 * 
 */

public class RimuoviElementi {

	public static void main(String[] args) {
		
		int[] in = {0, 1, 3, 2, 3, 0, 3, 1};
		
		int v = 3;
		
		System.out.println("L'array ottenuto togliendo il valore " + v + " è:");
		
		int[] arrayOttenuto = rimuovi(v, in);
		
		for(int i = 0; i < arrayOttenuto.length; i++) {
			System.out.print(arrayOttenuto[i] + " ");
		}
		
	}
	
	public static int[] rimuovi(int v, int[] in) {
		
		int conteggioValori = 0;
		
		/*
		 * Conto quanti valori saranno inseriti nel nuovo array, quindi quale sarà
		 * la sua dimensione.
		 */
		
		for(int i = 0; i < in.length; i++) {
			
			if(in[i] != v) {
				conteggioValori++;
			}
		}
		
		int[] valore = new int[conteggioValori];
		int z = 0;
		
		/*
		 * Riempio il nuovo array con i valori dell'array precedente, escluso 
		 * il valore v
		 */
		
		for(int i = 0; i < in.length; i++) {
			
			for(int j = z; j < valore.length; j++) {
						
				if(in[i] != v) {
					valore[j] = in[i];
				}					
			}
            
			if(in[i] != v) {		//incrementa z se il valore alla posizione i è diverso dal valore v
				z++;
			}	
		}
		return valore;
	}

}
