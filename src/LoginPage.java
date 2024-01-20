import java.util.HashMap;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();

    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");

    JTextField userField = new JTextField();
    JPasswordField passwordField = new JPasswordField();

    JLabel userIDLabel = new JLabel("userID");
    JLabel passwordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel();

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOriginal){

        loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        passwordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userField.setBounds(125, 100, 200, 25);
        passwordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);

        frame.add(userIDLabel);
        frame.add(passwordLabel);
        frame.add(messageLabel);
        frame.add(userField);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource() == resetButton) {

            userField.setText("");
            passwordField.setText("");
            
        }

        if (e.getSource() == loginButton) {

            String userID = userField.getText();

            String password = String.valueOf(passwordField.getPassword());

            if (loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(password)) {

                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login Succesful");

                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                    
                } else {

                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Incorrect Password");

                }
            } else {

                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Username Not Found");

            }
            
        }
        
    }
    
}
