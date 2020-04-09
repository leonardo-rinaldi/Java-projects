/*
 * Simple login GUI with Java
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {


        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200); //window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User"); //user text
        userLabel.setBounds(10, 20, 80, 25); //text position (x, y, length, height)
        panel.add(userLabel); //add it

        userText = new JTextField(20); //text box
        userText.setBounds(100, 20, 165, 25); //box position
        panel.add(userText);

        passwordLabel = new JLabel("Password"); //password text
        passwordLabel.setBounds(10, 50, 80, 25); //text position
        panel.add(passwordLabel);

        passwordText = new JPasswordField(); //text box
        passwordText.setBounds(100, 50, 165, 25); //box position
        panel.add(passwordText);

        button = new JButton("Login"); //button
        button.setBounds(10, 80, 80, 25); //button position
        button.addActionListener(new login());
        panel.add(button);

        success = new JLabel(""); //login message
        success.setBounds(10, 110, 300, 25); //message position
        panel.add(success);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String user = userText.getText();
        String password = passwordText.getText();

        if (user.equals("User1") && password.equals("password1")) { //user= user1 password= password1
            success.setText("Login successfull!");
        } else {
            success.setText("Login failed");
        }

    }
}
