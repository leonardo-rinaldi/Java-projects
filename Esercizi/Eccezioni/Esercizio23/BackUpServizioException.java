package Esercizio23;

public class BackUpServizioException extends Exception {

    public BackUpServizioException() {
        super("Spazio per i nomi esaurito!");
    }

    public BackUpServizioException(String messaggio) {
        super(messaggio);
    }
}
