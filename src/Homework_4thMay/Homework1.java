package Homework_4thMay;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //Reverse a String without using any function or using for loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the normal string and check string is reversed or not");
        String userInput= sc.nextLine();

        // india is our country
        System.out.println("The reversed string is -> ");
        for (int i = userInput.length()-1; i >=0 ; i--) {
            System.out.print(userInput.charAt(i));
        }
    }
}
