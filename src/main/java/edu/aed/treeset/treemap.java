package edu.aed.treeset;
import java.util.Map;
import java.util.TreeMap;
public class treemap {
    public static void main(String[] args) {
        TreeMap cities=new TreeMap();    
        cities.put(new PersonByName("Gregg",25),"Pittsburgh");
        cities.put(new PersonByName("Ann",30),"Boston");
        cities.put(new PersonByName("Bill",20),"Belmont");
        System.out.println(cities);
        //{(Ann,30)=Boston,(Bill,20)=Belmont,(Gregg,25)=Pittsburgh}
        cities.put(new PersonByName("Gregg",30),"Austin");
        System.out.println(cities);
        //cities={(Ann,30)=Boston,(Bill,20)=Belmont,(Gregg,25)=Austin}
        System.out.println(cities.containsKey(new PersonByName("Ann",30)));
        //verdadero
        System.out.println(cities.containsValue("Austin"));
        //verdadero
        System.out.println(cities.firstKey()+" "+cities.lastKey());
        //(Ann,30)(Gregg,25)
        System.out.println(cities.get(new PersonByName("Ann",30)));
        //Boston
        System.out.println(cities.entrySet());
        //{(Ann,30)=Boston,(Bill,20)=Belmont,(Gregg,25)=Austin}
        System.out.println(cities.keySet());
        //[(Ann,30)(Bill,20)(Gregg,25)]
        System.out.println(cities.remove(new PersonByName("Bill",20)));
        //Belmont
        //cities={(Ann,30)=Boston,(Gregg,25)=Austin}
        Map.Entry me=(Map.Entry)cities.entrySet().iterator().next();
        //primera entrada
        System.out.println(me.getKey());//Ann,30)
        System.out.println(me.getValue());//Boston
        System.out.println(me.setValue("Harrisburg"));//Boston
        System.out.println(cities);
        //cities={(Ann,30)=Harrisburg,(Gregg,25)=Austin}
     }
}   


