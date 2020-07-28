/*
 * 	4- Scrivere un metodo ricorsivo che calcoli la somma delle cifre di
 * 	   un numero positivo.
 * 
 */

public class SommaCIfre {

	public static void main(String[] args) {
		
		System.out.println(sommaCifre(333));

	}
	
	public static int sommaCifre(int numero) {
		int risultato = 0;
		
		if(numero == 0) {
			risultato = 0;
		} else {
			risultato = (numero % 10) + sommaCifre(numero / 10);
		}
		return risultato;
	}

}
