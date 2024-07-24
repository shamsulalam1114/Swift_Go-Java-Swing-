
import java.lang.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
public class DriverChoose extends JFrame implements ActionListener {
	JPanel panel;
	 JButton back;
	  ImageIcon icon5;
	
	
	 Color mycolor;
	
	
	
	 public DriverChoose() {
        super("My work");
        this.setSize(1000, 800);
        panel = new JPanel();
        panel.setLayout(null);
		
		
		Color mycolor=new Color(25, 123, 126);	
        panel.setBackground(mycolor);
		
		
				ImageIcon icon5=new ImageIcon("‪D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\back1.jpg ");
		 back = new JButton(icon5);
        back.setBounds(700, 600, 150, 70);
		back.setIcon(icon5);
        panel.add(back);
		
		back.addActionListener(this);
		
		this.add(panel);
	 }
	 
	 
	  public void actionPerformed(ActionEvent ae)
	  {
		  
		  
		  	 if(ae.getSource()==back)
		{
			Frame1 f1=new Frame1();
			f1.setVisible(true);
			this.setVisible(false);
		}	
	 
}
}