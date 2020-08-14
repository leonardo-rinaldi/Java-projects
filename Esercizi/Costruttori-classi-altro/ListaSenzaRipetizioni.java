package oggetti;

/*
 *	Un oggetto di questa classe è un caso speciale du lista di stringhe.
 *	E' possibile creare la lista solo dal''inizio alla fine. E' possibile 
 *	aggiungere elementi solo alla fine della lista. Non è possibile cambiare
 *	singoli elementi, ma è possibile cancellare l'intera lista e ricominciare.
 *	Nessun elemento può comparire più di una volta nella lista. E' possibile
 *	utilizzare delle variabili intere come indicatori della posizione nella lista.
 *	Gli indicatori della posizione sono simili agli indici dell'array, ma sono
 *	numerati da 1.  	
 *
 */

public class ListaSenzaRipetizioni {

	public static int POSIZIONE_INIZIALE = 1;
	public static int DIMENSIONE_DEFAULT = 50;
	
	private int numeroElementi;
	private String[] elemento;
	
	/*
	 * Crea una lista vuota di una data capacità.
	 */
	
	public ListaSenzaRipetizioni(int massimoNumeroDiElementi) {
		elemento = new String[massimoNumeroDiElementi];
		numeroElementi = 0;
	}
	
	/*
	 * Crea una lista vuota con capacità DIMENSIONE_DEFAULT
	 */
	
	public ListaSenzaRipetizioni() {
		elemento = new String[DIMENSIONE_DEFAULT];
		numeroElementi = 0;
	}
	
	public boolean piena() {
		return numeroElementi == elemento.length;
	}
	
	public boolean vuota() {
		return numeroElementi == 0;
	}
	
	/*
	 * Precondizione: la lista non è piena
	 * Postcondizione: se un elemento non è nella lista
	 * deve essere aggiunto alla lista
	 */
	
	public void aggiungiElemento(String nuovoElemento) {
		if(!nellaLista(nuovoElemento)) {
			if(numeroElementi == elemento.length) {
				System.out.println("La lista è piena!");
				System.exit(0);
			} else {
				elemento[numeroElementi] = nuovoElemento;
				numeroElementi++;
			}
		}
	}
	
	/*
	 * Se l'argomento indica una posizione nella lista,
	 * viene restituito l'elemento in quella specifica posizione;
	 * altrimenti viene restituito null.
	 */
	
	public String getElementoIn(int posizione) {
		String risultato = null;
		
		if((1 <= posizione) && (posizione <= numeroElementi)) {
			risultato = elemento[posizione - 1];
		}
		return risultato;
	}
	
	/*
	 * Restituisce true se la posizione passata come argomento
	 * indica l'ultima posizione nella lista; altrimenti restituisce
	 * false.
	 */
	
	public boolean ultimoElemento(int posizione) {
		return posizione == numeroElementi;
	}
	
	/*
	 * Restituisce true se l'elemento è nella lista;
	 * altrimenti restituisce false. Non distingue tra
	 * lettere maiuscole e minuscole.
	 */
	
	public boolean nellaLista(String elementoDaRicercare) {
		boolean trovato = false;
		int i = 0;
		while(!trovato && (i < numeroElementi)) {
			if(elementoDaRicercare.equalsIgnoreCase(elemento[i])) {
				trovato = true;
			} else {
				i++;
			}
		}
		return trovato;
	}
	
	public int getMassimoNumeroDiElementi() {
		return elemento.length;
	}
	
	public int getNumeroDiElementi() {
		return numeroElementi;
	}
	
	public void cancellaLista() {
		numeroElementi = 0;
	}
	
}
