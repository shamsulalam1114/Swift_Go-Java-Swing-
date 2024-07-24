import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DriverSelection extends JFrame implements ActionListener {
    JPanel panel, panel2, panel3, panel4, panel5, panel6, panel7;
    JButton back,next;
JCheckBox ch1,ch2,ch3,ch4,ch5,ch6;
    ImageIcon icon8;

    Color mycolor, mycolor66;

    public DriverSelection() {
        super("DriverSelection");
        this.setSize(1000, 800);
        panel = new JPanel();
        panel.setLayout(null);
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setSize(500, 400);
        panel2.setBounds(10, 10, 450, 320); 
        panel.add(panel2);

        JLabel nameLabel1 = new JLabel("Driver 1 Name:");
        JLabel addressLabel1 = new JLabel("Address:");
        JLabel mobileLabel1 = new JLabel("Mobile Number:");
          ch1 = new JCheckBox("Select");
           ch1.setBounds(200, 250, 100, 30);
                 panel2.add(ch1);
        nameLabel1.setBounds(200, 10, 100, 20);
        addressLabel1.setBounds(200, 40, 100, 20);
        mobileLabel1.setBounds(200, 70, 100, 20);
       
        JLabel driverImageLabel1 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\dr1.png"));
        driverImageLabel1.setBounds(10, 10, 180, 180);  
        panel2.add(nameLabel1);
        panel2.add(addressLabel1);
        panel2.add(mobileLabel1);
     
        panel2.add(driverImageLabel1);

        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setSize(500, 400);
        panel3.setBounds(480, 10, 450, 320); 
        panel.add(panel3);
        JLabel nameLabel2 = new JLabel("Driver 2 Name:");
        JLabel addressLabel2 = new JLabel("Address:");
        JLabel mobileLabel2 = new JLabel("Mobile Number:");
      
	     ch2 = new JCheckBox("Select");
           ch2.setBounds(200, 250, 100, 30);
                 panel3.add(ch2);
	  
        nameLabel2.setBounds(200, 10, 100, 20);  
        addressLabel2.setBounds(200, 40, 100, 20);
        mobileLabel2.setBounds(200, 70, 100, 20);
       
        JLabel driverImageLabel2 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\dr2.png"));
        driverImageLabel2.setBounds(10, 10, 180, 180); 
        panel3.add(nameLabel2);
        panel3.add(addressLabel2);
        panel3.add(mobileLabel2);
        
        panel3.add(driverImageLabel2);

       
        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(950, 10, 450, 320);
        panel.add(panel4);
		
		
		JLabel nameLabel3 = new JLabel("Driver 3 Name:");
        JLabel addressLabel3 = new JLabel("Address:");
        JLabel mobileLabel3 = new JLabel("Mobile Number:");
       
	     ch3 = new JCheckBox("Select");
           ch3.setBounds(200, 250, 100, 30);
                 panel4.add(ch3);
	   
        nameLabel3.setBounds(200, 10, 100, 20);  
        addressLabel3.setBounds(200, 40, 100, 20);
        mobileLabel3.setBounds(200, 70, 100, 20);
       
        JLabel driverImageLabel3 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\dr3.png"));
        driverImageLabel3.setBounds(10, 10, 180, 180);  
        panel4.add(nameLabel3);
        panel4.add(addressLabel3);
        panel4.add(mobileLabel3);
       
        panel4.add(driverImageLabel3);
		
		

       
        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBounds(10, 338, 450, 320);
        panel.add(panel5);
		
		
		JLabel nameLabel4 = new JLabel("Driver 4 Name:");
        JLabel addressLabel4 = new JLabel("Address:");
        JLabel mobileLabel4 = new JLabel("Mobile Number:");
     
	 
	    ch4 = new JCheckBox("Select");
           ch4.setBounds(200, 250, 100, 30);
                 panel5.add(ch4);
	 
	 
        nameLabel4.setBounds(200, 10, 100, 20); 
        addressLabel4.setBounds(200, 40, 100, 20);
        mobileLabel4.setBounds(200, 70, 100, 20);
       
        JLabel driverImageLabel4 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\dr4.png"));
        driverImageLabel4.setBounds(10, 10, 180, 180);  
        panel5.add(nameLabel4);
        panel5.add(addressLabel4);
        panel5.add(mobileLabel4);
       
        panel5.add(driverImageLabel4);
		
		
 panel6 = new JPanel();
        panel6.setLayout(null);
        panel6.setBounds(480, 338, 450, 320);
        panel.add(panel6);
		
		
		JLabel nameLabel5 = new JLabel("Driver 5 Name:");
        JLabel addressLabel5 = new JLabel("Address:");
        JLabel mobileLabel5 = new JLabel("Mobile Number:");
          ch5 = new JCheckBox("Select");
           ch5.setBounds(200, 250, 100, 30);
                 panel6.add(ch5);

	
        nameLabel5.setBounds(200, 10, 100, 20);  
        addressLabel5.setBounds(200, 40, 100, 20);
        mobileLabel5.setBounds(200, 70, 100, 20);
       
        JLabel driverImageLabel5 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\dr5.png"));
        driverImageLabel5.setBounds(10, 10, 180, 180);  
        panel6.add(nameLabel5);
        panel6.add(addressLabel5);
        panel6.add(mobileLabel5);
       
        panel6.add(driverImageLabel5);
		
		
		
		 panel7 = new JPanel();
        panel7.setLayout(null);
        panel7.setBounds(950, 338, 450, 320);
        panel.add(panel7);

		JLabel nameLabel6 = new JLabel("Driver 6 Name:");
        JLabel addressLabel6 = new JLabel("Address:");
        JLabel mobileLabel6 = new JLabel("Mobile Number:");
       
	   
	      ch6 = new JCheckBox("Select");
           ch6.setBounds(200, 250, 100, 30);
                 panel7.add(ch6);
	   
	   
        nameLabel6.setBounds(200, 10, 100, 20);  
        addressLabel6.setBounds(200, 40, 100, 20);
        mobileLabel6.setBounds(200, 70, 100, 20);
      
        JLabel driverImageLabel6 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\dr6.png"));
        driverImageLabel6.setBounds(10, 10, 180, 180);  
        panel7.add(nameLabel6);
        panel7.add(addressLabel6);
        panel7.add(mobileLabel6);
       
        panel7.add(driverImageLabel6);


        Color mycolor66 = new Color(238, 138, 248);
        panel2.setBackground(mycolor66);
        panel3.setBackground(mycolor66);
        panel4.setBackground(mycolor66);
        panel5.setBackground(mycolor66);
        panel6.setBackground(mycolor66);
		panel7.setBackground(mycolor66);
      
        Color mycolor = new Color(25, 123, 126);
        panel.setBackground(mycolor);

        ImageIcon icon8 = new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\back1.jpg");
        back = new JButton(icon8);
        back.setBounds(800, 700, 150, 70);
        back.setIcon(icon8);
        panel.add(back);
		
		next = new JButton("Next");
        next.setBounds(400, 700, 150, 70);
        panel.add(next);
		next.addActionListener(this);
		
        back.addActionListener(this);

        this.add(panel);
    }

 public void actionPerformed(ActionEvent ae) {
        
            if (ae.getSource() == next) {
				if (ch1.isSelected() || ch2.isSelected() || ch3.isSelected() || ch4.isSelected() ||ch5.isSelected() || ch6.isSelected() ){
                PaymentMethod pm1 = new PaymentMethod();
                pm1.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Please Select At Least One Driver.");
            }
        }
		//else if (ae.getSource() == back) {
         // ChooseRide cr1=new ChooseRide();
		//	cr1.setVisible(true);
		//	this.setVisible(false);
       // }
    }
}