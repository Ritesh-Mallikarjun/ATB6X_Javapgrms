package ATB_6X_May.Encapsulation;

public class CarOwner {
    private String name;
    private String carName;
    private String ModelName;
    private long phoneNo;
    private double driverSalary;

    CarOwner(){
        System.out.println("default constructor of the car owner");
        System.out.println("the class calling me is "+getClass().getSimpleName());
    }

    public CarOwner(String name, String carName, String modelName, long phoneNo, double salary) {
        this.name = name;
        this.carName = carName;
        ModelName = modelName;
        this.phoneNo = phoneNo;
        this.driverSalary = salary;
    }

    void ownerMyInfo(){
        System.out.println("Owner's name is "+this.getName());
        System.out.println("Owner's car name is "+this.getCarName());
        System.out.println("Owner's car model name is "+this.getModelName());
        System.out.println("Owner's phone number name is "+this.getPhoneNo());
        System.out.println("Owner paying driver salary of "+this.getDriverSalary());
        System.out.println("the name of the class calling me "+getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public String getCarName() {
        return carName;
    }

    public String getModelName() {
        return ModelName;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public double getDriverSalary() {
        return driverSalary;
    }

    void businessPlace(){
        System.out.println("Owner works at delhi, lal chowk street");
    }
}
