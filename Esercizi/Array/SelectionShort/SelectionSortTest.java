/*
 * 	Test del metodo SelectionSort
 */

public class SelectionSortTest {

	public static void main(String[] args) {
		
		char[] caratteri = {'a', 'c', 'b'};
		char[] caratteriOrdinati = SelectionSort.selectionSort(caratteri);
		
		System.out.println("I caratteri ordinati sono:");
		System.out.println();
		System.out.print("( ");
		
		for(int i = 0; i < caratteriOrdinati.length; i++) {
			System.out.print(caratteriOrdinati[i] + " ");
			
		} 
		System.out.print(")");	
	}

}
