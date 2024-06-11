package ATB_6X_May.Single_Inheritance.SIngleInheritancePart2;

public class Student extends University{
    Student(){
        System.out.println("I am a student studying in this university");
    }

    void Studying(){
        System.out.println("Studying for my exams!!");
    }

    void Practisingforinternals(){
        System.out.println("i am preparing for internals");
    }

    void PractisingforLabViva(){
        System.out.println("i am preparing for lab viva");
    }

    void prepareforExams(){
        System.out.println("I am preparing for exams");
    }

    protected void setUniversityName(String universityName, boolean isAuth ){
        super.setUniversityName(universityName,isAuth);
    }
}
