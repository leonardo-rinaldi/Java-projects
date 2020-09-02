/*
 * 	4- Si derivi una classe BambinoPrecoce da BambinoScuola, come descritta nel
 * 	   precedente esercizio. La nuova classe dovrebbe ridefinire il metodo get
 * 	   per l'età, restituieno l'età attuale aumentata di 2. Essa dovrebbe anche
 * 	   ridefinire il metodo set per la stringa di saluto, restituendo la stringa
 * 	   di saluto del bambino concatenata con le parole "Io sono il migliore".
 */

public class BambinoScuolaDue {
	
	public String nome;
	public int età;
	public String nomeInsegnante;
	public String saluto;
	
	public BambinoScuolaDue() {
		nome = "";
		età = 0;
		nomeInsegnante = "";
		saluto = "";
	}
	
	public BambinoScuolaDue(String nome, int età, String nomeInsegnante, String saluto) {
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
