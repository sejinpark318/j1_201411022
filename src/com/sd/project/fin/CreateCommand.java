package com.sd.project.fin;

public class CreateCommand implements Command{
  AddressDaoImpl addressDaoImpl;
  
  public CreateCommand(AddressDaoImpl addressDaoImpl){
    this.addressDaoImpl=addressDaoImpl;
  }
  public void execute(){
    addressDaoImpl.create();
  }
}
