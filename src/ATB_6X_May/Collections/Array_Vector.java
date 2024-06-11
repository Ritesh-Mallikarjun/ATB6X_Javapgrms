package ATB_6X_May.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Array_Vector {
    public static void main(String[] args) {
        List arraylIst= new ArrayList<>();
        arraylIst.add("Ranga");
        arraylIst.add("Manga");
        arraylIst.add("Sangha");
        arraylIst.add("Linga");
        arraylIst.add("Ninga");
        System.out.println(arraylIst);
        System.out.println(arraylIst.size());

        //Removes from this list all of its elements that are
        // contained in the specified collection (optional operation).
        //arraylIst.removeAll(arraylIst);


        //Arraylist is not synchronized and its not a legacy class.
        //Arraylist increase only 50% of the current arraysize, if the total no of elements exceeds its capacity.
        // it uses iterator to traverse the elements.
        //its fast as its not synchronized.

        //the main use of arraylist or datastructures is to store the elements and without knowing the implementation.
        //if you have to store the duplicate elements , then use vectors, arraylist, stack, linkedlist
        //if you have to remove the duplicate elements , then we use sets.
        //if you have to store the data in key-value pairs, then we use map.

        //-----------Uses of Arraylist:--------------
        //insertion order is preserved.
        //null values are allowed,
        //duplicate values are allowed.
        //heterogenous objects are allowed.
        //sequential access and random access is possible.
        //Iterator to traverse, implements serializable and cloneable
        //List Iterator is also possible.
        //Index Representation is also possible.

        Vector v1= new Vector();
        v1.add("amazon");
        v1.add("nile");
        v1.add("sindhu");
        v1.add("sutlej");
        v1.remove("nile");
        System.out.println(v1);
        System.out.println(v1.size());

        //vector is a legacy class, and it is synchronized/
        //vector increments 100% means it doubles the arraysize, if the total no of elements exceeds the total maximum capacity
        //vector is slow in its execution, in a multithreading environment, and it holds other threads in runnable or non-runnable state
        //until the current thread unlocks the object.
        // a vector uses enumeration to traverse the elements

    }
}
