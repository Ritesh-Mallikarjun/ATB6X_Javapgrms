package Homework_23April;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year to check if its leap year or not !!!!!");
        int  leap_year=sc.nextInt();
        if(leap_year%400!=0)
        {
            if(leap_year%4==0){
                System.out.println("The entered year "+leap_year+" is a leap year");
            }
            else{
                System.out.println("I am sorry , the entered year "+leap_year+" is not a leap year");
            }
        }
        else{
            System.out.println("The entered year "+leap_year+" is a multiples of 400 is not a leap year");
        }
        sc.close();
    }
}
