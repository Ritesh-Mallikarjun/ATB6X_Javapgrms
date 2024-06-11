package ATB_6X_May;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        System.out.println("this program is linear search , which returns the index of the search element");
        Scanner sc=new Scanner(System.in);
        int[] linearArray = {10,23,15,16,89,33,12,30,25,45,28,12,6};
        System.out.println("Enter the number to be searched in the array");
        int noSearch= sc.nextInt();
        System.out.println("the elements present in the array are:");
        for (int i = 0; i <linearArray.length ; i++) {
            System.out.print(linearArray[i]+" ");
        }
        System.out.println();
        
        int keyIndexNum=0;
        boolean result=false;

        for (int i = 0; i <linearArray.length ; i++) {
            if(noSearch==linearArray[i]){
                keyIndexNum=i;
                result=true;

            }
            else{
                continue;
            }
        }

        if(result){
            System.out.println("the element "+noSearch+" is present in the index "+keyIndexNum);
        }
        else{
            System.out.println("the element "+noSearch+" is not present in the given array");
        }



    }
}
