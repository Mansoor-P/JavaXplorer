package com.mansoor.java.design_pattrens.creational.factory;

public
class DeveloperClient {
    public static
    void main(String[] args) {

      Employee employee=  EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee);
        int sal=employee.salary();
        System.out.println(sal);
    }
}
