package ATB_6X_May.Hierarchical_Inheritance;

public class Lab059RunClass {
    public static void main(String[] args) {
        SonMukesh somuk=new SonMukesh();
        somuk.fruits();
        somuk.mukeat();

        System.out.println("**********");
        SonRamesh soram= new SonRamesh();
        soram.eat();

        System.out.println("&&&&&&&&&&&&&&&");
        Daughterdipika dadi= new Daughterdipika();
        dadi.dipfruit();

    }
}
