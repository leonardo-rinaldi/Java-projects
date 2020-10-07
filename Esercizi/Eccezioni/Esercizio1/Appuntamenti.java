package Esercizio1;
import java.util.Scanner;

/*
    1-  Scrivere unprogramma che permetta agli studenti di pianificare appuntamenti per
        le ore 13, 14, 15,1 16, 17 o 18. Si utilizzi un array di sei stringhe per
        memorizzare degli appuntamenti associati a sei orari. Scrivere un ciclo che si
        ripete finchè ha ancora spazio libero. In un blocco try, chiedere all'utente di
        inserire un'ora e una descrizione. Se l'ora specificata è libera, inserire la
        descrizione nell'array. In caso contrario, lanciare un'eccezione OraOccupataException.
        Se, invece, l'ora specificata non è nell'intervallo 13 - 18, lanciare un'eccezione
        OraNonContemplataException. Usare un blocco catch per ogni tipo di eccezione.
 */

public class Appuntamenti {

    private String[] appuntamenti;

    public static void main(String[] args) {
        Appuntamenti qualcosa = new Appuntamenti();
        qualcosa.pianificaAppuntamenti();
        qualcosa.visualizzaAppuntamenti();
    }

    /*
        Il metodo controlla l'ora dell'appuntamento e la possibilità
        di una sovrapposizione degli appuntamenti.
     */

    public void pianificaAppuntamenti() {
        Scanner tastiera = new Scanner(System.in);
        appuntamenti = new String[6];

        for(int i = 0; i < appuntamenti.length; i++) {
            try {
                System.out.println("Inserisci un orario per l'appuntamento:");
                int orario = tastiera.nextInt();
                System.out.println("Inserisci una descrizione dell'appuntamento");
                tastiera.nextLine();    //risolve il problema del "salta riga" del comando dopo .nextLine()
                String descrizione = tastiera.nextLine();

                if(!(orario >= 13 && orario <= 18)) {
                    throw new OraNonContemplataException("Ora sbagliata");
                }
                if(controlloDisponibilità(orario) != null) {
                    throw new OraOccupataException();
                }
                orari(orario, descrizione);
            } catch(OraNonContemplataException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            } catch(OraOccupataException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }

    /*
        Il metodo assegna la descrizione dell'appuntamento al corretto
        elemento dell'array tramite l'orario inserito.
     */

    private void orari(int orario, String descrizione) {
        switch(orario) {
            case 13:
                appuntamenti[0] = descrizione;
                break;
            case 14:
                appuntamenti[1] = descrizione;
                break;
            case 15:
                appuntamenti[2] = descrizione;
                break;
            case 16:
                appuntamenti[3] = descrizione;
                break;
            case 17:
                appuntamenti[4] = descrizione;
                break;
            case 18:
                appuntamenti[5] = descrizione;
                break;
        }
    }

    /*
        Il metodo ritorna la descrizione dell'appuntamento in una determinata
        ora.
     */

    private String controlloDisponibilità(int orario) {
        String descrizioneaAppuntamento = null;
        switch(orario) {
            case 13:
                descrizioneaAppuntamento = appuntamenti[0];
                break;
            case 14:
                descrizioneaAppuntamento = appuntamenti[1];
                break;
            case 15:
                descrizioneaAppuntamento = appuntamenti[2];
                break;
            case 16:
                descrizioneaAppuntamento = appuntamenti[3];
                break;
            case 17:
                descrizioneaAppuntamento = appuntamenti[4];
                break;
            case 18:
                descrizioneaAppuntamento = appuntamenti[5];
                break;
        }
        return descrizioneaAppuntamento;
    }

    /*
        Il metodo permette di visualizzare l'array
     */

    public void visualizzaAppuntamenti() {
        int ora = 13;
        System.out.println();
        System.out.println("Questi sono i tuoi appuntamenti:");
        for(int i = 0; i < appuntamenti.length; i++) {
            System.out.println(ora + " : " + appuntamenti[i]);
            ora++;
        }
    }
}
