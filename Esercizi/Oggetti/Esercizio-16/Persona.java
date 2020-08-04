import java.util.Scanner;

/*
 * 	2- Si crei una classe Persona che presenti gli attributi nome ed età e i
 * 	   metodi per eseguire le seguenti attività.
 * 
 * 	   - Assegnare un nome a un oggetto Persona.
 * 	   - Assegnare un valore all'attributo età di un oggetto Persona.
 * 	   - Verificare se due oggetti Persona sono uguali (hanno stesso nome e età).
 * 	   - Verificare se due oggetti Persona hanno lo stesso nome.
 * 	   - Verificare se due oggetti Persona hanno la stessa età.
 * 	   - Verificare se una persona è più vecchia di un'altra.
 * 	   - Verificare se una persona è più giovane di un'altra.
 * 
 * 	   SI scriva un programma di test che mostri l'esecuzione di ciascun metodo.
 */

public class Persona {

	private String nome;
	private int età;
	
	public void assegnaNome() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Assegna un nome:");
		this.nome = tastiera.next();
	}
	
	public void assegnaEtà() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Assegna un età:");
		this.età = tastiera.nextInt();
	}
	
	public boolean equals(Persona altroOggetto) {
		return equalsNome(altroOggetto) && equalsEtà(altroOggetto);
				
	}
	
	public boolean equalsNome(Persona altroOggetto) {
		return this.nome.equalsIgnoreCase(altroOggetto.nome);
	}
	
	public boolean equalsEtà(Persona altroOggetto) {
		return this.età == altroOggetto.età;
	}
	
	public boolean piùVecchio(Persona altroOggetto) {
		boolean risultato;
		
		if(this.età > altroOggetto.età) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
	
	public boolean piùGiovane(Persona altroOggetto) {
		boolean risultato;
		
		if(this.età < altroOggetto.età) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
}
