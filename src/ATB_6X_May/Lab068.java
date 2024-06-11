package ATB_6X_May;

public class Lab068 {
    public static void main(String[] args) {
        Student s1= new Student();
        Student.m1();
        System.out.println("Class student can access only this: "+Student.playName);
        System.out.println("static methods can be accessed using object reference");
        s1.m1();
        System.out.println(s1.playName);
        s1.display();
        System.out.println("-------------s2 obj ref---------------------------");
        Student s2= null;// No action will take place, when you initialize a class and objref with null reference.
        System.out.println("Static variables can be accessed using s2 obj reference");
        System.out.println(s2.playName);
        s2.m1();
        System.out.println("-----------------------------------------------------");
        Student s3=new Student(15,"anirudh","Car");
        s3.display();
        s3.m1();

        Student.playName="All is well, Kevin!!!!";
        System.out.println("playname using studenet class: "+Student.playName+" -> using student obj reference");
        System.out.println("playname using s1 obj ref: "+s1.playName);
        System.out.println("playname using s2 obj ref, even though it is pointing to null reference: "+s2.playName);
        System.out.println("playname using s3 obj ref: "+s3.playName);

        System.out.println();
        System.out.println("_____________________________");

        s1.playName="Book of Heaven";
        System.out.println(Student.playName+": using s1 obj reference");

        s2.playName="Book of Hell";
        System.out.println(Student.playName+": using s2 obj reference");

        s3.playName="Book of Wonderworld";
        System.out.println(Student.playName+": using s3 obj reference");

    }
}

class Student {

    static String playName;
    //#No 1 will get executed when class gets loaded and object is created
    static{
        System.out.println("I am a static block , which is loaded when class is loaded fully");
        playName="John is well";
    }

    //#No 3 will get executed when objected is created , immediately constrcutor gets called.
    Student(){
        System.out.println("I am a default constructor!!");
    }

    //#No 2 will get executed when object is created
    {
        System.out.println("I am a IIB, instance initialization block, gets called , when object is created");
    }

    int age;
    String name;
    String vehicleType;

    public Student(int age, String name, String vehicleType) {
        this.age = age;
        this.name = name;
        this.vehicleType = vehicleType;
    }



    void display(){
        System.out.println("age is "+this.age);
        System.out.println("student name is "+this.name);
        System.out.println("student vehicle type is "+this.vehicleType);
        System.out.println("we can access the static varialbe in non-static method as: "+playName);
    }

    static void m1(){
        System.out.println("static name is "+playName);
        //System.out.println("age is "+age);
    }
}
