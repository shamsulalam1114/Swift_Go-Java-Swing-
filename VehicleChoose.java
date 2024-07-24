import java.lang.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
public class VehicleChoose extends JFrame implements ActionListener{
	JPanel panel;
	 JButton s1,s2,back,next,confirm;
	  ImageIcon icon4;
	  JLabel vehicle, SelectLocation,u1,SelectHub;
	  JCheckBox ch1, ch2, ch3;
	  ButtonGroup bg1;
	  JRadioButton r1, r2, r3;
	  JComboBox combo;
	  Font myFont;
	  
 Color mycolor;


	
	 public VehicleChoose() {
        super("VEHICLE CHOOSE");
        this.setSize(1000, 800);
        panel = new JPanel();
        panel.setLayout(null);
		
		
		Color mycolor=new Color(25, 123, 126);	
        panel.setBackground(mycolor);
		
		
		vehicle = new JLabel("VECHILE CHOOSE");
        vehicle.setBounds(250, 400, 300, 80);
		
		Font font11 = new Font("Times New Roman", Font.PLAIN, 24);
		vehicle.setFont(font11);
		
		
        panel.add(vehicle);
		
		
		
		
		ImageIcon icon4=new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\back1.jpg");
		 back = new JButton(icon4);
        back.setBounds(700, 600, 150, 70);
		back.setIcon(icon4);
        panel.add(back);
		
		
		
		
		next = new JButton("Next");
        next.setBounds(500, 600, 150, 70);
		
        panel.add(next);
		
		
		
		ch1 = new JCheckBox("Motor Bike");
		ch1.setBounds(350, 460, 100, 30);
		panel.add(ch1);
		
		ch2 = new JCheckBox("Scooter");
		ch2.setBounds(350, 480, 100, 30);
		panel.add(ch2);
		
		ch3 = new JCheckBox("Bicycle");
		ch3.setBounds(350, 500, 100, 30);
		panel.add(ch3);
		
		
			
		mycolor = new Color(25, 123, 126);
		myFont = new Font("Cambria", Font.PLAIN, 28);
		
		
		
		SelectLocation = new JLabel("Select Location");
		SelectLocation.setBounds(100, 115, 400, 50);
		
		SelectHub = new JLabel("Select Hub");
		SelectHub.setBounds(600, 115, 400, 50);
		
		SelectLocation.setFont(myFont);
		panel.add(SelectLocation);
		
		SelectHub.setFont(myFont);
		panel.add(SelectHub);
	     
        u1 = new JLabel("SELECT LOCATION");
        u1.setBounds(350, 50, 400, 50);
		panel.add(u1);		 
			

		
		
	
		
		r1 = new JRadioButton("Mohammadpur Hub");
		r1.setBounds(750, 120, 150, 20);
		panel.add(r1);
		
		r2 = new JRadioButton("New Market Hub");
		r2.setBounds(750, 150, 150, 20);
		panel.add(r2);
		
		r3 = new JRadioButton("Kuril Hub");
		r3.setBounds(750, 180, 150, 20);
		panel.add(r3);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		
		
		
		
		String locations[] = {"Dhanmondi 27", "Azimpur", "Rampura", "Banani", "kuratoli"};
		combo = new JComboBox(locations);
		combo.setBounds(300, 120, 120, 40);
		panel.add(combo);
		
		
		
		back.addActionListener(this);
		next.addActionListener(this);
		this.add(panel);
	 }
		
		public void actionPerformed(ActionEvent ae)
		{
		
	
		
		 if(ch1.isSelected()){
			 
					 if(ae.getSource()==next)
					 {
						 
						
							 BikeChoose bc=new BikeChoose();
				bc.setVisible(true);
				this.setVisible(false);
						 }
					 }
					 else if(ch2.isSelected())
					 {
					 
						  if(ae.getSource()==next)
						 
							 
							 {
									ScooterChoose sc=new ScooterChoose();
				                      sc.setVisible(true);
				                     this.setVisible(false); 
								 
							 }
						 }
						 
						 
						 
						 else if(ch3.isSelected())
						 
						 { if(ae.getSource()==next)
						 
							 {
		                 BicycleChoose bbc=new BicycleChoose();
				    bbc.setVisible(true);
				     this.setVisible(false); 
								 
							 }
						 }
						 	 
						 
						 
			
		
		
		
		
		
			//else if(ae.getSource()==back)
	//	{
		//	ChooseRide cr1=new ChooseRide();
		//	cr1.setVisible(true);
			//this.setVisible(false);
		//}	
		
		
		
			
		
		
		
		}
	 }
		
		
		
		
		
		