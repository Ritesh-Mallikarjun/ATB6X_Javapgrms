package ATB_6X_May;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {
        System.out.println("This program is to find the Armstrong number from a given number");
        Scanner sc= new Scanner(System.in);
        String armNumber=sc.next();
        int n=armNumber.length();
        double sum=0;

        for (int i = 0; i < n; i++) {
           int indi= Integer.parseInt(String.valueOf(armNumber.charAt(i)));
            System.out.println(indi);
           sum=sum+Math.pow(indi,n);
        }

        if(sum==Integer.parseInt(armNumber)){
            System.out.println("the number "+armNumber+" is a armstrong number");
        }
        else{
            System.out.println("the number "+armNumber+" is not a armstrong number");
        }



    }
}
