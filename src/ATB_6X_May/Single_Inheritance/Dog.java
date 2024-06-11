package ATB_6X_May.Single_Inheritance;

public class Dog extends Animal {
    Dog(){
        System.out.println("Dog class exterds Animal Constructor!!!");
    }

    void home(){
        System.out.println("Some lucky dogs have home, some unlucky dogs dont have home!!!");
    }

    void ForestInfo(){
        System.out.println("Some of the wild dogs live in "+forestName);
    }

    void bite(){
        System.out.println(" Dogs bite when they are angry !!!!");
    }
}
