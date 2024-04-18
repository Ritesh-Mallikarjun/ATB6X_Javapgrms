package batch11April;
import static java.lang.Math.abs;
import static java.lang.Math.round;

public class Lab002 {
    public static void main(String[] args) {
        int a= 10; // unary operator positive
        int a2=-65; // unary operator negative
        int a3=a+a2; //binary operator with 2 operands
        float a4=17.50F;
        float a5= 15.10F;
        float a6=a4*a5;
        float a7=a4*a5*a3;
        System.out.println(a3);
        System.out.println(abs(a3)); //absoulute function
        System.out.println(round(a6)); //rounding off the decimal value
        System.out.println(a6);// without rounding off the decimal value.
        System.out.println(a7);// without rounding off the decimal value.
        System.out.println(abs(round(a7)));
    }
}
