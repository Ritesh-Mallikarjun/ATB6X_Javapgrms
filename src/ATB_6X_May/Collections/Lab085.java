package ATB_6X_May.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab085 {
    public static void main(String[] args) {
        List arrayList= new ArrayList<>();
        arrayList.add("Amar");
        arrayList.add("Akbar");
        arrayList.add("Orange");
        arrayList.add("Kiran");
        arrayList.add("Suman");
        arrayList.addFirst("Pintu");
        arrayList.addLast("Frieda");
        arrayList.add("Kiran");
        arrayList.add("Minto");
        arrayList.add("Mahanth");
        arrayList.addFirst("Penga");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("dinga"));
        System.out.println(arrayList.contains("amar"));
        System.out.println(arrayList.lastIndexOf("Kiran")); // if present gives index number else it gives result as -1.
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.remove("Suman"));
        System.out.println(arrayList);
        //arrayList.clear();
        System.out.println(arrayList.removeFirst());
        System.out.println(arrayList.removeLast());
        System.out.println(arrayList);
        arrayList.set(3,"Madinaji");
        System.out.println(arrayList);
        arrayList.set(3,"Kiana");
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
    }
}
