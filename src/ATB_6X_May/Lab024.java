package ATB_6X_May;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {
        float[][] basicSalary = new float[3][6];
        //To get the salary from the user itself
        System.out.println("This program is to get the salary details from the user !!!!!");
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i <basicSalary.length; i++) {
            for (int j = 0; j < basicSalary[i].length ; j++) {
                System.out.println("Enter the salary of row "+ (i+1) );
                basicSalary[i][j]=sc.nextFloat();
            }
        }

        //printing the values of all the rows of the table
        for (int i = 0; i <basicSalary.length ; i++) {
            System.out.println("The values of row "+ (i+1));
            for (int j = 0; j < basicSalary[i].length; j++) {
                System.out.print(basicSalary[i][j]+" ");
            }
            System.out.println();
        }


    }
}
