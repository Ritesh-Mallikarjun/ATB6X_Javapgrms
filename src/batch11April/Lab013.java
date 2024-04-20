package batch11April;

public class Lab013 {
    public static void main(String[] args) {
        String s1="Java";
        String s2="JAVA";
        String s3= s1.equalsIgnoreCase(s2) ? "true" : "false";
        System.out.println("the value of s3 is: "+ s3);
        System.out.println("=========================");

        //Syntax of Tertiary Operator :- condition ? valueIfTrue : valueIfFalse
        int a= 145;
        int b=167;
        int min= (a<b) ? a : b;
        System.out.println("the minimum value between "+a+" and "+b+" is "+min);
        int max= (a>b) ? a : b;
        System.out.println("the maximum value between "+a+" and "+b+" is "+max);
    }
}
