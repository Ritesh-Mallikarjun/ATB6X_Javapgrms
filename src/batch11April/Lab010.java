package batch11April;

public class Lab010 {
    public static void main(String[] args) {
        int b=10;
        System.out.println("the b value before operation is: "+b); //10
        int res= --b+ b++ + ++b; // --b=9,b=9 + b++=9,b=10 + ++b=11,b=11
        System.out.println("The result of b is: "+res); //29
        System.out.println("the value of b after operation is: "+b); //11
    }
}
