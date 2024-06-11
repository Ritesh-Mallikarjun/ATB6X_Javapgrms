package ATB_6X_May.Single_Inheritance.SIngleInheritancePart2;

public class University {
    private String UniversityName;

    University(){
        System.out.println("this is VTU University !!!");
    }

    public String getUniversityName() {
        return UniversityName;
    }

    protected void setUniversityName(String universityName, boolean isAuth) {
        if(isAuth){
            UniversityName = universityName;
        }
        else{
            System.out.println("Not Allowed to display");
        }
    }

    void prepareforExams(){
        System.out.println(" please prepare for your exams!!");
    }

    void examsCommenced(){
        System.out.println("Exams are going on, do well");
        this.resultsToBeAnnounced();
    }
    private  void resultsToBeAnnounced(){
        System.out.println("results are announced after your exam validations");
    }
}
