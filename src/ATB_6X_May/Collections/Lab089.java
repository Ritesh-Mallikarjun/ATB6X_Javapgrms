package ATB_6X_May.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab089 {
    public static void main(String[] args) {
        ArrayList list= new ArrayList(15);
        System.out.println("The initial capacity of the list size is: "+list.size());
        for (int i = 0; i <15; i++) {
            list.add("AB"+i);
        }
        System.out.println(list);
        System.out.println("The size after some elements in the arraylist is: "+list.size());

        //All are allowed in java , using list interface
        //using seqencedcollection interface
        // using collection interface
        List list1= new ArrayList();
        SequencedCollection list2= new ArrayList();
        Collection list3= new ArrayList();

        list1.add("ritesh");
        list1.add("suman");
        list1.add("rangoli");
        list1.add("ritesh");
        list1.add("pramod");
        list1.add("ritesh");
        System.out.println(list1);
        list1.remove("ritesh");
        System.out.println("list after removing ritesh: "+list1);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        System.out.println(list1);
        list1.set(5,"Hitler");
        list1.set(7,"Mussolini");
        System.out.println(list1);

    }
}
