/*
 *	Classe per la vendita di un componente con lo sconto espresso
 *	come una percentuale del prezzo, ma senza altri aggiustamenti.
 *	Il prezzo e lo sconto assumono valori non negativi;
 *	il nome è una stringa non vuota.
 */

public class VenditaScontata extends Vendita {

	private double sconto;	//Una percentuale del prezzo.
							//Non può essere negativa.
	
	public VenditaScontata() {
		super();
		sconto = 0;
	}
	
	/*
	 * Precondizione: ilNome è una stringa non vuota; ilPrezzo è non negativo;
	 * loSconto è espresso come una percentuale del prezzo ed è non negativo.
	 */
	
	public VenditaScontata(String ilNome, double ilPrezzo, double loSconto) {
		super(ilNome, ilPrezzo);
		setSconto(loSconto);
	}
	
	public VenditaScontata(VenditaScontata oggettoOriginale) {
		super(oggettoOriginale);
		sconto = oggettoOriginale.sconto;
	}
	
	public static void annuncio() {
		System.out.println("Questa è la classe VenditaScontata.");
	}
	
	public double totale() {
		double frazione = sconto / 100;
		return (1 - frazione) * getPrezzo();
	}
	
	public double getSconto() {
		return sconto;
	}
	
	/*
	 * Precondizione: nuovoSconto è non negativo.
	 */
	
	public void setSconto(double nuovoSconto) {
		if(nuovoSconto >= 0) {
			sconto = nuovoSconto;
		} else {
			System.out.println("Errore: sconto negativo.");
			System.exit(0);
		}
	}
	
	public String toString() {
		return ("Componente = " + getNome() +
				", Prezzo = E" + getPrezzo() +
				" Sconto = " + sconto + "%\n" +
				" Costo totale = E" + totale());
	}
	
	public boolean equals(Object altroOggetto) {
		if(altroOggetto == null) {
			return false;
		} else if (!(altroOggetto instanceof VenditaScontata)) {
			return false;
		} else {
			VenditaScontata altraVenditaScontata = (VenditaScontata)altroOggetto;
			return (super.equals(altraVenditaScontata) && sconto == altraVenditaScontata.sconto);
		}
	}
}
