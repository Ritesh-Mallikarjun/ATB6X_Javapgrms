package ATB_6X_May;

import java.util.Scanner;

public class Lab037 {
    public static void main(String[] args) {
        //function without parameters & return type
        iplStarted();

        //function without parameters ,but with return type only
        String team=rcbLuckyTeam();
        System.out.println(team+" will win the match today!!!");

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter 1 for head and 0 for tail");
        int toss=sc.nextInt();

        //function with parameters w/o return type
        iplMatchWinner(team,"CSK",toss);

        System.out.println("please enter your salary");
        int salary= sc.nextInt();
        System.out.println("please enter the percentage hike you except");
        float salaryHikePercent=sc.nextFloat();

        //function with parameters and return type
        float finalCalSal=isSalaryHiked(salary,salaryHikePercent);
        System.out.println("The final calculated salary is: "+finalCalSal);

    }

    private static float isSalaryHiked(int salary, float salaryHikePercent) {
        float finalSalary = salary + (salary * (salaryHikePercent / 100));
        System.out.println(finalSalary);
        return finalSalary;
    }

    private static void iplMatchWinner(String team, String csk,int toss) {
        if(toss==1){
            System.out.println(team+" is going to win the match");
        }
        else{
            System.out.println(csk+" is going to win the match");
        }
    }

    private static String rcbLuckyTeam() {
        return "RCB";
    }

    private static void iplStarted() {
        System.out.println("IPL Season has started this month !!!!!");
    }
}
