package com.mansoor.java.killer_java.jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.io.*;
import java.util.Scanner;


public class Dynamic_Prepared_Statement {

    public static void main(String[] args) {
        try{
            String url="jdbc:mysql://localhost:3306/mansoor18";
            String uname="root";
            String pwd="1234";

            Connection con = DriverManager.getConnection(url ,uname,pwd );

            String q="insert into department (dep_id,dept_name) values (?,?)";

            PreparedStatement psmt= con.prepareStatement(q);

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Department id");
            int d_id=sc.nextInt();
            System.out.println("Enter your Department name");
            String d_name=sc.next();


            psmt.setInt(1,d_id);
            psmt.setString(2,d_name);
            psmt.executeUpdate();
            System.out.println("Records Successfully Inserted");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

