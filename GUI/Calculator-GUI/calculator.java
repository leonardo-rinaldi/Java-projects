/*
 * This is a GUI for a "calculator" made with Java
 * It isn't very sophisticated but works :-)
 * I created it to start learn something about GUI's
 * This program is in Italian.
 * 
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener{
	
	private JLabel text;
	private JLabel resultSum;
	private JLabel resultSub;
	private JLabel resultMolt;
	private JLabel resultDiv;
	private JTextField number1;
	private JTextField number2;
	private JButton buttonSum;
	private JButton buttonSub;
	private JButton buttonMolt;
	private JButton buttonDiv;
	
	

	public void info() {    //info window
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(200, 150);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("Informazioni");
		
		panel.setLayout(null);
		
		text = new JLabel("Calculator");
		text.setBounds(65, 20, 80, 25);
		panel.add(text);
		
		text = new JLabel("Version: 3.0");
		text.setBounds(60, 40, 80, 25);
		panel.add(text);
		
		text = new JLabel("Author: Leonardo Rinaldi");
		text.setBounds(20, 60, 200, 25);
		panel.add(text);
		
		text = new JLabel("Made with Love by Leonardo");
		text.setBounds(10, 80, 200, 25);
		panel.add(text);
		
		
		frame.setVisible(true);
		
	}
	
	public void sum() {   //sum window
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(300, 150);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("Somma");
		
		panel.setLayout(null);
		
		text = new JLabel("Inserisci due numeri");
		text.setBounds(88, 20, 200, 25);
		panel.add(text);
		
		number1 = new JTextField(20);
		number1.setBounds(90, 50, 30, 30);
		panel.add(number1);
		
		text = new JLabel("+");
		text.setBounds(123, 52, 200, 25);
		panel.add(text);
		
		number2 = new JTextField(20);
		number2.setBounds(137, 50, 30, 30);
		panel.add(number2);
		
		buttonSum = new JButton("Somma");
		buttonSum.setBounds(101, 90, 100, 25);
		buttonSum.addActionListener(this);
		panel.getRootPane().setDefaultButton(buttonSum); //press button using enter key
		buttonSum.setForeground(Color.WHITE);	//change text color
		panel.add(buttonSum);
		
		text = new JLabel("=");
		text.setBounds(170, 52, 200, 25);
		panel.add(text);
		
		resultSum = new JLabel("");
		resultSum.setBounds(185, 52, 200, 25);
		panel.add(resultSum);
		
		frame.setVisible(true);
		
		
		
	}
	
	public void subtraction() { //substraction window
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(300, 150);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("Sottrazione");
		
		panel.setLayout(null);
		
		text = new JLabel("Inserisci due numeri");
		text.setBounds(88, 20, 200, 25);
		panel.add(text);
		
		number1 = new JTextField(20);
		number1.setBounds(90, 50, 30, 30);
		panel.add(number1);
		
		text = new JLabel("-");
		text.setBounds(125, 52, 200, 25);
		panel.add(text);
		
		number2 = new JTextField(20);
		number2.setBounds(137, 50, 30, 30);
		panel.add(number2);
		
		buttonSub = new JButton("Sottrazione");
		buttonSub.setBounds(99, 90, 100, 25);
		buttonSub.addActionListener(this);
		panel.getRootPane().setDefaultButton(buttonSub);	
		buttonSub.setForeground(Color.WHITE);	
		panel.add(buttonSub);
		
		text = new JLabel("=");
		text.setBounds(170, 52, 200, 25);
		panel.add(text);
		
		resultSub = new JLabel("");
		resultSub.setBounds(185, 52, 200, 25);
		panel.add(resultSub);
		
		frame.setVisible(true);
		
	}
	
	public void molt() {  //moltiplication window
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(300, 150);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("Moltiplicazione");
		
		panel.setLayout(null);
		
		
		text = new JLabel("Inserisci due numeri");
		text.setBounds(88, 20, 200, 25);
		panel.add(text);
		
		number1 = new JTextField(20);
		number1.setBounds(90, 50, 30, 30);
		panel.add(number1);
		
		text = new JLabel("X");
		text.setBounds(123, 52, 200, 25);
		panel.add(text);
		
		number2 = new JTextField(20);
		number2.setBounds(137, 50, 30, 30);
		panel.add(number2);
		
		buttonMolt = new JButton("Moltiplicazione");
		buttonMolt.setBounds(90, 90, 120, 25);
		buttonMolt.addActionListener(this);
		panel.getRootPane().setDefaultButton(buttonMolt);	
		buttonMolt.setForeground(Color.WHITE);	
		panel.add(buttonMolt);
		
		text = new JLabel("=");
		text.setBounds(170, 52, 200, 25);
		panel.add(text);
		
		resultMolt = new JLabel("");
		resultMolt.setBounds(185, 52, 200, 25);
		panel.add(resultMolt);
		
		
		
		frame.setVisible(true);
	}
	
	public void div() {		//division window
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(300, 150);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("Divisione");
		
		panel.setLayout(null);
		
		text = new JLabel("Inserisci due numeri");
		text.setBounds(88, 20, 200, 25);
		panel.add(text);
		
		number1 = new JTextField(20);
		number1.setBounds(90, 50, 30, 30);
		panel.add(number1);
		
		text = new JLabel(":");
		text.setBounds(126, 52, 200, 25);
		panel.add(text);
		
		number2 = new JTextField(20);
		number2.setBounds(137, 50, 30, 30);
		panel.add(number2);
		
		buttonDiv = new JButton("Divisione");
		buttonDiv.setBounds(100, 90, 100, 25);
		buttonDiv.addActionListener(this);
		panel.getRootPane().setDefaultButton(buttonDiv);	
		buttonDiv.setForeground(Color.WHITE); 	 
		panel.add(buttonDiv);
		
		text = new JLabel("=");
		text.setBounds(170, 52, 200, 25);
		panel.add(text);
		
		resultDiv = new JLabel("");
		resultDiv.setBounds(185, 52, 200, 25);
		panel.add(resultDiv);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		double value1 = Double.parseDouble(number1.getText());   //convert the number from String to double 
		double value2 = Double.parseDouble(number2.getText());
	
		
		//sum
		
		double sum = value1 + value2; 
		
		String stringaSomma = String.valueOf(sum);	//convert from double to String
		
		if(e.getSource() == buttonSum) {
			resultSum.setText(stringaSomma);   
		}
		
		
		//substraction
		
		double sub = value1 - value2; 
		
		String stringaSottrazione = String.valueOf(sub);
		
		if(e.getSource() == buttonSub) {
			resultSub.setText(stringaSottrazione);
		}
		
		//moltiplication
		
		double molt = value1 * value2;

		String stringaMolt = String.valueOf(molt);
	
		if(e.getSource() == buttonMolt) {
			resultMolt.setText(stringaMolt);
		}
		
		//division
		
		double div = value1 / value2;
		
		String stringDiv = String.valueOf(div);
		
		if(e.getSource() == buttonDiv) {
			resultDiv.setText(stringDiv);
		}
		
		
		
	}
	

	
}
	
	


