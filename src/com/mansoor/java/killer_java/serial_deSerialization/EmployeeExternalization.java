package com.mansoor.java.killer_java.serial_deSerialization;

import java.io.*;

public
class EmployeeExternalization implements Externalizable {
    @Serial
    private  static final long serialVersionUID=1L;
    private int id;
    private String name;

    public
    int getId() {
        return id;
    }

    public
    void setId(int id) {
        this.id = id;
    }

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id= in.readInt();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EmployeeExternalization ee=new EmployeeExternalization();
        ee.setId(1);
        ee.setName("Mansoor");

        // serialization
        FileOutputStream fileOut=new FileOutputStream("E:\\programming-projects\\IntelliJProjects\\killer-java\\src\\com\\mansoor\\java\\killer_java\\serial_deSerialization\\ExternalizationFile.ser");
        ObjectOutputStream outputStream =new ObjectOutputStream(fileOut);
        outputStream.writeObject(ee);
        outputStream.close();
        fileOut.close();

        // deserialization

        // when we're deserializing this file the id only wrote why because in write method we declared only id but not name
        // so the name will ignore and output is null

        FileInputStream fileIn=new FileInputStream("E:\\programming-projects\\IntelliJProjects\\killer-java\\src\\com\\mansoor\\java\\killer_java\\serial_deSerialization\\ExternalizationFile.ser");
        ObjectInputStream objInput=new ObjectInputStream(fileIn);
        EmployeeExternalization reCreateObj=(EmployeeExternalization)  objInput.readObject();
        System.out.println(reCreateObj.getName());
        objInput.close();
        fileIn.close();
    }


}
