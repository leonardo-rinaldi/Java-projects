import java.util.ArrayList;
import java.util.Scanner;

/*
 *	13- Si ripeta il precedente progetto, ma ordinando gli oggetti Animale
 *	    rispetto al peso dell'animale invece che rispetto al nome. Dopo aver
 *	    visualizzato i dati sullo schermo, si scriva il numero degli animali
 *	    il cui peso è, rispettivamente, sotto i 5 kg, compreso tra i 5 kg e
 *	    i 10 kg e oltre i 10 kg.
 *
 */

public class CreaAnimaliDue {
	
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
	
	private void visualizzaNomi(ArrayList<Double> peso) {
		System.out.println("Peso in ordine crescente::");
		for(int i = 0; i < peso.size(); i++) {
			System.out.println(peso.get(i));
		}
	}
	
	public void ordina() {
		ArrayList<Double> peso = new ArrayList<Double>();
		
		for(int i = 0; i < animali.size(); i++) {
			peso.add(animali.get(i).getPeso());
		}
		OrdinaArrayListDouble.selectionSort(peso);
		visualizzaNomi(peso);
	}
	
	public void percentuali() {
		int sottoCinque = 0;
		int cinqueDieci = 0;
		int oltreDieci = 0;
		
		for(int i = 0; i < animali.size(); i++) {
			if(animali.get(i).getPeso() < 5) {
				sottoCinque++;
			} else 
				if(animali.get(i).getPeso() >= 5 && animali.get(i).getPeso() <= 10) {
					cinqueDieci++;
				} else {
					oltreDieci++;
				}
		}
		
		System.out.println();
		System.out.println("Pesi sotto i 5 kg = " + sottoCinque);
		System.out.println("Pesi compresi tra i 5 kg e i 10 kg: " + cinqueDieci);
		System.out.println("Pesi sopra i 10 kg: " + oltreDieci);
	}
}
