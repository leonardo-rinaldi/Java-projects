import java.util.Scanner;

/*
 * 	5- Si consideri la classe Caratteristiche da utilizzare in un servizio di appuntamenti
 * 	   on-line e che permette di capire quanto siano compatibili due persone. Gli attributi
 * 	   sono i seguenti:
 * 
 * 	   - descrizione: una stringa che identifica le caratteristiche;
 * 	   - punteggio: un intero da 1 a 10 che indica quanto una persona ricerchi questa caratteristica
 * 		            in un'altra persona.
 * 
 * 	   a. Si scriva un costruttore che assegni una stringa data alla descrizione e che assegni il
 * 		  valore 0 al punteggio per indicare che questo non è stato ancora indicato.
 * 	   b. Si scriva il metodo privato valido(punteggio) che restituisce vero se il punteggio dato
 * 		  è valido e cioè è compreso tra 1 e 10.
 * 	   c. Si scriva il metodo setPunteggio(punteggio) che assegna il punteggio dato se questo è
 * 		  valido.
 * 	   d. Si scriva il metodo setPunteggio che legge il punteggio inserito da tastiera, continuando
 * 		  a richiederlo se il punteggio inserito non è valido.
 * 
 */

public class Caratteristiche {

	public String descrizione;
	public int punteggio;
	
	public Caratteristiche(String descrizione) {
		this.descrizione = descrizione;
		punteggio = 0;
	}
	
	private boolean valido(int punteggio) {
		boolean risultato;
		
		if(punteggio >= 0 && punteggio <= 10) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
	
	public void setPunteggio(int punteggio) {
		boolean punteggioValido = valido(punteggio);
		
		if(punteggioValido) {
			this.punteggio = punteggio;
		} else {
			System.out.println("Punteggio non valido");
		}
	}
	
	public void setPunteggio() {
		Scanner tastiera = new Scanner(System.in);
		int punteggioInserito = 0;
		boolean punteggioValido = false;
		
		while(!punteggioValido) {
			System.out.println("Inserisci un punteggio valido");
			punteggioInserito = tastiera.nextInt();
			punteggioValido = valido(punteggioInserito);
		}
		setPunteggio(punteggioInserito);
	}
	
	public void visualizza() {
		System.out.println("Descrizione: " + descrizione);
		System.out.println("Punteggio: " + punteggio);
	}
}
