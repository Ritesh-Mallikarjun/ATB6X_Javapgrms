package Homework_2thMay;

public class Homework4 {
    public static void main(String[] args) {
        // doubling the array and also storing the array in second array.
        int[] arr={1,2,3};
        int[] arr2= new int[3];

        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = arr[i]*2;
        }

        System.out.println("Array 1 list below:- ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Doubled array list below:-");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
