import java.util.Scanner;

/* 
 * 	6- Si supponga di dover definire un programma per determinare i costi del servizio
 *     legati alla riscossione di assegni. Il costo del servizio dipende dall'ammontare
 *     dell'assegno. Se è minore o uguale a 10 Euro, il costo del servizio è di 1 Euro.
 *     Se è maggiore di 10 ma minore o uguale di 100 Euro il costo del servizio è pari
 *     al 10% dell'importo.
 *     Se l'importo è maggiore di 100 Euro ma minore o uguale a 1000 Euro, il costo del
 *     servizio è pari a 5 Euro più il 5% dell'importo. Se il valore dell'importo è 
 *     superiore a 1000 Euro, il costo del servizio è pari a 40 Euro più l' 1% dell'importo.
 *     Scrivere un frammento di codice che permetta di computare questa cifra tramite
 *     un'istruzione if-else multi-ramo.
 * 
 * 
 */

// caso 1:  X <= 10 ----> 1 
// caso 2:  10 < X <= 100 -------> X * 0,10
// caso 3:  100 < X <= 1000 -----> 5 + (X * 0,05)
// caso 4:  X > 1000 ------> 40 + (X * 0,01)

public class CostiServizio {

	public static void main(String[] args) {
		
		double importo;
		double costoServizio;
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Inserisci una cifra in euro per calcolare il costo del servizio:");
		
		importo = numero.nextInt();
		
		if ( importo <= 10 ) {   //caso in cui x <= 10 (caso 1) 
			
			costoServizio = 1;
			System.out.println("Il costo del servizio è: " + costoServizio);
		}
		else
			if ( importo > 10 && importo <= 100 ){  //caso in cui 10 < X <= 100 (caso 2)
				costoServizio =  importo * 0.10 ;
			System.out.println("Il costo del servizio è: " + costoServizio);
		}
			else if ( importo > 100 && importo <= 1000 ) { //caso in cui 100 < x <= 1000 (caso 3)
				costoServizio = 5 + ( importo * 0.05);
				System.out.println("Il costo del servizio è: " + costoServizio);
			}
			else if ( importo > 1000) {			//caso in cui x > 1000 (caso 4)
				costoServizio = 40 + (importo * 0.01);
				System.out.println("Il costo del servizio è: " + costoServizio);
			}
			else {
				System.out.println("Risposta non valida");
			}

	}

}
