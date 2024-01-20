import javax.swing.*;

import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();

    WelcomePage(String userID){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        welcomeLabel.setBounds(0, 0, 300, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Hello " + userID + "!");

        frame.add(welcomeLabel);

        frame.setVisible(true);

    }
    
}
