import java.util.Scanner;

/*
 * 	CAPITOLO 9
 * 
 * 	20- Si modifichi la definizione della classe Specie aggiungendo i metodi
 * 	    seguenti.
 * 
 * 		- Cinque costruttori: uno per ciascuna variabile di istanza, uno con
 * 		  tre parametri per le tre variabili di istanza, un costruttore di default.
 * 		  Ci si accerti che ciascun costruttore assegni valori a tutte le variabili
 * 		  di istanza.
 * 
 * 		- Quattro metodi set per resettare i valori: uno deve resettare tutti i valori,
 * 		  mentre gli altri tre devono resettare ciascuna variabile di istanza. Si scriva
 * 		  quindi un programma di test per verificare ciascuno dei metodi implementati.
 * 
 * 
 */

public class Specie {

	private String nome;
	private int popolazione;
	private double tassoCrescita;
	
	/*
	 * Costruttore di default
	 */
	
	public Specie() {
		this.nome = "";
		this.popolazione = 0;
		this.tassoCrescita = 0;
	}
	
	public Specie(String nome) {
		this.nome = nome;
		this.popolazione = 0;
		this.tassoCrescita = 0;
	}
	
	public Specie(int popolazione) {
		this.nome = "";
		this.popolazione = popolazione;
		this.tassoCrescita = 0;
	}
	
	public Specie(double tassoCrescita) {
		this.nome = "";
		this.popolazione = 0;
		this.tassoCrescita = tassoCrescita;
	}
	
	public Specie(String nome, int popolazione, double tassoCrescita) {
		this.nome = nome;
		this.popolazione = popolazione;
		this.tassoCrescita = tassoCrescita;
	}
	
	public void leggiInput() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Qual è il nome della specie?");
		nome = tastiera.nextLine();
		System.out.println("A quanto ammonta la popolazione?");
		popolazione = tastiera.nextInt();
		System.out.println("Inserisci il tasso di crescita " + "% crescia per anno):");
		tassoCrescita = tastiera.nextDouble();
	}
	
	public void scriviOutput() {
		System.out.println("nome = " + nome);
		System.out.println("Popolazione = " + popolazione);
		System.out.println("Tasso crescita = " + tassoCrescita + "%");
	}
	
	/*
	 * Restituisce una proiezione della popolazione dopo un numero
	 * specificato di anni
	 */
	
	public int prediciPopolazione(int anni) {
		int risultato = 0;
		double totalePopolazione = popolazione;
		int contatore = anni;
		
		while((contatore > 0) && (totalePopolazione > 0)) {
			totalePopolazione = (totalePopolazione + (tassoCrescita / 100) * totalePopolazione);
			contatore--;
		}
		if(totalePopolazione > 0) {
			risultato = (int)totalePopolazione;
		}
		return risultato;
	}
	
	/*
	 * Metodi set per resettare i valori
	 */
	
	public void setSpecie() {
		nome = "";
		popolazione = 0;
		tassoCrescita = 0;
	}
	
	public String setNome() {
		return nome = "";
	}
	
	public int setPopolazione() {
		return popolazione = 0;
	}
	
	public double setTassoCrescita() {
		return tassoCrescita = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPopolazione() {
		return popolazione;
	}
	
	public double getTassoCrescita() {
		return tassoCrescita;
	}
	
	public boolean equals(Specie altroOggetto) {
		return (nome.equalsIgnoreCase(altroOggetto.nome)) 
				&& (popolazione == altroOggetto.popolazione)
				&& (tassoCrescita == altroOggetto.tassoCrescita);
	}
}
