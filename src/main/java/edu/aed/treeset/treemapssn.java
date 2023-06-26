package edu.aed.treeset;
import java.util.TreeMap;
public class treemapssn {
    public static void main(String[] args) {
        TreeMap SSN=new TreeMap();    
        SSN.put(123456789,new PersonByName("Gregg",25));
        SSN.put(123456790,new PersonByName("Ann",30));
        SSN.put(123456791,new PersonByName("Bill",20));
        System.out.println(SSN);
    }
    
}
