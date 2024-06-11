package ATB_6X_May;

import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial fo a given number!!! ");
        int factNumber=sc.nextInt();
        int fact=1;
        for (int i = factNumber; i>0 ; i--) {
             fact=fact*i;
        }

        System.out.println("The factorial of given number is: "+fact);
    }
}
