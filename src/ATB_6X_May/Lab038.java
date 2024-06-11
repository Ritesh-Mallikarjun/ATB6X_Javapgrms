package ATB_6X_May;

import java.util.Scanner;

public class Lab038 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name to check the occurance of the characters !!!");
        String yourName=sc.nextLine();
        int charCount=0;
        //String[] name= new String[yourName.length()];
        for (int i = 0; i < yourName.length(); i++) {
                if(yourName.charAt(i) != ' '){
                    charCount++;
                }
        }
        System.out.println("the actual length of the string is: "+yourName.length());
        System.out.println("the total no of characters present in the string are: "+charCount);


    }
}
