package batch11April;

import java.util.Scanner;

public class tAdd2Arrays {
    public static void main(String[] args) {
        System.out.println("this program is to add the 2 arrays and to store it in 3rd array");
        Scanner sc= new Scanner(System.in);
        int[] classRoom1=new int[5];
        int[] classRoom2=new int[5];
        int[] classRoom3=new int[5]; // vacant classroom to be filled

        for (int i = 0; i <classRoom1.length ; i++) {
            System.out.println("Enter the student marks for subject "+(i+1)+" for classroom 1");
            classRoom1[i]=sc.nextInt();
        }

        for (int i = 0; i <classRoom2.length ; i++) {
            System.out.println("Enter the student marks for subject "+(i+1)+" for classroom 2");
            classRoom2[i]=sc.nextInt();
        }

        System.out.println("The total marks of both classes are as follows:-");
        for (int i = 0; i < classRoom3.length; i++) {
            classRoom3[i]=classRoom1[i]+classRoom2[i];
            System.out.print(classRoom3[i]+" ");
        }


    }
}
