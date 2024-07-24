import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerInfo extends JFrame implements ActionListener
{
	    JPanel panel;
	    JLabel c1,c2,c3,c4,c5,c6,c7,c8,c9,e1,e2,e3,e4,e5,e6,e7,e8,e9,PASS,NAME;
	    JTextField T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,NAMEF;
	    JButton next,submit,back;
	  
		JPasswordField passc;
	 
	 Color mycolor,mycolor111;
	 public CustomerInfo() 
	 {
        super("My work");
        this.setSize(1000, 800);
		
        panel = new JPanel();
        panel.setLayout(null);
		
		
		Color mycolor=new Color(25, 123, 126);	
        panel.setBackground(mycolor);
		
		PASS = new JLabel("Password: ");
        PASS.setBounds(500, 200, 100, 50);
        panel.add(PASS);
		
		passc = new JPasswordField();
        passc.setBounds(600, 200, 150, 50);
        panel.add(passc);
		
		NAME = new JLabel("Name: ");
        NAME.setBounds(500, 100, 100, 50);
        panel.add(NAME);
		
		NAMEF = new JTextField();
        NAMEF.setBounds(600, 100, 150, 50);
        panel.add(NAMEF);

		
		c1 = new JLabel("CUSTOMER APPLICATION FORM");
        c1.setBounds(350, 50, 400, 20);
		panel.add(c1);
		
		Font font6 = new Font("Times New Roman", Font.PLAIN, 24);
		c1.setFont(font6);
		
		c2 = new JLabel("PERSONAL INFORMATION");
        c2.setBounds(100, 80, 400, 20);
		panel.add(c2);
		
		Font font7 = new Font("Times New Roman", Font.PLAIN, 24);
		c2.setFont(font7);
		
		c3 = new JLabel("Name:");
        c3.setBounds(100, 100, 100, 50);
		panel.add(c3);
		
		T1 = new JTextField();
        T1.setBounds(200, 110, 200, 30);
        panel.add(T1);
		
		c4 = new JLabel("Phone Number:");
        c4.setBounds(100, 140, 100, 50);
		panel.add(c4);
		
		T2 = new JTextField();
        T2.setBounds(200, 150, 200, 30);
        panel.add(T2);
		
		
		c5 = new JLabel("Date of Birth:");
        c5.setBounds(100, 180, 100, 50);
		panel.add(c5);
		
		T3 = new JTextField();
        T3.setBounds(200, 190, 200, 30);
        panel.add(T3);
		
		c6 = new JLabel("Address:");
        c6.setBounds(100, 220, 100, 50);
		panel.add(c6);
		
		T4 = new JTextField();
        T4.setBounds(200, 230, 200, 30);
        panel.add(T4);
	
		c7 = new JLabel("CUSTOMER LICENSE INFORMATION");
        c7.setBounds(100, 272, 450, 20);
		panel.add(c7);
		
		Font font8 = new Font("Times New Roman", Font.PLAIN, 24);
		c7.setFont(font8);
		
		c8 = new JLabel("customer License:");
        c8.setBounds(100, 290, 200, 50);
		panel.add(c8);
		
		T5 = new JTextField();
        T5.setBounds(300, 300, 200, 30);
        panel.add(T5);
		
		c9 = new JLabel("customer License Class:");
        c9.setBounds(100, 330, 200, 50);
		panel.add(c9);
		
		T6 = new JTextField();
        T6.setBounds(300, 337, 200, 30);
        panel.add(T6);
		
		e1 = new JLabel("customer License Issuance State:");
        e1.setBounds(100, 365, 300, 50);
		panel.add(e1);
		
		T7 = new JTextField();
        T7.setBounds(300, 375, 200, 30);
        panel.add(T7);
		
		e2= new JLabel("customer License Issuance Date:");
        e2.setBounds(100, 405, 300, 50);
		panel.add(e2);
		
		T8 = new JTextField();
        T8.setBounds(300, 415, 200, 30);
        panel.add(T8);
		
		e3 = new JLabel("customer License Expiry Date:");
        e3.setBounds(100, 445, 300, 50);
		panel.add(e3);
		
		T9 = new JTextField();
        T9.setBounds(300, 455, 200, 30);
        panel.add(T9);
		
		e4 = new JLabel("GUARNTOR INFORMATION");
        e4.setBounds(100, 500, 400, 20);
		panel.add(e4);
		
		Font font9= new Font("Times New Roman", Font.PLAIN, 24);
		e4.setFont(font9);
		 
		e5= new JLabel("Name:");
        e5.setBounds(100, 527, 100, 50);
		panel.add(e5);
		
		T10 = new JTextField();
        T10.setBounds(250, 540, 200, 30);
        panel.add(T10);
		
		e6 = new JLabel("Place of Work:");
        e6.setBounds(100, 570, 100, 50);
		panel.add(e6);
		
		T11 = new JTextField();
        T11.setBounds(250, 580, 200, 30);
        panel.add(T11);
		
		e7= new JLabel("Phone Number:");
        e7.setBounds(100, 610, 100, 50);
		panel.add(e7);
		
		T12 = new JTextField();
        T12.setBounds(250, 620, 200, 30);
        panel.add(T12);
		
		e8 = new JLabel("Guarantor's Signature :");
        e8.setBounds(100, 650, 150, 50);
		panel.add(e8);
		
		T13 = new JTextField();
        T13.setBounds(250, 660, 200, 30);
        panel.add(T13);
		
		next = new JButton("Next");
        next.setBounds(650, 700, 120, 60);
        panel.add(next);
		
		submit=new JButton("Submit");
		submit.setBounds(450,700,120,60);
		panel.add(submit);
		
	
		back = new JButton("Back");
        back.setBounds(850, 700, 140, 60);
		panel.add(back);
		
		
	
		
			next.addActionListener(this);
			submit.addActionListener(this);
			next.addActionListener(this);
			back.addActionListener(this);
		this.add(panel);
	}
	       public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String username = NAMEF.getText();
            String pass = new String(passc.getPassword()); 
            String name = T1.getText();
            String phoneNumberString = T2.getText();
            String address = T4.getText();
            String customerLicense = T5.getText();
            String customerLicenseClass = T6.getText();
            String customerLicenseIssuanceState = T7.getText();
            String customerLicenseIssuanceDate = T8.getText();
            String customerLicenseExpiryDate = T9.getText();
            String guarantorName = T10.getText();
            String placeOfWork = T11.getText();
            String guarantorPhoneNumberString = T12.getText();
            String signature = T13.getText();

            if (username.isEmpty() || pass.isEmpty() || name.isEmpty() || phoneNumberString.isEmpty()
                    || address.isEmpty() || customerLicense.isEmpty() || customerLicenseClass.isEmpty()
                    || customerLicenseIssuanceState.isEmpty() || customerLicenseIssuanceDate.isEmpty()
                    || customerLicenseExpiryDate.isEmpty() || guarantorName.isEmpty() || placeOfWork.isEmpty()
                    || guarantorPhoneNumberString.isEmpty() || signature.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Fill All");
            } else {
                try {
                    int phoneNumber = Integer.parseInt(phoneNumberString);
                    int guarantorPhoneNumber = Integer.parseInt(guarantorPhoneNumberString);

                    Account acc = new Account(username, pass, name, phoneNumber, address, customerLicense,
                            customerLicenseClass, customerLicenseIssuanceState, customerLicenseIssuanceDate,
                            customerLicenseExpiryDate, guarantorName, placeOfWork, guarantorPhoneNumber, signature);
                    acc.addaccount();

                    JOptionPane.showMessageDialog(null, "Successfully Registered");
                  NAMEF.setText("");
                    passc.setText("");
                    T1.setText("");
					T2.setText("");
					T4.setText("");
					T5.setText("");
					T6.setText("");
					T7.setText("");
					T8.setText("");
					T9.setText("");
					T10.setText("");
					T11.setText("");
					T12.setText("");
					T13.setText("");
					
						Frame1 f1=new Frame1();
				f1.setVisible(true);
				this.setVisible(false);
				
					
             
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Phone numbers must be numeric");
                }
            }

			
		}
		else if(ae.getSource()==back)
		{
			Frame1 f1=new Frame1();
			f1.setVisible(true);
			this.setVisible(false);
		}
		   }
}