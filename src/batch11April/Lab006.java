package batch11April;

public class Lab006 {
    public static void main(String[] args) {
        byte a=100;
        byte b=60;
        byte c= (byte) (a+b);  //byte +byte should be typcasted externally as byte only to assign it to byte.
        System.out.println(c);
        short d= (short) (a+b); //byte+ byte to short also to be typecasted to assign it to short.
        int dint=a+b; //byte +byte is ok with int type.
        System.out.println(d);
        short s1= 200;
        byte s2= (byte) 300;
        short s4= 246;
        short s3= (short) (s1+s2); // short + byte to be typecasted to short or int only.
        short s5 = (short) (s1+s4); // short +short should be typecasted to short only to assign it to short.
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        int i1=1500;
        int i2=950;
        int i3= i1+i2;
        System.out.println(i3);
        System.out.println("===================");
       // byte i3= (byte) (i1+i2); 2 integers :- need to be typecasted to byte if you are assigning it to byte type
       // short i3= (short) (i1+i2); 2 integers:- need to be typecasted to short if you are assigning it to short type
        // int i3=i1+i2;
       // float i3=i1+i2; it is fine
        // double i3=i1+i2;  it is fine
        int i4=135;
        float f1=250.98f;
        float i5=i4+f1; //int +float given to float is ok
        System.out.println(i5);
        float i6=i5+f1; // float + float given to float is also fine.
        System.out.println(i6);
        double d1=i5+f1; // float + float to double is also fine.
        System.out.println(d1);
        double d2= i5+i4; // float+ int to double is also fine.
        System.out.println(d2);


    }
}
