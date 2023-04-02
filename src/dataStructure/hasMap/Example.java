package dataStructure.hasMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Example {
    public static void main(String[] args) {
        HashMap<Integer, String> arrs = new HashMap<>();

        //add data 
        for (int i=1; i<=10; i++){
            arrs.put(i, "Cambodia"+i);
        }

        //print all elements
        System.out.println("---------------------");
        System.out.println(arrs);
        System.out.println("only key---------------------");
        for (Integer i : arrs.keySet()){
            System.out.println(i);
        }
        System.out.println("only value---------------------");
        for (String i : arrs.values()){
            System.out.println(i);
        }
        System.out.println("key value/pairs---------------------");
        for (Entry<Integer, String> i : arrs.entrySet()){
            System.out.println(i);
        }
        
    }
}
