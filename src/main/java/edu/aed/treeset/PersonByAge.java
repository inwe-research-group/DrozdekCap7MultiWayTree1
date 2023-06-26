package edu.aed.treeset;
public class PersonByAge extends Person implements Comparable {

    public PersonByAge() {
        super();
    }

    public PersonByAge(String name, int age) {
        super(name, age);
    }
    
    public PersonByAge(Person p) {
        super(p.name,p.age);
    }

    @Override
    public int compareTo(Object o) {
        return age-((Person)o).age;
    }
    
    
}
