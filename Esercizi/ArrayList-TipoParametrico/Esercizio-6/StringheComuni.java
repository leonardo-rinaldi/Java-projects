import java.util.ArrayList;

/*
 * 	6-	si scriva un metodo statico:
 * 
 * 		getStringheComuni(ArrayList<String> lista1, ArrayList<String> lista2)
 * 
 * 		che restituisca una nuova istanza di ArrayList contenente tutte le stringhe
 * 		comuni a lista1 e lista2.
 * 
 */

public class StringheComuni {

	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		ArrayList<String> lista3 = new ArrayList<String>();
		
		lista1.add("gatto");
		lista1.add("cane");
		lista1.add("topo");
		lista1.add("cavallo");
		
		lista2.add("zebra");
		lista2.add("topo");
		lista2.add("cane");
		lista2.add("leone");
		
		lista3 = getStringheComuni(lista1, lista2);
		
		visualizza(lista3);
	}
	
	/*
	 * Precondizione: lista1 e lista 2 devono avere la stessa lunghezza.
	 */

	public static ArrayList<String> getStringheComuni(ArrayList<String> lista1, ArrayList<String> lista2) {
		ArrayList<String> lista3 = new ArrayList<String>();
		
		for(int i = 0; i < lista1.size(); i++) {
			for(int j = 0; j < lista2.size(); j++) {
				if(lista1.get(i) == lista2.get(j)) {
					lista3.add(lista1.get(i));
				}
			}
		}
		return lista3;
	}
	
	public static void visualizza(ArrayList<String> lista) {
		System.out.print("[");
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
		System.out.print("]");
	}
}
