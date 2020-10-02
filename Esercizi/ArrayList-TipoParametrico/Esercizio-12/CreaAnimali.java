import java.util.ArrayList;
import java.util.Scanner;

/* 
 * 	12-	Si scriva un programma che crei un oggetto Animale dai dati letti da tastiera.
 * 		Si memorizzino questi oggetti in un'istanza di ArrayList. Si sistemino quindi 
 * 		gli oggetti Animale in ordine alfabetico rispetto al nome dell'animale e infine
 * 		si mostrino sullo schermo i dati degli oggetti Animale ordinati.
 * 
 */

public class CreaAnimali {
	
	private ArrayList<AnimaleArrayList> animali;
	
	public void riempiArray() {
		Scanner tastiera = new Scanner(System.in);
		animali = new ArrayList<AnimaleArrayList>();
		boolean continuare = true;
		
		do {
		System.out.println("Inserisci un nome per l'animale");
		String nome = tastiera.next();
		System.out.println("Inserisci un'età per l'animale");
		int età = tastiera.nextInt();
		System.out.println("Iserisci un peso per l'animale");
		double peso = tastiera.nextDouble();
		
		animali.add(new AnimaleArrayList(nome, età, peso));
		
		System.out.println("Premi y per continuare, altrimenti premi n");
		String risposta = tastiera.next();
		
		if(risposta.equalsIgnoreCase("y")) {
			continuare = true;
		} else {
			continuare = false;
		}
		
		}while(continuare);
		
	}
	
	private void visualizzaNomi(ArrayList<String> nomi) {
		System.out.println("Nomi in ordine alfabetico:");
		for(int i = 0; i < nomi.size(); i++) {
			System.out.println(nomi.get(i));
		}
	}
	
	public void ordina() {
		ArrayList<String> nomi = new ArrayList<String>();
		
		for(int i = 0; i < animali.size(); i++) {
			nomi.add(animali.get(i).getNome());
		}
		OrdinaArrayList.selectionSort(nomi);
		visualizzaNomi(nomi);
	}
}
