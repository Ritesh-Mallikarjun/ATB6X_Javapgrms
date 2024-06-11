package ATB_6X_May.Single_Inheritance;

public class Lab055RunnerClass {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.home();
        //dog can access the method of the animal class
        d1.characterstics();
        d1.ForestInfo();
        d1.bite();

        //Animal object creation details
        Animal a1= new Animal();
        a1.home();
        a1.characterstics();


        Animal a2= new Dog();//Dynamic Dispatch
        a2.home();
        System.out.println(a2.forestName);
        a2.characterstics();
    }
}
