package ATB_6X_May;

public class Lab032 {
    public static void main(String[] args) {
         int a=10;
         int b=10;
         int c=a+b;
        System.out.println(c);
        sum(a,b);
        //function without return type and function with parameters;
    }

    static void sum(int a, int b){
        int p=2*(a+b);
        System.out.println("the result of p is "+p);
    }
}
