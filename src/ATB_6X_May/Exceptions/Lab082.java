package ATB_6X_May.Exceptions;

public class Lab082 {
    public static void main(String[] args) throws Exception {
        BankName sbibank= new BankName("INR",150);
        System.out.println(sbibank.add(sbibank));
        System.out.println(sbibank.Amount);
        System.out.println(sbibank.Currency);
        BankName Duetsche = new BankName("USD",120);
        System.out.println(Duetsche.Amount);
        System.out.println(Duetsche.Currency);
        System.out.println(sbibank.add(Duetsche));
        System.out.println(Duetsche.add(Duetsche));
    }
}
