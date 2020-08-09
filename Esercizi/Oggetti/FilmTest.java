/*
 * 	Test della classe Film
 */

import java.util.Scanner;

public class FilmTest {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int valutazione;
		String classificazione;
		String nomeFilm;
		
		Film primoFilm = new Film();
		
		System.out.println("Inserisci il nome del film:");
		nomeFilm = tastiera.next();
		primoFilm.setTitolo(nomeFilm);
		
		System.out.println("Inserisci una classificazione MPAA:");
		classificazione = tastiera.next();
		primoFilm.setMPAA(classificazione);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Inserisci un voto per questo film da 0 a 5");
		    valutazione = tastiera.nextInt();
		    primoFilm.aggiungiValutazione(valutazione);
		}
		
		System.out.println("La media di voti per questo film è: " + primoFilm.getMedia());
		System.out.println("La classificazione per questo film è: " + primoFilm.getMPAA());

		Film secondoFilm = new Film();
		
		System.out.println("Inserisci il nome del film:");
		nomeFilm = tastiera.next();
		secondoFilm.setTitolo(nomeFilm);
		
		System.out.println("Inserisci una classificazione MPAA:");
		classificazione = tastiera.next();
		secondoFilm.setMPAA(classificazione);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Inserisci un voto per questo film da 0 a 5");
			valutazione = tastiera.nextInt();
			secondoFilm.aggiungiValutazione(valutazione);
		}
		System.out.println("La media di voti per questo film è: " + secondoFilm.getMedia());
		System.out.println("La classificazione per questo film è: " + secondoFilm.getMPAA());
	}
}
