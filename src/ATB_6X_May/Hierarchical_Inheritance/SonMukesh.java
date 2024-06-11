package ATB_6X_May.Hierarchical_Inheritance;

public class SonMukesh extends Father_3K{
    void mukeat(){
        System.out.println("Mukesh also likes fruits from his father");
        //System.out.println(fruits());
        fruits();
        System.out.println("i am called from "+getClass().getSimpleName());
    }
}
