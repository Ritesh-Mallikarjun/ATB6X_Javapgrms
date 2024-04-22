package Homework_20April;

public class Homework2 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("the initial a value is: "+a);
        System.out.println("the operation is: ++a + a++ + a++");
        System.out.printf("the result is: ");
        System.out.println(++a + a++ + a++); //11 + 11(a=12) + 12(13)
        System.out.println("the value of a after operation is :"+a);
    }
}
