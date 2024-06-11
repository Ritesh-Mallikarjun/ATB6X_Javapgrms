package Homework_11thMay;

public class RunnerClass {
    public static void main(String[] args) {
        Student ritesh=new Student("Ritesh","12-12-1990",9999999999l,"male",33,"yes",true);
        ritesh.isloginOk();

        Student sushma=new Student("Sushma","female");
        sushma.isloginOk();

        Student neeraj=new Student("neeraj","male",29,"yes");
        neeraj.setName("Neeraj Sharma");
        neeraj.setPhoneNumber(9999955555l);
        neeraj.setPaymentDoneOrNot(true);
        neeraj.displayInfo();
        neeraj.isLearning();
        neeraj.isPractisingProg();
        neeraj.isloginOk();

        Course c1=new Course("Java","J123DF",5000,"James Gosling",30);
        c1.displayInfo();
        c1.enrollStudents();
        c1.enrollStudents();
        c1.enrollStudents();
        c1.enrollStudents();
        c1.enrollStudents();
        c1.dropStudents();

        Payment priya=new Payment("Priya","ID1001165","Cash","16-5-2024",0.0);
        priya.displayInfo();
        priya.toCheckBalance();
        priya.makePayment(50);
        priya.addBalance(100);
        priya.toCheckBalance();
        priya.makePayment(50);
        priya.toCheckBalance();
    }
}
