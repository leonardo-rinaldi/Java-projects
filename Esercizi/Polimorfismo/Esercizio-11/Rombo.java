/*
 * 	11- Si definisca una classe Rombo derivata dalla classe FormaGeometrica.
 * 		Si definiscano i metodi opportuni che disegnino le linee orizzontali,
 * 		le linee della grande V e le linee della grande V rovesciata.
 */

public class Rombo extends FormaGeometrica {
	private int altezza;
	private int larghezza;
	
	public Rombo() {
		super(0);
		altezza = 0;
		larghezza = 0;
	}
	
	public Rombo(int scostamento, int altezza, int larghezza) {
		super(scostamento);
		controlloDispariAltezza(altezza);
		controlloDispariLarghezza(larghezza);
	}
	
	public void setAltezza(int altezza) {
		controlloDispariAltezza(altezza);
	}
	
	public void setLarghezza(int larghezza) {
		controlloDispariLarghezza(larghezza);
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public int getLarghezza() {
		return larghezza;
	}
	
	public void disegnaQui() {
		parteSuperiore();
		parteInferiore();
	}
	
	private void parteSuperiore() {
		int spazioInterno = 1;
		int spazio = larghezza / 2 - 1;
		
		saltaSpazi(getScostamento());
		saltaSpazi(spazio + 1);
		System.out.print("*");
		System.out.println();
		for(int i = 0; i < altezza / 2 - 1; i++) {
			saltaSpazi(getScostamento());
			saltaSpazi(spazio--);
			System.out.print("*");
			saltaSpazi(spazioInterno);
			System.out.print("*");
			spazioInterno+=2;
			System.out.println();
		}
	}
	
	private void parteInferiore() {
		int spazioInterno = larghezza - 2;
		int spazio = 0;
		
		for(int i = altezza / 2; i > 0; i--) {
			saltaSpazi(getScostamento());
			saltaSpazi(spazio);
			System.out.print("*");
			saltaSpazi(spazioInterno);
			System.out.print("*");
			System.out.println();
			spazio++;
			spazioInterno-=2;
		}
		saltaSpazi(getScostamento());
		saltaSpazi(spazio);
		System.out.println("*");
	}
	
	private void controlloDispariAltezza(int altezza) {
		if(altezza % 2 != 0) {
			this.altezza = altezza;
		} else {
			System.out.println("L'altezza deve essere un numero dispari.");
		}
	}
	
	private void controlloDispariLarghezza(int larghezza) {
		if(larghezza % 2 != 0) {
			this.larghezza = larghezza;
		} else {
			System.out.println("La larghezza deve essere un numero dispari");
		}
	}
}
