package Esercizio10;

/*
    10- Si supponga di voler creare un oggetto per contare il numero di
        persone in una stanza. Tale numero non può mai essere negativo.
        Creare una classe ContatoreStanza che abbia tre metodi pubblici:

        - aggiungiPersona: aggiunge una persona allas tanza;
        - rimuoviPersona: rimuove una persona dalla stanza;
        - getContatore: restituisce il numero di persone nella stanza.

        Qualora l'invocazione al metodi rimuoviPersona rendesse il numero
        di persone presenti nella stanza inferiore a 0, si deve lanciare
        un'eccezione ContatoreNegativoException.
 */

public class ContatoreStanza {

    private int numeroPersone;

    public void aggiungiPersona() {
        numeroPersone++;
    }

    public void rimuoviPersona() {
        try {
            numeroPersone--;
            if(numeroPersone < 0) {
                throw new ContatoreNegativoException();
            }
        } catch(ContatoreNegativoException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public void getContatore() {
        System.out.println("Il numero totale di persone è: " + numeroPersone);
    }
}
