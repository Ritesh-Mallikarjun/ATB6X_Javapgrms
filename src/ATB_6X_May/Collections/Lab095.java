package ATB_6X_May.Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
        System.out.println("this program is to print the elements from the users list using Collections list");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 10 numbers from 1 to 100 ");
        Integer max_size = 10;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < max_size; i++) {
            System.out.println("Number " + (i + 1));
            list.add(sc.nextInt());
        }
        System.out.println("The list of elements are: " + list);

        for (Object o : list) {
            System.out.println(o);
        }


    }
}
