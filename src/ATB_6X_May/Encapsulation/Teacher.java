package ATB_6X_May.Encapsulation;

public class Teacher {
    private String name;
    private String TeacherID;
    private int age;
    private String subjectType;
    private String teacherNatype;

    Teacher(){
        System.out.println("running teacher type class");
    }

    public  void getTeacherDetails(String name,int age,String subjectType,String teacherNatype){
        this.name=name;
        this.age=age;
        this.subjectType=subjectType;
        this.teacherNatype=teacherNatype;

    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType,boolean isAuth) {
        if(isAuth){
            this.subjectType = subjectType;
        }
        else{
            System.out.println("you cant set the subject name");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean isAuth) {
        if(isAuth){
            this.name = name;
        }
        else{
            System.out.println("you cant set the teacher name");
        }
    }

    public String getTeacherID() {
        return TeacherID;
    }

    private void setTeacherID(String teacherID,boolean isAuth) {
        if(isAuth){
            TeacherID = teacherID;
        }
        else{
            System.out.println("you cant edit set the teacher id");
        }
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age,boolean isAuth) {
        if(isAuth){
            this.age = age;
        }
        else {
            System.out.println("you cant edit the age");
        }
    }

    public String getTeacherNatype() {
        return teacherNatype;
    }

    private void setTeacherNatype(String teacherNatype) {
        this.teacherNatype = teacherNatype;
    }

    public void teaches(){
        System.out.println("teacher teaches the subject very well!!!");
    }

    public void setQuestionPaper(){
        System.out.println("teacher sets the question paper");
    }

    public void doesValidation(){
        System.out.println("teacher does the paper validation");
    }
}
