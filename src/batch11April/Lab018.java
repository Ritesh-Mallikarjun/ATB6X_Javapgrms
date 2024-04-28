package batch11April;

import java.util.Scanner;

public class Lab018 {
    public static void main(String[] args) {
        System.out.println("this is the program to check for loop");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            if (i == 0)
            {
                continue;
            }

            System.out.println("5 x " + i + " = " + 5 * i);

            if (i == 9)
            {
                i++;
                System.out.println("5 x " + i + " = " + 5 * i);
            }

        }


    }
}
