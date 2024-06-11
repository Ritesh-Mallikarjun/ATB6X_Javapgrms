package ATB_6X_May;

public class Lab052Auto {

    protected String name;
    protected int age;

    //Default Constructor
    public Lab052Auto() {
        System.out.println("google chrome is getting opened");
        dbSQLConnection();
        ExcelOpenBook();
    }

    //parameterized constructor!!!
    public Lab052Auto(String name){
        this.name=name;
        System.out.println("the name of single parameter constructor "+name);
    }

    public Lab052Auto(String name,int age){
        //this("Rahul");
        this.name=name;
        this.age=age;
        System.out.println("the name of 2 parameter constructor is: "+name);
        System.out.println("the age of 2 parameter constructor is: "+age);
    }

    public void ExcelOpenBook() {
        System.out.println("Excel Open book is getting opened");
    }

    public void dbSQLConnection() {
        System.out.println("SQL Connection is getting Created !!!");
    }

    public void TestCase1(String name){
        System.out.println("testcase 1 is getting executed");
        System.out.println("test case name: "+name);
    }

    public void TestCase2(String name){
        System.out.println("testcase 2 is getting executed");
        System.out.println("test case name: "+name);

    }
}
