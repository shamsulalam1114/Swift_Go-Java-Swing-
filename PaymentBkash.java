import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentBkash extends JFrame implements ActionListener {
     JPanel panel;
     JLabel name2, bkashno1, amount2, pin1, bkash;
     JTextField tfn2, tfb1;
     JPasswordField pin2;
     Color mycolor, mycolor1111;
     JButton confirm, back, next;

    public PaymentBkash() {
        super("PaymentBkash");
        this.setSize(1000, 800);

        panel = new JPanel();
        panel.setLayout(null);

        mycolor = new Color(255, 255, 255);
        panel.setBackground(mycolor);

        name2 = new JLabel("Bkash Payment");
        name2.setBounds(700, 100, 120, 50);
        panel.add(name2);
        amount2 = new JLabel("Amount:");
        amount2.setBounds(600, 220, 60, 50);
        panel.add(amount2);
        bkashno1 = new JLabel("Enter Bkash Number:");
        bkashno1.setBounds(600, 280, 180, 50);
        panel.add(bkashno1);
        pin1 = new JLabel("Enter Bkash Pin:");
        pin1.setBounds(600, 340, 180, 50);
        panel.add(pin1);

        tfn2 = new JTextField();
        tfn2.setBounds(680, 220, 100, 30);
        panel.add(tfn2);
        tfb1 = new JTextField();
        tfb1.setBounds(770, 280, 120, 30);
        panel.add(tfb1);
        pin2 = new JPasswordField();
        pin2.setBounds(740, 340, 80, 30);
        panel.add(pin2);

        bkash = new JLabel();
        ImageIcon bkashlogo = new ImageIcon("D:/JAVA Code/SwiftGo/Frame1/Pictures/bkashlogo.png"); 
        bkash.setIcon(bkashlogo);
        bkash.setBounds(0, 0, 800, 800);
        panel.add(bkash);
        bkash.setOpaque(true);

        confirm = new JButton("CONFIRM");
        confirm.setBounds(850, 450, 100, 30);
        panel.add(confirm);
        mycolor1111 = new Color(174, 230, 255);
        confirm.setBackground(mycolor1111);

        back = new JButton("Back");
        back.setBounds(1050, 700, 100, 30);
        back.setBackground(mycolor1111);
        panel.add(back);

        next = new JButton("Next");
        next.setBounds(850, 700, 100, 30);
        next.setBackground(mycolor1111);
        panel.add(next);

        next.addActionListener(this);
        back.addActionListener(this);
        confirm.addActionListener(this);

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == confirm) {
            if (isEmptyField(tfn2) || isEmptyField(tfb1) || isEmptyField(pin2)) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields before Confirmation.");
            } else {
                JOptionPane.showMessageDialog(null, "Successful Your Payment");
            }
        }   else if (ae.getSource() == next) {
            ServiceReview sr1 =new  ServiceReview();
			sr1.setVisible(true);
			this.setVisible(false);
        }
         else if (ae.getSource() == back) {
            PaymentMethod pm1 = new PaymentMethod();
            pm1.setVisible(true);
            this.setVisible(false);
        }
    }

    private boolean isEmptyField(JTextField textField) {
        return textField.getText().trim().isEmpty();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PaymentBkash());
    }
}
