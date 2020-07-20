import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 	13- Scrivere  un metodo statico cercaFigura(figura, soglia) dove figura è un array 
 * 		bidimensionale di valori double. Il metodo dovrebbe restituire un nuovo array
 * 		bidimensionale i cui elementi sono o 0.0 o 1.0. Il valore 1.0 indica che il 
 * 		valore corrispondente nell'array figura eccede soglia volte la media di tutti 
 * 		i valori in figura. Gli altri elementi sono 0.0. Per esempio, se i valori in 
 * 		figura sono:
 * 
 * 		1.2	 1.3  4.5  6.0	 2.7
 * 		1.7	 3.3  4.4  10.5  17.0
 * 		1.1	 4.5  2.1  25.3  9.2
 * 		1.0	 9.5  8.3  2.9	 2.1
 * 
 * 		il valore medio è 5.93. L'array risultante per una soglia pari a 1.4 dovrebbe
 * 		essere il seguente:
 * 
 * 		0.0	 0.0  0.0  0.0	0.0
 * 		0.0	 0.0  0.0  1.0  1.0
 * 		0.0  1.0  0.0  1.0  1.0
 * 		0.0  1.0  0.0  0.0  0.0
 * 
 * 		L'array risultante per una soglia pari a 0.6 dovrebbe essere il seguente:
 * 
 * 		0.0  0.0  1.0  1.0  0.0
 * 		0.0  0.0  1.0  1.0  1.0
 *      0.0  1.0  0.0  1.0  1.0
 *      0.0  1.0  1.0  0.0  0.0
 *      
 *      Valori in input:
 *      
 *      1,2
 *		1,3
 *		4,5
 *		6,0
 *		2,7
 *		1,7
 *		3,3
 *		4,4
 *		10,5
 *		17,0
 *		1,1
 *		4,5
 *		2,1
 *		25,3
 *		9,2
 *		1,0
 *		9,5
 *		8,3
 *		2,9
 *		2,1
 * 
 */

public class FiguraSoglia {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		double[][] array = new double[4][5];
		
		System.out.println("Inserisci dei valori per riempire la matrice / array");
		
		for(int riga = 0; riga < 4; riga++) {
			for(int colonna = 0; colonna < 5; colonna++) {;
				array[riga][colonna] = tastiera.nextDouble(); 
			}
		}
		cercaFigura(array, 1.4);
		
        /*
        *   Stampo il nuovo array
        */
        
		for(int riga = 0; riga < 4; riga++) {
			for(int colonna = 0; colonna < 5; colonna++) {;
				System.out.print(array[riga][colonna] + " ");
			}
			System.out.println();
		}
	
	}
	
	public static double[][] cercaFigura(double figura[][], double soglia) {
		
		int numeroElementi = 0;
		double somma = 0;
		double valoreMedio;
		
		double[][] nuovoArray = new double[4][5];
		
		/*
		 * Trovo la media e il numero di elementi
		 */
		
		for(int riga = 0; riga < 4; riga++) {
			for(int colonna = 0; colonna < 5; colonna++) {;
				
				somma = somma + figura[riga][colonna];
				numeroElementi++;
			}
		}
		valoreMedio = somma / numeroElementi;
		
		/*
		 * Genero la nuova matrice
		 */
	
		for(int riga = 0; riga < 4; riga++) {
			for(int colonna = 0; colonna < 5; colonna++) {;
				
				if(figura[riga][colonna] / valoreMedio  > soglia) { 
					figura[riga][colonna] = 1.0; 
				} else {
					figura[riga][colonna] = 0.0;
				}
			}
		}
		return figura;
	}
}
