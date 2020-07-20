/*
 * 	Test del metodo SelectionSortModifica
 */

public class SelectionSortModificaTest {

	public static void main(String[] args) {
		
		int[] listaNumeri = {9, 6, 8, 4, 1};
		int indiceInizio = 2;
		int indiceFine = 5;
		
		controlloErrori(listaNumeri, indiceInizio, indiceFine);
		
	}
	
	public static void visualizzaArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void controlloErrori(int[] listaNumeri, int indiceInizio, int indiceFine) {
		
		if(indiceInizio > indiceFine) {
			System.out.println("Errore!");
		} else
			if(indiceInizio < 0) {
				System.out.println("Errore!");
			} else
				if(indiceFine > listaNumeri.length) {
					System.out.println("Errore");
				} else {
					SelectionSortModifica.selectionSortParziale(listaNumeri, indiceInizio, indiceFine);
					visualizzaArray(listaNumeri);
				}
	}
	
}
