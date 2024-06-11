package ATB_6X_May.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lab090 {
    public static void main(String[] args) {
        List l1= new LinkedList();
        l1.add("ritesh");
        l1.add("pavan");
        l1.add("mantara");
        l1.add("Sundeep");
        l1.add("kuldeep");
        System.out.println(l1);
        l1.add(231330);
        l1.add(52.2368);
        l1.add(true);
        l1.add(false);
        l1.add(null);
        System.out.println(l1);

        System.out.println("======Print 1=========");
        for (int i = 0; i <l1.size() ; i++) {
            System.out.println(l1.get(i));
        }

        System.out.println("========Print 2========");
        for(Object obj:l1){
            System.out.println(obj);
        }

        System.out.println("========Print 3========");
        Iterator iterator= l1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
//            l1.add("Prani"); Using l1 its not possible
//            Not possible to add elements inside Iterator because it gives java.util.ConcurrentModificationException
        }

        System.out.println("=========Print 4=========");
        ListIterator listIterator=l1.listIterator();
        while (listIterator.hasNext()){
//            listIterator.add("manojsharma");
//            we can add the elements only inside the listIterator rest all the iterators will result in concurrentmodification exception
            System.out.println(listIterator.next());
        }

        System.out.println(l1);
    }
}
