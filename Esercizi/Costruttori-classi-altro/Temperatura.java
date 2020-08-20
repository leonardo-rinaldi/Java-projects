/*
 * 	5- Si scriva una classe Temperatura che rappresenta le temperature in gradi Celsius
 * 	   e Fahrenheit. Si usi un numero in virgola mobile per le temperature e un carattere
 * 	   per la scala: "C" per Celsius e "F" per Fahrenheit. La classe dovrebbe avere i seguenti
 * 	   elementi:
 * 		
 * 	   - quattro costruttori: uno che riceve in input i gradi, uno la scala, uno entrambi e un
 * 		 costruttore di default. Per ciascuno di questi costruttori si supponga che se non viene
 * 		 specificata la scala, sia di tipo Celsius e che se non vengono forniti i gradi, siano 0 
 * 		 gradi;
 * 
 * 	   - due metodi get: uno che restituisce la temperatura in gradi Celsius, l'altro in gradi 
 * 		 Fahrenheit.
 * 
 * 	   - tre metodi set: uno che imposti i gradi, uno che imposta la scala e uno entrambi;
 * 	   - tre metodi di confronto: un che verifica se due temperature sono uguali, uno che
 * 		 verifica se una temperatura è minore di un altra, uno che verifica se una temperatura
 * 		 è maggiore di un'altra.
 * 
 */

public class Temperatura {
	
	private double gradi;
	private char scala;
	
	/*
	 * Costruttori
	 */
	
	public Temperatura(double gradi) {
		this.gradi = gradi;
		scala = 'C';
	}
	
	public Temperatura(char scala) {
		gradi = 0;
		this.scala = scala;
	}
	
	public Temperatura(double gradi, char scala) {
		this.gradi = gradi;
		this.scala = scala;
	}
	
	public Temperatura() {
		gradi = 0;
		scala = 'C';
	}
	
	/*
	 * Metodi set
	 */
	
	public void setGradi(double gradi) {
		this.gradi = gradi;
	}
	
	public void setScala(char scala) {
		this.scala = scala;
	}
	
	public void setScalaGradi(double gradi, char scala) {
		this.gradi = gradi;
		this.scala = scala;
	}
	
	/*
	 * metodi get
	 */
	
	public double getCelsius(double temperaturaFahrenheit) {
		return  5 * (temperaturaFahrenheit - 32) / 9;
	}
	
	public double getFahrenheit(double temperaturaCelsius) {
		return (9 * (temperaturaCelsius / 5) + 32);
	}
	
	public double getGradi() {
		return gradi;
	}
	
	public char getScala() {
		return scala;
	}
	
	/*
	 * Metodi di confronto
	 */
	
	public boolean equalsTemperatura(Temperatura altroOggetto) {
		boolean risultato = false;
		
		if(scala == altroOggetto.getScala()) {
			risultato = gradi == altroOggetto.getGradi();
		} else {
			System.out.println("Scala non compatibile");
		}
		return risultato;
	}
	
	public boolean minore(Temperatura altroOggetto) {
		boolean risultato = false;
		
		if(scala == altroOggetto.getScala()) {
			risultato = gradi < altroOggetto.getGradi();
		} else {
			System.out.println("Scala non compatibile");
		}
		return risultato;
	}
	
	public boolean maggiore(Temperatura altroOggetto) {
		boolean risultato = false;
		
		if(scala == altroOggetto.getScala()) {
			risultato = gradi > altroOggetto.getGradi();
		} else {
			System.out.println("Scala non compatibile");
		}
		return risultato;
	}
}
