/*
 *	Test della classe SelectionSort 
 */

public class SelectionSortDemo {

	public static void main(String[] args) {
		int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
		visualizza(b, "Prima dell'ordinamento");
		OrdinaArray.selectionSort(b);
		visualizza(b, "dopo l'ordinamento");
	}
	
	public static void visualizza(int[] array, String quando) {
		System.out.println("Valori dell'array " + quando + ":");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
