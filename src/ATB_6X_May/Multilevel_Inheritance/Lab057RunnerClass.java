package ATB_6X_May.Multilevel_Inheritance;

public class Lab057RunnerClass {
    public static void main(String[] args) {
        // This is the usage of Dyanamic Dispatcher example
        Grandfather gf1= new Child();
        System.out.println("======After constructor details======");
        //gf1 which is grandfather class type , has only access to common methods of the child class and also
        //all the methods which belong to grandfather class
        gf1.eat();// grandfather's method
        gf1.home(); // child's method overriding the grandfather's method
        gf1.hobby(); //// grandfather's method
        System.out.println(gf1.FamilyName); //// grandfather's variable

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Grandfather gf2= new Father();
        System.out.println("===After father's constructor details");
        gf2.hobby();
        gf2.home();
        gf2.eat();
        System.out.println(gf2.FamilyName);

        System.out.println("*****************");

        Father f1= new Child();
        System.out.println("After constructor details********");
        f1.fatherCar();
        f1.eat();
        f1.home();
        f1.hobby();
        System.out.println(f1.FamilyName);
    }
}
