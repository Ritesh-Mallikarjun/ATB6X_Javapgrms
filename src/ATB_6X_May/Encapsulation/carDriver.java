package ATB_6X_May.Encapsulation;

public class carDriver extends CarOwner{

    carDriver(){
        System.out.println("Default constructor of the car driver");
    }

    void ownerInfo(){
        System.out.println("Owner's name is "+super.getName());
        System.out.println("Owner's car name is "+super.getCarName());
        System.out.println("Owner's car model name is "+super.getModelName());
        System.out.println("Owner's phone number name is "+super.getPhoneNo());
        System.out.println("Owner paying driver salary of "+super.getDriverSalary());
        System.out.println("the name of the class calling me "+getClass().getSimpleName());
    }

    carDriver(String name, String carName, String modelName, long phoneNo, double salary){
        super(name,carName,modelName,phoneNo,salary);
    }

//     void tryOwnerVar() {
//        // this can happen only if we are not using super keyword and also when our datamembers are not made private.
//        // if u try to access the data members when its made private, then it will result in errors
//        // You can access only with getters , get all the details only using get function
//        System.out.println("trying to access name of owners"+name);
//        System.out.println("trying to access salary of driver"+driverSalary);
//
//    }


}
