/*
 * Test del metodo BubbleSort
 */

public class BubbleSortTest {

	public static void main(String[] args) {
			
			int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
			
				ArrayOrdinato.bubbleSort(b);
				visualizza(b);
	}
	
	public static void visualizza(int[] a) {
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
