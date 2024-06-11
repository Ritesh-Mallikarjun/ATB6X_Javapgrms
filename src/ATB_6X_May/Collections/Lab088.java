package ATB_6X_May.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab088 {
    public static void main(String[] args) {
        List<String> stringlist= new ArrayList<>();
        stringlist.add("uncle");
        stringlist.add("aunty");
        stringlist.add("dodappa");
        stringlist.add("dodamma");
        stringlist.add("chikkapa");
        stringlist.add("chikkamma");
        stringlist.add("ajji");
        stringlist.add("ajja");
        stringlist.add("brother");
        stringlist.add("sister");
        // not possible inside the string arraylist ,which is specifically mentioned
//        stringlist.add(12355555555);
//        stringlist.add(123.4568);
//        stringlist.add(105666);
//        stringlist.add(true);
//        stringlist.add(false);
        System.out.println(stringlist);
        System.out.println(stringlist.size());

        System.out.println("---------Using normal for loop-------------");

        for (int i = 0; i < stringlist.size() ; i++) {
            System.out.println(stringlist.get(i));
        }

        System.out.println("----------using for each loop---------------");
        for(String str:stringlist){
            System.out.println(str);
        }

        System.out.println("-----------using Iterator----------------");
        Iterator<String>  itr= stringlist.iterator();
        System.out.println("printing the iterator "+itr);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("===========================================");

        List<Integer> intlist= new ArrayList<>();
        intlist.add(10000);
        intlist.add(10320);
        intlist.add(1344);
        intlist.add(545);
        intlist.add(224);
        //Only integers are allowed , rest decimals,float,long, boolean,char,strings are not allowed when its restricted to Integer
//        intlist.add(123.4568);
//        intlist.add(true);
//        intlist.add('A');
//        intlist.add('a');
//        intlist.add(false);
//        intlist.add(9999999999L);
//        intlist.add("String is it allowed??");
        System.out.println(intlist);
        System.out.println(intlist.size());

        System.out.println("----------using for each loop---------------");
        for(Integer itl: intlist){
            System.out.println(itl);
        }

        System.out.println("==========using iterator==========");
        Iterator<Integer> iterator= intlist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
