package ATB_6X_May;
import java.util.Scanner;

public class Lab046 {
    public static void main(String[] args) {
        System.out.println("this program is to find the prime number of a given number");
        Scanner sc=new Scanner(System.in);
        int primeSearch= sc.nextInt();
        if(isPrimeNumber(primeSearch)){
            System.out.println("The entered number "+primeSearch+" is a prime number");
        }
        else{
            System.out.println("The entered number "+primeSearch+" is not a prime number");
        }
    }

    public static boolean isPrimeNumber(int primeno){
        int count=0;
        for (int i = 1; i <= primeno; i++) {
             if (primeno%i==0) {
                count++;
            }
        }

        if(count==2){
            return true;
        }
        else{
            return false;
        }

    }
}
