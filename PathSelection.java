import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PathSelection extends JFrame implements ActionListener
{
	JPanel panel;
	 JButton customer, driver,employee,backbtn;
	  Frame f1;
	 Color mycolor,mycolor111;
	
	 public PathSelection(String username, Frame1 f1) {
        super("Path Selection");
        this.setSize(1000, 800);
	this.f1=f1;
        panel = new JPanel();
        panel.setLayout(null);
		Color mycolor=new Color(25, 123, 126);	
        panel.setBackground(mycolor);
		customer = new JButton("Customer Path Selection");
        customer.setBounds(250, 200, 400, 50);
		
		backbtn = new JButton("BACK");
        backbtn.setBounds(150, 700, 100, 50);
		panel.add(backbtn);
		
		Color mycolor111= new Color(254, 222, 174);
        customer.setBackground(mycolor111);
    
		
        panel.add(customer);
		driver = new JButton("Driver Path Selection");
        driver.setBounds(250, 320, 400, 50);
	
	
        driver.setBackground(mycolor111);
      
	
	
        panel.add(driver);
			employee = new JButton("Employe Path Selection");
        employee.setBounds(250, 450, 400, 50);
		
		
		
        employee.setBackground(mycolor111);
       
		
        panel.add(employee);
		customer.addActionListener(this);
		driver.addActionListener(this);
		employee.addActionListener(this);
		backbtn.addActionListener(this);
		this.add(panel);
	 }

	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==driver)
			{
					DriverInfo d1=new DriverInfo();
				d1.setVisible(true);
				this.setVisible(false);
		
			}
			
		
			else if(ae.getSource()==backbtn)
		{
			Frame1 f1=new Frame1();
			f1.setVisible(true);
			this.setVisible(false);
		}	
		
		}
	
		
}	