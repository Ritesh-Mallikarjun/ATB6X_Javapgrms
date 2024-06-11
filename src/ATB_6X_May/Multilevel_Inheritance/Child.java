package ATB_6X_May.Multilevel_Inheritance;

public class Child extends Father{
    Child(){
        System.out.println("I am the only child!!! ");
        System.out.println("I also belong to family "+FamilyName);
    }

    @Override
    void home() {
        System.out.println("I live in 3 and 4 BHK apartment ");
        super.home(); // child trying to access father's home using super keyword super.home();
    }

    void myInterests(){
        System.out.println("I love travelling seeing beautiful scenaries!!! - Child says");
        System.out.println("I love visiting resorts and love playing swimming!!! - Child says");
    }

    void myTaxDetails(){
        System.out.println("I need to pay tax for this year in june month!!!!!");
    }
}
