import java.util.Scanner;

/*
 * 	CAPITOLO 8
 * 
 * 	8- 
 * 
 */

public class PromotoreConcerto {
	
	private String nomeGruppo;
	private int capacitàLuogoConcerto;
	private int bigliettiVenduti;
	private double prezzoBigliettoTelefono;
	private double prezzoBigliettoSulPosto;
	private double prezzoAttuale;
	private double ricavatoTotale;
	
	public void concerto() {
		Scanner tastiera = new Scanner(System.in);
		prezzoBigliettoTelefono = 3;
		prezzoBigliettoSulPosto = 2;
		capacitàLuogoConcerto = 1000;
		
		System.out.println("Inserisci il nome del gruppo:");
		nomeGruppo = tastiera.next();
	}
	
	public void cambiaPrezzo(int giorno) {	
		if(giorno == 0) { //giorno del concerto
			prezzoAttuale = prezzoBigliettoSulPosto;
		} else {
			prezzoAttuale = prezzoBigliettoTelefono;
		}
	}
	
	/*
	 * Registra la vendita di uno o più biglietti
	 */
	
	public void venditaBiglietto() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Quanti biglietti vuoi comprare?");
		int bigliettiComprati = tastiera.nextInt();
		bigliettiVenduti = bigliettiVenduti + bigliettiComprati;
		double prezzoTotale = prezzoAttuale * bigliettiVenduti;
		ricavatoTotale = ricavatoTotale + prezzoTotale;
	}
	
	public double totaleVendite() {
		return ricavatoTotale;
	}
	
	public int bigliettiRimanenti() {
		return capacitàLuogoConcerto - bigliettiVenduti;
	}
	
	public int bigliettivenduti() {
		return bigliettiVenduti;
	}
}
