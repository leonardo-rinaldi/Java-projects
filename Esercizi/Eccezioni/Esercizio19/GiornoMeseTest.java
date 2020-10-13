package Esercizio19;

/*
    Test della classe GiornoMese
 */

public class GiornoMeseTest {

    public static void main(String[] args) throws MeseException, GiornoException {
        GiornoMese data = new GiornoMese("09/02");
        data.dividiData();
        data.mostraData();
    }
}
