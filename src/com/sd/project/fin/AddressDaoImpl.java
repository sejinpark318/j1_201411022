package com.sd.project.fin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddressDaoImpl implements AddressDao{
  Connection conn=ConnectionFactory.getConnection();
 
  PreparedStatement pstmt=null;
  ResultSet rs = null;
  
  public void create(){
    Statement stmt = null;
     System.out.println("AddressDaoImpl........");
    try{
      stmt = conn.createStatement();
      String mySql = "CREATE TABLE Address2(id varchar(64) NOT NULL, name varchar(255) NOT NULL, address varchar(255) NOT NULL, phoneNum varchar(255) NOT NULL, UNIQUE (id))";
      stmt.execute(mySql);
      System.out.println("created.....");
    }catch(SQLException e){
      e.printStackTrace();
    }
  }

  
  public void insert(String id,String name, String address, String phoneNum){
    try{
      pstmt = conn.prepareStatement("INSERT INTO address2(id,name,address,phoneNum) VALUES(?,?,?,?)");
      pstmt.setString(1,id);
      pstmt.setString(2,name);
      pstmt.setString(3,address);
      pstmt.setString(4,phoneNum);
      System.out.println("inserting..."+name);
      pstmt.executeUpdate();
      }catch(SQLException e){
        e.printStackTrace();
      }
  }

  public void findAll(){
    Statement stmt = null;
    AddressVO a =null;
    try{
      stmt = conn.createStatement();
      rs = stmt.executeQuery("select * from address2");
      while(rs.next()){
        a = new AddressVO(null,null,null,null);
        a.setId(rs.getString("id"));
        a.setName(rs.getString("name"));
        a.setAddress(rs.getString("address"));
        a.setPhoneNum(rs.getString("phoneNum"));
       
        System.out.println(a.getId()+" "+a.getName()+" "+a.getAddress()+" "+a.getPhoneNum());
      }
    }catch(SQLException e){
      e.printStackTrace();
    }finally{
      try{
        if(stmt != null) stmt.close();
      }catch(Exception e){};
    }
  }
 
  public void findById(String id){
    AddressVO a = null;
    try{
      pstmt = conn.prepareStatement("select * from address2 where id=?");
      pstmt.setString(1,id);
      rs = pstmt.executeQuery();
      //Resultset은 set이다. 여러개를 담을수있고 보통 while문으로 읽고 하나면 if문으로 읽음
      if(rs.next()){
        a = new AddressVO(null,null,null,null);//위에서 담은걸 p에 setter함수 불러서 담을것
        a.setId(rs.getString("id"));
        a.setName(rs.getString("name"));
        a.setAddress(rs.getString("address"));
        a.setPhoneNum(rs.getString("phoneNum"));
      }
      System.out.println(a.getId()+" "+a.getName()+" "+a.getAddress()+" "+a.getPhoneNum());

    }catch (SQLException e){
      e.printStackTrace();
    }
  }
  public void update(String name, String address, String phoneNum, String id){
    try{
      pstmt = conn.prepareStatement("update address2 set name = ?,address =?, phoneNum =? where id =?");
      pstmt.setString(1,name);
      pstmt.setString(2,address);
      pstmt.setString(3,phoneNum);
      pstmt.setString(4,id);
      System.out.println("updating..."+name);
      pstmt.executeUpdate();
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
  public void delete(String id){
    try{
      pstmt = conn.prepareStatement("delete from address2 where id = ?");
      pstmt.setString(1, id);
      int rows = pstmt.executeUpdate(); 
      if(rows == 0){
        System.out.println("can not delete");
      }else if(rows > 0){
        System.out.println("number "+id+"is deleting.,.,");
      }
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
  
  public void close(){
    System.out.println("closing all...");
    try{
      if(rs != null) rs.close();
      if(pstmt != null) pstmt.close();
      if(conn != null) conn.close();
    }catch (Exception e){};
  }
  
}