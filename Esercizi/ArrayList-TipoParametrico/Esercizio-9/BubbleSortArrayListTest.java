import java.util.ArrayList;

/*
 * Test della classe BubbleSortArrayList
 */

public class BubbleSortArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> stringhe = new ArrayList<String>();
		
		stringhe.add("c");
		stringhe.add("b");
		stringhe.add("a");
		stringhe.add("h");
		stringhe.add("g");
		
		BubbleSortArrayList.bubbleSort(stringhe);
		System.out.println(BubbleSortArrayList.getIndiceDelPiùPiccolo(0, stringhe));
		visualizza(stringhe);

	}
	
	public static void visualizza(ArrayList<String> a) {
		
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
	}
	
	

}
