package ATB_6X_May.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab087 {
    public static void main(String[] args) {
        List mylist= new ArrayList<>();
        mylist.add("Anand");
        mylist.add("Amaresh");
        mylist.add(1333);
        mylist.add(true);
        mylist.add(false);
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.add("rohan");
       mylist.add("rohanisha");

        //adding collection mylist to another arraylist named mylist2 , we add mylist inside the arraylist(mylist) and give
        // it to mylist2 , so that mylist2 can access all the mylist elements
        List<String> mylist2=new ArrayList(mylist);
        System.out.println("first list of mylist2 "+mylist2);
        mylist2.add("Nigam");
        mylist2.add("Sonu");
        mylist2.add("Bappi");
        mylist2.add("Lahiri");
//        mylist2.add(12535); integer not possible to add
//        mylist2.add(true); boolean not possible to add
//        mylist2.add(false); boolean not possible to add
//        mylist2.add(12.568999); decimal not possible to add
        System.out.println(mylist2);
        //No use of adding elements inside the mylist , once it is given to mylist2, as it will not print the added elements into mylist2
//        mylist.add("rohan");
//        mylist.add("rohanisha");
        System.out.println(mylist2);
        System.out.println(mylist2.size());
        System.out.println(mylist2.getLast());
    }
}
