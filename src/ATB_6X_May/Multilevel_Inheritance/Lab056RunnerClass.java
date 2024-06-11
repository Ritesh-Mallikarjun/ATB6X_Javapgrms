package ATB_6X_May.Multilevel_Inheritance;

public class Lab056RunnerClass {
    public static void main(String[] args) {
        Child c1= new Child();
        c1.home();
        //what all can child can access
        System.out.println("child belongs to "+c1.FamilyName);
        System.out.println("-------------------");
        c1.fatherCar(); // child can access father's car method
        c1.hobby(); //child can access grandfather's hobby method
        c1.myInterests(); //child accessing its own method
        c1.eat(); // child accessing grandfather's method

        System.out.println("Father's details------------");
        Father f1= new Father();
        f1.home();
        System.out.println(f1.FamilyName);
        f1.eat();
        f1.fatherCar();

        System.out.println("Grandfather details=======");
        Grandfather gf= new Grandfather();
        gf.hobby();
        gf.home();
        gf.eat();
        System.out.println(gf.FamilyName);
    }
}
