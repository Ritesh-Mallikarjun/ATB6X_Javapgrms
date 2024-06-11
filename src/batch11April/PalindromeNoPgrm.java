package batch11April;

import java.util.Scanner;

public class PalindromeNoPgrm {
    public static void main(String[] args) {
        System.out.println("this program is to check for a palindrome number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if its palindrome or not");
        int userNumber=sc.nextInt();
        //function being called below:-
        if (isNumPalin(userNumber)){
            System.out.println("The user provided number: '"+userNumber+"' is a palindrome");
        }
        else{
            System.out.println("The user provided number: '"+userNumber+"' is not a palindrome");
        }

    }

    private static boolean isNumPalin(int userNumber) {
        String newString = String.valueOf(userNumber);
        int numLastCount=newString.length()-1;
        int palindrome=0;
        for (int i = 0; i < newString.length() ; i++) {
            if(newString.charAt(i)==newString.charAt(numLastCount)){
                palindrome++;
            }
            numLastCount--;
        }

        System.out.println("the count of palindrome is "+palindrome);
        System.out.println("the count of username is "+newString.length());

        if(palindrome==newString.length()){
            return true;
        }
        else{
            return false;
        }

    }
}
