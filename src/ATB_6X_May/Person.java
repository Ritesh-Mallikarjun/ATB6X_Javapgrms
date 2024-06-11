package ATB_6X_May;

public class Person {
    String name;
    String dob;
    int age;
    long phoneNumber;
    String skinColor;
    String eyeColor;
    String sex;
    String address;

    public Person() {
        System.out.println("Default Constructor");
    }

    public Person(String name,String dob,int age){
        this.name=name;
        this.dob=dob;
        this.age=age;
        System.out.println("Hi, my name is "+name+" , i am born on "+dob+" and my age is "+age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void changeData(){
        System.out.println("Hi, my name is "+name+" , i am born on "+dob+" and my age is "+age);
    }

    void walk(){
        System.out.println("I am walking daily");
    }

    void cycling(String cycleName){
        System.out.println("I am using my "+cycleName+" for cycling daily");
    }

    String eating(){
        return "Veg Dishes";
    }

    String sleep(String hours){
        return "8";
    }
}

