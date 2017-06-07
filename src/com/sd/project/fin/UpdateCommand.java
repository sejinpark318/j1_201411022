package com.sd.project.fin;
import java.util.ArrayList;

public class UpdateCommand implements Command{
  AddressDaoImpl addressDaoImpl;
  AddressInfo addressInfo = new AddressInfo();

  
  public UpdateCommand(AddressDaoImpl addressDaoImpl){
    this.addressDaoImpl=addressDaoImpl;
  }
  public void execute(){    
    addressDaoImpl.update(addressInfo.getUpdateName(), addressInfo.getUpdateAddress(), addressInfo.getUpdatePhoneNum(), addressInfo.getUpdateId());

  }
}
