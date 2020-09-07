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

public class File extends Documento {

	private String nomePercorso;
	
	public File() {
		super();
		nomePercorso = "";
	}
	
	public File(String testo, String nomePercorso) {
		super(testo);
		this.nomePercorso = nomePercorso;
	}
	
	public void setNomePercorso(String nomePercorso) {
		this.nomePercorso = nomePercorso;
	}
	
	public String getNomePercorso() {
		return nomePercorso;
	}
	
	public String toString() {
		return "Percorso: " + nomePercorso + "\n" + "Testo: " +  getTesto();
	}
}
