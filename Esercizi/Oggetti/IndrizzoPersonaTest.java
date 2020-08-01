import java.util.Scanner;

/*
 * Test della classe indirizzo persona
 */

public class IndrizzoPersonaTest {

	public static void main(String[] args) {
		
		IndirizzoPersona personaUno = new IndirizzoPersona();
		
		personaUno.setDati("Elon", "Musk", "elonMusk99@gmail.com", "3481222896");
		
		IndirizzoPersona personaDue = new IndirizzoPersona();
		
		personaDue.setDati("Steve", "Jobs", "steveJobs@icloud.com", "3476511461");
		
		personaDue.visualizza();
		System.out.println();
		personaUno.visualizza();
		
		personaUno.cambiaEmail("elon@gmail.com");
		personaUno.cambiaNumero("3476210635");
		
		System.out.println();
		personaUno.visualizza();
		
		System.out.println(personaUno.equals(personaDue));
	}

}
