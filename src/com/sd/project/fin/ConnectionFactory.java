package com.sd.project.fin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//v0에서 연결부분가지고 singleton으로 변형
public class ConnectionFactory{
  private static Connection conn = null;
  private ConnectionFactory(){}//생성자가 프라이빗이라서 생성자 안만들고 써야됨 
  //Connection conn = ConnectionFactory.getConnection();
  public static Connection getConnection(){
      
    try{
      String path = System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      conn=DriverManager.getConnection(
                                       prop.getProperty("URL")+"?useSSL=true",
                                       prop.getProperty("USER"),
                                       prop.getProperty("PASSWORD"));
      System.out.println("connecting...");
    }catch(Exception e){
      e.printStackTrace();
    }
    return conn;
  }
}