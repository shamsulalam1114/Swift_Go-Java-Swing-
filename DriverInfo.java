import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DriverInfo extends JFrame implements ActionListener
{
	   JPanel panel;
	   JLabel Name1,pass1, a1,a2,a3,a4,a5,a6,a7,a8,a9,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,name11;
	   JPasswordField passfc;
	   JButton next,submit,back;
	   Color mycolor,mycolor111;
	   
	 public DriverInfo() 
	 
	 {
        super("My work");
        this.setSize(1000, 800);
		
        panel = new JPanel();
        panel.setLayout(null);
		
		Color mycolor=new Color(25, 123, 126);	
        panel.setBackground(mycolor);
		
		pass1 = new JLabel("Password: ");
        pass1.setBounds(500, 200, 100, 50);
        panel.add(pass1);
		
		passfc = new JPasswordField();
        passfc.setBounds(600, 200, 150, 50);
        panel.add(passfc);
		
		Name1 = new JLabel("Name: ");
        Name1.setBounds(500, 100, 100, 50);
        panel.add(Name1);
		
		name11 = new JTextField();
        name11.setBounds(600, 100, 150, 50);
        panel.add(name11);

		
		
		a1 = new JLabel("DRIVER JOB APPLICATION FORM");
        a1.setBounds(350, 50, 400, 20);
		panel.add(a1);
		
		Font font1 = new Font("Times New Roman", Font.PLAIN, 24);
		a1.setFont(font1);
		
		a2 = new JLabel("PERSONAL INFORMATION");
        a2.setBounds(100, 80, 400, 20);
		panel.add(a2);
		
		Font font2 = new Font("Times New Roman", Font.PLAIN, 24);
		a2.setFont(font2);
		
		a3 = new JLabel("Name:");
        a3.setBounds(100, 100, 100, 50);
		panel.add(a3);
		
		t1 = new JTextField();
        t1.setBounds(200, 110, 200, 30);
        panel.add(t1);
		
		a4 = new JLabel("Phone Number:");
        a4.setBounds(100, 140, 100, 50);
		panel.add(a4);
		
		t2 = new JTextField();
        t2.setBounds(200, 150, 200, 30);
        panel.add(t2);
		
		
		a5 = new JLabel("Date of Birth:");
        a5.setBounds(100, 180, 100, 50);
		panel.add(a5);
		
		t3 = new JTextField();
        t3.setBounds(200, 190, 200, 30);
        panel.add(t3);
		
		a6 = new JLabel("Address:");
        a6.setBounds(100, 220, 100, 50);
		panel.add(a6);
		
		t4 = new JTextField();
        t4.setBounds(200, 230, 200, 30);
        panel.add(t4);
		
		a7 = new JLabel("DRIVERS LICENSE INFORMATION");
        a7.setBounds(100, 272, 450, 20);
		panel.add(a7);
		
		Font font3 = new Font("Times New Roman", Font.PLAIN, 24);
		a7.setFont(font3);
		
		a8 = new JLabel("Drivers License:");
        a8.setBounds(100, 290, 200, 50);
		panel.add(a8);
		
		t5 = new JTextField();
        t5.setBounds(300, 300, 200, 30);
        panel.add(t5);
		
		a9 = new JLabel("Drivers License Class:");
        a9.setBounds(100, 330, 200, 50);
		panel.add(a9);
		
		t6 = new JTextField();
        t6.setBounds(300, 337, 200, 30);
        panel.add(t6);
		
		b1 = new JLabel("Drivers License Issuance State:");
        b1.setBounds(100, 365, 300, 50);
		panel.add(b1);
		
		t7 = new JTextField();
        t7.setBounds(300, 375, 200, 30);
        panel.add(t7);
		
		b2= new JLabel("Drivers License Issuance Date:");
        b2.setBounds(100, 405, 300, 50);
		panel.add(b2);
		
		t8 = new JTextField();
        t8.setBounds(300, 415, 200, 30);
        panel.add(t8);
		
		b3 = new JLabel("Drivers License Expiry Date:");
        b3.setBounds(100, 445, 300, 50);
		panel.add(b3);
		
		t9 = new JTextField();
        t9.setBounds(300, 455, 200, 30);
        panel.add(t9);

		b4 = new JLabel("GUARNTOR INFORMATION");
        b4.setBounds(100, 500, 400, 20);
		panel.add(b4);
		
		Font font4= new Font("Times New Roman", Font.PLAIN, 24);
		b4.setFont(font4);
		 
		b5= new JLabel("Name:");
        b5.setBounds(100, 527, 100, 50);
		panel.add(b5);
		
		t10 = new JTextField();
        t10.setBounds(250, 540, 200, 30);
        panel.add(t10);
		
		b6 = new JLabel("Place of Work:");
        b6.setBounds(100, 570, 100, 50);
		panel.add(b6);
		
		t11 = new JTextField();
        t11.setBounds(250, 580, 200, 30);
        panel.add(t11);
		
		b7= new JLabel("Phone Number:");
        b7.setBounds(100, 610, 100, 50);
		panel.add(b7);
		
		t12 = new JTextField();
        t12.setBounds(250, 620, 200, 30);
        panel.add(t12);
		
		b8 = new JLabel("Guarantor's Signature :");
        b8.setBounds(100, 650, 150, 50);
		panel.add(b8);
		
		t13 = new JTextField();
        t13.setBounds(250, 660, 200, 30);
        panel.add(t13);
		
		next = new JButton("Next");
        next.setBounds(700, 700, 100, 50);
        panel.add(next);
		
		submit=new JButton("Submit");
		submit.setBounds(400,700,100,50);
		panel.add(submit);
		next.addActionListener(this);
		submit.addActionListener(this);
		
	
		ImageIcon icon110=new ImageIcon("C:\\my files\\java\\java codes\\SwiftGo\\Frame1\\Pictures\\back1.jpg");
		back = new JButton(icon110);
        back.setBounds(850, 700, 140, 60);
		
		back.setIcon(icon110);
        panel.add(back);
		
		back.addActionListener(this);
		
		this.add(panel);
	}
	
	     public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String username = name11.getText();
            String pass = new String(passfc.getPassword()); // Using getPassword() for JPasswordField
            String name = t1.getText();
            String phoneNumberString = t2.getText();
            String address = t4.getText();
            String DriverLicense = t5.getText();
            String DriverLicenseClass = t6.getText();
            String DriverLicenseIssuanceState = t7.getText();
            String DriverLicenseIssuanceDate = t8.getText();
            String DriverLicenseExpiryDate =t9.getText();
            String guarantorName = t10.getText();
            String placeOfWork = t11.getText();
            String guarantorPhoneNumberString =t12.getText();
            String signature = t13.getText();

            if (username.isEmpty() || pass.isEmpty() || name.isEmpty() || phoneNumberString.isEmpty()
                    || address.isEmpty() || DriverLicense.isEmpty() || DriverLicenseClass.isEmpty()
                    || DriverLicenseIssuanceState.isEmpty() || DriverLicenseIssuanceDate.isEmpty()
                    || DriverLicenseExpiryDate.isEmpty() || guarantorName.isEmpty() || placeOfWork.isEmpty()
                    || guarantorPhoneNumberString.isEmpty() || signature.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Fill All");
            } else {
                try {
                    int phoneNumber = Integer.parseInt(phoneNumberString);
                    int guarantorPhoneNumber = Integer.parseInt(guarantorPhoneNumberString);

                    AccountDriver acc = new AccountDriver(username, pass, name, phoneNumber, address, DriverLicense,
                            DriverLicenseClass, DriverLicenseIssuanceState, DriverLicenseIssuanceDate,
                            DriverLicenseExpiryDate, guarantorName, placeOfWork, guarantorPhoneNumber, signature);
                    acc.addaccountDriver();

                    JOptionPane.showMessageDialog(null, "Successfully Registered");
                  name11.setText("");
                    passfc.setText("");
                    t1.setText("");
					t2.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					t8.setText("");
					t9.setText("");
					t10.setText("");
					t11.setText("");
					t12.setText("");
					t13.setText("");
					
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

