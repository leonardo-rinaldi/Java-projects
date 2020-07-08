import java.util.Scanner;

/*
 * 	15- Si supponga di voler computare la media geometrica di un elenco di valori positivi.
 * 		Per calcolare la media geometrica di k valori, occorre moltiplicarli tra loro e 
 * 		quindi calcolare la radice k-esima del valore. Per esempio, la media geometrica di
 * 		2, 5, 7 è la radice cubica del prodotto dei tre valori. Si usi un ciclo con una
 * 		sentinella per permettere all'utente di inserire un numero arbitrario di valori. 
 * 		Si calcoli e si mostri la media geometrica di tutti i valori esclusa la sentinella.
 * 		Suggerimento: il metodo Math.pow(x, 1.0/k) calcola la k-esima radice di x.
 * 
 */

public class MediaGeometrica {

	public static void main(String[] args) {
		
		Double valoreTotale = 0.0;
		int numeriTotali = 0;
		Double valoreInserito = 0.0;
		Double media;
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci i valori:");
		System.out.println("Alla fine inserisci un numero negativo");	//valore sentinella
		
		while(valoreInserito >= 0) {
		
			valoreInserito = tastiera.nextDouble();
			
			numeriTotali++;
			
			valoreTotale = valoreTotale + valoreInserito;
		}
		
		media = Math.pow(valoreTotale, 1.0/numeriTotali);
		System.out.println("La media è: " + media);
	}

}
