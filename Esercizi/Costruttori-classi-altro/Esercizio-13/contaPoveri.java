import java.util.Scanner;

public class contaPoveri {
	
	private Famiglia[] famiglie;	//oggetto array
	private double costoMedioCasa;
	private double costoMedioCibo;

	public static void main(String[] args) {
		
		contaPoveri prova = new contaPoveri();
		prova.riempiArray();
		prova.costi();
		prova.visualizzaArray();
	}
	
	public void riempiArray() {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di famiglie");
		int k = tastiera.nextInt();
		
		famiglie = new Famiglia[k]; //array di dimensione k
		
		for(int i= 0; i < k; i++) {
			System.out.println("Inserisci il reddito della famiglia:");
			double reddito = tastiera.nextDouble();
			System.out.println("Inserisci la dimensione della famiglia:");
			int dimensione = tastiera.nextInt();
			
			famiglie[i] = new Famiglia(reddito, dimensione);
		}
	}
	
	public void costi() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserire costo medio casa:");
		costoMedioCasa = tastiera.nextDouble();
		System.out.println("Inserire costo medio cibo:");
		costoMedioCibo = tastiera.nextDouble();
		
	}
	
	public void visualizzaArray() {
		System.out.println("Famiglie povere:");
		
		for(int i = 0; i < famiglie.length; i++) {
			if(famiglie[i].povera(costoMedioCasa, costoMedioCibo)) {
				System.out.println(famiglie[i].toString());
			} else {
				continue;
			}
		}
	}

}
