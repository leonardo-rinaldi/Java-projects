/*
 * 	 1- Si consideri un programma che archivierà gli articoli in una bibilioteca scolastica.
 * 		Si disegni una gerarchia di classi, che include una classe base, per i vari tipi di 
 * 		articoli. Si devono considerare anche gli articoli che non possono essere dati in
 * 		prestito.
 * 
 * 	 2- Si implementi la classe base per la gerarchia ottenuta dal precedente esercizio.
 */

public class Articoli {
	
	private String nomeArticolo;
	
	public Articoli() {
		nomeArticolo = "";
	}
	
	public Articoli(String nome) {
		this.nomeArticolo = nome;
	}
	
	public void setNome(String nuovoNome) {
		nomeArticolo = nuovoNome;
	}
	
	public String getNome() {
		return nomeArticolo;
	}
	
	public boolean equals(Articoli altroOggetto) {
		return nomeArticolo.equalsIgnoreCase(altroOggetto.nomeArticolo);
	}
}
