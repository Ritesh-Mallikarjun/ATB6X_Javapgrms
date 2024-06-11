package batch11April;

import java.util.Scanner;

public class Printfpgrm {
    public static void main(String[] args) {
        System.out.println("this program is to print the tables for a given number");
        Scanner sc=new Scanner(System.in);
        int givenNumber=sc.nextInt();

        System.out.println("The tabular format of a given number "+givenNumber+" is shown below:-");
        for (int i =0; i <=givenNumber; i++) {
            System.out.println(givenNumber+" x "+(i+1)+" = "+(givenNumber*(i+1)) );
        }
    }
}
