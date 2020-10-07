package Esercizio8;

/*
    8-  Creare una classe Razionale che rappresenti un numero razionale. Deve
        avere delle variabili di istanza private per rappresentare:

        - il numeratore (un intero);
        - il denominatore (un intero);

        e i seguenti metodi:

        - Razionale(numeratore, denominatore) un costruttore per un numero razionale;
        - i metodi get getnumeratore e getDenominatore e i metodi set setNumeratore
          e setDenominatore per il numeratore e il denominatore.

        Si deve utilizzare un'eccezione per garantire che il denominatore non sia uguale
        a 0.

 */

public class Razionale {

    private int numeratore;
    private int denominatore;

    public Razionale(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        controlloDenominatore(denominatore);
    }

    public int getNumeratore() {
        return numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }

    public void setDenominatore(int denominatore) {
        controlloDenominatore(denominatore);
    }

    /*
        Metodo per controllare che il denominatore sia diverso
        da zero.
     */

    public void controlloDenominatore(int denominatore) {
        try {
            if(denominatore == 0) {
                throw new Exception("Errore! Divisione per zero!");
            } else {
                this.denominatore = denominatore;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
