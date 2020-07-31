import java.util.Scanner;

/*
 * 	7-	Si consideri la classe barcaAMotore che rappresenta una barca a motore. 
 *      Una barca a motore presenta i seguenti attributi:
 *      
 *      - la capacità del serbatoio;
 *      - la quantità di carburante nel serbatoio;
 *      - la velocità massima della barca;
 *      - la velocità corrente della barca;
 *      - l'efficenza del motore della barca;
 *      - la distanza percorsa.
 *      
 *      La classe ha i metodi per le seguenti attività:
 *      
 *      - cambiare la velocità della barca;
 *      - far navigare la barca per un certo tempo alla velocità corrente;
 *      - riempire il serbatoio con una certa quantità di carburante;
 *      - restituire l'ammontare di carburante nel serbatoio;
 *      - restituire la distanza percorsa.
 *      
 *      Se la barca ha un'efficenza e, l'ammontare di carburante usato quando si 
 *      naviga a una velocità s per un tempo t è: e * s^2 * t. La distanza è s * t. 
 * 
 */

public class BarcaAMotore {

	private double capacitàSerbatoio;
	private double carburanteNelSerbatoio;
	private double velocitàMassima;
	private double velocitàCorrente;
	private double efficenzaMotore;
	private double distanzaPercorsa;
	
	public void barca() {
		Scanner tastiera = new Scanner(System.in);
		String risposta;
		capacitàSerbatoio = 200000;
		velocitàMassima = 100;
		efficenzaMotore = 0.5;
		
		do {
			System.out.println("Scegli una delle seguenti azioni:");
			System.out.println("1- Cambia la velocità");
			System.out.println("2- Far navigare la barca");
			System.out.println("3- Riempi il serbatoio");
			System.out.println("4- Informazioni sulla barca");
			
			int azioneScelta = tastiera.nextInt();
			scelta(azioneScelta);
			
			System.out.println("Vuoi continuare con altre azioni?");
			risposta = tastiera.next();
		} while(risposta.equalsIgnoreCase("si"));
	}
	
	/*
	 * Precondizione: azioneScelta deve essere un intero
	 * Restituisce la scelta corrispettiva al numero scelto
	 */
	
	private void scelta(int azioneScelta) {
		Scanner tastiera = new Scanner(System.in);
		double valoreInserito;
		
		switch(azioneScelta) {
		case 1: 
			System.out.println("Inserire la velocità a cui vuoi andare");
			valoreInserito = tastiera.nextDouble();
			variaVelocità(valoreInserito);
			break;
		case 2:
			System.out.println("Per quanto tempo vuoi navigare?");
			valoreInserito = tastiera.nextDouble();
			navigare(valoreInserito);
			System.out.println("La distanza percorsa è: " + distanzaPercorsa + "km");
			break;
		case 3:
			System.out.println("Inserisci la quantità di carburante");
			valoreInserito = tastiera.nextDouble();
			riempiSerbatoio(valoreInserito);
			break;
		case 4:
			quantitàCarburante();
			System.out.println("Velocità corrente: " + velocitàCorrente);
			System.out.println("La distanza percorsa è di: " + distanzaPercorsa);
			
		}
		
	}
	/*
	 * Precondizione: la barca deve avere un valore per il carburante positivo
	 * Restituisce la nuova velocità della barca
	 */

	private double variaVelocità(double velocità) {
		if(carburanteNelSerbatoio <= 0) {
			System.out.println("Manca carburante, non puoi partire senza!");
		} else
		if(velocità <= velocitàMassima) {
			velocitàCorrente = velocità;
		} else {
			System.out.println("La velocità inserità non può superare la velocità massima");
		}
		return velocitàCorrente;
	}
	
	/*
	 * Restituisce la distanzaPercorsa da una barca in un lasso di tempo
	 */
	
	private double navigare(double tempo) {
		carburanteConsumato(tempo);
		distanzaPercorsa(tempo);
		return distanzaPercorsa;
	}
	
	private double riempiSerbatoio(double quantitàCarburante) {
		if(carburanteNelSerbatoio + quantitàCarburante <= capacitàSerbatoio) {
			carburanteNelSerbatoio = carburanteNelSerbatoio + quantitàCarburante;
		} else {
			System.out.println("Il serbatoio è troppo pieno!");
		}
		return carburanteNelSerbatoio;
	}
	
	private void quantitàCarburante() {
		System.out.println("L'ammontare di carburante nel serbatorio è: " + carburanteNelSerbatoio);
	}
	
	private double distanzaPercorsa(double tempo) {
		return distanzaPercorsa = velocitàCorrente * tempo;	// s * t
	}
	
	private double carburanteConsumato(double tempo) {
		double carburanteUsato = efficenzaMotore * (velocitàCorrente * velocitàCorrente) * tempo;	//e * s^2 * t
		return carburanteNelSerbatoio = carburanteNelSerbatoio - carburanteUsato;
	}
}


