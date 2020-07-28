/*
 *	6- Scrivere un metodo ricorsivo che calcoli la somma di tutti
 *	   gli elementi di un array.
 * 
 */

public class SommaArray {

	public static void main(String[] args) {
		
		int[] a = {3, 3, 2};
		int n = a.length - 1;
		System.out.println(sommaArray(a, n));
	}
	
	public static int sommaArray(int[] a, int n) {
		int risultato;
		
		if(n == 0) {
			risultato = a[0];
		} else {
			risultato = a[n] + sommaArray(a, n - 1);
		}
		return risultato;
		
		
		
	}

}
