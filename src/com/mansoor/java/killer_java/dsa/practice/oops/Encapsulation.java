package dsa.practice.oops;

class Encapsulate {

    private String studentName;
    private int studentRoll;
    private int studentAge;

    public int getAge() {
        return studentAge;
    }
    public String getName() {
        return studentName;
    }


    public int getRoll() {
        return studentRoll;
    }

    public void setAge(int newAge) {
        studentAge = newAge;
    }
    public void setName(String newName)
    {
        studentName = newName;
    }


    public void setRoll(int newRoll) {
        studentRoll = newRoll;
    }
}

public class Encapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();

        obj.setName("Mansoor");
        obj.setAge(21);
        obj.setRoll(81);

        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}