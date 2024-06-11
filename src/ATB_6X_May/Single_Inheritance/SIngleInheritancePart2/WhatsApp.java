package ATB_6X_May.Single_Inheritance.SIngleInheritancePart2;

public class WhatsApp extends Gallery{
    WhatsApp(){
        System.out.println("Running Whatsapp application");
    }

    public void getAccess(String name,boolean isAuth){
        super.getAccess(name, isAuth);
    }

    void message(){
        System.out.println("I am used to chat or message");
    }

    void whatsAppCall(){
        System.out.println("I am used for whatsapp calling!!!");
    }

    void addStatus(String imageName){
        System.out.println("I am used to add status using gallery pics also");
        System.out.println(super.display(imageName)+" is displayed from the gallery and added to the user !!!!");
    }
}
