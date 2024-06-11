package ATB_6X_May.Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set set= new HashSet();
        set.add("Apple");
        set.add("Mango");
        set.add("Grapes");
        set.add("Pineapple");
        set.add("apple");
        set.add("Apple");
        System.out.println(set);
        System.out.println(set.size());

        Set set2= new HashSet();
        set2.add(12);
        set2.add(23);
        set2.add(56);
        set2.add(89);
        set2.add("rahim");
        set2.add(null);
        set2.add(true);
        set2.add(false);
        set2.add(true);
        System.out.println(set2);

        Iterator it1 = set.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        System.out.println("-------------------SET2---------------------");

        Iterator it2 =set2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }


    }
}
