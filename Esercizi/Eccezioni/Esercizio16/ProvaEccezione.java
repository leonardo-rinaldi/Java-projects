package Esercizio16;

import java.util.Scanner;

/*
    16- Il seguente frammento di codice riceve come input un numero intero e lo visualizza:

        int num = 0;
        Scanner tastiera = new Scanner(System.in);
        num = tastiera.nextInt();
        System.out.println(num);

        Eseguire questo programma digitando un testo, anzichè un numero intero. Il programma
        si interromperà e segnalerà il tipo di eccezione che è stata generata dal metodo nextInt.
        Inserire questo codice all'interno di un blocco try/catch dove viene catturata
        l'eccezione generata.
*/

public class ProvaEccezione {

    public static void main(String[] args) {
        numeroIntero();
    }

    public static void numeroIntero() {
        try {
            int num = 0;
            Scanner tastiera = new Scanner(System.in);
            num = tastiera.nextInt();
            System.out.println(num);
        } catch(Exception e) {
            System.out.println("Errore!");
        }
    }
}
