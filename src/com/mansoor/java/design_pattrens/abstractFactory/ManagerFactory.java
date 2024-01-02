package com.mansoor.java.design_pattrens.abstractFactory;

public
class ManagerFactory extends EmployeeAbstractFactory{
    @Override
    public
    Employee createEmployee() {
        return new Manager();
    }
}
