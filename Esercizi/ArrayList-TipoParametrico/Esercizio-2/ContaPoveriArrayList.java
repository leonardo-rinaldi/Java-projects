import java.util.ArrayList;
import java.util.Scanner;

/*
 * 	2-	Scrivere un programma in una classe ContaPoveri che conti il numero di famiglie
 * 		che vengono considerate povere. Scrivere e utilizzare una classe Famiglia che ha
 * 		i seguenti attributi:
 * 
 * 		- reddito: un valore double che è il reddito della famiglia;
 * 		- dimensione: il numero di componenti della famiglia;
 * 
 * 		e i seguenti metodi:
 * 
 * 		- Famiglia(reddito, dmensione): il costruttore cje inizializza gli attributi;
 * 		- povera(costoCasa, costoCibo): un metodo che restituisce vero se costoCasa +
 * 										costoCibo * dimensione è maggiore della metà
 * 										del reddito della famiglia(costoCibo è il costo
 * 										medio del cibo per ogni individuo, mentre costoCasa
 * 										è unico per la famiglia);
 * 		- toString: un metodo che restiutisce una stringa contenete le informazioni della famiglia;
 * 		
 * 		Il programma deve leggere da tastiera un intero k e, successivamente, creare un array di
 * 		dimensione k il cui tipo base è Famiglia. Deve inoltre creare k oggetti di tipo Famiglia e
 * 		inserirli nell'array, leggendo da tastiera il reddito e la dimensione di ogni famiglia. Dopo
 * 		aver letto da tastiera un costo medio familiare e un costo medio del cibo, visualizzare le famiglie
 * 		che sono povere.
 * 
 * 
 * 		Ripetere l'esercizio precedente ma usando un'istanza di ArrayList invece di un array. Non si legga
 * 		il numero dei valori, ma si continui a leggere i valori finchè l'utente non inserisce un valore
 * 		negativo.
 * 
 */

public class ContaPoveriArrayList {

	private ArrayList<FamigliaArrayList> famiglie;	//oggetto array
	private double costoMedioCasa;
	private double costoMedioCibo;

	public static void main(String[] args) {
		
		ContaPoveriArrayList prova = new ContaPoveriArrayList();
		prova.riempiArray();
		prova.costi();
		prova.visualizzaArray();
	}
	
	public void riempiArray() {
		Scanner tastiera = new Scanner(System.in);
		boolean fatto = false;

		famiglie = new ArrayList<FamigliaArrayList>();
		
		do {
			System.out.println("Inserisci il reddito della famiglia:");
			double reddito = tastiera.nextDouble();
			System.out.println("Inserisci la dimensione della famiglia:");
			int dimensione = tastiera.nextInt();
			
			famiglie.add(new FamigliaArrayList(reddito, dimensione));
			
			System.out.println("Inserisci la parola fatto per concludere");
			System.out.println("Altrimenti inserisci qualunque altra parola");
			String risposta = tastiera.next();
			if(risposta.equalsIgnoreCase("fatto")) {
				fatto = true;
			}
		} while(!fatto);
	}
	
	public void costi() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserire costo medio casa:");
		costoMedioCasa = tastiera.nextDouble();
		System.out.println("Inserire costo medio cibo:");
		costoMedioCibo = tastiera.nextDouble();
		
	}
	
	public void visualizzaArray() {
		System.out.println("Famiglie povere:");
		
		for(int i = 0; i < famiglie.size(); i++) {
			if(famiglie.get(i).povera(costoMedioCasa, costoMedioCibo)) {
				System.out.println(famiglie.get(i).toString());
			} else {
				continue;
			}
		}
	}
}
