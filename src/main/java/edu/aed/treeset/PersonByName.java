package edu.aed.treeset;

public class PersonByName extends Person implements Comparable {

    public PersonByName() {
        super();
    }

    public PersonByName(String name, int age) {
        super(name, age);
    }
    
    public PersonByName(Person p) {
        super(p.name, p.age);
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Person)o).name);
    }
    
}
