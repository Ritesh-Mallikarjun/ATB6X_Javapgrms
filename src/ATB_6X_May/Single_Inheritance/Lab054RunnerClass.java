package ATB_6X_May.Single_Inheritance;

public class Lab054RunnerClass {
    public static void main(String[] args) {
        Father fref= new Father();
        fref.home();
        Father fref1= new Father("Andrew",35,"Doctor");
        Child c1= new Child();
        c1.home();//father's method is overridden and also inherited
        c1.myWatch();//Father's method
        c1.printDetails();
        c1.printFatherDetails();
        c1.myCar();//Father's method

        Child c2= new Child("Aravind",25,"Builder");
        c2.printDetails();
        c2.home();
        c2.printFatherDetails();
    }
}
