package ATB_6X_May.Single_Inheritance;

public class Lab046RunnerClass {
    public static void main(String[] args) {
        Father fref=new Child();
        fref.home();
        fref.printDetails();

        Child seenu=new Child("Srini",12,"Student"); // here child parameters are passed and
        // using super keyword , i am able to pass fathers values through super keyword
        seenu.printFatherDetails(); // calling my own method through constructor overloading
        seenu.printDetails(); // calling fathers method
        seenu.myWatch();//Fathers method
        seenu.myCar(); //Fathers method
        seenu.myGame(); //my own method
    }
}
