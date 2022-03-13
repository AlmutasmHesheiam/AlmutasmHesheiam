import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterFace  extends  JFrame
{
    private JLabel Fname;
    private JTextField tfName;
    private JLabel crCard;
    private JTextField cridetCard;
    private JButton btnExit;
    private JButton btnEnter;
    private JPanel mainPanel;
    private JLabel lbWelcome;
    public UserInterFace(){
        setTitle("Welcome 😊❤");
        setVisible(true);
        setSize(450,300);
        setContentPane(mainPanel);
//        setDefaultCloseOperation();
        btnEnter.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String inName = tfName.getText();
                String PassCard = cridetCard.getText();
                lbWelcome.setText("Welcome "+ inName + " Your Credit Card is " + PassCard);
                System.out.println("Welcome " + inName + " We're happy to be here !");
                dispose();
            }
        });
        btnExit.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                tfName.setText(" ");
                cridetCard.setText(" ");
                lbWelcome.setText(" ");
            }
        });
    }
}