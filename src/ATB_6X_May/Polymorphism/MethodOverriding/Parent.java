package ATB_6X_May.Polymorphism.MethodOverriding;

public class Parent {
     Parent(){
         System.out.println("running parent class constructor");
     }

     void morningWalk(){
         System.out.println("parents love to go morning walk");
     }

     void eveningWalk(){
         System.out.println("parents dont like to go evening walk");
     }

     void getInfor(){
         System.out.println("person who called me is "+getClass().getSimpleName());
         System.out.println("person who called me is "+getClass().getPackageName());
     }

     void location(){
         System.out.println("parents are living in bangalore!!");
     }
}
