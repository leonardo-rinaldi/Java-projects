import java.util.Scanner;

/*
 * 	2- Il seguente codice crea una piccola rubrica telefonica. Un array viene utilizzato
 * 	   per memorizzare una lista di nomi; un altro array viene utilizato per memorizzare
 * 	   i numeri di telefono che sono associati a ciascun nome. Per esempio il numero di
 * 	   telefono di Michele Marini è 333-8000 e quello di Andrea Villa è 333-2323.
 * 
 * 	   Scrivere il metodo cercaNome in modo che ricerchi e restituisca il numero di 
 * 	   telefono associato al nome passato in ingresso. Questo metodo dovrà restituire 
 * 	   una stringa vuota se il nome non è presente in rubrica.
 * 
 */

public class RubricaTelefonica {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		String[] nomi = {"Michele Marini", "Andrea Villa", "Gianni Torre", "Francesco Carini"};
		String[] numeriTel = {"333-8000", "333-2323", "333-6150", "339-7970"};
		
		System.out.println("Digita il nome da cercare.");
		String nomeTarget = tastiera.nextLine();
		String telTarget = cercaNome(nomi, numeriTel, nomeTarget);
		System.out.println("Il numero di telefono è " + telTarget);
	}
	
	public static String cercaNome(String[] nomi, String[] numeriTel, String nomeTarget) {
		
		String numeroScelto = "";
		
		for(int i = 0; i < nomi.length; i++) {
			if(nomi[i].equalsIgnoreCase(nomeTarget)) {
				numeroScelto = numeriTel[i];
			} else {
				continue;
			}
		}
		return numeroScelto;
	}

}
