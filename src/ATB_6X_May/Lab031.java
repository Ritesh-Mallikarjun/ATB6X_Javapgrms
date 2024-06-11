package ATB_6X_May;

import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {
        System.out.println("this program is to find the no of prime numbers present from a given number ");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the max number to find the prime numbers present within it");
        int primeNumber=sc.nextInt();
        int[] array=new int[primeNumber];
        int[] retArray=toCheckPrime(primeNumber,array);
        for (int i = 0; i < retArray.length; i++) {
            if(retArray[i]==0){
                continue;
            }
            else{
                System.out.println(retArray[i]);
            }
        }
    }

    private static int[] toCheckPrime(int primeNumber,int[] arrayReceived) {
        int count=0;
        int arCount =0;
        for (int validPrime = 1; validPrime <= primeNumber ; validPrime++) {
            for (int j = 1; j <= validPrime; j++) {
                 if(validPrime %j==0){
                     count++;
                 }
            }
            if(count==2){
                arrayReceived[arCount]= validPrime;
                arCount++;
            }
            count=0;
        }

        return arrayReceived;


    }
}

