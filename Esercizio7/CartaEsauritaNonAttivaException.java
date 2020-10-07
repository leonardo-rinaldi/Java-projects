package Esercizio7;

public class CartaEsauritaNonAttivaException extends Exception{

    public CartaEsauritaNonAttivaException() {
        super("la carta è esaurita o non attiva");
    }

    public CartaEsauritaNonAttivaException(String messaggio) {
        super(messaggio);
    }
}
