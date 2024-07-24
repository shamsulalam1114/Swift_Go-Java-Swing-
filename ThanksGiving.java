import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThanksGiving extends JFrame
{

    JLabel goodLabel;
    Color mycolor67;
    JPanel panel; 

    public ThanksGiving() {
        super("THANKS");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(1000, 800);
        super.setLocation(200, 20);
        super.getContentPane().setBackground(Color.WHITE);
        super.setLayout(null);

        goodLabel = new JLabel("THANK YOU FOR USING OUR APPLICATION");
        goodLabel.setBounds(110, 15, 400, 20); 
        goodLabel.setFont(new Font("Segoe UI", 1, 18));
        this.add(goodLabel);

        panel = new JPanel(); 
        panel.setBounds(50, 50, 500, 500); 
        panel.setBackground(Color.YELLOW); 
        this.add(panel);
    }

   
}