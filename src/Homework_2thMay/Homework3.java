package Homework_2thMay;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
       // Find the max salary in the input arrays {30,50,60,90,10,100,999}
        Scanner sc=new Scanner(System.in);
        int[] numbGreater = new int[10];
        int max_num =Integer.MIN_VALUE;
        System.out.println("Enter the numbers to check the maximum salary");

        // To get the number from the user ,usersinput
        for (int i = 0; i < numbGreater.length; i++) {
            System.out.println("Enter the number "+(i+1));
            numbGreater[i]=sc.nextInt();
        }

        // to check if user entered input is greater than max_num, if yes then make user_input the max number,continue with this
        //process until you find the maximum number.
        for (int i = 0; i < numbGreater.length ; i++) {
            if(numbGreater[i]> max_num){
                max_num =numbGreater[i];
            }
        }

        System.out.println("The maximum salary is: -> "+ max_num);


    }
}
