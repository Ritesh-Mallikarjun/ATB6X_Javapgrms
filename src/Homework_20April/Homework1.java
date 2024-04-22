package Homework_20April;

public class Homework1 {
    public static void main(String[] args) {
        int a = 40;
        int b = 127;
        int c = 226;
        System.out.printf("the values are %d,%d,%d\n",a,b,c);
        int max_1= (a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c);
        System.out.println("the maximum value is: "+max_1);
    }
}