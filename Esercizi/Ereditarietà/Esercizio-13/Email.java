/*
 * 	13- Si definisca una classe Documento che contenga una variabile di istanza di tipo
 * 		String chiamata testo che memorizza qualsiasi contenuto testuale per il documento.
 * 		Si crei un metodo toString che restituisca il valore del testo  si includa anche un
 * 		metodo per impostare questo valore.
 * 		Si definisca poi una classe Email che sia derivata da Documento e che includa le variabili
 * 		di istanza per il mittente, il destinatario e il titolo del messaggio.
 * 		Si implementino metodi get e set appropriati. Il corpo del messaggio dell'e-mail dovrebbe
 * 		essere memorizzato nella variabile ereditata testo. Si ridefinisca il metodo toString per
 * 		concatenare tutti i campi di testo.
 * 		Analogamente, si definisca una classe File che sia derivata da Documento e includa una
 * 		variabile di istanza per il nomePercorso. I contenuti testuali del file dovrebbero essere
 * 		memorizzati nella variabile ereditata testo. Si ridefinisca il metodo toString che concateni
 * 		il nome del percorso e il testo.
 * 		Infine, in un programma driver, si creino vari oggetti di tipo Email e File. Si provino gli
 * 		oggetti passandoli al seguente metodo (incluso nel programma driver) che restituisce vero se 
 * 		l'oggetto contiene la parola chiave specificata nel proprio testo.
 * 
 * 		public static boolean contieneParolaChiave(Documento oggettoDoc, String parolaChiave) {
 * 			if(oggettoDoc.toString().indexOf(parolaChiave, 0) >= 0)
 * 				return true;
 * 			return false;
 * 		}
 * 
 */

public class Email extends Documento {

	private String mittente;
	private String destinatario;
	private String titolo;
	
	public Email() {
		super();
		mittente = "";
		destinatario = "";
		titolo = "";
	}
	
	public Email(String testo, String mittente, String destinatario, String titolo) {
		super(testo);
		this.mittente = mittente;
		this.destinatario = destinatario;
		this.titolo = titolo;
	}
	
	public void setMittente(String mittente) {
		this.mittente = mittente;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getMittente() {
		return mittente;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public String toString() {
		return "Titolo: " + titolo + "\n" + "Mittente: " + mittente + "\n" + "Destinatario: " +destinatario + "\n" + "Testo: " + getTesto();
	}
}
