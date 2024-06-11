package batch11April;

import java.util.Scanner;

public class totalPrimeNos {
    // 12 {1,2,3,4,5,6,7,8,9,10,11,12} [1-1],[2-1,2],[3-1,2,3],[4-1,2,3,4]
    public static void main(String[] args) {
        System.out.println("this program is to find the total no of primes nos present within a given number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please find the prime numbers for a given number");
        int searchNum=sc.nextInt();
        int[] array=new int[searchNum];
        int[] result=arePrimeNumbers(searchNum,array);
        int finalCount=0;
        for (int i = 0; i < result.length; i++) {
            if(result[i]==0){
                continue;
            }
            else{
                System.out.println(result[i]);
                finalCount++;
            }
        }
        System.out.println("the count of prime numbers for a given no is: "+finalCount);

        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
        // 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179,
        // 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277,
        // 281, 283, 293.
    }

    private static int[] arePrimeNumbers(int searchNum, int[] array) {
        int count=0;
        int arrCount=0;
        for (int i = 1; i <=searchNum ; i++) {
            //begin of j loop
            for (int j = 1; j <=i; j++) {
                if(i % j==0){
                    count++;
                }
            }
            //end of j loop
            if(count==2){
                array[arrCount]=i;
                arrCount++;
            }
            count=0;
        }// end of i loop

        return array;
    }
}
