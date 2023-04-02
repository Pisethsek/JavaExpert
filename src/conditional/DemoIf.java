package conditional;

public class DemoIf {
    public static void main(String[] args) {
        /*
         * Java provides three types of control flow statements:
            1. Decision Making statements
                if statements
                switch statement
            2. Loop statements
                do while loop
                while loop
                for loop
                for-each loop
            3. Jump statements
                break statement
                continue statement
         */

        //Simple if statement
        int a = 71;

        if (a < 5){
            System.out.println("A is bigger than 10");
        }
        
        // if-else statement
        if (a < 10 ){
            System.out.println("A is smaller than 10 ");
        }else{
            System.out.println("A is bigger than 10");
        }

        // if-else-if ladder
        if (a <= 0){
            System.out.println("a is negative");
        }else if (a <= 70){
            System.out.println("A is bigger than 0 and equal to 70");
        }else if(a <= 100){
            System.out.println("Perfect");
        }else{
            System.out.println("the best");
        }

        // Nested if-statement
        if (a > 0){
            if (a > 10){
                System.out.println("hi");
            }else{
                System.out.println("Hello");
            }
        }

    }
}
