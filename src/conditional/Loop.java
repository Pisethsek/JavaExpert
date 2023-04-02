package conditional;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //for loop
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        //do-while loop
        String name = "seth";
        String nameIn;
        do{
            System.out.println("Enter Your Name : ");
            nameIn = cin.nextLine();
        }while(!(name.equalsIgnoreCase(nameIn)));

        //while loop
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        //for each loop
        int arr[] = new int[]{1,2,3,4,44,5,5,56};
        for (int a : arr){
            System.out.println(a);
        }
    }
}
