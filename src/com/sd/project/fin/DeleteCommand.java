package com.sd.project.fin;

public class DeleteCommand implements Command{
  AddressDaoImpl addressDaoImpl;
  AddressInfo addressInfo = new AddressInfo();
  
  public DeleteCommand(AddressDaoImpl addressDaoImpl){
    this.addressDaoImpl=addressDaoImpl;
  }
  public void execute(){
    addressDaoImpl.delete(addressInfo.getDeleteId());
  }
}
