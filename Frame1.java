import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends JFrame implements ActionListener {
    JPanel panel;
    JLabel name, pass, SwiftGo, imag, font;
    JButton login, regist, back, admin;
    JTextField tfname1;
    JPasswordField passf;
    Color mycolor, mycolor1, mycolor2, mycolor1111;
    ImageIcon imag1;

    public Frame1() {
        super("SWIFTGO");
        this.setSize(1000, 800);
        panel = new JPanel();
        panel.setLayout(null);
        name = new JLabel("User Name:");
        name.setBounds(250, 300, 100, 50);
        panel.add(name);
        name.setOpaque(true);
        Color mycolor2 = new Color(63, 150, 221);
        name.setBackground(mycolor2);
        Color mycolor = new Color(25, 123, 126);
        panel.setBackground(mycolor);
        pass = new JLabel("Password: ");
        pass.setBounds(250, 450, 100, 50);
        panel.add(pass);

        pass.setBackground(mycolor2);
        pass.setOpaque(true);

        

        mycolor1111 = new Color(174, 230, 255);

        login = new JButton("Login");
        login.setBounds(250, 600, 120, 30);
		   login.setBackground(mycolor1111);
        panel.add(login);

        regist = new JButton("Registration");
        regist.setBounds(500, 600, 120, 30);
        regist.setBackground(mycolor1111);
        panel.add(regist);

        back = new JButton("Back");
        back.setBounds(750, 600, 120, 30);
        back.setBackground(mycolor1111);
        panel.add(back);

        admin = new JButton("Admin");
        admin.setBounds(100, 600, 120, 30);
        admin.setBackground(mycolor1111);
        panel.add(admin);

       
        login.setOpaque(true);
        

        login.addActionListener(this);
        regist.addActionListener(this);
        back.addActionListener(this);
        admin.addActionListener(this);
       
        regist.setOpaque(true);
      
        back.setOpaque(true);
        tfname1 = new JTextField();
        tfname1.setBounds(400, 300, 300, 50);
        panel.add(tfname1);

        passf = new JPasswordField();
        passf.setBounds(400, 450, 150, 50);
        panel.add(passf);

        imag = new JLabel();
        ImageIcon imag1 = new ImageIcon("D:\\JAVA Code\\SwiftGo\\Frame1\\Pictures\\Logo1.jpg");
        imag.setIcon(imag1);
        imag.setBounds(0, 0, 800, 400);
        panel.add(imag);
        imag.setOpaque(true);

        this.add(panel);
    }
public void actionPerformed(ActionEvent ae) {
        String username = tfname1.getText();
        String pass = passf.getText();

        if (ae.getSource() == regist) {
            
            Registration r1 = new Registration();
            r1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == login) {
            
            Account acc = new Account();
            AccountDriver accDriver = new AccountDriver();
            AccountEmployee accEmployee = new AccountEmployee();

            if (acc.getAccount(username, pass)) {
                JOptionPane.showMessageDialog(null, "Valid  Customer Account");
                ChooseRide cr1 = new ChooseRide(username, this);
                cr1.setVisible(true);
                this.setVisible(false);
            } else if (accDriver.getAccountDriver(username, pass)) {
                JOptionPane.showMessageDialog(null, "Valid Driver Account");
                DriverChecking dc1 = new DriverChecking(username, this);
                dc1.setVisible(true);
                this.setVisible(false);
            } else if (accEmployee.getAccountEmployee(username, pass)) {
                JOptionPane.showMessageDialog(null, "Valid Employee Account");
                EmployeChecking ec1 = new EmployeChecking(username, this);
                ec1.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }
        }// else if (ae.getSource() == admin) {
            // Handle admin button click
            //Admin2 ad2 = new Admin2();
            //ad2.setVisible(true);
            //this.setVisible(false);
        //}
    }
}