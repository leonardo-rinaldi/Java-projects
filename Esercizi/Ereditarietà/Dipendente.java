/*
 * 	7- Si definisca una classe Dipendente i cui soggetti rappresentano le schede
 * 	   dei dipendenti di un'azienda. Si derivi questa classe dalla classe Persona.
 * 	   Un dipendente eredita il nome dalla classe Persona. In aggiunta, un dipendente
 * 	   possiede una retribuzione annuale rappresentata come un valore di tipo double,
 * 	   una data di assunzione che fornisce l'anno di assunzione come un valore di tipo
 * 	   int e un numero identificativo che è un valore di tipo String. Si definiscano gli
 * 	   appropriati costruttori, i metodi get e set e un metodo equals. Si scriva un
 * 	   programma di prova per verificare tutti i metodi.
 */

public class Dipendente extends Persona {
	
	private double retribuzioneAnnuale;
	private int annoAssunzione;
	private String numeroIdentificativo;
	
	
	public Dipendente() {
		super();
		retribuzioneAnnuale = 0;
		annoAssunzione = 0;
		numeroIdentificativo = "";
	}
	
	public Dipendente(String nome, double retribuzione, int assunzione, String identificativo) {
		super(nome);
		retribuzioneAnnuale = retribuzione;
		annoAssunzione = assunzione;
		numeroIdentificativo = identificativo;
	}
	
	public void setRetribuzione(double retribuzione) {
		retribuzioneAnnuale = retribuzione;
	}
	
	public void setAnnoAssunzione(int anno) {
		annoAssunzione = anno;
	}
	
	public void setIdentificativo(String identificativo) {
		numeroIdentificativo = identificativo;
	}
	
	public double getRetribuzione() {
		return retribuzioneAnnuale;
	}
	
	public int getAnno() {
		return annoAssunzione;
	}
	
	public String getIdentificativo() {
		return numeroIdentificativo;
	}
	
	public boolean equals(Dipendente altroOggetto) {
		
		String nome = getNome();
		return nome.equalsIgnoreCase(altroOggetto.getNome()) && this.retribuzioneAnnuale == altroOggetto.retribuzioneAnnuale
				&& this.annoAssunzione == altroOggetto.annoAssunzione && this.numeroIdentificativo == altroOggetto.numeroIdentificativo;
			
	
		
	}
	
}
