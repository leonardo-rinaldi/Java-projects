package Esercizio14;

import java.util.Scanner;

/*
   14- Definire una classe di eccezione chiamata MessaggioTroppoLungoException
       che abbia due costruttori: uno di default che assegna al messaggio la stringa
       "Messaggio troppo lungo" e l'altro che accetta in ingresso un argomento di
       tipo String. Usare tale classe in un programma che chiede all'utente di inserire
       una riga di testo composta da non più di 20 caratteri. Se l'utente inserisce un
       numero accettabile di caratteri, il programma deve visualizzare il messaggio "Hai
       inserito x caratteri, che è un numero di caratteri accettabile" (al posto della
       lettera x deve essere indicato l'effettivo numero di caratteri). In caso contrario,
       deve essere lanciata e catturata un'eccezione del tipo MessaggioTroppoLugoExcetion.
       In ogni caso, il programma deve ripetutamente chiedere all'utente se vuole inserire
       un'atra riga di testo o se desidera terminare l'esecuzione.

 */

public class RigaDiTesto {

    public static void main(String[] args) {
        RigaDiTesto stringa = new RigaDiTesto();
        stringa.inserisciStringa();
    }

    /*
        Metodo che permette di inserire una stringa e determina se
        è più o meno lunga di 20 caratteri
     */

    public void inserisciStringa() {
        Scanner tastiera = new Scanner(System.in);
        String risposta;
        int lunghezzaStringa;

        do {
            System.out.println("Inserisci una stringa con meno di 20 caratteri");
            risposta = tastiera.nextLine();
            lunghezzaStringa = risposta.length();
            validitàStringa(lunghezzaStringa);
            System.out.println("Vuoi inserire un'altra stringa?");
            risposta = tastiera.nextLine();
        } while(!risposta.equalsIgnoreCase("no"));
    }

    /*
        Metodo che identifica una stringa lunga più di
        20 caratteri e lancia un'eccezione.

        Precondizione: La lunghezza della stringa deve essere un
                       numero intero > 0
     */

    private void validitàStringa(int lunghezzaStringa) {
        try {
            if(lunghezzaStringa > 20) {
                throw new MessaggioTroppoLungoException();
            } else {
                System.out.println("Hai inserito " + lunghezzaStringa + " caratteri, che è un numero di caratteri accettabile");
            }
        } catch(MessaggioTroppoLungoException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}

