/*
 * 
 * 
 */
import java.net.URL;
import java.sql.*;
import java.io.PrintWriter;
import java.io.*; 
import java.sql.*; 
import java.sql.Connection.*; 
public class DataBase
{
  // the main was use for test and debug 
  public static void main (String[] args) { 
    
    Connection connection = null;
    
    try {
      // Load the JDBC driver
      String driverName = "com.mysql.jdbc.Driver"; // MySQL MM JDBC driver
      
      Class.forName(driverName);
      
      // connection to the database
      String serverName = "localhost:3307";
      String mydatabase = "database";
      String url = "jdbc:mysql://" + serverName +  "/" + mydatabase; // a JDBC url
      String username = "admin";
      String password = "admin12345";
      connection = DriverManager.getConnection(url, username, password);
      
      // for debugg
      System.out.println(url);
      
      Statement st = connection.createStatement();
      ResultSet rs = st.executeQuery("select * from tabledatas where score   = 12");
      while(rs.next()) 
      {
        System.out.println( rs.getString("name"));
      }
      st.close();
      rs.close();
      connection.close(); 
      DataBase db = new DataBase();
      db.updateScore("Cagri1", 101);
    }
    catch (ClassNotFoundException e) 
    {
      e.printStackTrace();        
      // it expalain that not find the database driver
    } catch (SQLException e) 
    {
      e.printStackTrace();     
      // it explain not connect to the database
    }
  }
  public boolean updateScore(String name, Integer score)
  {
    Connection connection = null;
    Player player = new Player();
    Arrow arrow = new Arrow();
    Environment environment = new Environment();
    BasicGame game = new BasicGame(arrow, environment);
    //name = player.getName();
    //score = game.getTotalScore();
    try {
      // Load the JDBC driver
      String driverName = "com.mysql.jdbc.Driver"; // MySQL MM JDBC driver
      
      Class.forName(driverName);
      
      // connection to the database
      String serverName = "localhost:3307";
      String mydatabase = "database";
      String url = "jdbc:mysql://" + serverName +  "/" + mydatabase; // a JDBC url
      String username = "admin";
      String password = "admin12345";
      connection = DriverManager.getConnection(url, username, password);
      
      System.out.println(url);
      Statement st = connection.createStatement();

      boolean b =  st.execute("insert into tabledatas ( name, score, part) values ('"+name+"',"+ score+",'1')");
      
      if (b) {
        System.out.println( "çalýþtý");
      }
      st.close();
      connection.close(); 
    } 
    catch (ClassNotFoundException e) 
    {
      e.printStackTrace();        
      // it explain that not find the database driver
    } 
    catch (SQLException e) 
    {
      e.printStackTrace();     
      // it explain that not connect to the database
    }
   return true;
  }
}