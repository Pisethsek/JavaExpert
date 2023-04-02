package conditional;

import java.util.Scanner;

public class SmallPractice {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        final String usename = "sek piseth";
        final String password = "1234";

        int count =1;
        while(count < 4){
            System.out.print("Enter Username : ");
            String n = cin.nextLine();
            System.out.print("Enter Password : ");
            String p = cin.nextLine();

            if (n.equals(usename) && p.equals(password)){
                System.out.println("Successfully Login");
            }else{
                System.out.println("Failed To Login");
            }

            count++;
        }
    }
}
