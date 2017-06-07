package com.sd.project.fin;

public class AddressVO{
  private String id;
  private String name;
  private String address;
  private String phoneNum;
  
  public AddressVO(String id, String name, String address, String phoneNum){
    this.id = id;
    this.name = name;
    this.address = address;
    this.phoneNum = phoneNum;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getId(){
    return id;
  }
  public void setId(String id){
    this.id= id;
  }
  public String getAddress() {
        return address;
    }
  public void setAddress(String address){
    this.address = address;
  }
  public String getPhoneNum(){
    return phoneNum;
  }
  public void setPhoneNum(String phoneNum){
    this.phoneNum = phoneNum;
  }
  public String toString(){
        return "ID: "+id+" Name: "+name+" Address: "+address;
    }
}