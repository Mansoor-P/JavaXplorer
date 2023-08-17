package com.mansoor.java.killer_java.jdbc_connectivity;

import java.sql.Connection;
import java.sql.*;

public class main {


    public static void main(String[] args) throws Exception {
        try{
            String url="jdbc:mysql://localhost:3306/mansoor18";
            String uname="root";
            String pwd="1234";

            Connection con =DriverManager.getConnection(url ,uname,pwd );

            Statement st=con.createStatement();

//            st.executeUpdate("insert into student values(1,'mansoor') ");
//            st.executeUpdate("insert into student values(2,'akbar') ");
//            st.executeUpdate("insert into student values(3,'reyaz') ");
//            st.executeUpdate("insert into student values(4,'fareed') ");

//            int i= st.executeUpdate("create table if not exists department(dep_id int ,dept_name varchar(100))");
//            i=st.executeUpdate("insert into department values (2,'Bussiness')");
//
//            System.out.println(i+" Row Effected");

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
