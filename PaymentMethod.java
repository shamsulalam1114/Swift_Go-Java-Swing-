import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentMethod extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel name1,date1,amount1,method1;
	JTextField tfn1,tfd1,tfa1;
	JCheckBox rr1,bb1,nn1;
	JButton pp1,back;
	public PaymentMethod()
	{
		super("PaymentMethod");
        this.setSize(1000, 800);
		
        panel = new JPanel();
        panel.setLayout(null);
		
		Color mycolor=new Color(247, 58, 181);	
        panel.setBackground(mycolor);
		
		
		name1 = new JLabel(" User Name:");
        name1.setBounds(400, 200, 80, 30);
		panel.add(name1);
		amount1 = new JLabel("Amount:");
        amount1.setBounds(400, 235, 80, 30);
		panel.add(amount1);	
		date1 = new JLabel("Date:");
        date1.setBounds(400, 275, 80, 30);
		panel.add(date1);		
		method1 = new JLabel("Payment Method:");
        method1.setBounds(390, 320, 100, 50);
		panel.add(method1);
		
		tfn1 = new JTextField();
        tfn1.setBounds(490, 200, 150, 30);
        panel.add(tfn1);
		tfa1 = new JTextField();
        tfa1.setBounds(490, 230, 80, 30);
        panel.add(tfa1);
		tfd1 = new JTextField();
        tfd1.setBounds(490, 265, 90, 30);
        panel.add(tfd1);
		
		bb1 = new JCheckBox("Bkash");
           bb1.setBounds(570, 330, 80, 30);
                 panel.add(bb1);
				 
			nn1 = new JCheckBox("Nagad");
           nn1.setBounds(670, 330, 80, 30);
                 panel.add(nn1);
				 	rr1 = new JCheckBox("Rocket");
           rr1.setBounds(770, 330, 80, 30);
                 panel.add(rr1);
				 
				pp1 = new JButton("Procced To Payment");
        pp1.setBounds(400, 450, 200, 50);
        panel.add(pp1); 
		
		back = new JButton("Back");
        back.setBounds(650, 450, 100, 50);
        panel.add(back);
		pp1.addActionListener(this);
		
        back.addActionListener(this);

        this.add(panel);
	}
	
	
	
	public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == pp1) {
        if (bb1.isSelected()) {
            PaymentBkash pb1 = new PaymentBkash();
            pb1.setVisible(true);
            this.setVisible(false);
        } else if (nn1.isSelected()) {
            PaymentNagad pn1 = new PaymentNagad();
            pn1.setVisible(true);
            this.setVisible(false);
        } else if (rr1.isSelected()) {
            PaymentRocket pr1 = new PaymentRocket();
            pr1.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please Select One Payment Method.");
        }
    } else if (ae.getSource() == back) {
        Frame f1 = new Frame1();
        f1.setVisible(true);
        this.setVisible(false);
    }
}
}
	
	
	
	
	
	
	
	
	
	
	
	