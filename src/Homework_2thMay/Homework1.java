package Homework_2thMay;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //write the program which accepts all the arrays and print all the marks

        Scanner sc=new Scanner(System.in);
        float[] userInput= new float[6];
        int passCount=0;
        int failCount=0;

        for (int i = 0; i < userInput.length ; i++) {
            System.out.println("Enter the marks of subject "+(i+1));
            userInput[i]=sc.nextFloat();
        }

        for (int i = 0; i < userInput.length ; i++) {
            System.out.println("The user's marks of subject "+(i+1)+" is -> "+ userInput[i]);
        }

        System.out.println();

        for (int i = 0; i < userInput.length ; i++) {
             if(userInput[i]< 35){
                 System.out.println("The user's result of subject "+userInput[i]+" is -> FAIL");
                 failCount++;
             }
             else{
                 System.out.println("The user's result of subject "+userInput[i]+" is -> PASS");
                 passCount++;
             }
        }

        System.out.println();
        System.out.print("Passed count is -> "+passCount+"  ");
        System.out.print("Failed count is -> "+failCount);


    }
}
