package ATB_6X_May.Collections;

import java.util.*;

public class Lab093 {
    public static void main(String[] args) {
        List<String> v1= new Vector();
        v1.add("Mahesh");
        v1.add("Nangesh");
        v1.add("niharika");
        v1.add("mihari");
        System.out.println(v1+" -> v1");

        List<Integer> v2= new Vector<>();
        v2.add(123);
        v2.add(456);
        v2.add(789);
        v2.add(101112);
        v2.add(121314);
        System.out.println(v2+" -> v2");

        Vector v3=new Vector();
        System.out.println(v3);
        System.out.println(v3.size());
        v3.add(12340);
        v3.add("monika");
        v3.add("maggi");
        v3.add("niggi");
        v3.add("swiggi");
        System.out.println(v3+" -> v3");
        v3.addAll(v1); //Object with String and String with Object is possible in java
        v3.addAll(v2); //Object with Integer and Integer with Object is possible in java
        System.out.println(v3+": Now printing v3 by adding v2 and v1");

        v1.addAll(v3); // adding string type v1 with Object type v3 to it , String with Object is possibe in java,
        //but Sting with integer, or vice-versa is not possible.

        System.out.println(v1+": printing v1 with v3");

        v2.addAll(v3);
        System.out.println(v2+": printing v2 with v3");

//        v1.addAll((v2));
//        We cant add Integer with String , that is adding v1 with v2 is not possible
//        as they are of different types specified in the list as <String> and <Integer>

        System.out.println("Printing the previous elements from last to first");
        ListIterator listIterator =v3.listIterator(v3.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("Printing from first to last");
        ListIterator listIterator1= v3.listIterator();
        while (listIterator1.hasNext()){
            System.out.println(listIterator1.next());
        }

        System.out.println("------we can use Enumeration as a iterator when we are using Vector-------");
        Enumeration e= v3.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        //If we use Vector classtype while creating object, then we will get the methods to use Enumeration
        //For example, elements(),hasMoreElements(),nextElements() with Enumeration






    }

}
