import java.util.Scanner;

/*
 * 	CAPITOLO 8
 * 
 * 	6- Si consideri una classe che registra le vendite di un articolo. Un oggetto di
 * 	   questa classe avrà i seguenti attributi:
 * 		
 * 	   - numero venduti;
 * 	   - totale vendite;
 *     - totale scontati;
 *     - costo per articolo;
 *     - quantità all'ingrosso;
 *     - sconto percentuale all'ingrosso.
 *     
 *     Inoltre avrà i seguenti metodi:
 *     
 *     - registraVendita(n) - registra la vendita di n articoli. Se n supera la quantità
 *       all'ingrosso, il costo per ogni articolo deve essere ridotto della percentuale di
 *       sconto all'ingrosso;
 *       
 *     - mostraVendite - mostra il numero di articoli venduti, il totale delle vendite e lo
 *       sconto totale.
 * 
 */

public class VenditeArticolo {

	private int numeroVenduti;
	private double totaleVendite;
	private double totaleScontati;
	private double costoArticolo;
	private int quantitàIngrosso;
	private double scontoIngrosso;
	
	public void vendite() {
		Scanner tastiera = new Scanner(System.in);
		int articoli = 0;
		
		quantitàIngrosso = 5;
		scontoIngrosso = 0.5;
		
		System.out.println("Inserisci il numero di articoli venduti");
		numeroVenduti = tastiera.nextInt();
		
		while(articoli < numeroVenduti) {
		System.out.println("Inserisci il costo dell'articolo");
		costoArticolo = tastiera.nextDouble();
		registraVendite(numeroVenduti);
		totaleVendite = totaleVendite + costoArticolo;
		articoli++;
		
		}
		mostraVendite();
	}
	
	private double registraVendite(int n) {
		if(n >= quantitàIngrosso) {
			costoArticolo = costoArticolo - (costoArticolo * scontoIngrosso);
			totaleScontati = scontoIngrosso * numeroVenduti;
		}
		return costoArticolo;
	}
	
	private void mostraVendite() {
		System.out.println(numeroVenduti);
		System.out.println(totaleVendite);
		System.out.println(totaleScontati);
	}
}
