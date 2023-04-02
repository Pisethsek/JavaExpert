package dataStructure.hasMap;

import java.util.HashMap;

public class HasmapDemo {
    public static void main(String[] args) {
        //create an HasMap
        HashMap<String, Integer> arr = new HashMap<>();
        // Add elements
        arr.put("one", 1);
        arr.put("two", 2);
        arr.put("three", 3);
        arr.put("four", 4);
        arr.put("five", 5);
        // Access elements
        System.out.println(arr.get("one"));
        System.out.println(arr.keySet()); //get all key
        System.out.println(arr.entrySet());
        System.out.println(arr.values()); //get all value
        // Change elements
        arr.replace("two", 100);
        // Remove elements'
        arr.remove("two");
        //print all elements
        System.out.println(arr);            
    }
}
