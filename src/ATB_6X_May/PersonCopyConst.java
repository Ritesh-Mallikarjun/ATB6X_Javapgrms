package ATB_6X_May;

public class PersonCopyConst {
    //this program is to know more about copy constructor works
    public static void main(String[] args) {
        PersonCopyConst person1=new PersonCopyConst("Alice",50,75000.89);
        person1.printDetails();
        //by using person1, all the details of person1 is accessible for person2
        PersonCopyConst person2= new PersonCopyConst(person1);
        //here for person3, as its using person2 , person2 has not initialized its variables,as its using person1 ,
        // so all the values will be default (null,0,0.0);
        PersonCopyConst person3= new PersonCopyConst(person2);
        // now again person4 is using person1 details, so it will be using person1 details
        PersonCopyConst person4= new PersonCopyConst(person1);

    }

    private String name;
    private int age;
    private Double Salary;

    PersonCopyConst(){
        System.out.println("Google chrome is getting opened!!!");
    }

    //Parameterized Constructor
    PersonCopyConst(String name, int age, Double Salary){
        this.name=name;
        this.age=age;
        this.Salary=Salary;
    }

    //Usage of Copy Constructor
    PersonCopyConst(PersonCopyConst person){
        System.out.println("this is the Copy Constructor details below !!!!");
        System.out.println("the name is "+person.name);
        System.out.println("the age of "+person.name+" is "+person.age);
        System.out.println("the salary of "+person.name+" is "+person.Salary);
    }


    private void printDetails(){
        System.out.println("the name is "+name);
        System.out.println("the age of "+name+" is "+age);
        System.out.println("the salary of "+name+" is "+Salary);
    }
}
