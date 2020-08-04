import java.util.Scanner;

/*
 * 	3- Si crei una classe che rappresenta la distribuzione di voti per un dato corso.
 * 	   Si scrivano i metodi per effettuare le seguenti attività.
 * 
 * 	   - Assegnare il numero di studenti che hanno preso un certo voto (per ognuno dei
 * 		 voti A, B, C, D, F).
 * 	   - Legge il numero di studenti che hanno preso un certo voto (per ognuno dei voti
 * 		 A, B, C, D, F).
 * 	   - Restituisce il numero totale di voti.
 * 	   - Restituisce la percentuale di voti per ciascuna lettera come un intero compreso
 * 		 tra 0 e 100.
 * 
 * 	   Il grafico avrà cinque varre. Ciascuna barra può essere una riga orizzontale di 
 * 	   asterischi: il numero di asterischi di una riga sarà proporzionale lla percentuale
 * 	   per ciascuna categoria. Se si fa in modo che un asterisco rappresenti il 2% allora 
 * 	   50 asterischi rappresentano il 100%. Si gradui l'asse orizzontale al 10 per cento 
 * 	   da 0 a 100 e si etichetti ciascuna riga con il nome della lettera corrispondente.
 * 
 * 	   Per esempio, se i punteggi sono 1A, 4B, 6C, 2D, 1F, il numero totale di punteggi
 * 	   è 14, la percentuale di A è 7, di b è 29, di C è 43, di D è 14 e di F è 7. La riga
 * 	   A conterrà 3 asterischi (7% di 50), la riga B 14, la C 21, la D 7 e la riga F ne 
 * 	   conterrà 4.
 * 	   Il gafico sarà simile al seguente:
 * 
 * 	   0  10  20  30  40  50  60  70  80  90  100%
 * 	   |   |   |   |   |   |   |   |   |   |   |
 * 	   *****************************************
 * 
 * 	   *** A
 * 	   ************** B
 * 	   ********************* C
 * 	   *******	D
 *     *** F
 * 
 */

public class DistribuzioneVoti {

	private int votoA;
	private int votoB;
	private int votoC;
	private int votoD;
	private int votoF;
	
	public void assegnaVoto() {
		Scanner tastiera = new Scanner(System.in);
		String votoInserito;
		String risposta;
		
		System.out.println("Inserisci il numero di studenti che ha preso A");
		votoA = tastiera.nextInt();
		System.out.println("Inserisci il numero di studenti che ha preso B");
		votoB = tastiera.nextInt();
		System.out.println("Inserisci il numero di studenti che ha preso C");
		votoC = tastiera.nextInt();
		System.out.println("Inserisci il numero di studenti che ha preso D");
		votoD = tastiera.nextInt();
		System.out.println("Inserisci il numero di studenti che ha preso F");
		votoF = tastiera.nextInt();
	}
	
	public int totaleVoti() {
		return votoA + votoB + votoC + votoD + votoF;
	}
	
	public void percentualeVoti() {
		int totale = totaleVoti();
		
		votoA = (votoA * 100) / totale;
		votoB = (votoB * 100) / totale;
		votoC = (votoC * 100) / totale;
		votoD = (votoD * 100) / totale;
		votoF = (votoF * 100) / totale;
	}
	
	public void asseGraduato() {
		System.out.println("0  10  20  30  40  50  60  70  80  90  100%");
		System.out.println("|   |   |   |   |   |   |   |   |   |    |");
		System.out.println("******************************************");
	}
	
	public void generaGrafico() {
		int asterischi = (votoA * 50) / 100;
		
		for(int i = 0; i < asterischi; i++) {
			System.out.print("*");
		}
		System.out.print(" A");
		System.out.println();
		
		asterischi = (votoB * 50) / 100;
		for(int i = 0; i < asterischi; i++) {
			System.out.print("*");
		}
		System.out.print(" B");
		System.out.println();
		
		asterischi = (votoC * 50) / 100;
		for(int i = 0; i < asterischi; i++) {
			System.out.print("*");
		}
		System.out.print(" C");
		System.out.println();
		
		asterischi = (votoD * 50) / 100;
		for(int i = 0; i < asterischi; i++) {
			System.out.print("*");
		}
		System.out.print(" D");
		System.out.println();
		
		asterischi = (votoF * 50) / 100;
		for(int i = 0; i < asterischi; i++) {
			System.out.print("*");
		}
		System.out.print(" F");
		System.out.println();
	}
}
