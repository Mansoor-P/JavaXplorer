package com.mansoor.java.design_pattrens.creational.abstractFactory;

public
class Client {
    public static
    void main(String[] args) {
        // i want to get Android Developer

        Employee e1= EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        e1.name();

        Employee e2= EmployeeFactory.getEmployee(new WebDeveloperFactory());
        e2.name();

        Employee e3= EmployeeFactory.getEmployee(new ManagerFactory());
        e3.name();



    }
}
