/*
 * 	4-	Si consideri una classe Persona che descrive una generica persona. Questa
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
 * 
 * 
 *  	Si includano i seguenti metodi:
 *  
 *  	- getNome: restituisce il nome di una persona come stringa;
 *  	- getEtà: restituisce l'età della persona;
 *  	- setNome(nome, cognome): imposta il nome e il cognome di una persona;
 *  	- setNome(nomeCompleto): imposta il nome di una persona, dati il nome e 
 *  							 il cognome in una sola stringa.
 *  	- setEtà(età): imposta l'età di una persona;
 *  	- creaInfante: metodo statico che restituisce una speciale istanza di questa
 *  				   classe che rappresenta un infante. L'istanza ha il nome "Un infante"
 *  				   e un'eta che vale 2;
 *  
 *  	- creaBambino: metodo statico che crea una speciale istanza di questa classe che
 *  				   rappresenta un bambino in età pre-scolare e ha il nome "Un bambino" e un
 *  				   età che vale 5;
 *  
 *  	- creaPreAdolescente: un metodo statico che restituisce una speciale istanza di questa
 *  						  classe che rappresenta un pre-adolescente. L'istanza ha il nome
 *  						  "Un pre-adolescente" e un età che vale 9;
 *  
 *  	- creaAdolescente: un metodo statico che restiuisce una speciale istanza di questa classe
 *  					   che rappresenta un adolescente. L'istanza ha il nome "Un adolescente" e
 *  					   un età che vale 15.
 * 
 */

public class PersonaTre {

	String nome;
	String cognome;
	String nomeCompleto;
	int età;
	
	public PersonaTre() {
		nome = "Nessun nome";
		cognome = "Nessun cognome";
		nomeCompleto = nome + " " + cognome;
		età = 0;
	}
	
	public PersonaTre(String nome, int età) {
		this.nome = nome;
		this.età = età;
	}
	
	public static Persona creaPersonaAdulta() {
		return new Persona("adulto", 21);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getEtà() {
		return età;
	}
	
	public void setNome(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public void setNome(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public void setEtà(int età) {
		this.età = età;
	}
	
	public static PersonaTre creaInfante() {
		PersonaTre infante = new PersonaTre("Un infante", 2);
		return infante;
	}
	
	public static PersonaTre creaBambino() {
		PersonaTre bambino = new PersonaTre("Un bambino", 5);
		return bambino;
	}
	
	public static PersonaTre creaPreAdolescente() {
		PersonaTre preAdolescente = new PersonaTre("Un pre adolescente", 9);
		return preAdolescente;
	}
	
	public static PersonaTre creaAdolescente() {
		PersonaTre adolescente = new PersonaTre("Un adolescente", 15);
		return adolescente;
	}
}
