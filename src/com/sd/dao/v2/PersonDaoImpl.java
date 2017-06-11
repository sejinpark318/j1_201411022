package com.sd.dao.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonDaoImpl implements PersonDao{
  Connection conn = ConnectionFactory.getConnection();
  PreparedStatement pstmt=null;
  ResultSet rs = null;
  public void insert(PersonVO p){
    try{
      pstmt = conn.prepareStatement("INSERT INTO persons(id,name,address) VALUES(null,?,?)");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      System.out.println("inserting..."+p.getName());
      pstmt.executeUpdate();
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
  public List<PersonVO> findAll(){
    Statement stmt = null;
    List<PersonVO> persons = new ArrayList<PersonVO>();
    try{
      
      stmt = conn.createStatement();
      rs = stmt.executeQuery("selet * from persons");
      PersonVO p = null;
      while(rs.next()){
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        persons.add(p);
      }
    }catch(SQLException e){
      e.printStackTrace();
    }finally{
      try{
        if(stmt != null) stmt.close();
      }catch(Exception e){};
    }
    return persons;
  }
  public PersonVO findById(int id){
    PersonVO p = null;
    try{
      
      pstmt = conn.prepareStatement("select * from persons where id=?");
      pstmt.setInt(1,id);
      rs = pstmt.executeQuery();
      //Resultset은 set이다. 여러개를 담을수있고 보통 while문으로 읽고 하나면 if문으로 읽음
      if(rs.next()){
        p = new PersonVO();//위에서 담은걸 p에 setter함수 불러서 담을것
        p.setId/*클래스명*/(rs.getInt("id"/*테이블속성*/));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
      }
    }catch (SQLException e){
      e.printStackTrace();
    }
    return p;
  }
  public void update(PersonVO p){
    try{
      pstmt = conn.prepareStatement("update persons set name = ?,address =? where id =?");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      pstmt.setInt(3,p.getId());
      System.out.println("updating..."+p.getName());
      pstmt.executeUpdate();
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
  public void delete(int id){
    try{
      pstmt = conn.prepareStatement("delete from persons where id = ?");
      pstmt.setInt(1, id);
      int rows = pstmt.executeUpdate(); //return이 int임
      if(rows == 0){
        System.out.println("can not delete");
      }else if(rows > 0){
        System.out.println("deleting.,.,");
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