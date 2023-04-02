package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //vector are synchronized
        Vector<Integer> arr = new Vector<>();
        arr.add(10);
        arr.add(20);

        //access el in vector 
        System.out.println(arr.get(1));

    }
}
