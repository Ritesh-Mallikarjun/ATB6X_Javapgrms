package ATB_6X_May.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab091 {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList();
        for (int i = 0; i < 10 ; i++) {
            l1.add("Ram "+(i+1));
        }
        System.out.println(l1);
//        l1.add(12233); not possible because its restricted only to string

        System.out.println("=====Print using String");
        Iterator iterator= l1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Integer> l2= new LinkedList<>();
        for (int i = 0; i < 15 ; i++) {
            l2.add(i+1);
        }
        System.out.println(l2);

        System.out.println("Print using integer for each loop");
        for(Integer il:l2){
            System.out.println(il);
        }


        List<Character> l3= new LinkedList<>();
        for (char i = 'A'; i <='z' ; i++) {
            if(i<='Z'){
                l3.add(i);
            } else if (i>='a' && i<='z') {
                l3.add(i);
            }
            // 65 to 90 is A TO Z
            // 97 to 122 is a to z
        }
        System.out.println(l3);

        System.out.println("Print using character for each loop");
        for(Character ch:l3){
            System.out.println(ch);
        }



    }
}
