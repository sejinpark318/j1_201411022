package com.sd.project.mid;

import javax.swing.*;
import java.awt.*;

public class AddressListMain{
  static JTextField nameTf1, nameTf2, nameTf3, nameTf4, nameTf5;
  static JTextField addressTf1, addressTf2, addressTf3, addressTf4, addressTf5;
  
  public static void main(String[] args){
    JFrame f = new JFrame();
    JPanel panel = new JPanel(new GridLayout(7,2));
    f.getContentPane().add(panel);
    JLabel label1 = new JLabel("이름");
    JLabel label2 = new JLabel("주소");
    nameTf1 = new JTextField(20);
    nameTf2 = new JTextField(20);
    nameTf3 = new JTextField(20);
    nameTf4 = new JTextField(20);
    nameTf5 = new JTextField(20);
    
    addressTf1 = new JTextField(40);
    addressTf2 = new JTextField(40);
    addressTf3 = new JTextField(40);
    addressTf4 = new JTextField(40);
    addressTf5 = new JTextField(40);
    
    JButton b1 = new JButton("저장");
    JButton b2 = new JButton("지우기");
    //b1.setPreferredSize(new Dimension(40, 40));
    b1.addActionListener(new AddressListListener());
    //b1.addActionListener(this);
    //b2.addActionListener(new CalcAreaListener());
    panel.add(label1);
    panel.add(label2);
    panel.add(nameTf1);
    panel.add(addressTf1);
    panel.add(nameTf2);
    panel.add(addressTf2);
    panel.add(nameTf3);
    panel.add(addressTf3);
    panel.add(nameTf4);
    panel.add(addressTf4);
    panel.add(nameTf5);
    panel.add(addressTf5);
    panel.add(b1);
    panel.add(b2);
    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
}