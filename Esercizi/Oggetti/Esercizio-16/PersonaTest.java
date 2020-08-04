/*
 *  Test della classe Persona
 */

public class PersonaTest {

	public static void main(String[] args) {
		
		Persona primaPersona = new Persona();
		Persona secondaPersona = new Persona();
		
		primaPersona.assegnaNome();
		primaPersona.assegnaEtà();
		
		secondaPersona.assegnaNome();
		secondaPersona.assegnaEtà();
		
		System.out.println(primaPersona.equals(secondaPersona));
		System.out.println(primaPersona.equalsNome(secondaPersona));
		System.out.println(primaPersona.equalsEtà(secondaPersona));
		System.out.println(primaPersona.piùVecchio(secondaPersona));
		System.out.println(primaPersona.piùGiovane(secondaPersona));
	}

}
