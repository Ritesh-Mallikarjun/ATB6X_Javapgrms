package Homework_4th_May2;

public class Homework1 {
    public static void main(String[] args) {
        //Write - Java method to find the maximum value in a 2D array. - O/P - 9
        int [][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        int max_value=Integer.MIN_VALUE;
        System.out.println("the total length of the array is "+arr.length);
        for (int i = 0; i <arr.length; i++) {
            System.out.println("the length of array "+i+" is "+arr[i].length);
        }

        System.out.println("----------------------");
        System.out.print("out of all these elements ");
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max_value){
                    max_value=arr[i][j];
                }
            }
        }

        System.out.println("The maximum value is: "+max_value);

    }
}
