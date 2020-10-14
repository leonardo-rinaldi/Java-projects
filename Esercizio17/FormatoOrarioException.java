package Esercizio17;

public class FormatoOrarioException extends Exception {

    public FormatoOrarioException() {
        super("Formato orario non valido");
    }

    public FormatoOrarioException(String messaggio) {
        super(messaggio);
    }
}
