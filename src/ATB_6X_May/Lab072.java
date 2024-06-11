package ATB_6X_May;

public class Lab072 {
    public static void main(String[] args) {
        String s1="123456";
        int a= Integer.valueOf(s1); // converting string to integer
        System.out.println(a); // printing int reference

        int i=90;
        int i1=Integer.valueOf(90);
        System.out.println(i1);
        Integer intobj=Integer.valueOf(90);
        System.out.println(intobj);
        double d2=Double.valueOf(12.568999);
        Double d1=Double.valueOf(12.568999);
//        Integer int1=(Integer) Double.valueOf(12.568999); // not possible
//        Integer int2=(int) Double.valueOf(12.568999);
//        Integer int3= Double.valueOf((int)12.568999);
        Integer int4 = Integer.valueOf((int)12.568999); // both are available with value typecasting inside parameter
        Integer int5 = Integer.valueOf((int)d2); // both are available with reference typecasting inside parameter

        double d3=454.869666; // double to integer
        //Integer int6=d3; not possible
        Integer int6=(int) d3; // it is also possible
        int int7= (int) d3; // it is possible
    }
}
