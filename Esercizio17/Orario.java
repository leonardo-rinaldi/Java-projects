package Esercizio17;

/*
    17- Scrivere un programma che converta un orario dalla notazione "24 ore" a quella
        "12 ore". Di seguito viene mostrato un esempio d'interazione tra il programma e
        l'utente:

        Inserire un orario nella notazione 24 ore:
        13:07
        L'equivalente in notazione 12 ore è
        1:07 PM
        Di nuovo? (s/n)
        s
        Inserire un orario nella notazione 24 ore:
        10:15
        L'equivalente in notazione 12 ore è
        10:15 AM
        Di nuovo? (s/n)
        s
        Inserire un orario nella notazione 24 ore:
        10:65
        L'orario 10:65 non esiste.
        Riprova.
        Inserire un orario nella notazione 24 ore:
        16:05
        L'equivalente in notazione 12 ore è
        4:05 PM
        Di nuovo? (s/n)
        n
        Fine del programma.

        Definire un'eccezione chiamata FormatoOrarioException. Se l'utente inserisce
        un orario non valido il programma deve lanciare e gestire un'eccezione di
        tipo FormatoOrarioException.

 */

import java.util.Scanner;

public class Orario {

    private String orarioInserito;
    private int oraFormato24;
    private String minuti;
    private int oraFormato12;

    /*
        Il metodo provvede a richiedere un orario e ripetere il ciclo
        finchè l'utente non decide di smettere.
     */

    public void inserisciOrario() {
        Scanner tastiera = new Scanner(System.in);
        String risposta;

        do{
            System.out.println("Inserire un orario nella notazione 24 ore:");
            orarioInserito = tastiera.nextLine();
            componiOraFormato12();
            System.out.println("Di nuovo? (s/n)");
            risposta = tastiera.nextLine();
        } while(risposta.equalsIgnoreCase("s"));
        System.out.println("Fine programma.");
    }

    /*
        Il metodo divide la stringa orarioInserito in due sotto-stringhe,
        una per l'ora e una per i minuti. L'ora viene convertita in un
        valore int.
     */

    private void dividiOraMinuti() {
        String oraStringa = orarioInserito.substring(0, 2);
        oraFormato24 = Integer.parseInt(oraStringa);
        minuti = orarioInserito.substring(3, orarioInserito.length());
        controllaOrario();
    }

    /*
        Il metodo compone i valori ottenuti per formare un orario in notazione
        12 ore.
     */

    private void componiOraFormato12() {
        dividiOraMinuti();
        conversioneOraFormato12();
        System.out.println("L'equivalente in formato 12 ore è:");
        System.out.println(oraFormato12 + ":" + minuti + " " + aggiungiAmPm());
    }

    /*
        Il metodo ritorna la stringa AM o PM in base all'ora inserita.
     */
    private String aggiungiAmPm() {
        String mattinaPomeriggio = "AM";

        if(oraFormato24 >= 13 && oraFormato24 <= 23) {
            mattinaPomeriggio = "PM";
        }
        return mattinaPomeriggio;
    }

    /*
        Il metodo provvede a controllare che l'ora inserita sia
        sensata e priva di errori.
     */

    private void controllaOrario() {
        try {
            int minutiNumero = Integer.parseInt(minuti);

            if(oraFormato24 < 1 || oraFormato24 > 24) {
                throw new FormatoOrarioException();
            }
            if(minutiNumero < 0 || minutiNumero > 59) {
                      throw new FormatoOrarioException();
            }
            if(orarioInserito.charAt(2) != ':') {
                throw new FormatoOrarioException();
            }
        } catch(FormatoOrarioException e) {
            System.out.println("L'orario " + orarioInserito + " non esiste.");
            System.out.println("Riprova");
            inserisciOrario();
        }
    }

    /*
        Il metodo converte l'ora dal formato 24 ore al formato
        12 ore.
     */

    private void conversioneOraFormato12() {
        switch(oraFormato24) {
            case 1:
            case 13:
                oraFormato12 = 1;
                break;
            case 2:
            case 14:
                oraFormato12 = 2;
                break;
            case 3:
            case 15:
                oraFormato12 = 3;
                break;
            case 4:
            case 16:
                oraFormato12 = 4;
                break;
            case 5:
            case 17:
                oraFormato12 = 5;
                break;
            case 6:
            case 18:
                oraFormato12 = 6;
                break;
            case 7:
            case 19:
                oraFormato12 = 7;
                break;
            case 8:
            case 20:
                oraFormato12 = 8;
                break;
            case 9:
            case 21:
                oraFormato12 = 9;
                break;
            case 10:
            case 22:
                oraFormato12 = 10;
                break;
            case 11:
            case 23:
                oraFormato12 = 11;
                break;
            case 12:
            case 24:
                oraFormato12 = 12;
                break;
        }
    }
}
