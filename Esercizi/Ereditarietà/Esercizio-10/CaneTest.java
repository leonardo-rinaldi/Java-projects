/*
 *	Test della classe Cane 
 */

public class CaneTest {
	
	public static void main(String[] args) {
		Cane Volpino = new Cane();
		
		Volpino.setRazza("volpino");
		Volpino.setComandoDiRichiamo(true);
		
		Volpino.setNome("Bau");
		Volpino.setEtà(5);
		Volpino.setPeso(10);
		
		System.out.println("Nome: " +Volpino.getNome());
		System.out.println("Età: " + Volpino.getEtà());
		System.out.println("Peso: " + Volpino.getPeso());
		System.out.println("Razza: " + Volpino.getRazza());
		System.out.println("Richiamo: " + Volpino.getComandoDiRichiamo());		
	}

}
