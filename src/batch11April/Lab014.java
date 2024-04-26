package batch11April;

import org.w3c.dom.ls.LSOutput;

public class Lab014 {
    static int a = 10; //global variable
    static int b=34;
    //System.out.println("a intial value is:"+a); not able to print outside main method.
    public static void main(String[] args) {
        a = 50;
        System.out.println("b value is:"+b);
        System.out.println("a value is:"+a);
        System.out.println("great a value after pre-increment is:"+ Lab014.great());
        System.out.println(bata(50));
        System.out.println("a value is:"+Lab014.a);

    }

    static int bata(int b) {
        System.out.println("hi bata , now its static");
        System.out.println("bata b =:"+b);
        return 100;
    }

    static int great() {
        a = 17;
        System.out.println("great a value is: "+a);
        return ++a;
    }
}
