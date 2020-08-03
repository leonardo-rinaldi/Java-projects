import java.util.Scanner;

/* 
 * 	11- Si scriva un programma che risponda a domande come la seguente. Si supponga
 * 		che la specie Bufalo Klingon abbia una popolazione di 100 individui e un 
 * 		tasso di crescita del 15% e che la specie Elefante abbia una popolazione di
 * 		10 individui e un tasso di crescita del 35%. In quanti anni la popolazione di
 * 		elefanti supererà quella dei bufali klingon?
 * 
 * 		Il programma richiederà i dati di entrambe le specie e risponderà dicendo quanti
 * 		anni ci vorranno per far si che la specie con il minor numero di individui superi
 * 		quella con il numero maggiore di individui. Le due specie possono essere inserite 
 * 	    	in qualsiasi ordine.
 * 
 */

public class Specie {

	private String nome;
	private int popolazione;
	private double tassoCrescita;
	
	public void leggiInput() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Qual'è il nome della specie?");
		nome = tastiera.nextLine();
		System.out.println("A quanto ammonta la popolazione?");
		popolazione = tastiera.nextInt();
		System.out.println("Inserisci il tassto di crescita " + "(% crescita per anno):");
		tassoCrescita = tastiera.nextDouble();
	}
	
	public void scriviOutput() {
		System.out.println("Nome = " + nome);
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
		
		while((contatore < 0) && (totalePopolazione > 0)) {
			totalePopolazione = (totalePopolazione + (tassoCrescita / 100) * totalePopolazione);
			contatore--;
		}
		return risultato;
	}
	
	/*
	 * Restituisce in quanto tempo una popolazione supererà l'altra
	 * per numero.
	 */
	
	public int crescitaPopolazione(Specie secondoOggetto) {
		double primaPopolazione = this.popolazione;
		double secondaPopolazione = secondoOggetto.popolazione;
		int anni = 0;
		
		if(primaPopolazione > secondaPopolazione) {
			while(secondaPopolazione < primaPopolazione) {
				secondaPopolazione = (secondaPopolazione + (tassoCrescita / 100) * secondaPopolazione);
				primaPopolazione = (primaPopolazione + (tassoCrescita / 100) * primaPopolazione);	//aumento specie con popolazione maggiore
				anni++;
			}
		} else {	//if(secondaPopolazione > primaPopolazione)
			while(primaPopolazione < secondaPopolazione) {
				primaPopolazione = (primaPopolazione + (tassoCrescita / 100) * primaPopolazione);
				secondaPopolazione = (secondaPopolazione + (tassoCrescita / 100) * primaPopolazione);	//aumeno specie con popolazione maggiore
				anni++;
			}
		}
		return anni;
	}
	
	public void setSpecie(String nuovoNome, int nuovaPopolazione, double nuovoTassoCrescita) {
		nome = nuovoNome;
		if(nuovaPopolazione >= 0) {
			popolazione = nuovaPopolazione;
		} else {
			System.out.println("ERRORE: si sta usando un numero negativo " + "per la popolazione");
			System.exit(0);
		}
		tassoCrescita = nuovoTassoCrescita;
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
