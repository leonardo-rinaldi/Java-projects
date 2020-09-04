/*
 * Classe che descrive un animale
 */

public class Animale {
	
	private String nome;
	private int età;
	private double peso;
	
	public Animale() {
		nome = "Nessun nome";
		età = 0;
		peso = 0;
	}
	
	public Animale(String nomeIniziale, int etàIniziale, double pesoIniziale) {
		nome = nomeIniziale;
		if((etàIniziale < 0) || (pesoIniziale < 0)) {
			System.out.println("Errore: età o peso negativi.");
			System.out.println(0);
		} else {
			età = etàIniziale;
			peso = pesoIniziale;
		}
	}
	
	public void setAnimale(String nuovoNome, int nuovaEtà, double nuovoPeso) {
		nome = nuovoNome;
		if((nuovaEtà < 0) || (nuovoPeso < 0)) {
			System.out.println("Errore: età o peso negativi.");
			System.exit(0);
		} else {
			età = nuovaEtà;
			peso = nuovoPeso;
		}
	}
	
	public Animale(String nomeIniziale) {
		nome = nomeIniziale;
		età = 0;
		peso = 0;
	}
	
	public void setNome(String nuovoNome) {
		nome = nuovoNome;
	}
	
	public Animale(int etàIniziale) {
		nome = "Nessun nome";
		peso = 0;
		if(etàIniziale < 0) {
			System.out.println("Errore: età negativa.");
			System.exit(0);
		} else {
			età = etàIniziale;
		}
	}
	
	public void setEtà(int nuovaEtà) {
		if(nuovaEtà < 0) {
			System.out.println("Errore: età negativa.");
			System.exit(0);
		} else {
			età = nuovaEtà;
		}
	}
	
	public Animale(double pesoIniziale) {
		nome = "Nessun nome";
		età = 0;
		
		if(pesoIniziale < 0) {
			System.out.println("Errore: peso negativo.");
			System.exit(0);
		} else {
			peso = pesoIniziale;
		}
	}
	
	public void setPeso(double nuovoPeso) {
		if(nuovoPeso < 0) {
			System.out.println("Errore: peso negativo.");
			System.exit(0);
		} else {
			peso = nuovoPeso;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getEtà() {
		return età;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void scriviOutput() {
		System.out.println("Nome: " + nome);
		System.out.println("Età: " + età + " anni");
		System.out.println("Peso: " + peso + " Kg");
	}
}
