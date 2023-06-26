package edu.aed.treeset;

import java.util.Comparator;

public class PersonComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1==o2)
            return 0;
        else if(o1==null)
            return -1;
        else if(o2==null)
            return 1;
        else return ((Person)o1).name.compareTo(((Person)o2).name);
    }
    
}
