import java.util.Scanner;

/*
 * 	6- Si consideri una classe PromotoreConcerto che registra i biglietti venduti per
 * 	   un concerto. Prima del giorno del concerto i biglietti vengono venduti solo al 
 * 	   telefono. Le vendite il giorno del concerto sono fatte di persona, sul posto.
 * 
 * 	   La classe ha i seguenti attributi:
 * 
 * 	   - nome del gruppo;
 * 	   - capacità del luogo in cui si svolge il concerto;
 * 	   - numero biglietti venduti;
 * 	   - prezzo di un biglietto venduto al telefono;
 * 	   - prezzo di un biglietto venduto sul posto;
 * 	   - ricavato toale della vendita;
 * 
 * 	   Ha i metodi per le seguenti attività:
 * 
 * 	   - registrare la vendita di uno o più biglietti;
 * 	   - cambiare lo stato da vendita al telefono a vendita sul posto;
 * 	   - restituire il numero di biglietti venduti;
 * 	   - restituire il numero di biglietti rimanenti;
 * 	   - restituire il totale delle vendite per il concerto.
 * 
 * 		
 *	   Si includano i costruttori
 */

public class PromotoreConcertoDue {

	private String nomeGruppo;
	private int capacitàLuogoConcerto;
	private int bigliettiVenduti;
	private double prezzoBigliettoTelefono;
	private double prezzoBigliettoSulPosto;
	private double prezzoAttuale;
	private double ricavatoTotale;
	
	public PromotoreConcertoDue() {
		nomeGruppo = "";
		capacitàLuogoConcerto = 0;
		bigliettiVenduti = 0;
		prezzoBigliettoTelefono = 0;
		prezzoBigliettoSulPosto = 0;
		prezzoAttuale = 0;
		ricavatoTotale = 0;
	}
	
	public PromotoreConcertoDue(String nome, int capacità, int biglietti, double prezzoTelefono, double prezzoPosto, double prezzo, double ricavato) {
		nomeGruppo = nome;
		capacitàLuogoConcerto = capacità;
		bigliettiVenduti = biglietti;
		prezzoBigliettoTelefono = prezzoTelefono;
		prezzoBigliettoSulPosto = prezzoPosto;
		prezzoAttuale = prezzo;
		ricavatoTotale = ricavato;
	}
	
	public void concerto() {
		Scanner tastiera = new Scanner(System.in);
		prezzoBigliettoTelefono = 3;
		prezzoBigliettoSulPosto = 2;
		capacitàLuogoConcerto = 1000;
		
		System.out.println("Inserisci il nome del gruppo:");
		nomeGruppo = tastiera.next();
	}
	
	public void cambiaPrezzo(int giorno) {	
		if(giorno == 0) { //giorno del concerto
			prezzoAttuale = prezzoBigliettoSulPosto;
		} else {
			prezzoAttuale = prezzoBigliettoTelefono;
		}
	}
	
	/*
	 * Registra la vendita di uno o più biglietti
	 */
	
	public void venditaBiglietto() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Quanti biglietti vuoi comprare?");
		int bigliettiComprati = tastiera.nextInt();
		bigliettiVenduti = bigliettiVenduti + bigliettiComprati;
		double prezzoTotale = prezzoAttuale * bigliettiVenduti;
		ricavatoTotale = ricavatoTotale + prezzoTotale;
	}
	
	public double totaleVendite() {
		return ricavatoTotale;
	}
	
	public int bigliettiRimanenti() {
		return capacitàLuogoConcerto - bigliettiVenduti;
	}
	
	public int bigliettivenduti() {
		return bigliettiVenduti;
	}
	
}
