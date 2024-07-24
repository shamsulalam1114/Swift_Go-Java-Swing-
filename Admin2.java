import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Admin2 extends JFrame implements ActionListener {
    JTable table;
    DefaultTableModel model;

    JScrollPane scroll;
    JLabel LL1, LL2, LL3;
    JTextField jtf1, jtf2, jtf3;
    JButton add, delete, update;
    JPanel panel;

    public Admin2() {
        super("SWIFTGO");
        this.setSize(1000, 800);

        panel = new JPanel();
        panel.setLayout(null);

        Font font = new Font("Cambria", Font.PLAIN, 20);

        LL1 = new JLabel("Name");
        LL1.setBounds(300, 100, 80, 30);
        panel.add(LL1);

        LL2 = new JLabel("Phone Number");
        LL2.setBounds(300, 150, 150, 50);
        panel.add(LL2);

        LL3 = new JLabel("Address");
        LL3.setBounds(300, 230, 80, 50);
        panel.add(LL3);

        jtf1 = new JTextField();
        jtf1.setBounds(390, 100, 100, 30);
        panel.add(jtf1);

        jtf2 = new JTextField();
        jtf2.setBounds(390, 150, 100, 30);
        panel.add(jtf2);

        jtf3 = new JTextField();
        jtf3.setBounds(390, 230, 80, 30);
        panel.add(jtf3);

        add = new JButton("Add");
        add.setBounds(550, 100, 90, 30);
        panel.add(add);

        delete = new JButton("Delete");
        delete.setBounds(550, 150, 90, 30);
        panel.add(delete);

        update = new JButton("Update");
        update.setBounds(550, 230, 80, 30);
        panel.add(update);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Phone Number", "Address"});
        table.setModel(model);
        table.setFont(font);
        table.setBackground(Color.RED);

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                int numberofRow = table.getSelectedRow();
                String name = model.getValueAt(numberofRow, 0).toString();
                String phone = model.getValueAt(numberofRow, 1).toString();
                String address = model.getValueAt(numberofRow, 2).toString();
                jtf1.setText(name);
                jtf2.setText(phone);
                jtf3.setText(address);
            }
        });

        scroll = new JScrollPane(table);
        scroll.setBounds(10, 360, 740, 265);
        panel.add(scroll);

        add.addActionListener(this);
        delete.addActionListener(this);
        update.addActionListener(this);
        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
    if (add == ae.getSource()) {
        String[] row = {jtf1.getText(), jtf2.getText(), jtf3.getText()};
        model.addRow(row);
    } else if (delete == ae.getSource()) {
        int numberofRow = table.getSelectedRow();
        if (numberofRow >= 0) {
            model.removeRow(numberofRow);
        } 
	
    }
	else if (update == ae.getSource()) {
        int numberofRow = table.getSelectedRow();
        if (numberofRow >= 0) {
            String name = jtf1.getText();
            String phone = jtf2.getText();
            String address = jtf3.getText();
            model.setValueAt(name, numberofRow, 0);
            model.setValueAt(phone, numberofRow, 1);
            model.setValueAt(address, numberofRow, 2);
        } 
	
    }
}


  
}
