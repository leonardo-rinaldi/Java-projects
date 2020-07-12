/*
 *	10- Il vostro paese è in guerra e il nemico usa un codice segreto per comunicare. Siete riusciti a
 *	 	intercettare il seguente messaggio:
 *
 *		:mmZ\xZmx]Zpgy
 *
 *		Ovviamente questo messaggio è criptato tramite il codice segreto del nemico. Avete scoperto che
 *		il metodo di codifica si basa sull'insieme dei caratteri ASCII. I singoli caratteri in una 
 *		stringa sono codificati utilizzando questo insieme. Per esempio il carattere 'A' è codificato 
 *		con il numero 65 e il carattere 'B' con il numero 66. Il codice segreto del nemico prende ciascuna
 *		lettera del messaggio e la codifica in questo modo:
 *
 *		if (carOriginale + chiave > 126)
 *			carCodificato = 32 + ((carOriginale + chiave) - 127)
 *		else
 *			carCodificato = (carOriginale + chiave)
 * 
 * 		Per esempio, se il numero usa la chiave = 10, allora il messaggio "Hey" sarà rappresentato inizialmente come:
 * 
 * 		H --> 72
 * 		e --> 101
 * 		y --> 121
 * 
 * 		Quindi "Hey" sarà codificato così:
 * 
 * 		H codificato (72 + 10) = 82 --> R in ASCII
 * 		e codificato (101 + 10) = 111 --> o in ACII
 * 		y codificato 32 + ((121 + 10) - 127) = 36 --> in ASCII
 * 
 * 		Di conseguenza il messaggio "Hey" sarà trasmesso come "Ro$". Scrivere un programma Java per decifrare il messaggio
 * 		intercettato. La chiave utilizzata è un numero compreso tra 1 e 100. Il programma dovrebbe tentare di decodificare 
 * 		il messaggio utilizzando tutte le possibili chiavi da 1 a 100. Quando verrà trovata la chiave valida, il messaggio
 * 		avrà senso. Tutte le altre chiavi produrranno un messaggio senza significato.
 */

public class Decodifica {

	public static void main(String[] args) {
		
		String messaggio = ":mmZ\\dxZmx]Zpgy";  // :mmZ\\dxZmx]Zpgy --> Attack at dawn! Chiave:88
		int carattereCodificato;
		int carattereOriginale;
		int chiave;
		
		for(chiave = 1; chiave <= 100; chiave++) {
		
			
			for(int i = 0; i < messaggio.length(); i++) {
			
				char carattere = messaggio.charAt(i);	//carattere alla posizione i
			
				carattereCodificato = carattere;	//trovo il numero intero che rappresenta il carattere
			
				if (carattereCodificato - chiave < 32) {
					carattereOriginale =  ((carattereCodificato - chiave) + 127) - 32;
				} else {
					carattereOriginale = carattereCodificato - chiave;
				}
				
				System.out.print( (char)carattereOriginale ); //il numero intero viene trasformato in un carattere ASCII
				
			}
		    System.out.println( " Chiave:" + chiave);
			System.out.println();
		}
		

	}

}
