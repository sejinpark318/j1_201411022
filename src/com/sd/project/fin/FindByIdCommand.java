package com.sd.project.fin;

public class FindByIdCommand implements Command{
  AddressDaoImpl addressDaoImpl;
  AddressInfo addressInfo = new AddressInfo();
  public FindByIdCommand(AddressDaoImpl addressDaoImpl){
    this.addressDaoImpl=addressDaoImpl;
  }
  public void execute(){
    addressDaoImpl.findById(addressInfo.getFindById());
  }
}
