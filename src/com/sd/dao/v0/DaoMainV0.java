package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DaoMainV0{
  public static void main(String[] args){
    Connection conn = null; //sql�� �ִ� �Լ� ����.
    Statement stmt = null;
    ResultSet rs = null;
      
    try{
      String path = System.getProperty("user.dir"); //����η� ������� ã�ƿ��°�
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path)); //�о����� ���� �о properties�� �ֱ�?
      //3�ܰ� ���� �׻� �Ȱ��� ����̹� �ε� 
      Class.forName("com.mysql.jdbc.Driver");
      //4�ܰ�
     // conn=DriverManager.getConnection(//String url, String user, String pw return Connection
                                       //"jdbc:mysql://localhost/test","root","qkrtpwls");
      conn=DriverManager.getConnection(
                                       prop.getProperty("URL")+"?useSSL=true",
                                       prop.getProperty("USER"),
                                       prop.getProperty("PASSWORD")
      );
      //5�ܰ�
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
    } finally{//���⼭ �ڿ����� �ݾ�����������  �޸� explosion���� �Ͼ
      try{
        //6�ܰ�
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(conn != null) conn.close();
      }catch (Exception e){};
    }
  }
}