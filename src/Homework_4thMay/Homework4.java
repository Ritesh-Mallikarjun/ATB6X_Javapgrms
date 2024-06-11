package Homework_4thMay;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Enter the new string to check if its palindrome or not");
        Scanner sc= new Scanner(System.in);
        String userInput=sc.nextLine();
        int maxStringChar=userInput.length()-1;
        int count=0;

        for (int i = 0; i <userInput.length() ; i++) {
            if(userInput.charAt(i)==userInput.charAt(maxStringChar)){
                count++;
            }
            maxStringChar--;
        }

        if(count==userInput.length()){
            System.out.println("The entered string "+"'"+userInput+"'"+" is a palindrome");
        }
        else{
            System.out.println("The entered string "+"'"+userInput+"'"+" is not a palindrome");
        }


    }
}
