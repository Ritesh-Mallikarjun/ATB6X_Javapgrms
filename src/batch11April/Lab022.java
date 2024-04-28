package batch11April;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {
        System.out.println("This program is to print the tables of a number");
        int tab = 19;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which 19 tables should be displayed");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(tab + " x " + (i + 1) + " = " + (tab * (i + 1)));
        }
        sc.close();
    }
}
