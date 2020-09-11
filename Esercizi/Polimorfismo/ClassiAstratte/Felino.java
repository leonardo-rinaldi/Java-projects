/*
 *	Un felino è un particolare tipo di animale.
 *	La classe definisce il metodo dormi. 
 */

public abstract class Felino extends Animale {

	public Felino() {
		super();
	}
	
	public Felino(String nome) {
		super(nome);
	}
	
	public void dormi() {
		System.out.println("Ronf...");
	}
}
