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
    if(cmd.equals("계산")){
      System.out.println("계산 버튼");
      b.setText("계산했습니다.");
    } 
  }
}