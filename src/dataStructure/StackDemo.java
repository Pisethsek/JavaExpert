package dataStructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        arr.push(10);
        arr.push(20);
        arr.push(30);

        // arr.pop();
       System.out.println(arr.peek()); 
System.out.println(arr.search(20));

        System.out.println(arr);
    }
}
