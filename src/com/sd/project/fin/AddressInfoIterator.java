package com.sd.project.fin;
import java.util.ArrayList;

public class AddressInfoIterator implements Iterator{
  ArrayList<AddressVO> infos;
  int position = 0;
  
  public AddressInfoIterator(ArrayList<AddressVO> infos){
    this.infos = infos;
  }

  public boolean hasNext(){
    if(position >= infos.size()){
      return false;
    }else{
      return true;
    }
  }
  public Object next(){
    Object o = infos.get(position);
    position++;
    return o;
  }
}