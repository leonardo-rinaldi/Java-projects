package oggetti;

/*
 * 	CAPITOLO 8
 * 
 * 	9- Si riscriva la classe Cane del Listato 8.1 utilizzando le informazioni e i principi
 * 	   dell'incapsulamento descritti nella sezione 8.2. La nuova versione dovrebbe includere
 * 	   metodi set e get. Si definisca anche un metodo equals che restituisca true se il nome,
 * 	   l'età e la razza del cane coincidono con quelli dell'oggetto con il quale si esegue il
 * 	   confronto. Si includa un metodo main per verificare le funzionalità della nuova classe
 * 	   Cane. 
 * 
 */

public class Cane {

	private String nome;
	private String razza;
	public int anni;
	
	public void setDati(String nuovoNome, String nuovaRazza, int nuoviAnni) {
		this.nome = nuovoNome;
		this.razza = nuovaRazza;
		this.anni = nuoviAnni;
	}
	
	public void scriviOutput() {
		System.out.println("Nome: " + nome);
		System.out.println("Razza: " + razza);
		System.out.println("Anni: " + anni);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRazza() {
		return razza;
	}
	
	public int getAnni() {
		return anni;
	}
	
	public int getEtaInAnniUmani() {
		int etàUmana = 0;
		if(anni <= 2) {
			etàUmana = anni * 11;
		} else {
			etàUmana = 22 + ((anni - 2) * 5);
		}
		return etàUmana;
	}
	
	public boolean equals(Cane altroOggetto) {
		return (nome.equalsIgnoreCase(altroOggetto.nome) &&
				razza.equalsIgnoreCase(altroOggetto.razza) &&
				anni == altroOggetto.anni);
	}
}
