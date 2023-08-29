package com.mansoor.java.killer_java.corejava.files;

import java.io.File;
import java.io.IOException;

public class Exmaple {
    public static void main(String[] args) throws IOException {
        File f=new File("E:\\killer-java\\killer-java\\src\\com\\mansoor\\java\\killer_java\\corejava\\files\\mansoor.txt");

        if (f.exists()){
            System.out.println("File is Created Already");
        }
        else{
            f.createNewFile();
        }
    }
}
