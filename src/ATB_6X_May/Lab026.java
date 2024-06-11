package ATB_6X_May;

import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {
        //{ 500,600,700,800,900,950};
        int max_value= Integer.MIN_VALUE;
        int secMaxVaue=Integer.MIN_VALUE;
        int thirdMaxValue=Integer.MIN_VALUE;

        Scanner sc=new Scanner(System.in);
        System.out.println("This program is to find the maximum salary details of the employees");
        int[] salaryArray= new int[6];

        for (int i = 0; i < salaryArray.length; i++) {
            System.out.println("Enter the salary of the Employee "+(i+1));
            salaryArray[i]=sc.nextInt();
        }

        for (int i = 0; i < salaryArray.length; i++) {
                if(salaryArray[i]>max_value){
                    max_value=salaryArray[i];
                }
        }

        for (int i = 0; i < salaryArray.length; i++) {
            if(salaryArray[i]>secMaxVaue && salaryArray[i]<max_value)
            {
                secMaxVaue=salaryArray[i];
            }
        }

        for (int i = 0; i < salaryArray.length; i++) {
            if(salaryArray[i]>thirdMaxValue && salaryArray[i]<secMaxVaue)
            {
                thirdMaxValue=salaryArray[i];
            }
        }

        System.out.println("The first max salary present in the array is: "+max_value);
        System.out.println("The second max salary present in the array is: "+secMaxVaue);
        System.out.println("The third max salary present in the array is: "+thirdMaxValue);



    }
}
