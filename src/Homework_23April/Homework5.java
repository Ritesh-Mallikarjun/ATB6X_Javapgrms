package Homework_23April;

import java.util.Scanner;

public class Homework5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if its prime number or not from 1 to 1000");
        int chkPrimeNumber=sc.nextInt();
        int maxNum=1000;
        int count=0;
        if(chkPrimeNumber!=2 && chkPrimeNumber <=maxNum && chkPrimeNumber!=1)
        {
            for(int i=1;i<=chkPrimeNumber;i++)
            {
                if(chkPrimeNumber%i==0) //1234
                {
                   ++count; //1,2,3,4
                }
            }
            System.out.println("the count number is: "+count);
            //to check if count is greater than 2 or equal to 2 using primefun function
            if(primefun(count)){
                System.out.println("The entered number "+chkPrimeNumber+" is a prime number");
            }
            else{
                System.out.println("The entered number "+chkPrimeNumber+" is not a prime number");
            }
        }
        else if(chkPrimeNumber==2){
            System.out.println("The entered number "+chkPrimeNumber+" is a prime number");
        }
        else if(chkPrimeNumber==1){
            System.out.println("The entered number "+chkPrimeNumber+" is not a prime number");
        }
        else{
            System.out.println("The entered number is not in a specific range of 1 to 1000 to check the prime number");
        }
    }

    private static boolean primefun(int count)
    {
        if(count>2){
            return false;
        }
        else
        {
            return true;
        }
    }
}
