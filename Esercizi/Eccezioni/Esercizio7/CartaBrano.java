package Esercizio7;

/*
    7-  Creare una classe CartaBrano che rappresenta una carta prepagata per l'acquisto di
        brani musicali online. eve avere le seguenti variabili di istanza private:

        -brani: il numero di brani sulla carta.
        -attivata: vero se la carta è stata attivata.

        Inoltre deve avere i seguenti metodi:

        -CartaBrano(n): un costruttore per una carta prepagata con n brani musicali;
        -attiva: attiva la carta prepagata e lancia un'eccezione se la carta è già stata
                 attivata.
        -compraBrano: registra l'acquisto di un brano musciale decrementando il numero
                      di brani musciali ancora acquistabili con questa carta e lancia
                      un'eccezione se la carta è esaurita o se non è attiva;
        -braniRimanenti: restituisce il numero di brani musicali che si possono ancora
                         acquistare con questa carta.

 */

public class CartaBrano {

    private int brani;
    private boolean attivata;
    private int braniAcquistabili;

    public static void main(String[] args) {
        CartaBrano carta = new CartaBrano(10);
        carta.setBraniAcquistabili(20);
        carta.attiva();
        carta.compraBrano();
        System.out.println(carta.braniRimanenti());
        carta.attiva();

    }

    public CartaBrano(int n) {
        this.brani = n;
    }

    /*
        Metodo che provvede all'attivazione della carta.
     */

    public void attiva() {
        try {
            System.out.println("Attivazione carta, attendere...");

            if(attivata) {
                throw new GiàAttivataException();
            } else {
                System.out.println("Carta attivata");
                attivata = true;
            }
        } catch(GiàAttivataException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    /*
        Metodo che prevede l'acquisto di un brano.
     */

    public void compraBrano() {
        try {
            System.out.println("Stai acquistando un brano...");

            if(!attivata && braniAcquistabili <= 0) {
                throw new CartaEsauritaNonAttivaException();
            } else {
                System.out.println("Brano acquistato");
                brani++;
                braniAcquistabili--;
            }
        } catch(CartaEsauritaNonAttivaException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public int braniRimanenti() {
        return braniAcquistabili;
    }

    public void setBraniAcquistabili(int numeroBrani) {
        braniAcquistabili = numeroBrani;
    }

}
