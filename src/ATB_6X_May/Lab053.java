package ATB_6X_May;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {
        System.out.println("This program is to mask the first 6 digits of the numbers of userinput");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 digits phone number of your wish!!! ");
        String phoneNum = sc.next();
        String[] array = new String[10];
        if (phoneNum.length() == 10) {
            maskPhoneNumber(phoneNum, array);
        } else {
            System.out.println("Please enter proper 10 digits of your phone number!!! ");
            System.out.println("The entered phonenumber length is "+phoneNum.length());
        }

    }

    public static void maskPhoneNumber(String phoneNum, String[] array) {

        for (int i = 0; i < phoneNum.length(); i++) {
            if (!(i >= 6)) {
                array[i] = "X";
            } else {
                array[i] = String.valueOf(phoneNum.charAt(i));
            }
        }

        System.out.print("The user's phonenumbers masked is ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }


    }


}

