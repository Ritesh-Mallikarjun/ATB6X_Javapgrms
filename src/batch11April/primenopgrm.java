package batch11April;

import java.util.Scanner;

public class primenopgrm {
    public static void main(String[] args) {
        System.out.println("This program is to find the prime number or not");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter to check if its prime no or not");
        int primeNumber=sc.nextInt();
        int count=0;
        int result=isPrimeNumber(primeNumber,count);
        if(result==2){
            System.out.println("the user provided number "+primeNumber+" is a prime number");
        }
        else{
            System.out.println("the user provided number "+primeNumber+" is not a prime number");
        }
    }

    private static int isPrimeNumber(int primeNumber, int count) {
        for (int i = 1; i <= primeNumber; i++) {
            if(primeNumber%i==0){
                count++;
            }
        }

        return count;
    }

    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
    // 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179,
    // 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277,
    // 281, 283, 293.
}
