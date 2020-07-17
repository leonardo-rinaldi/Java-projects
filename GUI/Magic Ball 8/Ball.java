import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ball {
		
	
	
	public String ballRisposte() {
		
			
			int num = (int) (Math.random() * 8) + 1;
			String risposta = "";
			
			switch(num) {
			
			case 1:
				risposta = "E' certo";	
				break;
			case 2:
				risposta = "E' decisamente così";
				break;
			case 3:
				risposta = "E' molto probabile";
				break;
			case 4:
				risposta = "I segni indicano di sì";
				break;
			case 5:
				risposta = "E' difficile rispondere, prova di nuovo";
				break;
			case 6:
				risposta = "Rifai la domanda più tardi";
				break;
			case 7:
				risposta = "Non ci contare";
				break;
			case 8:
				risposta = "Le mie fonti dicono di no";
				break;
				
			}
			return risposta;
			
		
	
	}
}
