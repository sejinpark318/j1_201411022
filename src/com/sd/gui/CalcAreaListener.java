package com.sd.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class CalcAreaListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    System.out.println("Hello");
    JButton b = (JButton)e.getsource();
    String cmd = e.getActionCommand();
    if(cmd.equals("���")){
      System.out.println("��� ��ư");
      b.setText("����߽��ϴ�.");
    } 
  }
}