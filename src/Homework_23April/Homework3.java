package Homework_23April;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To check if the character is vowel or consonant");
        System.out.println("Enter the character !!!!");
        String s = sc.nextLine();
        char c = s.charAt(0);
//        System.out.println(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("The entered character is " + c + " that is vowel");
        } else {
            System.out.println("The entered character is " + c + " that is consonant");
        }
        sc.close();
    }
}
