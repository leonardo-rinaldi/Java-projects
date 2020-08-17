/*
 * 	17- Scrivere un metodo oltreUltimoElemento(posizione) per la classe 
 * 		ListaSenzaRipetizioni, come fornita nel listato 9.21, che restituisce
 * 		vero quando posizione è oltre l'ultimo elemento della lista.
 * 
 */


public class ListaSenzaRipetizioniDue {

	public static int POSIZIONE_INIZIALE = 1;
	public static int DIMENSIONE_DEFAULT = 50;
	
	private int numeroElementi;
	private String[] elemento;
	
	/*
	 * Crea una lista vuota di una data capacità.
	 */
	
	public ListaSenzaRipetizioniDue(int massimoNumeroDiElementi) {
		elemento = new String[massimoNumeroDiElementi];
		numeroElementi = 0;
	}
	
	/*
	 * Crea una lista vuota con capacità DIMENSIONE_DEFAULT
	 */
	
	public ListaSenzaRipetizioniDue() {
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
	
	/*
	 * Restituisce true se la posizione fornita come
	 * parametro eccede la dimensione della lista.
	 */
	
	public boolean oltreUltimoElemento(int posizione) {
		boolean risultato;
		
		if(posizione >= elemento.length) {
			risultato = true;
		} else {
			risultato = false;
		}
		return risultato;
	}
	
}
