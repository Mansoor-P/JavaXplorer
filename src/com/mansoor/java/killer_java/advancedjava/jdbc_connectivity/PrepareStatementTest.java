package com.mansoor.java.killer_java.advancedjava.jdbc_connectivity;
import java.sql.*;

public class PrepareStatementTest {
    public static void main(String[] args) throws Exception {

        try{
            String url="jdbc:mysql://localhost:3306/mansoor18";
            String uname="root";
            String pwd="1234";

            Connection con = DriverManager.getConnection(url ,uname,pwd );

            String q="insert into department (dep_id,dept_name) values (?,?)";

            PreparedStatement psmt= con.prepareStatement(q);

            psmt.setInt(1,3);
            psmt.setString(2,"PHYSICS");
            psmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
