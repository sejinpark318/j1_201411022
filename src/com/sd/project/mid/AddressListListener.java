package com.sd.project.mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.EventObject;


public class AddressListListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    HashMap<String, String> addressInfo = new HashMap<String,String>();
    Object source = e.getSource();
    String cmd = e.getActionCommand();
   
    String name1 = AddressListMain.nameTf1.getText();
    String address1 = AddressListMain.addressTf1.getText();
    String name2 = AddressListMain.nameTf2.getText();
    String address2 = AddressListMain.addressTf2.getText();
    String name3 = AddressListMain.nameTf3.getText();
    String address3 = AddressListMain.addressTf3.getText();
    String name4 = AddressListMain.nameTf4.getText();
    String address4 = AddressListMain.addressTf4.getText();
    String name5 = AddressListMain.nameTf5.getText();
    String address5 = AddressListMain.addressTf5.getText();
    
 
    if(cmd.equals("저장")){
      //map에 다넣고
      addressInfo.put(name1,address1);
      addressInfo.put(name2,address2);
      addressInfo.put(name3,address3);
      addressInfo.put(name4,address4);
      addressInfo.put(name5,address5);
      Iterator<String> iterator = addressInfo.keySet().iterator();
      //다출력
      int i = 1;
      while(iterator.hasNext()){
        String key = (String)iterator.next();
        String value = addressInfo.get(key);
        System.out.print("name, address "+i+": "+key);
        System.out.println(" and "+value);
        i++;
      }
    }
    if(cmd.equals("지우기")){
      AddressListMain.nameTf1.setText("");
      AddressListMain.addressTf1.setText("");
      AddressListMain.nameTf2.setText("");
      AddressListMain.addressTf2.setText("");
      AddressListMain.nameTf3.setText("");
      AddressListMain.addressTf3.setText("");
      AddressListMain.nameTf4.setText("");
      AddressListMain.addressTf4.setText("");
      AddressListMain.nameTf5.setText("");
      AddressListMain.addressTf5.setText("");
    }
  }
}

