package ATB_6X_May;

public class Lab069 {
    public static void main(String[] args) {
        outerclass oc= new outerclass();
        outerclass.nestedClass nc= oc.new nestedClass();
        oc.dispalyOC();
        oc.display();
        System.out.println("static varialbe of oc: "+oc.cityName);
        System.out.println("static varialbe of oc outerclass: "+outerclass.cityName);
        System.out.println("static varialbe of innerclass: "+  outerclass.nestedClass.ncName);
        System.out.println("static varialbe of innerclass obj reference nc: "+  nc.ncName);
        nc.displayNC();


        outerclass oc1= new outerclass();
        outerclass.nestedClass nc1= oc1.new nestedClass();
        oc1.dispalyOC();
        nc1.displayNC();

    }
}

class outerclass{
    int a =10;
    String carname="BMW";

    static final String cityName="Bangalore";

    void dispalyOC(){
        System.out.println("a value is "+a);
        carname="Ducati";
        //cityName="Hyderbad";
        System.out.println("carname of oc is "+carname);
        System.out.println("cityname of oc is "+cityName);
        //System.out.println("b value is "+b);
        //System.out.println("d1 value is "+d1);
    }

    static void display(){
        System.out.println("------------------------------");
        System.out.println("cityname is "+cityName);
        System.out.println("------------------------------");
    }

     class nestedClass{

         int b=25;
         double d1=15.2365;
         static String ncName="America";

         void displayNC(){
             carname="Lamborgini";
             System.out.println("b value is "+b);
             System.out.println("d1 value is "+d1);
             System.out.println("carname of nc is "+carname);
             System.out.println("cityname of nc is "+cityName);
             System.out.println("ncName of nc class is "+ncName);
         }

     }
}