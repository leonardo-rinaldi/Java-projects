import java.util.Scanner;

/*
 *	8-	Si supponga di voler vendere scatole di dolci per una raccolata fondi. Si hanno
 *		cinque tipi di dolci da vendere: dolci alla menta, cioccolatini alle mandorle, 
 *		biscotti al cioccolato, dolci al cioccolato e lecca-lecca senza zucchero. Si 
 *		vuole memorizzare l'ordine di un cliente in un array di cinque interi, i quali
 *		rappresentano il numero di scatole per ogni tipo di dolce. Scrivere un metodo
 *		statico combinaOrdini che prende come argomento due ordini e restituisce un
 *		array che rappresenta la somma degli ordini. Per esempio, se ordine1 contiene
 *		0, 0, 3, 4, 7 e ordine2 contiene 0, 4, 0, 1, 2, il metodo deve restituire un 
 *		array contenente 0, 4, 3, 5, 9.
 * 
 */

public class Dolci {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		int[] ordineUno = new int[5];
		int[] ordineDue = new int[5];
		
		System.out.println("Inserisci la quantità di dolci del primo ordine:");
		
		for(int i = 0; i < ordineUno.length; i++) {
			ordineUno[i] = tastiera.nextInt();
		}
		
		System.out.println("Inserisci la quantità di dolci del secondo ordine:");
		
		for(int i = 0; i < ordineDue.length; i++) {
			ordineDue[i] = tastiera.nextInt();
		}
		
		int[] ordine = combinaOrdini(ordineUno, ordineDue);
		
		for(int i = 0; i < ordine.length; i++) {
			System.out.print(ordine[i] + " ");
		}

	}
	
	public static int[] combinaOrdini(int[] ordineUno, int[] ordineDue) {
		
		int[] nuovoOrdine = new int[5];
		
		for(int j = 0; j < nuovoOrdine.length; j++ ) {
			nuovoOrdine[j] = ordineUno[j] + ordineDue[j];
		}
		
		return nuovoOrdine;
	}

}
