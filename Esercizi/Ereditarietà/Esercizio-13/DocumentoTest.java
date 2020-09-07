/*
 *	Test delle classi Documento, Email e File 
 */

public class DocumentoTest {

	public static void main(String[] args) {
		
		Email primaMail = new Email("Ciao come va?", "Mario@gmail.com", "Luigi@gmail.com", "Saluto");
		Email secondaMail = new Email("Tutto bene grazie", "Luigi@gmail.com", "Mario@gmail.com", "RIsposta saluto");
		
		File primoFile = new File("Ciao come va?", "/Utente/Desktop/Cartella");
		File secondoFIle = new File("Tutto bene grazie", "/Utente/Desktop");
	
		System.out.println(primaMail.toString());
		System.out.println();
		System.out.println(primoFile.toString());
		System.out.println();
		
		System.out.println(contieneParolaChiave(primoFile, "come"));
	}
	
	public static boolean contieneParolaChiave(Documento oggettoDoc, String parolaChiave) {
		if(oggettoDoc.toString().indexOf(parolaChiave, 0) >= 0)
			return true;
		return false;
	}

}
