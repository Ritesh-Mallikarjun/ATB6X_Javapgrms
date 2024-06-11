package ATB_6X_May.Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lab094StRunCl {
    public static void main(String[] args) {
        Student s1= new Student(2134,"Rangeeta");
        System.out.println(s1);

        Student s2= new Student(2578,"Vinutha");
        System.out.println(s2);
        Student s3= new Student(912,"ShankraSundara");
        System.out.println(s3);

        List v1= new LinkedList();
        v1.add(s1);
        v1.add(s2);
        v1.add(s3);
        System.out.println("List v1 before sorting: "+v1);
        Collections.sort(v1);
        System.out.println("List v1 after sorting: "+v1);

        System.out.println("---------------Now we are using sorting using Comparator Interface-------------");
        System.out.println();
        System.out.println("------Sorting using ID in Ascending Order--------------");
        Collections.sort(v1, new SortByIDAsc());
        System.out.println(v1);
        System.out.println();
        System.out.println("------Sorting using ID in Descending Order--------------");
        Collections.sort(v1,new SortByIDDesc());
        System.out.println(v1);
        System.out.println();
        System.out.println("------Sorting using Name in Ascending Order--------------");
        Collections.sort(v1,new SortByNameAsc());
        System.out.println(v1);
        System.out.println();
        System.out.println("------Sorting using Name in Descending Order--------------");
        Collections.sort(v1, new SortByNameDesc());
        System.out.println(v1);



    }
}
