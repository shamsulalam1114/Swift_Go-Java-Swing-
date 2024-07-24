import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeInfo extends JFrame implements ActionListener
{
	   JPanel panel;
	   JLabel Name22, u1,u2,u3,u4,u5,u6,u7,u8,u9,p1,p2,p3,p4,p5,p6,p7,p8,p9,pass2;
	   JTextField L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,name111;
	   JPasswordField passffc;
	   JButton next,submit,back;
	   Color mycolor,mycolor111;
	   
	 public EmployeInfo() 
	 
	 {
        super("My work");
        this.setSize(1000, 800);
		
        panel = new JPanel();
        panel.setLayout(null);
		
		Color mycolor=new Color(25, 123, 126);	
        panel.setBackground(mycolor);
		
		pass2 = new JLabel("Password: ");
        pass2.setBounds(500, 200, 100, 50);
        panel.add(pass2);
		
		passffc = new JPasswordField();
        passffc.setBounds(600, 200, 150, 50);
        panel.add(passffc);
		
		Name22 = new JLabel("Name: ");
        Name22.setBounds(500, 100, 100, 50);
        panel.add(Name22);
		
		name111 = new JTextField();
        name111.setBounds(600, 100, 150, 50);
        panel.add(name111);

		
		
		
		
		u1 = new JLabel("EMPLOYEE JOB APPLICATION FORM");
        u1.setBounds(350, 50, 450, 20);
		panel.add(u1);
		
		Font font11 = new Font("Times New Roman", Font.PLAIN, 24);
		u1.setFont(font11);
		
		u2 = new JLabel("PERSONAL INFORMATION");
        u2.setBounds(100, 80, 400, 20);
		panel.add(u2);
		
		Font font22 = new Font("Times New Roman", Font.PLAIN, 24);
		u2.setFont(font22);
		
		u3 = new JLabel("Name:");
        u3.setBounds(100, 100, 100, 50);
		panel.add(u3);
		
		L1 = new JTextField();
        L1.setBounds(200, 110, 200, 30);
        panel.add(L1);
		
		u4 = new JLabel("Phone Number:");
        u4.setBounds(100, 140, 100, 50);
		panel.add(u4);
		
		L2 = new JTextField();
        L2.setBounds(200, 150, 200, 30);
        panel.add(L2);
		
		
		u5 = new JLabel("Date of Birth:");
        u5.setBounds(100, 180, 100, 50);
		panel.add(u5);
		
		L3 = new JTextField();
        L3.setBounds(200, 190, 200, 30);
        panel.add(L3);
		
		u6 = new JLabel("Address:");
        u6.setBounds(100, 220, 100, 50);
		panel.add(u6);
		
		L4 = new JTextField();
        L4.setBounds(200, 230, 200, 30);
        panel.add(L4);
		
		u7 = new JLabel("EMPLOYEE LICENSE INFORMATION");
        u7.setBounds(100, 272, 450, 20);
		panel.add(u7);
		
		Font font33 = new Font("Times New Roman", Font.PLAIN, 24);
		u7.setFont(font33);
		
		u8 = new JLabel("EMPLOYEE License:");
        u8.setBounds(100, 290, 200, 50);
		panel.add(u8);
		
		L5 = new JTextField();
        L5.setBounds(310, 300, 200, 30);
        panel.add(L5);
		
		u9 = new JLabel("EMPLOYEE License Class:");
        u9.setBounds(100, 330, 200, 50);
		panel.add(u9);
		
		L6 = new JTextField();
        L6.setBounds(310, 337, 200, 30);
        panel.add(L6);
		
		p1 = new JLabel("EMPLOYEE License Issuance State:");
        p1.setBounds(100, 365, 300, 50);
		panel.add(p1);
		
		L7 = new JTextField();
        L7.setBounds(310, 375, 200, 30);
        panel.add(L7);
		
		p2= new JLabel("EMPLOYEE License Issuance Date:");
        p2.setBounds(100, 405, 300, 50);
		panel.add(p2);
		
		L8 = new JTextField();
        L8.setBounds(310, 415, 200, 30);
        panel.add(L8);
		
		p3 = new JLabel("EMPLOYEE License Expiry Date:");
        p3.setBounds(100, 445, 300, 50);
		panel.add(p3);
		
		L9 = new JTextField();
        L9.setBounds(310, 455, 200, 30);
        panel.add(L9);

		p4 = new JLabel("GUARNTOR INFORMATION");
        p4.setBounds(100, 500, 400, 20);
		panel.add(p4);
		
		Font font44= new Font("Times New Roman", Font.PLAIN, 24);
		p4.setFont(font44);
		 
		p5= new JLabel("Name:");
        p5.setBounds(100, 527, 100, 50);
		panel.add(p5);
		
		L10 = new JTextField();
        L10.setBounds(250, 540, 200, 30);
        panel.add(L10);
		
		p6 = new JLabel("Place of Work:");
        p6.setBounds(100, 570, 100, 50);
		panel.add(p6);
		
		L11 = new JTextField();
        L11.setBounds(250, 580, 200, 30);
        panel.add(L11);
		
		p7= new JLabel("Phone Number:");
        p7.setBounds(100, 610, 100, 50);
		panel.add(p7);
		
		L12 = new JTextField();
        L12.setBounds(250, 620, 200, 30);
        panel.add(L12);
		
		p8 = new JLabel("Guarantor's Signature :");
        p8.setBounds(100, 650, 150, 50);
		panel.add(p8);
		
		L13 = new JTextField();
        L13.setBounds(250, 660, 200, 30);
        panel.add(L13);
		
		next = new JButton("Next");
        next.setBounds(700, 700, 100, 50);
        panel.add(next);
		
		submit=new JButton("Submit");
		submit.setBounds(400,700,100,50);
		panel.add(submit);
		next.addActionListener(this);
		submit.addActionListener(this);
		
		ImageIcon icon1100=new ImageIcon("C:\\my files\\java\\java codes\\SwiftGo\\Frame1\\Pictures\\back1.jpg");
		back = new JButton(icon1100);
        back.setBounds(850, 700, 140, 60);
		
		back.setIcon(icon1100);
        panel.add(back);
		
		back.addActionListener(this);
			
		this.add(panel);
	}
	
	     public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String username = name111.getText();
            String pass = new String(passffc.getPassword()); // Using getPassword() for JPasswordField
            String name = L1.getText();
            String phoneNumberString = L2.getText();
            String address = L4.getText();
            String EmployeLicense = L5.getText();
            String EmployeLicenseClass =L6.getText();
            String EmployeLicenseIssuanceState =L7.getText();
            String EmployeLicenseIssuanceDate = L8.getText();
            String EmployeLicenseExpiryDate = L9.getText();
            String guarantorName = L10.getText();
            String placeOfWork = L11.getText();
            String guarantorPhoneNumberString = L12.getText();
            String signature = L13.getText();

            if (username.isEmpty() || pass.isEmpty() || name.isEmpty() || phoneNumberString.isEmpty()
                    || address.isEmpty() || EmployeLicense.isEmpty() || EmployeLicenseClass.isEmpty()
                    || EmployeLicenseIssuanceState.isEmpty() || EmployeLicenseIssuanceDate.isEmpty()
                    || EmployeLicenseExpiryDate.isEmpty() || guarantorName.isEmpty() || placeOfWork.isEmpty()
                    || guarantorPhoneNumberString.isEmpty() || signature.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Fill All");
            } else {
                try {
                    int phoneNumber = Integer.parseInt(phoneNumberString);
                    int guarantorPhoneNumber = Integer.parseInt(guarantorPhoneNumberString);

                    AccountEmployee acc = new AccountEmployee(username, pass, name, phoneNumber, address, EmployeLicense,
                            EmployeLicenseClass, EmployeLicenseIssuanceState, EmployeLicenseIssuanceDate,
                            EmployeLicenseExpiryDate, guarantorName, placeOfWork, guarantorPhoneNumber, signature);
                    acc.addaccountEmployee();

                    JOptionPane.showMessageDialog(null, "Successfully Registered");
                  name111.setText("");
                    passffc.setText("");
                    L1.setText("");
					L2.setText("");
					L4.setText("");
					L5.setText("");
					L6.setText("");
					L7.setText("");
					L8.setText("");
					L9.setText("");
					L10.setText("");
					L11.setText("");
					L12.setText("");
					L13.setText("");
					
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
		   
		 


