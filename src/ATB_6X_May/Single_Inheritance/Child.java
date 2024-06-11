package ATB_6X_May.Single_Inheritance;

public class Child extends Father{
    String myName;
    int myAge;
    String myOccupation;

    Child(){
        System.out.println("Child default constructor");
    }

    Child(String name,int age, String Occupation){
        super("manju",55,"president");
        this.myName=name;
        this.myAge=age;
        this.myOccupation=Occupation;
        //calling my own class method either using "this" keyword or without using keyword...
        //printDetails();
        this.printMyDetails();
    }

    void home(){
        System.out.println("i live in 2bhk house of my dad");
    }

    void printMyDetails(){
        System.out.println("My name is "+myName);
        System.out.println("My age is "+myAge);
        System.out.println("My occupation is "+myOccupation);
        //calling parents methods
        System.out.println("----calling fathers method using super keyword !!!!!!");
        super.myCar();
        super.myWatch();
        System.out.println("*******");
    }

    void printFatherDetails(){
        //Accessing parent class variables using super keyword
        System.out.println("My fathers name is "+super.name);
        System.out.println("My fathers age is "+super.age);
        System.out.println("My fathers occupation is "+super.Occupation);
    }

    void myGame(){
        System.out.println("I love to play tennis and i love roger federer!!!");
    }

}
