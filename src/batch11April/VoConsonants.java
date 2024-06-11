package batch11April;

import java.util.Scanner;

public class VoConsonants {
    public static void main(String[] args) {
        System.out.println("This program is to find vowels and consonants ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check vowels and consonants");
        String inputString=sc.nextLine();
        char[] ch=inputString.toCharArray();
        int vowelCount=0;
        int consonantCount=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                vowelCount++;
            }
            else{
                consonantCount++;
            }
        }

        System.out.println("The total count of vowels for given string '"+inputString+"' are: "+vowelCount);
        System.out.println("The total count of consonants for given string '"+inputString+"' are: "+consonantCount);

    }
}
