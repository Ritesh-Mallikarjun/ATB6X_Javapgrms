package ATB_6X_May.Multilevel_Inheritance;

import javax.crypto.spec.PSource;

public class Father extends  Grandfather {
    Father(){
        System.out.println("I am your father!!!");
        System.out.println("i belong to "+FamilyName);
    }

    void home(){
        System.out.println("I live in 3bhk house!! - Father");
        super.home();
    }

    void fatherCar(){
        System.out.println("Father owns RRoyce !!!");
    }



}
