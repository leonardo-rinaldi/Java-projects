package metodi;

/* 
 * 	7- Si realizzi una classe Java che abbia definito il metodo ordinaEstampa che accetta 
 * 	   in ingresso tre valori interi e visualizza quindi gli interi in ordine crescente. Si
 * 	   scriva un programma driver per collaudare il metodo.
 * 
 */

public class InteriOrdinati {
	
	public static void ordinaEstampa(int x, int y, int z) {
		
		if(x < y && y < z) {
			System.out.println(x + " " + y + " " + z);
		} else
			if(x < y && y > z) {
				System.out.println(x + " " + z + " " + y);
			} else 
				if(x > y && y > z) {
					System.out.println(z + " " + y + " " + x);
				} else
					if(x > y && y < z) {
						System.out.println(y + " " + x + " " + z);
					}
		
	}
}
