package Esercizio23;

/*
    Test della classe RichiestaServizio
 */

public class RichiestaServizioTest {

    public static void main(String[] args) {
        RichiesteServizio servizio = new RichiesteServizio();

        for(int i = 0; i < 10; i++) {
            servizio.aggiungiNomi();
        }

        servizio.rimuoviNome("Davide");
        servizio.getNome(1);
        System.out.println("Richieste servizio: " + servizio.getNumero());
        servizio.visualizzaNomi();

    }
}
