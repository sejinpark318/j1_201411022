package com.sd.project.fin;
import java.util.ArrayList;

public class InsertCommand implements Command{
  AddressDaoImpl addressDaoImpl;
  
  AddressInfo addressInfo = new AddressInfo();

  
  public InsertCommand(AddressDaoImpl addressDaoImpl){
    this.addressDaoImpl=addressDaoImpl;
  }
  public void execute(){
    System.out.println("insertCommand....");
    addressDaoImpl.insert(addressInfo.id1,addressInfo.name1, addressInfo.address1, addressInfo.pn1);
    addressDaoImpl.insert(addressInfo.id2,addressInfo.name2, addressInfo.address2, addressInfo.pn2);
    addressDaoImpl.insert(addressInfo.id3,addressInfo.name3, addressInfo.address3, addressInfo.pn3);
    addressDaoImpl.insert(addressInfo.id4,addressInfo.name4, addressInfo.address4, addressInfo.pn4);
    addressDaoImpl.insert(addressInfo.id5,addressInfo.name5, addressInfo.address5, addressInfo.pn5);
    System.out.println("insert success");
  }
}
