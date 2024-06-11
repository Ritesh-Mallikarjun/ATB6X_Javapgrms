package ATB_6X_May.Hierarchical_Inheritance;

public class Daughterdipika extends Father_3K{
    void dipfruit(){
        System.out.println("daughter dipika also likes fruits");
        fruits();
        System.out.println("I am called from "+getClass().getSimpleName());
    }
}
