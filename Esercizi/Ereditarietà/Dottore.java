/*
 * 	8- Si definisca una classe Dottore i cui oggetti rappresentano le schede dei dottori
 * 	   di una clinica. Si derivi questa classe dalla classe Persona. Un dottore ha un nome,
 * 	   definito nella classe Persona, una specializzazione descritta tramite una stringa
 * 	   (per esempio Pediatra, Ostetrico, Medico generale e così via) e tramite una parcella
 *     per le visite in ufficio (si usi il tipo double). Si descrivano gli appropriati costruttori,
 *     i metodi get e un metodo equals. Si scriva un programma i prova per verificare tutti i metodi.
 * 
 */

public class Dottore extends Persona {
	
	private String specializzazione;
	private double parcelle;
	
	public Dottore() {
		super();
		specializzazione = "";
		parcelle = 0;
	}
	
	public Dottore(String nome, String specializzazione, double parcelle) {
		super(nome);
		this.specializzazione = specializzazione;
		this.parcelle = parcelle;
	}
	
	public String getSpecializzazione() {
		return specializzazione;
	}
	
	public double getParcelle() {
		return parcelle;
	}
	
	public boolean equals(Dottore altroOggetto) {
		String nome = getNome();
		return nome.equalsIgnoreCase(altroOggetto.getNome()) && this.specializzazione.equalsIgnoreCase(altroOggetto.specializzazione)
				&& parcelle == altroOggetto.parcelle;
	}
}
