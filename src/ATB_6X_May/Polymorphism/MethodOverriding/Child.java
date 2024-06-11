package ATB_6X_May.Polymorphism.MethodOverriding;

public class Child extends Parent{
    Child(){
        System.out.println("running child class constructor");
    }
    void morningCyle(){
        System.out.println("I love to cycling in the morning");
    }

    void eveningCyle(){
        System.out.println("I love to go in the evening as well for cycling ");
    }

    void mywalk(){
        System.out.println("I do walk sometimes, but mostly run");
    }

    void yourParentsWalk(){
        super.morningWalk();
        super.eveningWalk();
    }

    void getInfor(){
        System.out.println("person who called me is "+getClass().getSimpleName());
        System.out.println("person who called me is "+getClass().getPackageName());
    }

    void location(){
        System.out.println("I am staying with my parents");
    }
}
