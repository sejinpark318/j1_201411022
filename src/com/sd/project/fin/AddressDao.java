package com.sd.project.fin;
import java.util.List;

public interface AddressDao{
  public void insert(String id, String name, String address, String phoneNum);
  public void findAll();
  public void findById(String id);
  public void update(String name, String address, String phoneNum,String id);
  public void delete(String id);
  public void close();
  public void create();
}