package ATB_6X_May;

public class Lab070 {
    public static void main(String[] args) {
        outer.staticInnerClass osc= new outer.staticInnerClass();
        osc.stdisplay();
        outer o1= new outer();
        System.out.println("outer class: "+outer.bayArea);
        System.out.println("outer class object reference o1 : "+o1.bayArea);
        //System.out.println("static inner class: "+outer.staticInnerClass.bayArea);
    }
}

class outer{
    int ant= 560;
    String animalName="Panda";
    static String bayArea="majestic";

    static class staticInnerClass{
        int sc=870;
        String schoolname="Vicans High School";

        void stdisplay(){
            sc=970;
            schoolname="VVIP school";
            System.out.println("sc value is "+sc);
            System.out.println("schoolname is "+schoolname);
            System.out.println("bayarea is "+bayArea);
           // System.out.println("animal name is "+animalName); not able to access the outerclass nonstatic variable inside the static class
        }
    }
}
