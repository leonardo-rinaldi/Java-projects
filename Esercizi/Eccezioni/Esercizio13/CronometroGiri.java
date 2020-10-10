package Esercizio13;

import java.util.Calendar;

/*
  13- Scrivere una classe CronometroGiri che possa essere utilizzata per cronometrare
      i giri di una corsa. La classe dovrebbe avere le seguenti variabili di istanza
      private:

      - inEsecuzione: un valore booleano che indica se il cronometro è stato fatto partire;
      - tempoDiPartenza: il omento in cui il cronometro è stato fatto partire;
      - tempoDiPartenzaGiroCorrente: il valore del cronometro all'inizio del giro corrente;
      - durataUltimoGiro: il tempo impiegato per effettuare l'ultimo giro; con ultimo si
                          intende rispetto al giro corrente;
      - tempoTotale: il tempo totale trascorso dall'inizio della gara dino all'ultimo giro
                     completato;
      - giriCompletati: il numero di giri completati finora;
      - numerogiri: il numero totale di giri previsti per questa gara.

      La classe dovrebbe avere i seguenti metodi:

      - CronometroGiri(n): un costruttore per una gara di n giri;
      - parti: fa partire il cronometro; lancia un'eccezione se la gara è già iniziata;
      - marcaGiro: marca la fine del giro corrente e l'inizio di un nuovo giro; lancia
                   un'eccezione se la gara è finita;
      - getDurataUltimoGiro: restituisce il tempo dell'ultimo giro; lancia un'eccezione se il
                             primo giro non è ancora stato completato;
      - getTempoTotale: restituisce il tempo totale trascorso dall'inizio della gara fino all'ultimo
                        giro completato; lancia un'eccezione se il primo giro non è ancora stato completato.
      - getGiriRimanenti: restituisce il numero di giri ancora da completare, compreso il giro cirrente.

      Per ottenere l'ora corrente sotto forma di millisecondi trascorsi da una certa data di riferimento,
      è sufficiente invocare il metodo:

      Calendar.getInstance().getTimeInMillis()

      Questa invocazione restituisce una valore di tipo long. Calcolando la differenza tra i valori
      restituiti da due invocazioni al metodo effetuate in momenti diversi, si ottiene il tempo trascorso,
      in millisecondi, tra la prima invocazione e la successiva. La classe Calendar è definita nel package
      java.util

 */

public class CronometroGiri {
  private boolean inEsecuzione;
  private double tempoDiPartenza;
  private double tempoDiPartenzaGiroCorrente;
  private double fineGiro;
  private double durataUltimoGiro;
  private double tempoTotale;
  private int giriCompletati;
  private int numeroGiri;

  public CronometroGiri(int n) {
      numeroGiri = n;
  }

  /*
    Fa partire il cronometro e lancia un'eccezione se la gara e già
    iniziata.
   */

  public void parti() {
      try {
        if(inEsecuzione) {
          throw new Exception("La corsa è già in esecuzione!");
        } else {
          inEsecuzione = true;
          tempoDiPartenza = Calendar.getInstance().getTimeInMillis();
        }
      } catch(Exception e) {
        System.out.println(e.getMessage());
    }
  }

  /*
    Marca la fine del giro corrente e l'inizio di un nuovo giro; lancia
    un'eccezione se la gara è finita.
   */

  public void marcaGiro() {
    try {
      if(!inEsecuzione) {
        throw new Exception("La gara è già finita!");
      } else {
        giriCompletati++;
        fineGiro = Calendar.getInstance().getTimeInMillis();
        calcolaTempo();
        tempoDiPartenzaGiroCorrente = Calendar.getInstance().getTimeInMillis();
      }
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /*
    Restituisce il tempo dell'ultimo giro; lancia un'eccezione se il
    primo giro non è ancora stato comletato.
   */

  public void getDurataUltimoGiro() {
    try {
      if(giriCompletati < 1) {
        throw new Exception("Il primo giro non è ancora stato completato.");
      } else {
        System.out.println("Durata ultimo giro: " + durataUltimoGiro);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /*
    Calcola i tempi trascorsi tra la fine di un giro e l'inizio del successivo.
   */

  private void calcolaTempo() {
    if(giriCompletati == 1) {
      durataUltimoGiro = fineGiro - tempoDiPartenza;
      tempoTotale += durataUltimoGiro;
    } else {
      durataUltimoGiro = fineGiro - tempoDiPartenzaGiroCorrente;
      tempoTotale += durataUltimoGiro;
    }
  }

  /*
    Restituisce il tempo totale trascorso dall'inizio della gara fino
    all'ultimo giro completato; lancia un'eccezione se il primo giro
    non è ancora stato completato.
   */

  public double getTempoTotale() {
    double tempo = 0;
    try {
      if(giriCompletati < 1) {
        throw new Exception("Il primo giro non è stato ancora completato");
      } else {
       tempo =  tempoTotale;
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return tempo;
  }

  /*
    Restituisce il numero di giri ancora da completare, compreso il giro
    corrente.
   */

  public int getGiriRimanenti() {
    return numeroGiri - (giriCompletati + 1);
  }
}
