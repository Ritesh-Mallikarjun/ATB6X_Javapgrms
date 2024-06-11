package ATB_6X_May;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {
        System.out.println("This program is to find the sum of numbers");
        Scanner sc=new Scanner(System.in);
        double[] intNumn=new double[6];
        for (int i = 0; i < intNumn.length ; i++) {
            System.out.println("Enter the number "+(i+1)+" to be added");
            intNumn[i]=sc.nextDouble();
        }
        double sum=0;
        for (int i = 0; i < intNumn.length; i++) {
            sum=sum+intNumn[i];
        }

        System.out.println("the total sum value is "+sum);
    }
}
