package batch11April;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("This program is to find out the factorial of user given number");
        int factInput=sc.nextInt();
        int fact=1;

        //usage of for loop
        for (int i = factInput; i>=1; i--) {
            fact=fact*i;
        }
        System.out.println("The factorial of given number "+factInput+" is "+fact);
    }
}
