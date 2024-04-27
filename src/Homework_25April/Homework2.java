package Homework_25April;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is to find the maximum of 3 nummbers");
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        // this program uses ternary/tertiary operator to find the maximum of 3 numbers.
        int result = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        /* num1 or num3 : num2 or num3 */
        System.out.println("the maximum result is " + result);

    }
}
