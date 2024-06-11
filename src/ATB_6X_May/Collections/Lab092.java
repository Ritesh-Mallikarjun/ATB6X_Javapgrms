package ATB_6X_May.Collections;

import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class Lab092 {
    public static void main(String[] args) {
        Stack<String> stack= new Stack();
        stack.add("nathan");
        stack.push("rohan");
        stack.push("roger");
        stack.push("binny");
        stack.push("kamal");
        System.out.println(stack);
        System.out.println(stack.peek()+": peek item is always last");
        System.out.println(stack.pop()+": popped item");
        System.out.println(stack);
        System.out.println(stack.pop()+": popped item");
        System.out.println(stack.contains("rohan"));
        System.out.println(stack.empty());
        stack.push("narman");
        stack.push("gutman");
        stack.push("kushman");

        System.out.println("-------Print 1--------------");
        ListIterator listIterator= stack.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println(stack.size());


    }
}
