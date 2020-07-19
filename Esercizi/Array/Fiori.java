import java.util.Scanner;

/*
 * 	3- Scrivere un programma in una classe ConteggioFiori che calcoli il prezzo di
 * 	   vendita di mazzi di fiori. Ci sono cinque tipi di fiori (petunie, viole del
 * 	   pensiero, rose, violette e garofani) che vengono venduti, rispettivamente, a
 *     € 0.50, € 0.75, € 1.50, € 0.50 e € 0.80 per fiore. Creare un array di stringhe
 *     che memorizzi il nome di questi fiori. Creare un altro array che memorizzi i 
 *     prezzi per ogni tipo di fiore. Il programma dovrebbe leggere il nome del fiore
 *     e la quantità desiderata dal cliente. Localizzare il nome del fiore nell'array 
 *     e utilizzare l'indice per trovare il suo prezzo nell'array dei prezzi. Calcolare
 *     e visualizare il prezzo toale del mazzo di fiori.
 * 
 */

public class Fiori {

	public static void main(String[] args) {
		
		String[] fiore = {"petunie", "viole del pensiero", "rose", "violette", "garofani"};
		double[] costi = {0.50 , 0.75, 1.50, 0.50, 0.80};
		
		int posizione;
		double costoTotale;
		String cercaFiore;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il nome del iore che desideri:");
		String fioreScelto = tastiera.nextLine();
		System.out.println("Inserisci la quantità:");
		double quantità = tastiera.nextDouble();
		
		/*
		 * Trovo il fiore scelto all'interno dell'array.
		 */
		
		for(int i = 0; i < fiore.length; i++) {
			
			if(fiore[i].equalsIgnoreCase(fioreScelto)) {
				cercaFiore = fiore[i];
				posizione = i;
			} else {
				continue;
			}
			
		/*
		 * Sfrutto la posizione i per trovare il costo del fiore
		 * e calcolare il prezzo totale.
		 */
			
		
		costoTotale = costi[posizione] * quantità;
		
		System.out.println("Il costo totale è di " + costoTotale);
		
			
		}
	}
	
	

}
