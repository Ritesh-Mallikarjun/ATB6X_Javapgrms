package Homework_2thMay;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}
        Scanner sc=new Scanner(System.in);
        int[] number=new int[10];

        for (int i = 0; i < number.length ; i++) {
            System.out.println("Enter the number "+(i+1)+" to double ");
            number[i]=sc.nextInt();
        }

        for (int i = 0; i < number.length ; i++) {
            System.out.println("The number which is doubled for "+(i+1)+" is shown as: "+number[i]*2);
        }

    }
}
