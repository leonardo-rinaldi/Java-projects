import java.util.Scanner;

/*
 * 	6-	Definire una classe Birra che contiene le seguenti variabili di istanza con
 * 	 	i metodi get e set:
 * 
 * 		String nome;	//il nome della birra
 * 		double alcool;	//la percentuale di alcool della birra, per esempio 0.05 per 5%
 * 		
 * 		Aggiungere il seguente metodo:
 * 
 * 		//	Questo metodo restituisce il numero di boccali che un individuo
 * 		//	di peso leggero può bere in base alla percentuale di alcool della
 * 		//	birra, supponendo che un boccale sia di 12 once. Questa è una
 * 		// 	stima. Il metodo suppone che il limite legale di alcool nel sangue
 * 		//  sia di 0.08.
 * 
 * 		public double numeroBoccaliBevibili(double peso) {
 * 		double numBoccali;
 * 		// Questa è una semplificazione della formula di Widmark
 * 		numBoccali = (0.08 + 0.015) * peso / (12 * 7.5 * alcool);
 * 		return numBoccali;
 * 		}
 * 
 * 		Scrivere il codice in un metodo main che crea due oggetti Birra con percentuali
 * 		di alcool differenti. Invocare il metodo numeroBoccaliBevibili per un individuo
 * 		di peso leggero e per un individuo pesante, e visualizzare in output il numero
 * 		stimato di boccali che unindividuo può bere per essere considerato ubriaco
 * 		secondo la legge.
 * 
 * 		
 * 		Aggiungere un costruttore che consenta all'utente di inizializzare il nome e la 
 * 	 	percentuale di alcool della birra.
 *
 */

public class BirraDue {

	private String nome;
	private double alcool;
	
	public BirraDue(String nome, double alcool) {
		this.nome = nome;
		this.alcool = alcool;
	}
	
	public void setNome() {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il nome della birra:");
		nome = tastiera.next();
	}
	
	public void setAlcool() {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci la percentuale di alcool:");
		alcool = tastiera.nextDouble();
	}
	
	public void setPeso() {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo peso:");
		double peso = tastiera.nextDouble();
		System.out.println(numeroBoccaliBevibili(peso));
	}
	
	private double numeroBoccaliBevibili(double peso) {
		double numBoccali;
		
		numBoccali = (0.08 + 0.015) * peso / (12 * 7.5 * alcool);
		return numBoccali;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getAlcool() {
		return alcool;
	}
}
