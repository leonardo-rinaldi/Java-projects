package metodi;

/*
 * 	CAPITOLO 5
 * 
 * 	1- Scrivere una classe Java chiamata Calcolatrice che definisce quattro metodi che
 * 	   rispettivamente sommano, moltiplicano, dividono e sottragono due valori interi.
 * 	   Scrivere quindi un programma driver per collaudare i quattro metodi.
 * 
 */

public class Calcolatrice {

	public static double somma(double primoNumero, double secondoNumero) {
		
		return primoNumero + secondoNumero;
		
	}
	
	public static double sottrazione(double primoNumero, double secondoNumero) {
		
		return primoNumero - secondoNumero;
		
	}
	
	public static double moltiplicazione(double primoNumero, double secondoNumero) {
		
		return primoNumero * secondoNumero;
		
	}

	public static double divisione(double primoNumero, double secondoNumero) {
		
		double risultato = 0;
		
		if(secondoNumero == 0) {
			System.out.println("Errore, non puoi dividere per 0!");
		} else {
			risultato = primoNumero / secondoNumero;
		}
		
		return risultato;
	}
	
}
