import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ServiceReview extends JFrame implements ActionListener{
	

	JLabel goodLabel,wrongLabel,applyLabel,starLabel;
	Choice starChoice;
	JButton submitButton;
	Color mycolor67;
	
        public ServiceReview() {
        super("Rating");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(1000, 800);
        super.setLocation(200, 20);
        super.getContentPane().setBackground(Color.CYAN); // Change to Color.MAGENTA
        super.setLayout(null);

		goodLabel = new JLabel("Good");
		goodLabel.setBounds(110,15,150,20);
		goodLabel.setFont(new Font("Segoe UI",1,18));
		this.add(goodLabel);
		//
		starLabel = new JLabel("Please Rating Now");
		starLabel.setBounds(15,35,120,50);
		this.add(starLabel);
		
		starChoice = new Choice();
		starChoice.add("1");
		starChoice.add("2");
		starChoice.add("3");
		starChoice.add("4");
		starChoice.add("5");
		starChoice.setBounds(160,50,80,20);
		this.add(starChoice);
		//
		wrongLabel = new JLabel("Give us a review");
		wrongLabel.setBounds(72, 85, 150, 20);
		wrongLabel.setFont(new Font("Segoe UI",0,14));
		this.add(wrongLabel);
		
		starChoice = new Choice();
		starChoice.add("User friendly");
		starChoice.add("Time efficient");
		starChoice.add("Good cutomer care");
		starChoice.add("Other");
		starChoice.setBounds(50,115,160,20);
		this.add(starChoice);
		//
		applyLabel = new JLabel("This rating will help us to grow more");
		applyLabel.setBounds(27,150,800,20);
		applyLabel.setFont(new Font("Segoe UI",0,14));
		this.add(applyLabel);
		
		submitButton = new JButton("SUBMIT");
		submitButton.setBounds(30,350,235,36);
		submitButton.setBackground(Color.BLACK);
		submitButton.setForeground(Color.WHITE);
		submitButton.setFont(new Font("Segoe UI",1,14));
		submitButton.addActionListener(this);
		this.add(submitButton);
		
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae){
		
		if(submitButton == ae.getSource())
		
		{
		  if(ae.getSource()==submitButton)
		{
			ThanksGiving tg1 =new ThanksGiving();
			tg1.setVisible(true);
			this.setVisible(false);
		}
		}
		
		
	}
}