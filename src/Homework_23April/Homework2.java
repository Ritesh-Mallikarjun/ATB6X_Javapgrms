package Homework_23April;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi folks,this is to check maximum number out of 3 numbers !!!!");
        System.out.println("Enter the first number");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number");
        int number3 = sc.nextInt();
        System.out.println("========================");
        System.out.printf("The entered numbers are: %d, %d, %d\n", number1, number2, number3);
        //if,elseif and else condition
        if (number1 > 0 && number2 > 0 && number3 > 0)
        {
            if (number1 == number2 && number1 == number3 || number1 == number2 || number1 == number3 || number2 == number3) {
                System.out.println("Any of the entered numbers are equal ,so please enter unique numbers for comparison");
            }
            else if (number1 > number2 && number1 > number3) {
                System.out.println("Tada!!!!, The maximum number is: " + number1);
            }
            else if (number2 > number1 && number2 > number3) {
                System.out.println("Tada!!!!, The maximum number is: " + number2);
            }
            else if (number3 > number1 && number3 > number2) {
                System.out.println("Tada!!!!, The maximum number is: " + number3);
            }

        }
        else if (number1 == 0 || number2 == 0 || number3 == 0)
        {
            System.out.println("Any of the entered number is 0, so please enter the greater number");
        }
        else
        {
            System.out.println("One of the entered number/numbers is/are negative, so please enter positive number for comparison");
        }
        sc.close();
    }
}
