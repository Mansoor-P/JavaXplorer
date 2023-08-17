package com.mansoor.java.projects.moneymanagement;

import java.sql.*;
import java.util.Scanner;

public class db
 {
    public static void main(String[] args) throws Exception
    {
        try
        {
            String url="jdbc:mysql://localhost:3306/moneymanagement";
            String uname="root";
            String pwd="1234";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url ,uname,pwd );

            Statement st=con.createStatement();

            int i= st.executeUpdate("create table if not exists transactions (tran_date varchar(20) , amount double , tran_ype varchar(10),note varchar(100) )");
            System.out.println(i);

            String q="insert into transactions (tran_date,amount,tran_type,note) values (?,?,?,?)";

            PreparedStatement psmt= con.prepareStatement(q);

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your date dd/mm/yyyy");
            String tran_date=sc.next();
            System.out.println("Enter your amount");
            double amount=sc.nextDouble();
            System.out.println("Enter your Transaction Type");
            String tran_type=sc.next();
            System.out.println("Enter your Transaction Note");
            String note=sc.next();

            psmt.setString(1,tran_date);
            psmt.setDouble(2,amount);
            psmt.setString(3,tran_type);
            psmt.setString(4, note);

            psmt.executeUpdate();

            System.out.println("Records Successfully Inserted");

//            ResultSet rs=st.executeQuery("select * from transactions");
//
//            while (rs.next())
//            {
//                System.out.println( rs.getString("tran_date") +
//                        "\t" + rs.getDouble("amount") +
//                        "\t" + rs.getString("tran_type") +
//                        "\t" + rs.getString("note") );
//            }

            st.close();
            con.close();
            psmt.close();
//            rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

 }
