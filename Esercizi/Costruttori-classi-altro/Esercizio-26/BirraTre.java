import java.util.Scanner;

/* 
 * 	7-	Definire una classe Birra che contiene le seguenti variabili di istanza con
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
 * 		E' possibile migliorare la classe Birra del precedente programma utilizzando i 
 * 		principi dell'information hiding. La variabile di istanza alcool contiene la 
 * 		percentuale di alcool nella birra. Se questa variabile è pubblica, allora qualcuno
 * 		potrebbe impostare il valore di questa variabile nel modo sbagliato. Per esempio, se
 * 		la percentuale di alcool è 5%, allora qualcuno potrebbe impostarla a 5.0, anzichè a
 * 		0.05, come si aspetta il programma. In questo caso, il proramma segnalerebbe che
 * 		qualcuno è già intossicato secondo la legge dopo aver bevuto un piccolo sorso di birra.
 * 		
 * 		Risolvere questo problema aggiungendo o modificando il metodo set, setAlcool. Se la 
 * 		variabile che si sta impostando è maggiore di 1, allora la variabile alcool dovrà
 * 		essere impostata al valore passato in ingresso diviso 100; altrimenti, dovrà essere
 * 		impostata al valore passato in ingresso. Questo controllo dovrà essere effetuato
 * 		anche per la percentuale di alcool a 5.0 e a 0.05. I risultati ottenuti dovrebero
 * 		essere uguali.
 * 
 */ 		

public class BirraTre {

	private String nome;
	private double alcool;
	
	public BirraTre(String nome, double alcool) {
		this.nome = nome;
		
		if(alcool > 1) {
			this.alcool = alcool / 100;
		} else {
			this.alcool = alcool;
		}
	}
	
	public void setNome() {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il nome della birra:");
		nome = tastiera.next();
	}
	
	public void setAlcool() {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci la percentuale di alcool:");
		double percentualeInserita = tastiera.nextDouble();
		
		if(percentualeInserita > 1) {
			alcool = percentualeInserita / 100;
		} else {
			alcool = percentualeInserita;
		}
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
