package com.mansoor.java.killer_java.advancedjava.jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrivingData {
    public static void main(String[] args) throws Exception {
        try{
            String url="jdbc:mysql://localhost:3306/mansoor18";
            String uname="root";
            String pwd="1234";

        //    Class.forName("com.mysql.jdbc.cj.Driver");

            Connection con = DriverManager.getConnection(url ,uname,pwd );

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("select * from department");
//            rs.next();
//            System.out.println(rs.getInt(1));
//            System.out.println(rs.getString("name"));

            while (rs.next()){
                System.out.println(rs.getInt(1) +"\t"+rs.getString("dept_name"));
//                System.out.println(rs.getString( "dept_name" ));
            }

            st.close();
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
