import java.util.Scanner;

/* 
 * 	10- Si crei una nuova classe Cane che sia derivata dalla classe Animale. La nuova classe
 * 		avrà gli attributi aggiuntivi razza (tipo String) e comandoDiRichiamo (tipo boolean),
 * 		il quale sarà vero se l'animale ha il suo comando di richiamo e falso altrimenti. Si
 * 		dotino le classi di opportuni costruttori e di tutti i metodi get. Si scriva un
 * 		programma driver per verificare tutti i metodi, poi si scriva un programma driver
 * 		per verificare tutti i metodi, poi si scriva un programma che legga le informazioni
 * 		per cinque animali di tipo Cane e visualizzi il nome e la razza di tutti gli animali
 * 		che siano oltre i due anni di età e non abbiano assegnati i loro comandi di richiamo.
 * 
 */

public class CaneProgramma extends Cane {

	private Cane[] cani;
	
	public static void main(String[] args) {
		CaneProgramma cane = new CaneProgramma();
		cane.riempiArray();
		cane.visualizzaDati();
	}
	
	public void riempiArray() {
		cani = new Cane[5];
		
		for(int i = 0; i < 5; i++) {
			Scanner tastiera = new Scanner(System.in);
			
			cani[i] = new Cane();
			System.out.println("Inserisci il nome del cane:");
			String nome = tastiera.next();
			System.out.println("Inserisci l'età del cane:");
			int età = tastiera.nextInt();
			System.out.println("Inserisci il peso del cane:");
			double peso = tastiera.nextDouble();
			System.out.println("Inserisci la razza del cane:");
			String razza = tastiera.next();
			System.out.println("Inserisci il comando di richiamo (true oppure false):");
			boolean richiamo = tastiera.nextBoolean();
			
			cani[i].setNome(nome);
			cani[i].setEtà(età);
			cani[i].setPeso(peso);
			cani[i].setRazza(razza);
			cani[i].setComandoDiRichiamo(richiamo);
		}
	}
	
	public void visualizzaDati() {
		for(int i = 0; i < 5; i++) {
			if(cani[i].getEtà() < 2 && cani[i].getComandoDiRichiamo() == false ) {
				System.out.println("Nome: " + cani[i].getNome());
				System.out.println("Età: " + cani[i].getEtà());
			}
		}
	}

}
