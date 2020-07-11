import java.util.Scanner;

/* 
 * 	8- Si supponga di comprare barette di cioccolato da una rivenditrice automatica per 1 euro
 *     l'una. All'interno di ogni barretta c'è un buono. Con sei buoni si ha diritto a una barretta
 *     gratis. Quindi, dopo aver iniziato a comprare barrette, si hanno sempre dei buoni avanzati. Si
 *     vuole determinare quante barrette si possono avere se si parte con N euro. Per esempio, con 6 euro 
 *     si possono ottenere 7 barrette, comprandone 6 (ottenedo così 6 buoni) e scambiando i 6 buoni con
 *     un ulteriore barretta. Alla fine, avanzerebbe il singolo buono contenuto nella settima baretta.
 *     Partendo con 11 Euro, si potrebbero ottenere 13 barrette avanzando ancora un buono. Con 12 Euro
 *     si potrebbero ottenere 14 barrette rimanendo con due buoni avanzati.
 *     
 *     Scrivere un programma che riceva in ingresso un valore per N e stampi quante barrette si possono
 *     magiare e quanti buoni avanzano alla fine. Si utilizzi un ciclo che continua a scambiare buoni 
 *     con barrette ogni volta che ce ne sono abbastanza per almeno una barreta.
 * 
 */

public class rivenditiceAutomatica {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		 int barette = 0; 
		 int buoni = 0;
		 
		 System.out.println("Benvenuto, ogni barrettea costa 1 euro.");
		 System.out.println("Ogni baretta contiene un buono, con sei buoni hai dirirtto ad una baretta gratis.");
		 System.out.println("Inserisci Euro");
		 int euroInseriti = tastiera.nextInt();
		 
		 for(int i = 0; i < euroInseriti; i++) {
			 
			 barette++;
			 
			 if(barette % 6 == 0) {
				 buoni++;
				 barette++;
			 }
		 }
		 
		 System.out.println("Il numero di buoni disponibili sono " + buoni);
		 System.out.println("Hai acquistato: " + barette + " barette di cioccolato.");

	}

}
