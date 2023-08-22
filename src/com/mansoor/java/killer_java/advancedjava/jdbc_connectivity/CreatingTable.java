package com.mansoor.java.killer_java.advancedjava.jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingTable {

    public static void main(String[] args) throws Exception {
        try{
            String url="jdbc:mysql://localhost:3306/mansoor18";
            String uname="root";
            String pwd="1234";

            Connection con = DriverManager.getConnection(url ,uname,pwd );

            Statement st=con.createStatement();

            int i= st.executeUpdate("create table if not exists department(dep_id int ,dept_name varchar(100))");
            i=st.executeUpdate("insert into department values (2,'Bussiness')");

            System.out.println(i+" Row Effected");

            st.close();
            con.close();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
