package ATB_6X_May.Encapsulation;

public class Student extends Teacher {
    private String name;
    private String studid;
    private int age;
    private String classname;

    Student(){
        System.out.println("running the student class DC");
    }

    Student(String name, String studid,int age, String classname){
        this.name=name;
        this.studid=studid;
        this.age=age;
        this.classname=classname;
    }

   public void getTeacherDetails(String name,int age,String subjectType,String teacherNatype){
        super.getTeacherDetails(name,age,subjectType,teacherNatype);
    }

    void printDetails(){
        System.out.println("my name is "+name);
        System.out.println("my student id  is "+studid);
        System.out.println("my age is "+age);
        System.out.println("my classname is "+classname);
    }



}
