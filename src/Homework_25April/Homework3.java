package Homework_25April;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This program is to find whether its fizz or buzz or fizzbuzz");
        int num=sc.nextInt();
        if(num>=3 || num>=5){
            //multiples of 3 and 5
            if(num%3==0 && num%5==0)
            {
                System.out.println("Fizzbuzz");
            }
            //multiples of 3 only
            else if(num%3==0){
                System.out.println("Fizz");
            }
            //multiples of 5 only
            else if(num%5==0){
                System.out.println("Buzz");
            }
            //Other numbers output is displayed here
            else{
                System.out.println("I am sorry, no fizzbuzz, try again later");
            }
        }
        else{
            System.out.println("The number is less than 3 and 5 ");
        }
    }
}
