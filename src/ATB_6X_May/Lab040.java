package ATB_6X_May;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {
        System.out.println("This program is to find the each characters present in the string");
        Scanner sc=new Scanner(System.in);
        String userInput=sc.nextLine();
        int[] count=new int[150];
        int charCount=0;
        for (int i = 0; i < userInput.length(); i++) {
            count[userInput.charAt(i)]++;
            System.out.println(count[userInput.charAt(i)]);
        }
        //m a l l i k a r j u n

        for (int i = 0; i <userInput.length() ; i++) {
            for (int j = 0; j <=i ; j++) {
                if (userInput.charAt(i) == userInput.charAt(j)) {
                    charCount++;
                }
            }
            if(charCount==1){
                System.out.println("The occurance of character "+userInput.charAt(i)+" is "+count[userInput.charAt(i)]);
            }
            charCount=0;
        }

    }
}
