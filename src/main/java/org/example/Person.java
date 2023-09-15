package org.example;

public class Person {

    private String name;
    private int age;
    private String gender;
    public Person(String name){
        System.out.println("In the Person class");
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
}
