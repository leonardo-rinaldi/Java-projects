/*
 *	Un gatto è un particolare tipo di felino. La classe definisce
 *	il metodo parla e un ulteriore metodo faiLeFusa.
 *
 */

public class Gatto extends Felino {
	
	public Gatto() {
		super();
	}
	
	public Gatto(String nome) {
		super(nome);
	}
	
	public void parla() {
		System.out.println("Miao");
	}
	
	public void faLeFusa() {
		System.out.println("Prrrr");
	}
}
