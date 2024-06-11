package ATB_6X_May.Collections.Sets;

import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
         Set tset= new TreeSet();
         tset.add(25);
         tset.add(89);
         tset.add(56);
         tset.add(457);
//         tset.add("naul");Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
         tset.add(153);
//         tset.add(null);Exception in thread "main" java.lang.NullPointerException
        System.out.println(tset);
        System.out.println(tset.size());

        TreeSet tset1 = new TreeSet();
        tset1.add("Amit");
        tset1.add("Kunal");
        tset1.add("Mianlia");
        tset1.add("Anakdat");
        tset1.add("Junaid");
//        tset1.add(12344);Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
//        tset1.add(253); Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
        System.out.println(tset1);
        System.out.println(tset1.size());

    }
}
