package batch11April;

import java.util.Locale;

public class Lab008 {
    public static void main(String[] args) {
        String s1="king"; //king -ORIGINAL
        s1="sharma"; // sharma
        String s2 = "chethan"; //chethan -ORIGINAL

        System.out.println(s2); //chethan
        s2=s1; //sharma is assigned to s2

        System.out.println(s1.toLowerCase());

        System.out.println(s1.toUpperCase());

        System.out.println(s2); //it will print sharma, instead of printing chethan.
        String s3= s2.concat(" is the lord of the island");
        System.out.println("s3 is:"+s3);
    }

}
