package ATB_6X_May.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab086 {
    public static void main(String[] args) {
        //List and arraylist are heterogenous in nature and it allows all the datatypes into the list
        List list= new ArrayList<>();
        list.add("Ramana");
        list.add("Timber");
        list.add(true);
        list.add(1235.5688);
        list.add(1000);
        list.add(false);
        list.add(true);
        list.add(null);
        list.add("Vinay");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("-------------------------------------");
        System.out.println("Using for loop ,displaying the elements");

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------");
        System.out.println("Using for each loop , displaying the elements");
        list.removeLast();
        System.out.println(list.size());
        for(Object obj:list){
            System.out.println(obj);
        }


    }
}
