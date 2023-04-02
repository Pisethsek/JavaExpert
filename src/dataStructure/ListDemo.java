package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {
        //In Java, the List interface is an ordered collection that allows us to store and access elements sequentially. 
        //It extends the Collection interface.
        //-> Methods of list:
        //add() - adds an element to a list
        //addAll() - adds all elements of one list to another
        //get() - helps to randomly access elements from lists
        //iterator() - returns iterator object that can be used to sequentially access elements of lists
        //set() - changes elements of lists
        //remove() - removes an element from the list
        // removeAll() - removes all the elements from the list
        //clear() - removes all the elements from the list (more efficient than removeAll())
        //size() - returns the length of lists
        //toArray() - converts a list into an array
        //contains() - returns true if a list contains specified element
        //-> class that implement list :
        //1. ArrayList
        //2. LinkedList
        //3. Vector
        //4. Stack
        List<String> arrList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();
        List<String> vexList = new Vector<>();
        List<String> stack = new Stack<>();

        System.out.println(arrList);
        System.out.println(linkList);
        System.out.println(vexList);
        System.out.println(stack);

    }
}
