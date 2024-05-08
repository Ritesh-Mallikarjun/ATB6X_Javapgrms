package Homework_2thMay;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //write the program which accepts all the arrays and print all the marks

        Scanner sc=new Scanner(System.in);
        float[] userInput= new float[6];

        for (int i = 0; i < userInput.length ; i++) {
            System.out.println("Enter the marks of subject "+(i+1));
            userInput[i]=sc.nextFloat();
        }

        for (int i = 0; i < userInput.length ; i++) {
            System.out.println("The user marks of subject "+(i+1)+" are displayed as "+ userInput[i]);
        }
    }
}
