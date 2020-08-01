import java.util.Scanner;

/*
 * 	8- Si consideri una classe IndirizzoPersona che rappresenta un elemento di una rubrica.
 * 	   I suoi attributi sono:
 * 
 * 	   - nome della persona;
 *     - cognome della persona;
 *     - indirizzo e-mail della persona;
 *     - numero di telefono della persona.
 *     
 *     La classe avrà i metodi per:
 *     
 *     - accedere a ogni attributo;
 *     - cambiare l'indirizzo e-mail;
 *     - cambiare il numero di telefono;
 *     - verificare se due istanze sono uguali sulla base del nome.
 * 
 */

public class IndirizzoPersona {

	private String nomePersona;
	private String cognomePersona;
	private String indirizzoMail;
	private String numeroTelefono;
	
	/*
	 * Assegna dei valori alle variabili locali
	 */
	
	public void setDati(String nuovoNome, String nuovoCognome, String nuovaMail, String nuovoNumero) {
		this.nomePersona = nuovoNome;
		this.cognomePersona = nuovoCognome;
		this.indirizzoMail = nuovaMail;
		this.numeroTelefono = nuovoNumero;
	}
	
	public void cambiaEmail(String nuovaMail) {
		this.indirizzoMail = nuovaMail;
	}
	
	public void cambiaNumero(String nuovoNumero) {
		this.numeroTelefono = nuovoNumero;
	}
	
	/*
	 * Confronta i due oggetti per controllare se il nome è uguale
	 */
	
	public boolean equals(IndirizzoPersona altroOggetto) {
		return this.nomePersona.equalsIgnoreCase(altroOggetto.nomePersona);
	}
	
	public void visualizza() {
		System.out.println("Nome: " + nomePersona);
		System.out.println("Cognome: " + cognomePersona);
		System.out.println("Mail: " + indirizzoMail);
		System.out.println("Telefono: " + numeroTelefono);
	}
}
