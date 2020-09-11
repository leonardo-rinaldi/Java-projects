/*
 * 	La classe rappresenta la vendita di un singolo elemento.
 * 	La classe ignora tasse, sconti e qualsiasi altro aggiustamento del prezzo.
 * 	Il prezzo assume valori non negativi, il nome è una stringa non vuota.
 * 
 */

public class Vendita {
	private String nome;	//Una stringa non vuota
	private double prezzo;	//non negativo
	
	public Vendita() {
		nome = "Nessun nome";
		prezzo = 0;
	}
	
	/*
	 * Precondizione: ilNome è una stringa non vuota; ilPrezzoè non negativ.
	 */
	
	public Vendita(String ilNome, double ilPrezzo) {
		setNome(ilNome);
		setPrezzo(ilPrezzo);
	}
	
	public Vendita(Vendita oggettoOriginale) {
		if(oggettoOriginale == null) {
			System.out.println("Errore: oggetto Vendita null.");
			System.exit(0);
		}	//else
		nome = oggettoOriginale.nome;
		prezzo = oggettoOriginale.prezzo;
	}
	
	public static void annuncio() {
		System.out.println("Questa è la classe Vendita.");
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	/*
	 * Precondizione: nuovoPrezzo è non negativo
	 */
	
	public void setPrezzo(double nuovoPrezzo) {
		if(nuovoPrezzo >= 0) {
			prezzo = nuovoPrezzo;
		} else {
			System.out.println("Errore: Prezzo negativo.");
			System.exit(0);
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	/*
	 * Precondizione: nuovoNome è una stringa non vuota.
	 */
	
	public void setNome(String nuovoNome) {
		if (nuovoNome != null && nuovoNome != "" ) {
			nome = nuovoNome;
		} else {
			System.out.println("Errore: nome errato");
			System.exit(0);
		}
	}
	
	public String toString() {
		return ("Componente = " + nome + ", Prezzo e costo totale = E" + prezzo);
	}
	
	public double totale() {
		return prezzo;
	}
	
	/*
	 * Restituisce true se i nomi e i totali delle vendite sono gli stessi;
	 * altrimenti restituisce false.
	 * Il metodo restituisce false anche se altraVendita è null.
	 */
	
	public boolean uguaglianzaVendite(Vendita altraVendita) {
		if(altraVendita == null) {
			return false;
		} else {
			return (nome.contentEquals(altraVendita.nome) && totale() == altraVendita.totale());
		}
	}
	
	/*
	 * Restituisce true se il totale dell'oggetto è minore del totale dell'oggetto
	 * altraVendita; altrimenti restituisce false.
	 */
	
	public boolean minoreDi(Vendita altraVendita) {
		if(altraVendita == null) {
			System.out.println("Errore: oggetto Vendita è null.");
			System.exit(0);
		} //else
		return (totale() < altraVendita.totale());
	}
	
	public boolean equals(Object altroOggetto) {
		if(altroOggetto == null) {
			return false;
		} else if(!(altroOggetto instanceof Vendita)) {
			return false;
		} else {
			Vendita altraVendita = (Vendita)altroOggetto;
			return (nome.contentEquals(altraVendita.nome) && (prezzo == altraVendita.prezzo)); 
		}
	}
}
