/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelManagement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author HP
 */
public class conn {
    Connection con;
    Statement s;
 public conn(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
     s=con.createStatement();
}
    catch(Exception e){
    e.printStackTrace();
}
}
}
