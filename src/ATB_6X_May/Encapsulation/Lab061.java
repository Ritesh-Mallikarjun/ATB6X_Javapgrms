package ATB_6X_May.Encapsulation;

public class Lab061 {
    public static void main(String[] args) {
        Student s1=new Student("ramesh","ram001",12,"X B section");
        s1.printDetails();
        s1.getTeacherDetails("Suresh",52,"Social","Peaceful");
        System.out.println("my teachers name is "+s1.getName());
        System.out.println("my teachers age is "+s1.getAge());
        System.out.println("my teachers subject type is "+s1.getSubjectType());
        System.out.println("my teachers nature type is "+s1.getTeacherNatype());

        Teacher testud= new Student();
        testud.getTeacherDetails("Narmda",26,"english","Beautiful");
        System.out.println("my teachers name is "+testud.getName());
        System.out.println("my teachers age is "+testud.getAge());
        System.out.println("my teachers subject type is "+testud.getSubjectType());
        System.out.println("my teachers nature type is "+testud.getTeacherNatype());

        Teacher t1=new Teacher();
        t1.setName("Gunavanta",true);
        t1.setSubjectType("Hindi",false);

    }
}
