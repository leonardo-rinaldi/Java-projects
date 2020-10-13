package Esercizio19;

/*
    19- Scrivere un programma che converta le date dal formato numerico giorno-mese
        al formato testuale giorno-mese. Per esempio, inserendo 31/1 o 31/01 si deve
        ottenere in output 31 Gennaio. Devono essere definite due classi di eccezioni,
        una chiamata MeseException e l'altra chiamata GiornoException. Se l'utente
        inserisce un numero di mese errato (dunque non compreso tra 1 e 12) il programma
        deve lanciare e catturare un'eccezione di tipo MeseException. In modo analogo,
        se l'utente inserisce un numero di giorno errato (dunque non compreso tra 1 e
        31, 1 e 30 o 1 e 28 a seconda del mese) il programma deve lanciare e catturare
        un'eccezione di tipo GiornoException. Per semplificare le cose si supponga che
        Febbraio abbia sempre 28 giorni.
 */

public class GiornoMese {

    private String data;
    private int giorno;
    private int mese;

    public GiornoMese(String data) {
        this.data = data;
    }

    /*
        Il metodo divide la stringa in due parti cioè il giorno
        e l'ora.
     */

    public void dividiData() throws GiornoException, MeseException {
        giorno = Integer.parseInt(data.substring(0, 2));
        mese = Integer.parseInt(data.substring(3, data.length()));
        controlloMese();
        controlloGiorni();
    }

    /*
        Il metodo controlla che il numero che rappresenta il mese
        sia 1 <= mese <= 12
     */

    private void controlloMese() throws MeseException {
        if(!(mese >= 1 && mese <= 12)) {
            throw new MeseException();
        }
    }

    /*
        Il metodo controlla che il giorno inserito rispetti le dimensioni
        di un normale mese: 31 giorni, 30 giorni e 28 giorni.
     */

    private void controlloGiorni() throws GiornoException {
        switch(mese) {
            case(1):
            case(3):
            case(5):
            case(7):
            case(8):
            case(10):
            case(12):
                if(giorno > 31) {
                    throw new GiornoException();
                }
                break;
            case(2):
                if(giorno > 28) {
                    throw new GiornoException();
                }
                break;
            case(4):
            case(6):
            case(9):
            case(11):
                if(giorno > 30) {
                    throw new GiornoException();
                }
                break;
        }
    }

    /*
        Il metodo converte il numero del mese nel suo
        nome in formato stringa.
     */

    public String convertiMeseInStringa() {
        String meseStringa = "";
        switch(mese) {
            case 1:
                meseStringa = "Gennaio";
                break;
            case 2:
                meseStringa = "Febbraio";
                break;
            case 3:
                meseStringa = "Marzo";
                break;
            case 4:
                meseStringa = "Aprile";
                break;
            case 5:
                meseStringa = "Maggio";
                break;
            case 6:
                meseStringa = "Giugno";
                break;
            case 7:
                meseStringa = "Luglio";
                break;
            case 8:
                meseStringa = "Agosto";
                break;
            case 9:
                meseStringa = "Settembre";
                break;
            case 10:
                meseStringa = "Ottobre";
                break;
            case 11:
                meseStringa = "Novembre";
                break;
            case 12:
                meseStringa = "Dicembre";
                break;
        }
        return meseStringa;
    }

    /*
        Il metodo mostra la data in formato: giorno (int) mese (String)
     */

    public void mostraData() {
       String meseStringa = convertiMeseInStringa();
       System.out.println(giorno + " " + meseStringa);
    }
}
