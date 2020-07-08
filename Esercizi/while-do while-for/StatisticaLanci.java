import java.util.Scanner;

/*
 * 	10- Si scriva un programma che computi la statistica per otto lanci di una moneta. Per ciascuno
 * 		dei lanci effetuati, l'utente scrive t se è uscito testa e c se è uscito croce. Il programma
 * 		mostrerà il numero totale e la percentuale di teste e croci. Si usi l'operatore di incremento
 * 		per contare ciascuna t e c inserita.
 */

public class StatisticaLanci {

	public static void main(String[] args) {
		
		double testa = 0;
		double croce = 0;
		int lanci = 0;
		String risultatoLancio;
		double percentualeTesta;
		double percentualeCroce;
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Per ciascun lancio della moneta inserisci t se è uscito testa");
		System.out.println("e c se è uscito croce.");
		
		
		do {
			
			System.out.print("Lancio " + lanci +": ");
			
			risultatoLancio = tastiera.next();
			
			if(risultatoLancio.equalsIgnoreCase("t")) {
				testa++;
				lanci++;
				
			} else
				if(risultatoLancio.equalsIgnoreCase("c")) {
					croce++;
					lanci++;
				}
			
		} while(lanci < 8);
			
		System.out.println("Numero teste: " + testa);
		System.out.println("Numero croci: " + croce);
		
		percentualeTesta = (testa / 8) * 100;
		percentualeCroce = (croce / 8) * 100;
		
		System.out.println("Percentuali di teste: " + percentualeTesta);
		System.out.println("Percentuali di croce: " + percentualeCroce);
		
	}

}
