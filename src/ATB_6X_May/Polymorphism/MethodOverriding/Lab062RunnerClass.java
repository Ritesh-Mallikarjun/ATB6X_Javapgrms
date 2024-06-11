package ATB_6X_May.Polymorphism.MethodOverriding;

public class Lab062RunnerClass {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.mywalk();
        c1.morningCyle();
        c1.eveningCyle();
        c1.yourParentsWalk();
        c1.morningWalk();
        c1.eveningWalk();

        System.out.println("=========================");
        //method overriding is shown below through dyanimc dispatcher
        Parent p1=new Child();
        //methods are called at runtime, as the object is created at runtime
        p1.eveningWalk();
        p1.morningWalk();
        //methods are called at runtime, as the object is created at runtime
        //below 2 methods are overridden in child class, for the methods present in parent class.
        // methods are overridden and also child provides specific implementation of the method, to differentite from its parents
        p1.getInfor();
        //methods are called at runtime, as the object is created at runtime
        p1.location();
    }
}
