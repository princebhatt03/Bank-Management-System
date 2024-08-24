package bank.management.system;

import java.awt.*;

import javax.swing.*;

public class signUp2 extends JFrame {
    String formNo;

    signUp2(String first) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formNo = formNo;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 60);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 60);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = { "Hindu, Muslim, Sikh, Cristian, Other" };

        setLayout(null);
        setSize(850, 700);
        setLocation(350, 10);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    public static void main(String[] args) {
        new signUp2("");
    }
}
