import java.util.Scanner;

import oggetti.ListaSenzaRipetizioni;

public class ListaDemo {

	public static final int DIMENSIONE_MAX = 3;
	
	public static void main(String[] args) {
		
		 ListaSenzaRipetizioniDue listaDiCoseDaFare = new ListaSenzaRipetizioniDue(DIMENSIONE_MAX);
		 
		 System.out.println("Inserire gli elementi per la lista " + "quando richiesto.");
		 boolean altriElementi = true;
		 String successivo = null;
		 Scanner tastiera = new Scanner(System.in);
		 
		 while(altriElementi && !listaDiCoseDaFare.piena()) {
			 System.out.println("Inserire un elemento:");
			 successivo = tastiera.nextLine();
			 listaDiCoseDaFare.aggiungiElemento(successivo);
			 
			 if(listaDiCoseDaFare.piena()) {
				 System.out.println("La lista è piena.");
			 } else {
				 System.out.print("Altri elementi per la lista? ");
				 String risposta = tastiera.nextLine();
				 if(risposta.trim().equalsIgnoreCase("no")) {
					 altriElementi = false;
				 }
			 }
		 }
		 System.out.println("La lista contiene:");
		 int posizione = listaDiCoseDaFare.POSIZIONE_INIZIALE;
		 successivo = listaDiCoseDaFare.getElementoIn(posizione);
		 
		 while(successivo != null) {
			 System.out.println(successivo);
			 posizione++;
			 successivo = listaDiCoseDaFare.getElementoIn(posizione);
		 }
	}
	
}
