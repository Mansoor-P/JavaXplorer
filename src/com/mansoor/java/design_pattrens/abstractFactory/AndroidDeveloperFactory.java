package com.mansoor.java.design_pattrens.abstractFactory;

public
class AndroidDeveloperFactory extends EmployeeAbstractFactory {

    @Override
    public
    Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
