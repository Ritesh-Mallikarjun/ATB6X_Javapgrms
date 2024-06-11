package Homework_11thMay;

public class Payment {
    String name;
    String PaymentID;
    String PaymentType;
    String PaymentDate;
    Double balance;

    public Payment(String name, String paymentID, String paymentType, String paymentDate, Double balance) {
        this.name = name;
        this.PaymentID = paymentID;
        this.PaymentType = paymentType;
        this.PaymentDate = paymentDate;
        this.balance = 0.0;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("PaymentID: "+PaymentID);
        System.out.println("PaymentType: "+PaymentType);
        System.out.println("PaymentDate: "+PaymentDate);
        System.out.println("balance: "+balance);
    }

    void makePayment(double paymentAmount){
        if(balance>0){
            balance=balance-paymentAmount;
            System.out.println("Payment of Rs: "+paymentAmount+" is made successfully");
        }
        else{
            System.out.println("There is insufficient balance, please add balance to make further payments");
        }
    }

    void addBalance(double creditAmount){
        if(creditAmount>0){
            balance=balance+creditAmount;
            System.out.println("Balance amount of "+creditAmount+" is added successfully!!!");
        }
        else{
            System.out.println("Invalid amount , please add some amount to the balance");
        }
    }

    void toCheckBalance(){
        if(balance<=0){
            System.out.println("Insufficient Balance !!!!!!, Please add some amount to your balance");
        }
        else{
            System.out.println("The balance amount is Rs: "+balance);
        }
    }

}
