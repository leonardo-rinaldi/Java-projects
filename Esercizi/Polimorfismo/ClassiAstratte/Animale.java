/*
 *	Una generica classe Animale. Un animale ha un nome.
 *	I comportamenti che un qualsiasi animale ha sono: dormi e parla
 * 
 */

public abstract class Animale {
	private String nome;
	
	public Animale() {
		this("Nessun nome");
	}
	
	public Animale(String nome) {
		this.nome = nome;
	}
	
	public abstract void parla();
	
	public abstract void dormi();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nuovoNome) {
		nome = nuovoNome;
	}
}
