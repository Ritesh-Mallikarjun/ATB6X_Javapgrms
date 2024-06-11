package ATB_6X_May;

// OUTECLASS NAMED LAB074
// 1 OUTERCLASS AND 1 INNERCLASS AND 1 STATICCLASS defined within the class
//Runner class named LAB075.java

public class Lab074 {
    private Integer age;
    private String name;
    private Long phonenum;

    private final static String SchoolName="National Public School";

    public Lab074(Integer age, String name, Long phonenum) {
        this.age = age;
        this.name = name;
        this.phonenum = phonenum;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Long phonenum) {
        this.phonenum = phonenum;
    }

    void display(){
        System.out.println("age of person is "+age);
        System.out.println("name of person is "+name);
        System.out.println("phoneno of person is "+phonenum);
    }

    static void getSchoolName(){
        System.out.println("my school name is "+SchoolName);
    }

    //INNERCLASS WITHIN OUTERCLASS
    class innerclass{
        int age =85;
        String cityName="Bangalore";
        void innerDisplay(){
            System.out.println("my age is "+age);
            System.out.println("my cityname is "+cityName);
            System.out.println("my phonenum is "+phonenum);
        }
    }
    //STATIC CLASS WITHIN OUTERCLASS
    static class stClass{
        int a=45;
        void innerStaticMet(){
            getSchoolName();
            System.out.println("a value is "+a);
        }
    }



}
