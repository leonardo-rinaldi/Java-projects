/*
 *	3- Scrivere un metodo ricorsivo che conti il numero di cifre dispari
 *	   in un numero.
 * 
 */

public class Dispari {

	public static void main(String[] args) {
		
		System.out.println(trovaNumeriDispari(3433));

	}
	
	public static int trovaNumeriDispari(int numeroInserito) {
		int risultato;
		
		if(numeroInserito == 0) {
			risultato = 0;
		} else {
			risultato = (numeroInserito % 2) + (trovaNumeriDispari(numeroInserito / 10));
		}
		return risultato;
	}
}
