package ATB_6X_May;
import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {
        System.out.println("this program is to find if given string is palindrome or not!!!");
        Scanner sc=new Scanner(System.in);
        String palindSearch=sc.next();
        if(isPalindrome(palindSearch)){
            System.out.println("The entered string "+palindSearch+" is a palindrome");
        }
        else{
            System.out.println("The entered string "+palindSearch+" is not a palindrome");
        }
    }

    public static boolean isPalindrome(String strSearch){
        //malayalam length=9 , 0 to 8,
        int countLast=strSearch.length()-1;
        int countLetter=0;
        for (int i = 0; i < strSearch.length(); i++) {
            if(strSearch.charAt(i)==strSearch.charAt(countLast)){
                countLetter++;
            }
            countLast--;
        }

        if(countLetter==strSearch.length()){
            return true;
        }
        else {
            return false;
        }
    }
}
