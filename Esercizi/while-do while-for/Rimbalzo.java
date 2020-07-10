import java.util.Scanner;

/*
 * 	6- Si scriva un programma che simuli una palla che rimbalza calcolando la sua altezza
 * 	   da terra in cm per ogni secondo a mano a mano che il tempo passa su un orologio simulato.
 * 	   Al tempo zero la pall comincia ad altezza zero e ha una velocità iniziale data dall'utente
 * 	   (una velocità iniziale di 300 cm al secondo è una buona scelta). Dopo ogni secondo si cambi
 * 	   l'altezza aggiungendo la velocità corrente; quindi si sottragga 96 dalla velocità. Se la nuova 
 * 	   altezza è inferiore a 0, si moltiplichi altezza e velocità per -0.5 per simulare il rimbalzo. Ci
 * 	   si fermi al quinto rimbalzo. L'output del programma deve avere il formato seguente:
 * 
 * 	   Inserisci la velocità iniziale dela palla: 300
 * 	   
 *     Tempo: 0 Altezza: 0.0
 * 	   Tempo: 1 Altezza: 300.0
 *     Tempo: 2 Altezza: 504.0
 *     Tempo: 3 Altezza: 612.0
 *     Tempo: 4 Altezza: 624.0
 *     Tempo: 5 Altezza: 540.0
 *     Tempo: 6 Altezza: 360.0
 *     Tempo: 7 Altezza: 84.0
 *     Rimbalzo!
 *     Tempo: 0 Altezza: 144.0
 */

public class Rimbalzo {

	public static void main(String[] args) {
		
		double velocitàIniziale;
		double altezza = 0;
		int rimbalzo = 0;
		int tempo = 0;
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci la velocità iniziale della palla:");
		velocitàIniziale = tastiera.nextDouble();
		
		double velocità = velocitàIniziale;
		
		while(rimbalzo < 5) {
			
			if (altezza < 0) {
				System.out.println("Rimbalzo!");
				altezza = altezza * (-0.5);
				velocità = velocità * (-0.5);
				rimbalzo++;
			} else {
				System.out.println("tempo: " + tempo + " Altezza: " + altezza);
				tempo++;
				
				altezza = altezza + velocità;
				velocità = velocità - 96;
			}
			
		}
	}

}
