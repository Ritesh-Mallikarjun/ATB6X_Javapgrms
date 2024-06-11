package ATB_6X_May;

public class Lab023 {
    //instance variables
     int outSide=10;
     int outdef;
     static  int ab;

    public static void main(String[] args) {
        //local variables/primitive variables
        int a=10;
        int b=20;
        int c;
        float f1=10.0f, f2=20.0f, f3=30.6f;
        char c1=65;
        //reference variables
        String s1="Ritesh ";
        //int int =20;
        boolean b1=true;
       // int s1=19;
        String s2=s1+10;
        System.out.println(s2);
        //creating a object of same class Lab023
        Lab023 l1=new Lab023();
        //printing the instance variable of the class outside the main method
        System.out.println(l1.outSide);
        System.out.println("instance variable: "+l1.outdef);
        //printing the static variable of the class and JVM initializes the variable value by default
        System.out.println("static variable: ab "+ab);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(c1);
        //System.out.println(c);


    }
}
