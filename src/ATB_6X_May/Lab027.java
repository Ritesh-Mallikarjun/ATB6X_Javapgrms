package ATB_6X_May;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {
        System.out.println("This program is to reverse the string of user input");
        System.out.println("Enter the string please");
        Scanner sc=new Scanner(System.in);
        String reverseString=sc.nextLine();
        System.out.println("Enter the second string please");
        String reverseString2=sc.nextLine();

        //using StringBuilder class
        StringBuilder sb= new StringBuilder(reverseString);
        System.out.println("the reverse string of "+reverseString+" is "+sb.reverse());

        //using StringBuffer class
        StringBuffer sbf=new StringBuffer(reverseString2);
        System.out.println("the reverse string of "+reverseString2+" is "+sbf.reverse());

    }
}
