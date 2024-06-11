package ATB_6X_May;

public class Lab075 {
    public static void main(String[] args) {
       Lab074 lab = new Lab074(25,"suman",9898985645L);
       Lab074.innerclass labic= lab.new innerclass();
        lab.display();
        //System.out.println(Lab074.SchoolName);

        //static method called using outerclass name (LAB074)
        Lab074.getSchoolName();
        System.out.println(lab.getAge());
        System.out.println(lab.getName());
        System.out.println(lab.getPhonenum());
        //static method called using outerclass object reference
        lab.getSchoolName();

        System.out.println("'''''''''''''''''''");
        labic.innerDisplay();

        System.out.println("0000000000000");
        Lab074.stClass stc= new Lab074.stClass();
        stc.innerStaticMet();
    }
}
