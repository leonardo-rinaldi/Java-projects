package Esercizio21;

/*
 *	Una classe base astratta per disegnare semplici forme sullo
 *	schermi utilizzand i caratteri.
 */

public abstract class FormaBase {

    private int scostamento;

    public FormaBase() {
        scostamento = 0;
    }

    public FormaBase(int scostamentoIniziale) {
        scostamento = scostamentoIniziale;
    }

    public void setScostamento(int nuovoScostamento) {
        scostamento = nuovoScostamento;
    }

    public int getScostamento() {
        return scostamento;
    }

    public void disegnaDa(int numeroLinee) {
        for(int conteggio = 0; conteggio < numeroLinee; conteggio++) {
            System.out.println();
        }
        disegnaQui();
    }

    public abstract void disegnaQui();

    //Scrive il numero indicato di spazi
    protected static void saltaSpazi(int numero) {
        for(int conteggio = 0; conteggio < numero; conteggio++) {
            System.out.print(' ');
        }
    }
}
