package Homework_23April;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 100!!!");
        int result=sc.nextInt();
        if(result%3==0 && result%5!=0){
            System.out.println("Fizz");
        }
        else if(result%5==0 && result%3!=0){
            System.out.println("Buzz");
        }
        else if(result%3==0 && result%5==0){
            System.out.println("FizzBuzz");
        }
        else{
            System.out.println("The entered number "+result+" is not a multiple of 3 or 5, so no FIZZ BUZZ !!!!");
        }
    }
}
