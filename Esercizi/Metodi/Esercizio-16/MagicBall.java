package metodi;

/*
 * 	CAPITOLO 5
 * 
 * 	2-	Scrivere una classe che simula il gioco della magica palla 8.
 * 		Scrivere un programma che simula il gioco. La classe dovrà avere
 * 		un metodo che restituisce una risposta casuale. Provare l'output 
 * 		della classe eseguendo più volte il programma.
 */

public class MagicBall {
	
	public static String pallaMagica() {
		
		int num = (int) (Math.random() * 8) + 1;
		String risposta = "";
		
		switch(num) {
		
		case 1:
			risposta = "E certo";	
			break;
		case 2:
			risposta = "E' decisamente così";
			break;
		case 3:
			risposta = "E' molto probabile";
			break;
		case 4:
			risposta = "I segni indicano di sì";
			break;
		case 5:
			risposta = "E' difficile rispondere, prova di nuovo";
			break;
		case 6:
			risposta = "Rifai la domanda più tardi";
			break;
		case 7:
			risposta = "Non ci contare";
			break;
		case 8:
			risposta = "Le mie fonti dicono di no";
			break;
			
		}
		return risposta;
	}
	
}
