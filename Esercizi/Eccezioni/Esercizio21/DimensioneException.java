package Esercizio21;

/*
    21- Definire una classe di eccezione chiamata DimensioneException
        da usare nel programma driver dell'esercizio 13 sul polimorfismo.
        Modificare il programma in modo che lanci e catturi un'eccezione
        di tipo DimensioneException se l'utente inserisce valori minori o
        uguali a 0 per una dimensione.
 */

public class DimensioneException extends Exception {

   public DimensioneException() {
       super("Valore non valido");
   }

   public DimensioneException(String messaggio) {
       super(messaggio);
   }
}
