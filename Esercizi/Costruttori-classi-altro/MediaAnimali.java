import java.util.Scanner;

/*
 * 	CAPITOLO 9
 * 
 * 	3- Si usi la classe Animale per scrivere un programma che legge i dati di 
 * 	   cinque animali e mostri le seguenti informazioni: nome del più piccolo,
 * 	   nome del più grande, nome del più vecchio, nome del più giovane, peso
 * 	   medio dei cinque animali ed età media dei cinque animali.
 * 
 */


public class MediaAnimali {

	public Animale[] animali;
	
	public void setValori() {
		Scanner tastiera = new Scanner(System.in);
		animali = new Animale[5];
		
		for(int i = 0; i < animali.length; i++) {		
			System.out.println("Inserisci un nome:");
			String nome = tastiera.next();
			System.out.println("Inserisci un età:");
			int età = tastiera.nextInt();
			System.out.println("Inserisci un peso:");
			double peso = tastiera.nextDouble();
			
			animali[i] = new Animale(nome, età ,peso);	//creo un nuovo oggetto	
		}
	}
	
	/*
	 * Restituisce il nome dell'animale più giovane
	 */
	
	public String nomePiùGiovane() {
		String nome = "";
		int minore = 0;
		
		if(animali[1].getEtà() < animali[0].getEtà()) {
			minore = animali[1].getEtà();
			nome = animali[1].getNome();
		} else {
			minore = animali[0].getEtà();
			nome = animali[0].getNome();
		}
		
		for(int i = 0; i < animali.length; i++) {
			if(animali[i].getEtà() < minore) {
				minore = animali[i].getEtà();
				nome = animali[i].getNome();
			} else {
				continue;
			}
		}
		return nome;
	}
	
	/*
	 * Restituisce il nome del più vecchio
	 */
	
	public String nomePiùVecchio() {
		String nome = "";
		int maggiore = 0;
		
		if(animali[1].getEtà() > animali[0].getEtà()) {
			maggiore = animali[1].getEtà();
			nome = animali[1].getNome();
		} else {
			maggiore = animali[0].getEtà();
			nome = animali[0].getNome();
		}
		
		for(int i = 0; i < animali.length; i++) {
			if(animali[i].getEtà() > maggiore) {
				maggiore = animali[i].getEtà();
				nome = animali[i].getNome();
			} else {
				continue;
			}
		}
		return nome;
		
	}
	
	/*
	 * Restituisce il nome del più piccolo
	 */
	
	public String nomePiùPiccolo() {
		String nome = "";
		double minore = 0;
		
		if(animali[1].getPeso() < animali[0].getPeso()) {
			minore = animali[1].getPeso();
			nome = animali[1].getNome();
		} else {
			minore = animali[0].getPeso();
			nome = animali[0].getNome();
		}
		
		for(int i = 0; i < animali.length; i++) {
			if(animali[i].getPeso() < minore) {
				minore = animali[i].getPeso();
				nome = animali[i].getNome();
			} else {
				continue;
			}
		}
		return nome;
	}
	
	/*
	 * Restituisce il nome del più grande
	 */
	
	public String nomePiùGrande() {
		String nome = "";
		double maggiore = 0;
		
		if(animali[1].getPeso() > animali[0].getPeso()) {
			maggiore = animali[1].getPeso();
			nome = animali[1].getNome();
		} else {
			maggiore = animali[0].getPeso();
			nome = animali[0].getNome();
		}
		
		for(int i = 0; i < animali.length; i++) {
			if(animali[i].getPeso() > maggiore) {
				maggiore = animali[i].getPeso();
				nome = animali[i].getNome();
			} else {
				continue;
			}
		}
		return nome;	
	}
	
	/*
	 * Ritorna il peso medio degli animali
	 */
	
	public double pesoMedio() {
		double pesoTotale = 0;
		double mediaPeso;
		
		for(int i = 0; i < animali.length; i++) {
			pesoTotale = pesoTotale + animali[i].getPeso();
		}
		mediaPeso = pesoTotale / 5;
		return mediaPeso;
	}
	
	/*
	 * Ritorna l'età media degli animali
	 */
	
	public int etàMedia() {
		int etàTotale = 0;
		int mediaEtà;
		
		for(int i = 0; i < animali.length; i++) {
			etàTotale = etàTotale + animali[i].getEtà();
		}
		mediaEtà = etàTotale / 5;
		return mediaEtà;
	}
	
}
