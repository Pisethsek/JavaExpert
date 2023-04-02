package dataStructure;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //decalare an arrayList in java
        ArrayList<Integer> arrayList = new ArrayList<>();

        //add element in arrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        //accessing element in arrayList
        int a = arrayList.get(4);System.out.println(a);

        //change arrayList element
        System.out.println("-------------------------------------------");
        arrayList.set(0, 1000);System.out.println(arrayList);

        //remove arrayList element by index
        System.out.println("-------------------------------------------");
        arrayList.remove(0);
        System.out.println(arrayList);

        //remove arrayList element
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("-------------------------------------------");
        System.out.println(arrayList);
      

        //some method in arrayLists
        System.out.println("-------------------------------------------");
        ArrayList<Integer> demo = new ArrayList<>();
        demo.add(100);
        demo.add(50);
        for (int i =1; i<=10; i++){
            demo.add(i);
        }

        System.out.println("Size of demo : "+demo.size());
        demo.sort(Comparator.naturalOrder());
        System.out.println(demo);
        demo.sort(Comparator.reverseOrder());
        System.out.println(demo);

        System.out.println("after clone the arraylsit from demo-------------------------------------------");
        ArrayList<Integer> newClone = (ArrayList<Integer>) demo.clone();
        System.out.println(newClone);

        System.out.println("containt method arraylsit from demo-------------------------------------------");
        System.out.println(newClone.contains(100));
        System.out.println(newClone.contains(10000));

        ArrayList<Integer> arrDemoEn = new ArrayList<>();
        arrDemoEn.ensureCapacity(2);
        arrDemoEn.add(1);
        arrDemoEn.add(2);
        arrDemoEn.add(3);

        System.out.println("Size of ensure is "+arrDemoEn.size());
        System.out.println("isEmpty of ensure is "+arrDemoEn.isEmpty());
        System.out.println("Index of 2 is "+arrDemoEn.indexOf(2));
        int j = arrDemoEn.indexOf(1);
        System.out.println(j);
        System.out.println(arrDemoEn);
    }
}
