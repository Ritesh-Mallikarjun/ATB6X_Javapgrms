package Homework_23April;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if its positive number or negative number");
        int number= sc.nextInt();
        if(number>0){
            System.out.println("The entered number "+number+" is positive");
        }
        else if(number<0){
            System.out.println("Then entered number "+number+" is negative");
        }
        else{
            System.out.println("Then entered number "+number+" is Zero");
        }
        sc.close();
    }
}
