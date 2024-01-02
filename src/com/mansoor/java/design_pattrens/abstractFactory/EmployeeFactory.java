package com.mansoor.java.design_pattrens.abstractFactory;

public
class EmployeeFactory {

    // get the employee

    public static
    Employee getEmployee(EmployeeAbstractFactory factory){
       return factory.createEmployee();
    }

}
