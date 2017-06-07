package com.sd.project.fin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.EventObject;


public class AddressListListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    //HashMap<String, String, String,String> addressInfo = new HashMap<String,String,String,String>();
    Object source = e.getSource();
    String cmd = e.getActionCommand();
    
    RemoteControl remote = new RemoteControl();
    AddressDaoImpl addressDaoImpl = new AddressDaoImpl();
    
  if(cmd.equals("CREATE")){
    CreateCommand createOn = new CreateCommand(addressDaoImpl);
    remote.setCommand(1,createOn);
    remote.buttonWasPressed(1);
  }
  if(cmd.equals("INSERT")){
    System.out.println("listener insert");
    InsertCommand insertOn = new InsertCommand(addressDaoImpl);
    remote.setCommand(2,insertOn);
    remote.buttonWasPressed(2);
  }
  if(cmd.equals("CLOSE")){
    CloseCommand closeOn = new CloseCommand(addressDaoImpl);
    remote.setCommand(3,closeOn);
    remote.buttonWasPressed(3);
  }
  
  if(cmd.equals("FIND ALL")){
    FindAllCommand findAllOn = new FindAllCommand(addressDaoImpl);
    remote.setCommand(4,findAllOn);
    remote.buttonWasPressed(4);
  }
  if(cmd.equals("FIND BY ID")){
    FindByIdCommand findByIdOn = new FindByIdCommand(addressDaoImpl);
    remote.setCommand(5,findByIdOn);
    remote.buttonWasPressed(5);
  }
  if(cmd.equals("DELETE BY ID")){
    DeleteCommand deleteOn = new DeleteCommand(addressDaoImpl);
    remote.setCommand(6, deleteOn);
    remote.buttonWasPressed(6);
  }
  if(cmd.equals("(UPDATE) ID")){
    UpdateCommand updateOn = new UpdateCommand(addressDaoImpl);
    remote.setCommand(0,updateOn);
    remote.buttonWasPressed(0);
  }

  }
}

