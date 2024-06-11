package ATB_6X_May;

public class StudentCalci {
    String name;
    String studentId;
    String calculatorName;

    public StudentCalci(){
        System.out.println("this is a default constructor for an empty parameterized object");
    }

    public StudentCalci(String name, String studentId, String calculatorName) {
        this.name = name;
        this.studentId = studentId;
        this.calculatorName = calculatorName;
    }

    public void sum(int a, int b){
        int c=a+b;
        System.out.println("the sum of "+a+" and "+b+" is "+c);
    }

    public void sub(int a,int b){
        int subt=a-b;
        System.out.println("the subtraction of "+a+" and "+b+" is "+subt);
    }

    public void mul(double a, double b){
        double mult=a*b;
        System.out.println("the multiplication of "+a+" and "+b+" is "+mult);
    }

    public void div(double a, double b){
        double division=a/b;
        System.out.println("the multiplication of "+a+" and "+b+" is "+division);
    }

    public void avgStudentMarks(double[] marks) {
        double sum=0;
        for(double smarks: marks){
            sum=sum+smarks;
        }
        double average= sum/marks.length;
        System.out.println("The average of total marks are: "+average);
    }



}
