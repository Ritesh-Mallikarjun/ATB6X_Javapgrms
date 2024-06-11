package ATB_6X_May.Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lab096Tea {
    public static void main(String[] args) throws InterruptedException {
        Teacher t1= new Teacher("Rajubangaya",1257);
        Teacher t2= new Teacher("Zara Singh",296);
        Teacher t3= new Teacher("Virukshah Kintu",3096);
        Teacher t4= new Teacher("Pintu Kintu",876);

        List list1= new LinkedList();
        list1.add(t1);
        list1.add(t2);
        list1.add(t3);
        list1.add(t4);
        System.out.println("This is using Collections.sort() method with Comparable<> interface and compareTo method");
        System.out.println("the list before sorting is displayed below:-");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println("the list after sorting is displayed below:-");
        System.out.println(list1);

        System.out.println("===============ID==DESC=====================");
        Collections.sort(list1,new SortByTIDDesc());
        System.out.println(list1);
        System.out.println("===============ID===ASC====================");
        Collections.sort(list1,new SortByTIDAsc());
        System.out.println(list1);
        System.out.println("===============NAME===ASC====================");
        Collections.sort(list1,new SortByTNamsASC());
        System.out.println(list1);
        System.out.println("===============NAME===DESC====================");
        Collections.sort(list1,new SortByTNameDesc());
        System.out.println(list1);





    }
}
