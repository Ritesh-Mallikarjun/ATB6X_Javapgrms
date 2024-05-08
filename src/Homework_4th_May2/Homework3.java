package Homework_4th_May2;

public class Homework3 {
    public static void main(String[] args) {
        //Write a Java method to transpose a given 2D array.
        int[][] arr = {
                {1, 2, 3,4},
                {5, 6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int trans[][] = new int[4][4];

        System.out.println("The elements present in the array before are ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        00 01 02
//        10 11 12
//        20 21 22 Transpose of 2d matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                   trans[j][i] = arr[i][j];
            }
        }

        System.out.println("The elements present in the array after are ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(trans[i][j]+" ");
            }
            System.out.println();
        }
        // {1,4,7},{2,5,8},{3,6,9}

    }
}
