package com.mansoor.java.killer_java.serial_deSerialization;

import java.io.*;

public
class Main {
    public static
    void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e=new Employee();
        e.setId(1);
        e.setName("Mansoor");
        // serialization
        FileOutputStream fileOut=new FileOutputStream("E:\\programming-projects\\IntelliJProjects\\killer-java\\src\\com\\mansoor\\java\\killer_java\\serial_deSerialization\\serializationFile.ser");
        ObjectOutputStream outputStream =new ObjectOutputStream(fileOut);
        outputStream.writeObject(e);
        outputStream.close();
        fileOut.close();

        // deserialization

        FileInputStream fileIn=new FileInputStream("E:\\programming-projects\\IntelliJProjects\\killer-java\\src\\com\\mansoor\\java\\killer_java\\serial_deSerialization\\serializationFile.ser");
        ObjectInputStream objInput=new ObjectInputStream(fileIn);
        Employee reCreateObj=(Employee)  objInput.readObject();

        System.out.println(reCreateObj.getName());
        objInput.close();
        fileIn.close();
    }
}
