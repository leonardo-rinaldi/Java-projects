/*
 * 	5- La seguente classe visualizza un messaggio di avvertimento ogni volta
 * 	   che viene creata un'istanza utilizzando il costruttore di default. Tuttavia,
 * 	   è preferibile che questo messaggio appaia una sola volta quando viene creato
 * 	   il primo oggetto di tipo Veicolo. Il messaggio non dovrà apparire quando vengono
 * 	   creati i successivi oggetti di tipo Veicolo. Modificare il codice per usare una
 * 	   variabile statica di tipo boolean che viene inizializzata a false quando viene
 * 	   definita. Una volta che viene visualizzato il messaggio, la variabile dovrà essere
 * 	   impostata a true. Aggiungere un'istruzione if in modo che il messaggio sia
 * 	   viualizzato soltanto se la variabile ha il valore false. Ciò dovrebbe forzare il programma
 * 	   a visualizzare il messaggio una sola volta. Aggiungere un metodo main e provare il codice 
 * 	   per verificare che il messaggio sia visualizzato una sola volta.
 * 
 * 	   public class Veicolo {
 * 			public Veicolo {
 * 				System.out.println("Non dovreste guidare questo veicolo sotto ");
 * 				System.out.println("l'effetto dell'alcool!");
 * 		}
 * 	  }
 * 
 */


public class Veicolo {
	
	public static boolean messaggio = false;	// se metto una variabile di istanza verrà sempre inizializzata a false

	public Veicolo() {
		if(messaggio == false) {
			System.out.println("Non dovreste guidare questo veicolo sotto ");
			System.out.println("l'effetto dell'alcool!");
			messaggio = true;
		}
	}
}
