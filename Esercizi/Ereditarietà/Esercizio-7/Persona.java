/*
 * 	7- Si definisca una classe Dipendente i cui soggetti rappresentano le schede
 * 	   dei dipendenti di un'azienda. Si derivi questa classe dalla classe Persona.
 * 	   Un dipendente eredita il nome dalla classe Persona. In aggiunta, un dipendente
 * 	   possiede una retribuzione annuale rappresentata come un valore di tipo double,
 * 	   una data di assunzione che fornisce l'anno di assunzione come un valore di tipo
 * 	   int e un numero identificativo che è un valore di tipo String. Si definiscano gli
 * 	   appropriati costruttori, i metodi get e set e un metodo equals. Si scriva un
 * 	   programma di prova per verificare tutti i metodi.
 * 
 */

public class Persona {

	private String nome;
	
	public Persona() {
		nome = "Ancora nessun nome";
	}
	
	public Persona(String nomeIniziale) {
		nome = nomeIniziale;
	}
	
	public void setNome(String nuovoNome) {
		nome = nuovoNome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void scriviOutput() {
		System.out.println("Nome: " + nome);
	}
	
	public boolean haLoStessoNome(Persona altraPersona) {
		return this.nome.equalsIgnoreCase(altraPersona.nome);
	}
}
