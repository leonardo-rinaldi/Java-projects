package Esercizio23;

/*
    23- Si supponga di essere il responsabile del servizio clienti di un negozio. Per
        ogni chiamata ricevuta, viene registrato il nome del chiamante. Scrivere una
        classe RichiestaServizio che tiene traccia del nome dei chiamanti. La classe
        dovrebbe avere i seguenti metodi:

        - aggiungiNome(nome): aggiunge un nome alla lista dei nomi e lancia un'eccezione
                              BackUpServizioException se non c'è spazio libero nella lista.
        -rimuoviNome(nome): rimuove un nome dalla lista e lancia un'eccezione RichiestaServizioException
                            se il nome non è nella lista.
        - getNome(i): restituisce l'i-esimo nome della lista;
        - getNumero: restituisce l'attuale numero di richieste di servizio.

        Scrivere un programma che utilizza un oggetto di tipo RichiesteServizio per tenere traccia
        dei clienti che hanno chiamato. Definire un ciclo che, a ogni iterazione, tenta di aggiungere un nome,
        rimuovere un nome o stampare tutti i nomi. Utilizzare un array di dimensione 10 per rappresentare la
        lista dei nomi.
 */

import java.util.Scanner;

public class RichiesteServizio {

    private String[] nomi = new String[10];
    private int nomiInseriti;
    private int richiesteServizio;

    /*
        Aggiunge un nome alla lista dei nomi e lancia un'eccezione
        BackUpServizioException se non c'è spazio libero nella lista.
     */

    public void aggiungiNomi() {
        Scanner tastiera = new Scanner(System.in);
        richiesteServizio++;
       try {
           if(nomiInseriti >= 10) {
               throw new BackUpServizioException();
           } else {
               System.out.println("Inserisci un nome:");
               String nome = tastiera.nextLine();
               nomi[nomiInseriti] = nome;
               nomiInseriti++;
           }
       } catch (BackUpServizioException e) {
           System.out.println(e.getMessage());
       }
    }

    /*
        Rimuove un nome dalla lista e lancia un'eccezione
        RichiestaServizioException se il nome non è nella
        lista.
     */

    public void rimuoviNome(String nome) {
        boolean trovato = cercaNome(nome);
        richiesteServizio++;
        try {
            if(!trovato) {
                throw new RichiestaServizioException();
            }
        } catch (RichiestaServizioException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
        Cerca uno specifico nome all'interno dell'array nomi
     */

    private boolean cercaNome(String nome) {
        boolean trovato = false;

        for(int i = 0; i < nomi.length; i++) {
            if(nomi[i]. equalsIgnoreCase(nome)) {
                nomi[i] = "-Nome eliminato-";
                trovato = true;
                break;
            }
        }
        return trovato;
    }

    /*
        Restituisce l'i-esimo nome della lista.
     */

    public void getNome(int i) {
        System.out.println(nomi[i]);
    }

    /*
        Restituisce l'attuale numero di richieste di servizio.
     */

    public int getNumero() {
        return richiesteServizio;
    }

    /*
        Visualizza tutti gli elementi dell'array di nomi.
     */

    public void visualizzaNomi() {
        System.out.println("Nomi inseriti:");
        for(int i = 0; i < nomi.length; i++) {
            System.out.println(nomi[i]);
        }
    }
}
