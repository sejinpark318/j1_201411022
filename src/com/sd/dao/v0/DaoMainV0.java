package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DaoMainV0{
  public static void main(String[] args){
    Connection conn = null; //sql에 있는 함수 쓸것.
    Statement stmt = null;
    ResultSet rs = null;
      
    try{
      String path = System.getProperty("user.dir"); //상대경로로 잡을라고 찾아오는거
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path)); //패쓰내의 파일 읽어서 properties에 넣기?
      //3단계 여긴 항상 똑같이 드라이버 로딩 
      Class.forName("com.mysql.jdbc.Driver");
      //4단계
     // conn=DriverManager.getConnection(//String url, String user, String pw return Connection
                                       //"jdbc:mysql://localhost/test","root","qkrtpwls");
      conn=DriverManager.getConnection(
                                       prop.getProperty("URL")+"?useSSL=true",
                                       prop.getProperty("USER"),
                                       prop.getProperty("PASSWORD")
      );
      //5단계
      stmt = conn.createStatement();
      //String mySql = "CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      //mySql += "name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      //String mySql ="INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')";
      String mySql="select name from persons where id<4 order by id";
      rs = stmt.executeQuery(mySql);
      while(rs.next()){
        System.out.println(rs.getString("name"));
      }
      
    }catch(Exception e){
      e.printStackTrace();
    } finally{//여기서 자원들을 닫아주지않으면  메모리 explosion현상 일어남
      try{
        //6단계
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(conn != null) conn.close();
      }catch (Exception e){};
    }
  }
}