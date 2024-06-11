package ATB_6X_May.Single_Inheritance.SIngleInheritancePart2;

public class Lab060 {
    public static void main(String[] args) {
        WhatsApp wapp= new WhatsApp();
        System.out.println(wapp.getAppname()+": name of the application ");
        wapp.getAccess("WhatsApp",true);
        System.out.println(wapp.getAppname()+": name of the application");
        System.out.println(wapp.display("Fruit image")+" is dispalyed to the user");
        wapp.addStatus("Fruit image");

        System.out.println("=======new object created========");
        Gallery gwapp= new WhatsApp();
        System.out.println(gwapp.getAppname());
        gwapp.getAccess("Snapchat",true);
        System.out.println(gwapp.getAppname());
        System.out.println(gwapp.display("Spacecraft image"));

    }
}
