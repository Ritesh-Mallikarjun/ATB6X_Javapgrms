package ATB_6X_May.Single_Inheritance.SIngleInheritancePart2;

public class Lab059 {
    public static void main(String[] args) {
        Student st1= new Student();
        st1.setUniversityName("VTU",true);
        System.out.println(st1.getUniversityName()+" is our university!!!");
        st1.PractisingforLabViva();
        st1.Practisingforinternals();
        st1.prepareforExams();
        st1.Studying();

        University st2= new Student();
        st2.setUniversityName("Apeejay University",true);
        st2.prepareforExams();
        st2.examsCommenced();
        System.out.println(st2.getUniversityName());


    }
}
