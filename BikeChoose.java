import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BikeChoose extends JFrame implements ActionListener {
    JPanel panel, panel2, panel3, panel4, panel5;
    JButton back,next;
	JCheckBox ch11,ch22,ch33,ch44;

    ImageIcon icon8;

    Color mycolor, mycolor66;

    public BikeChoose() {
        super("ScooterChoose");
        this.setSize(1000, 800);
        panel = new JPanel();
        panel.setLayout(null);
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setSize(500, 400);
        panel2.setBounds(120, 10, 600, 320); 
        panel.add(panel2);

        JLabel nameLabel1 = new JLabel("Scooter 1 Name:");
        JLabel addressLabel1 = new JLabel("Address:");
        JLabel mobileLabel1 = new JLabel("Mobile Number:");
  ch11 = new JCheckBox("Select");
           ch11.setBounds(250, 250, 100, 30);
                 panel2.add(ch11);
        nameLabel1.setBounds(250, 10, 100, 20);
        addressLabel1.setBounds(250, 40, 100, 20);
        mobileLabel1.setBounds(250, 70, 100, 20);
       
        JLabel driverImageLabel1 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\R15.png"));
        driverImageLabel1.setBounds(10, 10, 220, 180);  
        panel2.add(nameLabel1);
        panel2.add(addressLabel1);
        panel2.add(mobileLabel1);
     
        panel2.add(driverImageLabel1);

        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setSize(500, 400);
        panel3.setBounds(750, 10, 600, 320); 
        panel.add(panel3);
        JLabel nameLabel2 = new JLabel("Scooter 2 Name:");
        JLabel addressLabel2 = new JLabel("Address:");
        JLabel mobileLabel2 = new JLabel("Mobile Number:");
      
	    ch22 = new JCheckBox("Select");
           ch22.setBounds(250, 250, 100, 30);
                 panel3.add(ch22);
	  
        nameLabel2.setBounds(250, 10, 100, 20);  
        addressLabel2.setBounds(250, 40, 100, 20);
        mobileLabel2.setBounds(250, 70, 100, 20);
       
        JLabel driverImageLabel2 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\4v.png"));
        driverImageLabel2.setBounds(10, 10, 220, 180); 
        panel3.add(nameLabel2);
        panel3.add(addressLabel2);
        panel3.add(mobileLabel2);
        
        panel3.add(driverImageLabel2);

       
        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(750, 340, 600, 320);
        panel.add(panel4);
		
		
		JLabel nameLabel3 = new JLabel("Scooter 3 Name:");
        JLabel addressLabel3 = new JLabel("Address:");
        JLabel mobileLabel3 = new JLabel("Mobile Number:");
       
	      ch33 = new JCheckBox("Select");
           ch33.setBounds(290, 250, 100, 30);
                 panel4.add(ch33);
	   
        nameLabel3.setBounds(290, 10, 100, 20);  
        addressLabel3.setBounds(290, 40, 100, 20);
        mobileLabel3.setBounds(290, 70, 100, 20);
       
        JLabel driverImageLabel3 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\p1.png"));
        driverImageLabel3.setBounds(10, 10, 280, 180);  
        panel4.add(nameLabel3);
        panel4.add(addressLabel3);
        panel4.add(mobileLabel3);
       
        panel4.add(driverImageLabel3);
		
		

       
        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBounds(120, 340, 600, 320);
        panel.add(panel5);
		
		
		JLabel nameLabel4 = new JLabel("Scooter 4 Name:");
        JLabel addressLabel4 = new JLabel("Address:");
        JLabel mobileLabel4 = new JLabel("Mobile Number:");
     
	 
	    ch44 = new JCheckBox("Select");
           ch44.setBounds(290, 250, 100, 30);
                 panel5.add(ch44);
	 
	 
        nameLabel4.setBounds(290, 10, 100, 20); 
        addressLabel4.setBounds(290, 40, 100, 20);
        mobileLabel4.setBounds(290, 70, 100, 20);
       
        JLabel driverImageLabel4 = new JLabel(new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\livo.png"));
        driverImageLabel4.setBounds(10, 10, 280, 180);  
        panel5.add(nameLabel4);
        panel5.add(addressLabel4);
        panel5.add(mobileLabel4);
       
        panel5.add(driverImageLabel4);
		
		
 

        Color mycolor66 = new Color(238, 138, 248);
        panel2.setBackground(mycolor66);
        panel3.setBackground(mycolor66);
        panel4.setBackground(mycolor66);
        panel5.setBackground(mycolor66);
      
      
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
    if (ch11.isSelected() ^ ch22.isSelected() ^ ch33.isSelected() ^ ch44.isSelected()) {
        PaymentMethod pm1 = new PaymentMethod();
        pm1.setVisible(true);
        this.setVisible(false);
    } else {
        JOptionPane.showMessageDialog(this, "Please Select One Bike.");
    }
}
         else if (ae.getSource() == back) {
            VehicleChoose vc1 = new VehicleChoose();
            vc1.setVisible(true);
            this.setVisible(false);
        }
    }
}