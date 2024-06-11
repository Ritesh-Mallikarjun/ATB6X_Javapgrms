package Homework_4thMay;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=sc.nextLine();
        System.out.println("Enter the second string");
       String s2=sc.nextLine();
       if(toCheckAnagram(s1,s2))
       {
           System.out.println("The 2 strings are anagram");
       }
       else{
           System.out.println("Both strings are not a anagram");
       }
}

    private static boolean toCheckAnagram(String s1, String s2) {
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        //System.out.println(ch1); silent, listen
        for(char c:ch1){
            System.out.println(c);
        }
        System.out.println("------");
        for(char c:ch2){
            System.out.println(c);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        return Arrays.equals(ch1,ch2);

    }
    }
