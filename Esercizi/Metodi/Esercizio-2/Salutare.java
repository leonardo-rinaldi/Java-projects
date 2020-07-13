package metodi;

/*
 * 	2- Si realizzi una classe Java che definisce:
 * 
 * 	   a. il metodo saluta che accetta in ingresso una stringa nome e un intero n e
 * 		  stampa a video n volte la frase "Ciao" seguita dal valore di nome. Se per
 * 		  esempio viene inserito Marco e 3, l'output a video dovrebbe essere:
 * 
 * 		  Ciao Marco
 * 		  Ciao Marco
 * 		  Ciao Marco
 * 
 * 	   b. il metodo main che chiede all'utente di inserire una stringa e un intero e
 * 		  invoca il metodo saluta con i valori letti.
 * 
 */

public class Salutare {

	public static void saluta(String nome, int n) {
		
		for(int i = 0; i < n; i++) {
			System.out.println("Ciao " + nome);
		}
	}
	
}
