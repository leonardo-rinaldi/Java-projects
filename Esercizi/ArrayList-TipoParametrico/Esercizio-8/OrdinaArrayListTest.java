import java.util.ArrayList;

/*
 * Test della classe OrdinaArrayList
 */

public class OrdinaArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> z = new ArrayList<String>();
		
		z.add("z");
		z.add("a");
		z.add("b");
		z.add("g");
		z.add("h");
		
		visualizza(z, "Prima dell'ordinamento");
		OrdinaArrayList.selectionSort(z);
		visualizza(z, "dopo l'ordinamento");
	}
	
	public static void visualizza(ArrayList<String> array, String quando) {
		System.out.println("Valori dell'array " + quando + ":");
		
		for(int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println();
	}


}
