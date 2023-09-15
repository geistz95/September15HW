package org.example;

public class Employee extends Person {
    private String employeeID;
    private String title;
    public Employee(){
        super("angie");
        System.out.println("In the employee class");
    }
    public String getEmployeeID(){
        return employeeID;
    }
    public String getTitle(){
        return title;
    }
    public void setEmployeeID(String employeeID){
        this.employeeID=employeeID;
    }
    public void setTitle(String title){this.title=title;}
}
