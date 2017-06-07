package com.sd.project.fin;

import java.util.ArrayList;

public class AddressInfo implements Info{
  ArrayList<AddressVO> addressVOs;
    String id1 = AddressListMain.idTf1.getText();
    String id2 = AddressListMain.idTf2.getText();
    String id3 = AddressListMain.idTf3.getText();
    String id4 = AddressListMain.idTf4.getText();
    String id5 = AddressListMain.idTf5.getText();
    //String [] id = {AddressListMain.idTf1.getText(),AddressListMain.idTf1.getText(),AddressListMain.idTf1.getText(),AddressListMain.idTf1.getText(),AddressListMain.idTf1.getText()};
    
    String name1 = AddressListMain.nameTf1.getText();
    String name2 = AddressListMain.nameTf2.getText();
    String name3 = AddressListMain.nameTf3.getText();
    String name4 = AddressListMain.nameTf4.getText();
    String name5 = AddressListMain.nameTf5.getText();
    
    String address1 = AddressListMain.addressTf1.getText();
    String address2 = AddressListMain.addressTf2.getText();
    String address3 = AddressListMain.addressTf3.getText();
    String address4 = AddressListMain.addressTf4.getText();
    String address5 = AddressListMain.addressTf5.getText();
    
    String pn1 = AddressListMain.phoneNumTf1.getText();
    String pn2 = AddressListMain.phoneNumTf2.getText();
    String pn3 = AddressListMain.phoneNumTf3.getText();
    String pn4 = AddressListMain.phoneNumTf4.getText();
    String pn5 = AddressListMain.phoneNumTf5.getText();
  
    String findById = AddressListMain.findByIdId.getText();
    String deleteId = AddressListMain.deleteId.getText();
    String updateId = AddressListMain.updateIdTf.getText();
    String updateName = AddressListMain.updateNameTf.getText();
    String updateAddress = AddressListMain.updateAddressTf.getText();
    String updatePhoneNum = AddressListMain.updatePhoneNumTf.getText();
    
    
  public AddressInfo(){    
  }
  public String getFindById(){
    return findById;
  }
  public String getDeleteId(){
    return deleteId;
  }
  public String getUpdateId(){
    return updateId;
  }
  public String getUpdateName(){
    return updateName;
  }
  public String getUpdateAddress(){
    return updateAddress;
  }
  public String getUpdatePhoneNum(){
    return updatePhoneNum;
  }
 // public String get
  
  
  public ArrayList<AddressVO> getAddressInfo(){
    return addressVOs;
  }
  public Iterator createIterator(){
    return new AddressInfoIterator(addressVOs);
  }
  
}