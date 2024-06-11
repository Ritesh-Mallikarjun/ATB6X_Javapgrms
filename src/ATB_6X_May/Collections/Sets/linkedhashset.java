package ATB_6X_May.Collections.Sets;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

 class linkedhashset
 {
    public static void main(String[] args) throws IOException,RuntimeException
     {
         //Insertion order is preserved
         //null is entered and allowed,
         // the way user is entered , same way it is displayed.
         //serializable and cloneable interfaces can be implemented.
         //sorting is not done in linkedhashset

        Set<String> hset= new LinkedHashSet();
        hset.add("ramya");
        hset.add("soumta");
        hset.add("ranaga");
        hset.add("tinha");
        hset.add("tinha");
        hset.add("rithanshu");
        hset.add("himanshu");
//        hset.add(123);
//        hset.add(346);
        System.out.println(hset);
        System.out.println(hset.size());

        Set<Integer> setint= new LinkedHashSet<>();
        setint.add(223);
        setint.add(452);
        setint.add(898);
        setint.add(8956);
//        setint.add(89898.233); java: incompatible types: double cannot be converted to java.lang.Integer
        setint.add(8956);
        setint.add(789);
        setint.add(5645);
        setint.add(124);
//        setint.add("124"); java: incompatible types: java.lang.String cannot be converted to java.lang.Integer
//         setint.add(true); java: incompatible types: boolean cannot be converted to java.lang.Integer
//         setint.add(true);java: incompatible types: boolean cannot be converted to java.lang.Integer
//         setint.add(false);java: incompatible types: boolean cannot be converted to java.lang.Integer
         setint.add(null);
         setint.add(null);
//         setint.add(8989898985); java: integer number too large
        System.out.println(setint);
        System.out.println(setint.size());

        Iterator lit1= hset.iterator();
        while (lit1.hasNext()){
           System.out.println(lit1.next());
        }

        Iterator lit2 = setint.iterator();
        while (lit2.hasNext()){
           System.out.println(lit2.next());
        }
    }
}
