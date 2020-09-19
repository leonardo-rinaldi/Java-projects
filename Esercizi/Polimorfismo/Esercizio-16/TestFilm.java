/*
 *	Test della classe Film, Azione, Commedia, Dramma. 
 */

public class TestFilm {

	public static void main(String[] args) {
		
		Film filmUno = new Film(123, "Django");
		System.out.println("Penale: " + filmUno.calcolaPenaleRitardo(4));
		
		Azione filmDue = new Azione(456, "Joker");
		System.out.println("Penale: " + filmDue.calcolaPenaleRitardo(4));
		
		Commedia filmTre = new Commedia(789, "Deadpool");
		System.out.println("Penale: " + filmTre.calcolaPenaleRitardo(4));
		
		Dramma filmQuattro = new Dramma(101112, "Gravity");
		System.out.println("Penale: " + filmQuattro.calcolaPenaleRitardo(4));
	}

}
