/*
 * 	4- Si derivi una classe BambinoPrecoce da BambinoScuola, come descritta nel
 * 	   precedente esercizio. La nuova classe dovrebbe ridefinire il metodo get
 * 	   per l'età, restituieno l'età attuale aumentata di 2. Essa dovrebbe anche
 * 	   ridefinire il metodo set per la stringa di saluto, restituendo la stringa
 * 	   di saluto del bambino concatenata con le parole "Io sono il migliore".
 * 
 */

public class BambinoPrecoce extends BambinoScuolaDue {

	public BambinoPrecoce() {
		super();
	}
	
	public int getEtà() {
		return età * 2;
	}
	
	public String setSaluto(String nuovoSaluto) {
		String saluto = nuovoSaluto + " io sono il migliore";
		return saluto;	
	}
}


