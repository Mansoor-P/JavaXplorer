package com.mansoor.java.killer_java.jdbc_connectivity;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.*;
public class ImageInserting {
    public static void main(String[] args) throws  Exception {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mansoor18","root" ,"1234");

            Statement st=con.createStatement();
//         int i=  st.executeUpdate("create table  images(id int primary key auto_increment , pic blob )");
//         System.out.println(i+"Row Effecfted");

            String q= "insert into images(pic) values(?)";

            PreparedStatement psmt=con.prepareStatement(q);

            FileInputStream fis=new FileInputStream("E:\\killer-java\\src\\com\\mansoor\\java\\killer_java\\jdbc_connectivity\\m.jpg");
            psmt.setBinaryStream(1,fis,fis.available());

            psmt.executeUpdate();
            System.out.println("Image Inserted ....");
        }
        catch(Exception e)
        {
            System.out.println("error  =  " + e);
        }
    }
}
