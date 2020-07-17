/*
 *  MagicBall is a simple game based on Magic ball 8. I've create 
 *  a simple GUI to play with it in a easier way. In the window you can ask a
 *  question to the ball and receive a respond. The respond is generated casually 
 *  through the class Ball. It's not perfect, there's something to fix, but i've
 *  created it to improve my knowledge.
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
import javax.swing.SwingConstants;


public class MagicBall implements ActionListener {
	
	private JLabel testo;
	private JLabel rispostaDomanda;
	private JTextField domanda;
	private JButton conferma;

	public static void main(String[] args) {
		

		new MagicBall();
	}
	
	public MagicBall() {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		panel.setLayout(null);
		
		frame.setTitle("MagicBall");
		
		
		testo = new JLabel("Magic ball 8");
		testo.setBounds(137, 20, 80, 25);
		
		panel.add(testo);
		
		testo = new JLabel("Fai una domanda alla palla magica...");	
		testo.setBounds(60, 50, 270, 25);
		panel.add(testo);
		
		domanda = new JTextField(20);
		domanda.setBounds(25, 80, 300, 30);
		panel.add(domanda);

		rispostaDomanda = new JLabel();
		rispostaDomanda.setBounds(29, 110, 300, 25);
		panel.add(rispostaDomanda);
		
		
		conferma = new JButton("Fai una domanda");     
		conferma.addActionListener(this);
		conferma.setBounds(103, 140, 150, 25);
		panel.getRootPane().setDefaultButton(conferma);
		panel.add(conferma);
		
		
		
		frame.setVisible(true);
		
	}
	

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Ball risposte = new Ball();
		
		if(e.getSource() == conferma) {
			
			rispostaDomanda.setText(risposte.ballRisposte());
			
		}
		
	}

}
