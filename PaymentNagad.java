import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentNagad extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel name3,nagadno1,amount3,pin2,nagad;
	JTextField tfn3,tfg1;
	JPasswordField pin3;
	 Color mycolor, mycolor111;
	JButton confirm,back,next;
	public PaymentNagad()
	{
		super("PaymentNagad");
        this.setSize(1000, 800);
		
        panel = new JPanel();
        panel.setLayout(null);
		
		mycolor = new Color(255, 55, 39);
        panel.setBackground(mycolor);;
		
		
		name3 = new JLabel("Nagad Payment");
        name3.setBounds(700, 100, 120, 50);
		panel.add(name3);
		amount3 = new JLabel("Amount:");
        amount3.setBounds(600, 220, 60, 50);
		panel.add(amount3);	
		nagadno1 = new JLabel("Enter Nagad Number:");
        nagadno1.setBounds(600, 280, 180, 50);
		panel.add(nagadno1);		
		pin2 = new JLabel("Enter Nagad Pin:");
        pin2.setBounds(600, 340, 180, 50);
		panel.add(pin2);
		
		tfn3 = new JTextField();
        tfn3.setBounds(680, 220, 100, 30);
        panel.add(tfn3);
		tfg1 = new JTextField();
        tfg1.setBounds(770, 280, 120, 30);
        panel.add(tfg1);
		pin3 = new JPasswordField();
        pin3.setBounds(740, 340, 80, 30);
        panel.add(pin3);
		
		 nagad = new JLabel();
        ImageIcon nagadlogo = new ImageIcon("D:/JAVA Code/SwiftGo/Frame1/Pictures/nogot.png"); 
        nagad.setIcon(nagadlogo);
		nagad.setBackground(mycolor);
        nagad.setBounds(0, 0, 600, 800);
        panel.add(nagad);
        nagad.setOpaque(true);

		
		confirm=new JButton("CONFIRM");
		confirm.setBounds(650, 450, 100, 30);
		panel.add(confirm);
		 mycolor111 = new Color(174, 230, 255);
        confirm.setBackground(mycolor111);

		 back = new JButton("Back");
        back.setBounds(850, 700, 100, 30);
       back.setBackground(mycolor111);
        panel.add(back);
		
		next = new JButton("Next");
        next.setBounds(600, 700, 100, 30);
		next.setBackground(mycolor111);
        panel.add(next);
		next.addActionListener(this);
		
        back.addActionListener(this);

		
		
    

	confirm.addActionListener(this);
	this.add(panel);
	}
	
	
		public void actionPerformed(ActionEvent ae)
		   {
	
	if (ae.getSource() == confirm) 
			 {
	  if (isEmptyField(tfn3) || isEmptyField(tfg1) || isEmptyField(pin3))
		  
	                 {
                          JOptionPane.showMessageDialog(null, "Please fill in all fields before Confirmation.");
		                 }
	         else       {
                          JOptionPane.showMessageDialog(null, "Successfull Your Payment");
		                 }
}

       else if (ae.getSource() == next) {
            ServiceReview sr1 =new  ServiceReview();
			sr1.setVisible(true);
			this.setVisible(false);
        }
		
else if (ae.getSource() == back) {
          PaymentMethod pm1 =new  PaymentMethod();
			pm1.setVisible(true);
			this.setVisible(false);
        }


}

 private boolean isEmptyField(JTextField textField) 
				 {
                    return textField.getText().trim().isEmpty();
                 }

}