package Homework_25April;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("This program is to perform Arithmetic operations");
        System.out.println("Enter the input 1 data");
        int num1=sc.nextInt();
        System.out.println("Enter the input 2 data");
        int num2=sc.nextInt();
        System.out.println("Enter the arithmetic operation you want to operate and to get the result");
        char artOperator=sc.next().charAt(0);
        //Usage of Switch statement
        int result=0;
        double divResult=0;
        switch (artOperator){
            case '+':
                result = num1 + num2;
                System.out.println("The result of " + num1 + " + " + num2 + " is " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result of " + num1 + " - " + num2 + " is " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result of " + num1 + " * " + num2 + " is " + result);
                break;
            case '/':
                divResult = (double) num1 / num2;
                System.out.println("The result of " + num1 + " / " + num2 + " is " + divResult);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("The result of " + num1 + " % " + num2 + " is " + result);
                break;
            default:
                System.out.println("This operation is not allowed for calculation in this program");
        }

    }
}
