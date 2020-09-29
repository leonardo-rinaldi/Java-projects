import java.util.ArrayList;
import java.util.Scanner;

/*
 * 	5-	Si scriva un metodo statico rimuoviDuplicati(ArrayList<Character>
 * 		dati) che rimuova ogni carattere duplicato nell'oggetto dati. Si
 * 		tenga sempre la prima copia del carattere rimuovendo solo le successive.
 * 
 */

public class Duplicati {

	public static void main(String[] args) {
		ArrayList<Character> dati = new ArrayList<Character>();
		dati.add('a');
		dati.add('b');
		dati.add('c');
		dati.add('a');
		dati.add('e');
		dati.add('a');
		visualizza(dati);
		System.out.println();
		rimuoviDuplicati(dati);
		visualizza(dati);
	}
	
	public static void rimuoviDuplicati(ArrayList<Character> dati) {
		for(int i = 0; i < dati.size(); i++) {
			
			for(int j = i + 1; j < dati.size(); j++) {
				if(dati.get(i) == dati.get(j) ) {
					dati.remove(j);
				}
			}
		}
	}
	
	public static void visualizza(ArrayList<Character> dati) {
		System.out.print("[");
		for(int i = 0; i < dati.size(); i++) {
			System.out.print(dati.get(i) + " ");
		}
		System.out.print("]");
	}
	
}
