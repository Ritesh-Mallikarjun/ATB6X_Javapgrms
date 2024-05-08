package Homework_4thMay;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Duplicate String - Hello World -> Helo wrd
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string of your choice !!!!");
        String inputString=sc.nextLine();
        String outString= removeDuplicates(inputString);
        System.out.println(outString);

    }

    private static String removeDuplicates(String inputString) {
        //A LinkedHashSet is used to store characters encountered in the input string.
        //LinkedHashSet is chosen because it maintains the order of insertion, which will
        // preserve the original order of characters in the input string.

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        StringBuilder outputString = new StringBuilder();

        //This loop iterates over each character in the input string.
        //For each character (ch), it adds the character to the LinkedHashSet set.
        //Since a Set does not allow duplicate elements, duplicates are automatically removed.
        for( char ch: inputString.toCharArray()){
            set.add(ch);
            System.out.println(ch);
            System.out.println(set);
        }
        //After all characters have been added to the set, another loop iterates over the elements of the LinkedHashSet.
        //It appends each character to a StringBuilder named outputStr.
        // This step ensures that the characters are appended in the order they were inserted into the set.
        for(char ch:set){
            outputString.append(ch);
            System.out.println(ch);
        }
        System.out.println(outputString);

        return outputString.toString();
    }


}
