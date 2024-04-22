package Homework_20April;

public class Homework3 {
    public static void main(String[] args) {
        int b= 10;
        System.out.println("the initial b value is: "+b);
        System.out.println("the operation is: --b + b++ + ++b"); // 9 +9 (b=10) + 11 (b=11) ope=9+9+11=29
        System.out.printf("the result is: ");
        System.out.println(--b + b++ + ++b); // 9 +9 (b=10) + 11 (b=11) ope=9+9+11=29
        System.out.printf("the result of b after operation is: "+b);
    }
}
