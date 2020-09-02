/*
 *	3-	Si crei una classe BambinoScuola che è la classe base per i bambini di una scuola.
 *		Questa classe dovrebbe avere gli attributi per il nome e l'età del bambino, il nome
 *		dell'insegnante del bambino e una stringa di saluto. Questa classe dovrebbe avere
 *		appropriati metodi get e set per ognuno degli attributi.
 * 
 * 
 */

public class BambinoScuola {
	
	private String nome;
	private int età;
	private String nomeInsegnante;
	private String saluto;
	
	public BambinoScuola() {
		nome = "";
		età = 0;
		nomeInsegnante = "";
		saluto = "";
	}
	
	public BambinoScuola(String nome, int età, String nomeInsegnante, String saluto) {
		this.nome = nome;
		this.età = età;
		this.nomeInsegnante = nomeInsegnante;
		this.saluto = saluto;
	}
	
	public String setNome(String nuovoNome) {
		return nome = nuovoNome;
	}
	
	public int setEtà(int nuovaEtà) {
		return età = nuovaEtà;
	}
	
	public String setNomeInsegnante(String nuovoNomeInsegnante) {
		return nomeInsegnante = nuovoNomeInsegnante;
	}
	
	public String setSaluto(String nuovoSaluto) {
		return saluto = nuovoSaluto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getEtà() {
		return età;
	}
	
	public String nomeInsegnante() {
		return nomeInsegnante;
	}
	
	public String saluto() {
		return saluto;
	}
}
