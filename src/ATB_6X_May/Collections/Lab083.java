package ATB_6X_May.Collections;

import java.util.List;

public class Lab083 {
    public static void main(String[] args) {
        List<String> fruitslist = List.of("Apple","Bannana","Orange","Custard Apple","Watermelon","Grapes");
        System.out.println(fruitslist);
        System.out.println(fruitslist.size());
        System.out.println(fruitslist.getFirst());
        System.out.println(fruitslist.getLast());
        System.out.println(fruitslist.get(4));
        System.out.println(fruitslist.indexOf("Custard Apple"));

        //So List does not suppport removeFirst and removeLast methods in java, as it results in UnsupportedOperationException
        //String removed= fruitslist.removeFirst();
        //String remove= fruitslist.removeLast();


        // List does not support remove method as , it results in UnsupportedOperationException
        //String remove= fruitslist.remove(1);
        //The List.of() method creates an immutable list, which can’t be modified.
        //This attempt throws UnsupportedOperationException. It will also throw UnsupportedOperationException
        //System.out.println("removed item is: "+remove);

        System.out.println(fruitslist);
        ////This attempt throws UnsupportedOperationException. It will also throw UnsupportedOperationException
        //You cant use clear method as well with the List interface
        //fruitslist.clear();

        System.out.println(fruitslist.isEmpty());
        System.out.println(fruitslist.contains("Grapes"));
        System.out.println(fruitslist);


        //System.out.println(fruitslist.add("Jamoon"));
        //java.lang.UnsupportedOperationException

    }
}
