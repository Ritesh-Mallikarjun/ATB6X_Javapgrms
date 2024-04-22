package Homework_20April;

public class Homework4 {
    public static void main(String[] args) {
        int x = 10;
        float y = 12.4f;
        float z = 56.78f;
        System.out.printf("x value is: %d\n",x);
        System.out.printf("y value is: %f\n",y);
        System.out.printf("z value is: %f\n",z);
        double result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println("the operation is cbrt[3][{10^{2} + 12.4^{2} -|56.78|}] ");
        System.out.println("The result of the above operation is: "+result);
    }
}
