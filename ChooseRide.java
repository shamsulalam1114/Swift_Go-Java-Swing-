import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChooseRide extends JFrame implements ActionListener{
	JPanel panel;
	  Frame f1;
	JLabel p1,p2,p3,p4,p5,p6;
	 JButton s1,s2,back;
	  ImageIcon icon3;
	   Color mycolor;
	    JCheckBox termsCheckBox;
	
	
	
	 public ChooseRide(String username, Frame1 f1) {
        super("CHOOSERIDE");
        this.setSize(1000, 800);
				this.f1=f1;
        panel = new JPanel();
        panel.setLayout(null);
		
		
		Color mycolor=new Color(218, 155, 252);	
        panel.setBackground(mycolor);
		
		
		p1= new JLabel("●Avoid driving under 18 years of age");
        p1.setBounds(250, 100, 300, 80);
		
		Font fp1 = new Font("Times New Roman", Font.PLAIN, 18);
		p1.setFont(fp1);
		
		
        panel.add(p1);
		
		
		p2= new JLabel("● Vehicles license, driving license should be kept with you at all times");
        p2.setBounds(250, 120, 550, 80);
		
		Font fp2 = new Font("Times New Roman", Font.PLAIN, 18);
		p2.setFont(fp2);
		
		
        panel.add(p2);
		
		
		p3= new JLabel("●Always wear a properly fitted helmet to protect ");
        p3.setBounds(250, 140, 400, 80);
		
		Font fp3 = new Font("Times New Roman", Font.PLAIN, 18);
		p3.setFont(fp3);
		
		
        panel.add(p3);
		
			p4= new JLabel("●Drive vehicle at limited speed and avoid overtaking ");
        p4.setBounds(250, 160, 400, 80);
		
		Font fp4 = new Font("Times New Roman", Font.PLAIN, 18);
		p4.setFont(fp4);
		
		
        panel.add(p4);
		
			p5= new JLabel("●Obey all traffic laws and signals ");
        p5.setBounds(250, 180, 400, 80);
		
		Font fp5 = new Font("Times New Roman", Font.PLAIN, 18);
		p5.setFont(fp5);
		
		
        panel.add(p5);
		
		p6= new JLabel("Please Read Our Policies");
        p6.setBounds(250, 60, 300, 80);
		
		Font fp6 = new Font("Times New Roman", Font.PLAIN, 24);
		p6.setFont(fp6);
		
		
        panel.add(p6);
		
		
		
		
		
		
		
		
		
			s1 = new JButton("Self Driving");
        s1.setBounds(200, 400, 180, 70);
		panel.add(s1);
		
			s2 = new JButton("Driving With Divers");
        s2.setBounds(200, 500, 180, 70);
		panel.add(s2);
		 ImageIcon icon3=new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\back1.jpg");
		 back = new JButton(icon3);
        back.setBounds(700, 600, 150, 70);
		back.setIcon(icon3);
        panel.add(back);
		
		
		 termsCheckBox = new JCheckBox("I agree to the terms");
        termsCheckBox.setBounds(200, 250, 200, 30);
        panel.add(termsCheckBox);

		
		
		
		
		
		s1.addActionListener(this);
		s2.addActionListener(this);
		back.addActionListener(this);
		this.add(panel);
		
	 }
 public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == s1) {
            if (termsCheckBox.isSelected())
				{
                
                VehicleChoose vc1 = new VehicleChoose();
                vc1.setVisible(true);
                this.setVisible(false);
            } 
			else
				{
                JOptionPane.showMessageDialog(this, "Please agree to the terms to choose Self Driving.");
            }
        } 
			  if (ae.getSource() == s2) {
            if (termsCheckBox.isSelected())
		 
		{
           
            DriverSelection ds1 = new DriverSelection();
            ds1.setVisible(true);
            this.setVisible(false);
        }
		
		else	
		{
                JOptionPane.showMessageDialog(this, "Please agree to the terms to choose Self Driving.");
            }
        } 
		else if (ae.getSource() == back)
			{
            Frame1 f1 = new Frame1();
            f1.setVisible(true);
            this.setVisible(false);
        }


    }

}
		