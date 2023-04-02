package function;

public class Demo {
    public static void main(String[] args) {
        /*
         * 
         * A method/function is a way to perform some task. Similarly, in programming like Java, a function method is a block of code written to perform a specific task repeatedly. It provides reusability of code. We write the function once and use it many times. It works on the ‘DRY’ principle i.e., “Do not repeat yourself”.

            Steps -

            Define function - datatype function_name(parameters){body}
            Call function - function_name(values)
            Visit the following resources to learn more:

            Methods/Functions in Java.
            What are methods or functions in Java.
            Learn Functions/Methods in Java
            Functions / Methods in Java
         */

         AllMethod obj = new AllMethod();
         obj.greeting();
         obj.greetingName("Seth");

         System.out.println("--------------");

        String name = obj.greetingParam();
        System.out.println(name);

        String nameObj = obj.getName("Ji ko");
        System.out.println(nameObj);

    }
}
