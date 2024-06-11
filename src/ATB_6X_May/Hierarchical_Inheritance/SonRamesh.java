package ATB_6X_May.Hierarchical_Inheritance;

public class SonRamesh extends Father_3K{
    void eat(){
        System.out.println("Ramesh wants to have fruits brought by his father");
        fruits();
        System.out.println("I am called from "+getClass().getSimpleName());
    }
}
