package ATB_6X_May.Single_Inheritance;

public class Father {
    String name;
    int age;
    String Occupation;
    private String privateInfo;

    Father(){
        System.out.println("Father default constructor!!");
    }

    Father(String name,int age, String Occupation){
        this.name=name;
        this.age=age;
        this.Occupation=Occupation;
    }

    void home(){
        System.out.println("2bhk property !!!");
    }

    void printDetails(){
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My occupation is "+Occupation);
    }

    void myCar(){
        System.out.println("Father - BMW");
    }

    void myWatch(){
        System.out.println("FATHER - RADO Costly Watch");
    }

}
