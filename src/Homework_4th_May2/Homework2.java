package Homework_4th_May2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("total array length is " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " array length is " + arr[i].length);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched in the array ");
        int searchNum = sc.nextInt();
        String count="";

        System.out.print("Out of arrays displayed ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }

        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searchNum) {
                    count="yes";
                }

            }
        }

        if(count.equals("yes")){
            System.out.println("The number " + searchNum + " is available in the array");
        }
        else{
            System.out.println("The number " + searchNum + " is not available in the array");
        }
    }

}

