package ATB_6X_May;

import java.util.Random;
import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        System.out.println("This program is to get sms notifications");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number");
        String nummob = sc.nextLine();
        Double balanceAmount = 50235.85;
        System.out.println("Enter 1, to check balance amount");
        System.out.println("Enter 2, to send amount to user");
        System.out.println("Enter 3, to print the balance sheet");
        System.out.println("Enter 4, to add amount to your Account");
        Integer option = sc.nextInt();
        switch (option) {
            case 1:
                Double amount = checkBalance(balanceAmount);
                System.out.println("the amount avaiale in your bank is Rs: " + amount);
                break;
            case 2:
                System.out.println("please enter the username");
                String sendername = sc.next();
                System.out.println("please enter the mobile num");
                String sendPhone = sc.next();
                System.out.println("Enter the amount you want to send");
                Integer amntToBeDebited= sc.nextInt();
                balanceAmount=sendAmountTo(sendername,sendPhone,balanceAmount,amntToBeDebited);
                break;

            case 3:
                System.out.println("Print feature is yet to come!!!!, please bare");
                break;

            case 4:
                System.out.println("Enter the amount to be added to your account!!!! ");
                Integer addamt=sc.nextInt();
                balanceAmount=addAmntBankAcnt(addamt,balanceAmount);
                break;
        }
    }

    private static Double addAmntBankAcnt(Integer addamt,Double balamnt) {
        System.out.println("the amount present in your bank account is Rs: "+balamnt);
        balamnt=balamnt+addamt;
        System.out.println("Your new balance amount is Rs: "+balamnt);
        return balamnt;
    }

    private static Double sendAmountTo(String sendername,String phonenum,Double balamnt,Integer amtdebit) {
        System.out.println("The current balance is Rs:"+balamnt);
        balamnt = balamnt - amtdebit;
        System.out.println("Your amount of Rs "+amtdebit+" is debited from your bank account and credited to "+sendername+": "+phonenum);
        System.out.println("The remaining balance is Rs:"+balamnt);
        return balamnt;
    }

    private static Double checkBalance(Double balance) {
        return balance;
    }
}
