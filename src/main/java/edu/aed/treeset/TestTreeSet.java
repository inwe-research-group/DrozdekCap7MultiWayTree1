package edu.aed.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet set1=new TreeSet(); //set1=[]
        set1.add(4);//set1=[4]
        set1.add(5);//set1=[4,5]
        set1.add(6);//set1=[4,5,6]
        set1.add(5);//set1=[4,5,6]        
        System.out.println("set1= "+set1);//set1=[4,5,6]        
        System.out.println(set1.contains(5));//verdadero
        System.out.println(set1.contains(7));//false
        System.out.println(set1.first()+" "+set1.last());//4,6
        System.out.println(set1.headSet(5));//[4]//cabecera
        System.out.println(set1.tailSet(5));//[5,6]//cola
        
        TreeSet set2=new TreeSet(set1);//set2=[4,5,6]
        set2.remove(5);//set2=[4,6]
        set1.removeAll(set2);//set1=[5]
        set1.addAll(set2);//set1=[4,5,6]
        
        TreeSet pSet1=new TreeSet(), pSet2=new TreeSet();
        Person[] p={new Person("Gregg",25),
                    new Person("Ann",30),
                    new Person("Bill",20),
                    new Person("Gregg",35),
                    new Person("Kay",30)};
        for(int i=0;i<p.length;i++)
            pSet1.add(new PersonByName(p[i]));
        //pSet1=[(Ann,30),(Bill,20),(Gregg,25),(Kay,30)]
        
        for(int i=0;i<p.length;i++)
            pSet2.add(new PersonByAge(p[i]));
        //pSet2=[(Bill,20),(Gregg,25),(Ann,30),(Gregg,35)]
        
        Iterator it=pSet2.iterator();
        it.next();
        ((Person)it.next()).age=50;
        //pSet2=[(Bill,20),(Gregg,50),(Ann,30),(Gregg,35)]
        
        pSet2.add(new PersonByAge("Craig",40));
        //pSet2=[(Bill,20),(Craig,40),("Gregg",50),(Ann,30),(Gregg,35)]
        System.out.println("pSet2= "+pSet2);
        for(int i=0;i<p.length;i++)
            System.out.println(p[i]+" "+pSet2.contains(new PersonByAge(p[i])));        
        //(Gregg,25) falso
        //(Ann,30) falso
        //(Bill,20) verdadero
        //(Gregg,35) falso
        //(Kay,30) falso
        TreeSet pSet3=new TreeSet(new PersonComparator());
        for(int i=0;i<p.length;i++)
            pSet3.add(p[i]);
        pSet3.add(null);
        pSet3.add(null);
        System.out.println("pSet3= "+pSet3);
        //pSet3=[null,(Ann,30),(Bill,20),(Gregg,25),(Kay,30)]                
    }   
}
