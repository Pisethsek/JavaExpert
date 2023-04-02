package dataStructure.smsUsingArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Student> arrs = new ArrayList<>();
        
        int n =0;
        do{
            System.out.println("1. Add Student");
            System.out.println("2. Show Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
            System.out.print("Enter your Menu ::: ");
            n = cin.nextInt();

            switch(n){
                case 1 ->{
                    Student obj = new Student();
                    System.out.println("-----Add Student-----");
                    System.out.print("Enter Student ID : ");
                    obj.id = cin.nextInt();
                    System.out.print("Enter Steudent name : ");
                    cin.nextLine();
                    obj.name = cin.nextLine();
                    arrs.add(obj);
                }
                case 2 -> {
                    System.out.println("-----Show Student-----");
                    System.out.println(arrs);
                }
                case 3 -> {
                    System.out.println("-----Delete Student-----");
                    System.out.print("Enter ID to delete : ");
                    int id = cin.nextInt();
                    for (int i=0; i<arrs.size(); i++){
                        if (id == arrs.get(i).id){
                            arrs.remove(i);
                        }
                    }
                }
                case 4 -> {
                    Student obj = new Student();
                    System.out.println("-----Update Student-----");
                    System.out.print("Enter ID to update : ");
                    int id = cin.nextInt();
                    for (int i=0; i<arrs.size(); i++){
                        if (id == arrs.get(i).id){
                            obj.id = id;
                            System.out.print("Enter New Name : ");
                            cin.nextLine();
                            obj.name = cin.nextLine();
                            arrs.set(i, obj);
                        }
                    }
                }
                case 5 -> {}
                default -> System.out.println("Invalid chosen!!!");
            }
        }while(n!=5);

       
    }
}
