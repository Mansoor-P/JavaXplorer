package com.mansoor.java.killer_java.advancedjava.jdbc_connectivity;

import javax.swing.*;
import java.io.*;
import java.sql.*;

public class InsertLargeImage {
    public static void main(String[] args) throws Exception {
        JFileChooser fc = new JFileChooser();
        int returnValue = fc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File sf = fc.getSelectedFile();

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mansoor18", "root", "1234");
                String q = "INSERT INTO images (pic) VALUES (?)";
                PreparedStatement preparedStatement = connection.prepareStatement(q);
                    FileInputStream fis = new FileInputStream(sf);
                    preparedStatement.setBinaryStream(1, fis, (int) sf.length());
                    preparedStatement.executeUpdate();
                    System.out.println("Image inserted successfully!");
                    JOptionPane.showMessageDialog(null,"Success");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else {
            System.out.println("you are not selected any image");
        }
    }
}
