package ATB_6X_May;

import java.util.Scanner;

public class Lab035 {
    public static void main(String[] args) {
        //function with parameters and no return type
        System.out.println("This program is to find the results obtained through +,*,/,- operators");
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the number 1");
        int firstNumber=sc.nextInt();
        System.out.println("Please enter the number 1");
        int secondNumber=sc.nextInt();
        System.out.println("Enter the operator to calculate the operation !!!");
        char operator=sc.next().charAt(0);

        switch (operator){
            case '+':
                sum(firstNumber, secondNumber);
                break;
            case '-':
                minus(firstNumber, secondNumber);
                break;
            case '*':
                multiply(firstNumber, secondNumber);
                break;
            case '/':
                division(firstNumber, secondNumber);
                break;
            default:
                System.out.println("The other operators cant be calculated later");
        }

    }

    private static void division(int firstNumber, int secondNumber) {
        int result=firstNumber/secondNumber;
        System.out.println("The final result of division of 2 values are: "+result);
    }

    private static void multiply(int firstNumber, int secondNumber) {
        int result=firstNumber*secondNumber;
        System.out.println("The final result of multiplication of 2 values are: "+result);
    }

    private static void minus(int firstNumber, int secondNumber) {
        int result=firstNumber-secondNumber;
        System.out.println("The final result of addition of 2 values are: "+result);
    }

    private static void sum(int firstNumber, int secondNumber) {
        int result=firstNumber+secondNumber;
        System.out.println("The final result of subtraction of 2 values are: "+result);
    }
}
