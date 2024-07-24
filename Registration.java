import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements ActionListener
{
	JPanel panel;
	 JButton customer, driver,employee,backbtn;
	 Color mycolor,mycolor111;
	
	 public Registration() {
        super("Registration");
        this.setSize(1000, 800);
	
        panel = new JPanel();
        panel.setLayout(null);
		Color mycolor=new Color(25, 123, 126);	
        panel.setBackground(mycolor);
		customer = new JButton("Customer Registration");
        customer.setBounds(250, 200, 400, 50);
		
		backbtn = new JButton("BACK");
        backbtn.setBounds(150, 700, 100, 50);
		panel.add(backbtn);
		
		Color mycolor111= new Color(254, 222, 174);
        customer.setBackground(mycolor111);
    
		
        panel.add(customer);
		driver = new JButton("Driver Registration");
        driver.setBounds(250, 320, 400, 50);
	
	
        driver.setBackground(mycolor111);
      
	
	
        panel.add(driver);
			employee = new JButton("Employe Registration");
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
			
			else if(ae.getSource()==customer)
			{
					CustomerInfo C1=new CustomerInfo();
				C1.setVisible(true);
				this.setVisible(false);
		
			}
			
			else if(ae.getSource()==employee)
			{
				EmployeInfo em1=new EmployeInfo();
				em1.setVisible (true);
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