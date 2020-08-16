/*
 * 	10-	Si consideri una classe Persona che descrive una generica persona. Questa
 * 		classe ha una variabile di istanza di tipo stringa nome che indica il nome
 * 		della persona e una variabile di istanza di tipo intero età che rappresenta
 * 		l'età di una persona.
 * 
 * 		a. Si scriva un costruttore di default per la classe Persona che assegno "Nessun
 * 		   nome" a nome e 0 a età.
 * 		b. Si scriva un secondo costruttore che assegni la stringa fornita in ingresso a
 * 		   nome e l'intero fornito a età.
 * 		c. Si scriva un metodo statico creaPersonaAdulta che restituisce un'istanza speciale
 * 		   di questa classe. L'istanza restituita rappresenta un generico individuo adulto
 * 		   che ha come nome la stringa "un adulto" e come età 21.
 * 
 */

public class Persona {

	private String nome;
	private int età;
	
	public Persona() {
		nome = "Nessun nome";
		età = 0;
	}
	
	public Persona(String nome, int età) {
		this.nome = nome;
		this.età = età;
	}
	
	public static Persona creaPersonaAdulta() {
		return new Persona("adulto", 21);
	}
}
