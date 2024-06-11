package ATB_6X_May;

public class StdCalciRunner {
    public static void main(String[] args) {
        StudentCalci ritesh=new StudentCalci("Ritesh","ID1006","CASIO");
        ritesh.sum(5,10);
        ritesh.sum(500,10000);
        ritesh.sub(480,580);
        ritesh.mul(85.32,14.32);
        ritesh.div(850,25);


        StudentCalci akshay =new StudentCalci("Akshaya","ID1006","CASIO");
        akshay.mul(500,60.23);
        akshay.div(780,23.23);

        StudentCalci rony =new StudentCalci();
        rony.sub(500,425);
        rony.avgStudentMarks(new double[]{20.3,50.45,80.32,45.74,65.24,87.69});
        //new double[]{20.3,50.45,80.32,45.74,65.24,87.69} this is the way to send the double values or any other values as a parameter
        rony.avgStudentMarks(new double[]{20.3,50.45});
        rony.avgStudentMarks(new double[]{20.3,50.45,80.32});

    }
}
