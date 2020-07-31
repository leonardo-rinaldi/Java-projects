import java.util.Scanner;

/*
 * 	CAPITOLO 8
 * 
 * 	5- Si consideri una classe Java da usare per ricevere dall'utente
 * 	   un intero valido. Un oggetto di questa classe deve avere i 
 * 	   seguenti attributi:
 * 
 * 	   - valore minimo accettato;
 * 	   - valore massimo accettato;
 * 	   - stringa di sollecito.
 * 
 * 	   Inoltre deve avere il seguente metodo:
 * 
 * 	   - getValore mostra la stringa di sollecito e legge un valore usando
 * 	     la classe Scanner. Se il valore letto non è compreso tra il minimo
 * 		 e il massimo, ripete queste azioni finchè non viene inserito un
 * 		 valore accettabile. Il metodo restituisce il valore letto.
 * 
 */

public class InteroValido {

	private int minimo;
	private int massimo;
	private String stringaSollecito;
	
	/*
	 * Legge da tastiera il numero inserito e valuta se
	 * è compreso tra il minimo e il massimo.
	 */
	
	public void getValore() {
		minimo = 1;
		massimo = 10;
		stringaSollecito = "Prego inserire un numero intero compreso tra " + minimo + " e " + massimo;
		Scanner tastiera = new Scanner(System.in);
		int numeroInserito;
		
		do {
			System.out.println(stringaSollecito);
			numeroInserito = tastiera.nextInt();
		} while(numeroInserito < minimo || numeroInserito > massimo);
		System.out.println(numeroInserito);
	}
}
