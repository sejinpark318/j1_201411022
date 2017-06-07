package com.sd.project.fin;

public class CloseCommand implements Command{
  AddressDaoImpl addressDaoImpl;
  
  public CloseCommand(AddressDaoImpl addressDaoImpl){
    this.addressDaoImpl=addressDaoImpl;
  }
  public void execute(){
    addressDaoImpl.close();
  }
}
