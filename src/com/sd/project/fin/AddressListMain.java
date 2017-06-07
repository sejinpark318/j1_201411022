package com.sd.project.fin;

import javax.swing.*;
import java.awt.*;

public class AddressListMain{
  AddressDaoImpl addressDaoImpl = new AddressDaoImpl();
  static JTextField idTf1, idTf2, idTf3, idTf4, idTf5;
  static JTextField nameTf1, nameTf2, nameTf3, nameTf4, nameTf5;
  static JTextField addressTf1, addressTf2, addressTf3, addressTf4, addressTf5;
  static JTextField phoneNumTf1, phoneNumTf2, phoneNumTf3, phoneNumTf4, phoneNumTf5;
  static JTextField findByIdId, deleteId, updateIdTf, updateNameTf, updateAddressTf, updatePhoneNumTf;
  
  public static void main(String[] args){
    JFrame f = new JFrame();
    JPanel panel = new JPanel(new GridLayout(10,4));
    f.getContentPane().add(panel);
    JLabel label1 = new JLabel("아이디");
    JLabel label2 = new JLabel("이름");
    JLabel label3 = new JLabel("주소");
    JLabel label4 = new JLabel("전화번호");
    
    idTf1 = new JTextField(20);
    idTf2 = new JTextField(20);
    idTf3 = new JTextField(20);
    idTf4 = new JTextField(20);
    idTf5 = new JTextField(20);
    
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
    
    phoneNumTf1 = new JTextField(40);
    phoneNumTf2 = new JTextField(40);
    phoneNumTf3 = new JTextField(40);
    phoneNumTf4 = new JTextField(40);
    phoneNumTf5 = new JTextField(40);
    
    findByIdId = new JTextField(40);
    deleteId = new JTextField(40);
    updateIdTf = new JTextField(40);
    updateNameTf = new JTextField(40);
    updateAddressTf = new JTextField(40);
    updatePhoneNumTf = new JTextField(40);
    
    JButton create = new JButton("CREATE");
    JButton insert = new JButton("INSERT");
    JButton close = new JButton("CLOSE");
    JButton findAll = new JButton("FIND ALL");
    
    JButton findById = new JButton("FIND BY ID");
    JButton delete = new JButton("DELETE BY ID");
    
    JButton updateId = new JButton("(UPDATE) ID");
    JLabel updateName = new JLabel("Name");
    JLabel updateAddress = new JLabel("ADDRESS");
    JLabel updatePhoneNum = new JLabel("PHONE NUM");
    
    create.addActionListener(new AddressListListener());
    insert.addActionListener(new AddressListListener());
    close.addActionListener(new AddressListListener());
    findAll.addActionListener(new AddressListListener());
    findById.addActionListener(new AddressListListener());
    delete.addActionListener(new AddressListListener());
    updateId.addActionListener(new AddressListListener());

    panel.add(label1);
    panel.add(label2);
    panel.add(label3);
    panel.add(label4);
    panel.add(idTf1);
    panel.add(nameTf1);
    panel.add(addressTf1);
    panel.add(phoneNumTf1);
    panel.add(idTf2);
    panel.add(nameTf2);
    panel.add(addressTf2);
    panel.add(phoneNumTf2);
    panel.add(idTf3);
    panel.add(nameTf3);
    panel.add(addressTf3);
    panel.add(phoneNumTf3);
    panel.add(idTf4);
    panel.add(nameTf4);
    panel.add(addressTf4);
    panel.add(phoneNumTf4);
    panel.add(idTf5);
    panel.add(nameTf5);
    panel.add(addressTf5);
    panel.add(phoneNumTf5);

    panel.add(create);
    panel.add(insert);
    panel.add(close);
    panel.add(findAll);
    
    panel.add(findById);
    panel.add(findByIdId);
    panel.add(delete);
    panel.add(deleteId);
    
    panel.add(updateId);
    panel.add(updateName);
    panel.add(updateAddress);
    panel.add(updatePhoneNum);
    panel.add(updateIdTf);
    panel.add(updateNameTf);
    panel.add(updateAddressTf);
    panel.add(updatePhoneNumTf);
    
    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
}