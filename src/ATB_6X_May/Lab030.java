package ATB_6X_May;

import java.util.Scanner;

public class Lab030 {
    public static void main(String[] args) {
        System.out.println("This program is to find a number is prime number or not");
        System.out.println("Enter the number ");
        Scanner sc= new Scanner(System.in);
        int primeValue=sc.nextInt();
        int count=0;
        int resultCount =toCheckPrime(primeValue,count);
        if (resultCount == 2) {
            System.out.println("the user provided number "+primeValue+" is a prime number");
        }
        else{
            System.out.println("the user provided number "+primeValue+" is not a prime number");
        }

    }

    private static int toCheckPrime(int primeValue,int count) {
        for (int i = 1; i <= primeValue; i++) {
            if(primeValue%i==0) {
                count++;
            }
        }

        return count;
    }
}
