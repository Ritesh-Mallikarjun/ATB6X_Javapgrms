package ATB_6X_May;

public class Lab071 {
    public static void main(String[] args) {
        double d = 12.5656892356;
        System.out.println("d value: " + d);
        int a = (int) d; //downcasting from double to int, then need to do explicit typecasting to (int).
        System.out.println("a value of d: " + a);

        int a1 = 50;
        System.out.println("a1 value: " + a1);
        double d1 = a1;// upcasting of int given to double
        System.out.println("d1 value of a1: " + d1);

        short s = 120;
        System.out.println("short value: " + s);
        int a2 = s; // upcasting of short given to int
        System.out.println("a2 value of s: " + a2);
        short s1 = (short) a2; // downcasting from int to short, we need to do it explicitly to (short).
        System.out.println("s1 value of a2: " + s1);


        int i1 = 25;
        System.out.println("i1 value is: " + i1);
        float f = i1;//upcasting from int to float
        System.out.println("f value of i1: " + f);
        float f1 = (float) d1; // downcating from double to float
        System.out.println("f1 value of d1: " + f1);
        float f2 = (float) d; // downcating from double to float
        System.out.println("f2 value of d: " + f2);

    }
}
