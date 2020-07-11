/*
 *	9- Holy digits Batman! L'Enigmista sta pianificando un nuovo crimine da qualche parte
 *	   sulla Pennsylvania Avenue. Come al solito, ha lasciato l'indirizzo sotto forma di enigma.
 *	   Il numero civico della Pensylvania Avenue è formato da 4 cifre che soddisfano le seguenti
 *	   condizioni:
 *
 *	   - le 4 cifre sono differenti;
 *	   - la cifra delle migliaia è tre volte quella delle decine;
 *	   - il numero è dispari
 *	   - la somma delle 4 cifre è 27
 *
 *	   Scrivere un programma che usa uno o più cicli per trovare il numero civico della Pennsylvania
 *	   Avenue in cui l'Enigmista ha previsto di colpire.
 * 
 */

public class Enigmista {

	public static void main(String[] args) {
		
		int cifraMigliaia = 0;
		int cifraCentinaia = 0;
		int cifraDecine = 0;
		int cifraUnità = 0;
		
		String numeroOttenutoStringa;
		int numeroOttenutoIntero;
		int sommaTotale;
		
		do {
			
			sommaTotale = 0;
			numeroOttenutoIntero = 0;
			numeroOttenutoStringa = "";
			
			 do {
				
				cifraMigliaia = (int) (Math.random() * 9) + 1;
				cifraCentinaia = (int) (Math.random() * 9) + 1;
				cifraDecine = (int) (Math.random() * 9) + 1;
				cifraUnità = (int) (Math.random() * 9) + 1;
				
			 } while(cifraMigliaia == cifraCentinaia || cifraCentinaia == cifraDecine || cifraDecine == cifraUnità || cifraMigliaia == cifraUnità || cifraDecine == cifraMigliaia || cifraUnità == cifraCentinaia);
			
			System.out.println(cifraMigliaia + " " + cifraCentinaia + " " + cifraDecine + " " + cifraUnità);
			
			numeroOttenutoStringa = String.valueOf(cifraMigliaia) + String.valueOf(cifraCentinaia) + String.valueOf(cifraDecine) + String.valueOf(cifraUnità); //converto in stringa per comporre il numero
			numeroOttenutoIntero = Integer.parseInt(numeroOttenutoStringa);		//converto in intero per vedere poi se è dispari
			sommaTotale = cifraMigliaia + cifraCentinaia + cifraDecine + cifraUnità;
			
		} while(sommaTotale != 27 || numeroOttenutoIntero % 2 == 0 || cifraMigliaia != cifraDecine * 3); 

		System.out.println(numeroOttenutoStringa);
		System.out.println(numeroOttenutoIntero);
	}

}
