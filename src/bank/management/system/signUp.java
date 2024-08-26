package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class signUp extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4, r5, r6;
    JTextField textName, textFname, textEmail, textMar, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    JButton next;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000l) + 1000l;
    String first = " " + Math.abs(first4);

    signUp() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO" + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(350, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(300, 100, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelfName.setBounds(100, 240, 200, 30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 22));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel lableG = new JLabel("Gender: ");
        lableG.setFont(new Font("Raleway", Font.BOLD, 22));
        lableG.setBounds(100, 290, 200, 30);
        add(lableG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        r3 = new JRadioButton("Custom");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(222, 255, 228));
        r3.setBounds(600, 290, 90, 30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email Address");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 22));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMar = new JLabel("Martial Status:");
        labelMar.setFont(new Font("Raleway", Font.BOLD, 22));
        labelMar.setBounds(100, 440, 200, 30);
        add(labelMar);

        r4 = new JRadioButton("Single");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(222, 255, 228));
        r4.setBounds(300, 440, 100, 30);
        add(r4);

        r5 = new JRadioButton("Married");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(new Color(222, 255, 228));
        r5.setBounds(450, 440, 90, 30);
        add(r5);

        r6 = new JRadioButton("Other");
        r6.setFont(new Font("Raleway", Font.BOLD, 14));
        r6.setBackground(new Color(222, 255, 228));
        r6.setBounds(600, 440, 90, 30);
        add(r6);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r4);
        buttonGroup2.add(r5);
        buttonGroup2.add(r6);

        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 22));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 22));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("PIN Code:");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 22));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 640, 80, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 750);
        setLocation(300, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textName.getText();
        String fName = textFname.getText();
        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Custom";
        }
        String email = textEmail.getText();
        String martial = null;
        if (r4.isSelected()) {
            martial = "Single";
        } else if (r5.isSelected()) {
            martial = "Married";
        } else if (r6.isSelected()) {
            martial = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pin = textPin.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                conn con1 = new conn();
                String q = "insert into signup values('" + formNo + "','" + name + "', '" + fName + "', '" + DOB + "','"
                        + gender + "','" + email + "','" + martial + "','" + address + "','" + city + "','" + pin
                        + "')";
                con1.statement.executeUpdate(q);
                new signUp2(formNo);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signUp();
    }
}