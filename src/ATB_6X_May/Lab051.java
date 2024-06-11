package ATB_6X_May;

public class Lab051 {
    //instance variables
    String name;
    int age;
    String emailid;

    //default constructor
    public Lab051(){
        this.name="simran";
        this.age=100;
        System.out.println("Default constructor");
    }

    public Lab051(String name){
        System.out.println("this name is "+name);
    }

    //parameterized constructor
    public Lab051(String name, int age){
        //super("Army");
        this("Ankitha");
        name=name;
        age=age;
        System.out.println("the parameterized constructor details!!!");
        System.out.println("the name is "+name);
        System.out.println("the age is "+age);
    }

    //instance methods in class
    void printDetails(){
        System.out.println("the name is "+name);
        System.out.println("the persons age is "+age);
        System.out.println("the persons emailid  is "+emailid);
        System.out.println();
    }



}
