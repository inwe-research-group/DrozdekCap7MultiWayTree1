package edu.aed.treeset;

public class Person {
    protected String name;
    protected int age;

    public Person(){
        this("",0);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    
}
