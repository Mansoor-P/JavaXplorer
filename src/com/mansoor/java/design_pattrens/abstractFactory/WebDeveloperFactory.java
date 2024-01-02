package com.mansoor.java.design_pattrens.abstractFactory;

public
class WebDeveloperFactory  extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee(){
        return  new WebDeveloper()  ;

    }



}
