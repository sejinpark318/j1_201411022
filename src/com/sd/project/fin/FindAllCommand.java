package com.sd.project.fin;

public class FindAllCommand implements Command{
  AddressDaoImpl addressDaoImpl;
  AddressInfo addressInfo = new AddressInfo();
 
  
  public FindAllCommand(AddressDaoImpl addressDaoImpl){
    this.addressDaoImpl=addressDaoImpl;
  }
  public void execute(){
    addressDaoImpl.findAll();
  }
}
