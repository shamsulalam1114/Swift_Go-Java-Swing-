import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeChecking extends JFrame implements ActionListener


{
	JPanel panel;
	Frame f1;
	JButton submitbutn,backbtn,nextbtn;
	JCheckBox a1,a2,a3,a4,a5,a6,a7,a8;
	JLabel userLabel,userLabel1,userLabel2;
	
	Font myFont;
	Color c1;
	public EmployeChecking(String username, Frame1 f1)
	{
		super("SWIFTGO");
		this.setSize(1000,800);
		
	this.f1=f1;
				
		panel=new JPanel();
		panel.setLayout(null);
		
		
		myFont = new Font("Cambria", Font.PLAIN, 28);

		Color c1=new Color(25, 123, 126);	
        panel.setBackground(c1);
		
		
		userLabel = new JLabel("Did You Get The Bike? ");
		userLabel.setBounds(100, 70, 300, 30);
		userLabel.setOpaque(true);
		userLabel.setForeground(Color.BLACK);
        userLabel.setFont(myFont);
		userLabel.setBackground(c1);
		panel.add(userLabel);

		userLabel1 = new JLabel("Did You Get The Money? ");
		userLabel1.setBounds(500, 70, 300, 30);
		userLabel1.setOpaque(true);
		userLabel1.setForeground(Color.BLACK);
        userLabel1.setFont(myFont);
		userLabel1.setBackground(c1);
		panel.add(userLabel1);
		
		userLabel2 = new JLabel("Are You Facing Any Issues With  Any Vehicles? ");
		userLabel2.setBounds(100,360,900, 30);
		userLabel2.setBounds(100,360,900, 30);
		userLabel2.setOpaque(true);
		userLabel2.setForeground(Color.BLACK);
        userLabel2.setFont(myFont);
		userLabel2.setBackground(c1);
		panel.add(userLabel2);
		
		
		submitbutn = new JButton("Submit");
		submitbutn .setBounds(100,560,80,40);
		submitbutn.setFocusable(false);
		submitbutn .setBackground(Color.WHITE);
		panel.add(submitbutn );
		
		backbtn = new JButton("Back");
		backbtn.setBounds(700, 700, 80, 40);
		backbtn.setFocusable(false);
		backbtn.setBackground(Color.WHITE);
		panel.add(backbtn);
		
		nextbtn= new JButton("Next");
		nextbtn.setBounds(800, 700, 80, 40);
		nextbtn.setFocusable(false);
		nextbtn.setBackground(Color.WHITE);
		panel.add(nextbtn);




		
		
		
		a5=new JCheckBox("Yes");
		a5.setBounds(100,100,60,40);
		a5.setBackground(c1);
		panel.add(a5);
		 
		
		a6=new JCheckBox("No");
		a6.setBounds(160,100,60,40);
		a6.setBackground(c1);
		panel.add(a6);
		
		a7=new JCheckBox("Yes");
		a7.setBounds(500,100,60,40);
	a7.setBackground(c1);
		panel.add(a7);
		 
		
		a8=new JCheckBox("No");
		a8.setBounds(560,100,60,40);
		a8.setBackground(c1);
		panel.add(a8);
		
		a1=new JCheckBox("Throttling Issue");
		a1.setBounds(100,400,175,40);
		a1.setBackground(c1);
		a1.setFont(new Font("Cambria", Font.PLAIN, 20));
		a1.setFocusable(false);
		panel.add(a1);
		
		
		a2=new JCheckBox("Breaking Issue");
		a2.setBounds(100,440,160,40);
		a2.setFont(new Font("Cambria", Font.PLAIN, 20));
		a2.setBackground(c1);
		a2.setFocusable(false);
		panel.add(a2);
		
		a3=new JCheckBox("Engine Issue");
		a3.setBounds(100,480,160,40);
		a3.setFont(new Font("Cambria", Font.PLAIN, 20));
		a3.setBackground(c1);
		a3.setFocusable(false);
		panel.add(a3);
		
		a4=new JCheckBox("Others");
		a4.setBounds(100,520,160,40);
		a4.setFont(new Font("Cambria", Font.PLAIN, 20));
		a4.setBackground(c1);
		a4.setFocusable(false);
		panel.add(a4);
		
	backbtn.addActionListener(this);
	submitbutn.addActionListener(this);
		this.add(panel);
	
	}
	
	
	
	  public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submitbutn) {
	if (!(a1.isSelected() || a2.isSelected() || a3.isSelected() || a4.isSelected()) ||
      !(a5.isSelected() || a6.isSelected()) || !(a7.isSelected() || a8.isSelected())) {
    JOptionPane.showMessageDialog(this, "Please fill up all conditions before submission.");
} else {
    JOptionPane.showMessageDialog(this, "Successful Submission! Have a nice day.");
}

        } else if (ae.getSource() == backbtn ) {
            Frame1 f1 = new Frame1();
            f1.setVisible(true);
            this.setVisible(false);
        }
    }
}
	
	

	
	
	
	
