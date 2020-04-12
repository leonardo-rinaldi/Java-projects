/*
 * This is a GUI for a "calculator" made with Java
 * It isn't very sophisticated but works :-)
 * I created it to start learn something about Java Swing and about GUI's
 * This program is in Italian.
 * 
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculatorTest implements ActionListener {
	
private JLabel text;
private JLabel textDescription;
private JButton somma;
private JButton sottrazione;
private JButton moltiplicazione;
private JButton divisione;
private JButton informazioni;

	public static void main(String[] args) {
		
		
		new calculatorTest();
		
	}
	
	public calculatorTest() {
		
		
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 500);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calcolatrice");
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 50, 30));
		panel.setLayout(new GridLayout(0, 1));
		
		text = new JLabel("Calcolatore V3.0");
		
		panel.add(text);
		
		textDescription = new JLabel("Scegli uno dei seguenti programmi:");	
		panel.add(textDescription);
		
		somma = new JButton("Somma");     //sum button
		somma.addActionListener(this);
		panel.add(somma);
		
		sottrazione = new JButton("Sottrazione");  //substraction botton
		sottrazione.addActionListener(this);
		panel.add(sottrazione);
		
		moltiplicazione = new JButton("Moltiplicazione");	//moltiplication botton
		moltiplicazione.addActionListener(this);
		panel.add(moltiplicazione);
		
		divisione = new JButton("Dvisione");	//division botton
		divisione.addActionListener(this);
		panel.add(divisione);
		
		informazioni = new JButton("Informazioni");	//info button
		informazioni.addActionListener(this);
		panel.add(informazioni);
		
		
		frame.setVisible(true);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		calculator calc = new calculator();
	
		
		if(e.getSource() == somma) {
			calc.sum();
		}
		
		if(e.getSource() == sottrazione) {
			calc.subtraction();
		}
		
		if(e.getSource() == moltiplicazione) {
			calc.molt();
		}
		
		if(e.getSource() == divisione) {
			calc.div();
		}
		
		if(e.getSource() == informazioni) {
			calc.info();
		}
	}
	
	
		
		
		
		
	

}
